
#  Cyber Security Project
Ce projet à pour but de créer une application en indiquant sa surface d'attaque et en identifiant ses vulnérabilités.
***
# Description
L'application est développée avec JAVA-Spring Boot, et qui à pour objectif la gestion des concessionaires dont on peut ajouter, modifier, supprimer et afficher des clients, marques, voiture, adresses et des concessionnaires.
***
# Installation et Démarrage
Commande Docker pull

Commande Docker run

***
# Tests
##### Sur navigateur :

###### GET modèles
http://localhost:8080/nom_modèle/

ex: http://localhost:8080/client/


###### GET modèles par id
http://localhost:8080/nom_modèle/{id}

ex: http://localhost:8080/client/1


###### GET  Adresse,Concessionnaire,Marque par libelle
http://localhost:8080/nom_modèle/search/{libelle}

ex: http://localhost:8080/marque/search/Dacia


###### GET Client par login
http://localhost:8080/client/search/{login}

ex:http://localhost:8080/client/search/lamyaray


###### GET Voiture par login Client
http://localhost:8080/voiture/client/{login}

ex:http://localhost:8080/voiture/client/lamyaray

##### Sur Postman :

Vous trouverez un fichier de collection postman dans le dossier tests

###### Toute méthode de GET comme celle sur navigateur

###### POST modèle
http://localhost:8080/nom_modèle/save

ex: http://localhost:8080/voiture/save

 mettre l'objet à ajouter sur body postman en selectionnant JSON : {
    "id": 4,
    "prix": 30000.0,
    "kilometrage": 2000.0,
    "couleur": "Rouge",
    "marque": {"id": 2 },
    "client": {"id": 2}
}


###### PUTT modèle
http://localhost:8080/nom_modèle/update

ex: http://localhost:8080/voiture/update

 mettre l'objet à modifier sur body postman en selectionnant JSON : {
    "id": 4,
    "prix": 30000.0,
    "kilometrage": 2000.0,
    "couleur": "Jaune",
    "marque": {"id": 1 },
    "client": {"id": 1} 
   
}


###### DELETE modèles par id
http://localhost:8080/nom_modèle/{id}

ex: http://localhost:8080/client/delete/1
***
# Surface D'attaque

***
# Objectif De Sécurité

##### Confidentialité 
0/5 -> Les mots de passe sont affichés en clair  et on peut les récupérer facilement en utilisant GET, ainsi que tout les utilisateurs peuvent accéder à n'impote quel information. L'utilisation de Spring Security dans ce cas sera utile pour gérer l'accés aux informations ainsi pour le cryptage des mots de passe. 

##### Intégrité
1/5 -> la modification et la suppression des données est plus facile en utilisant les requêtes PUT et DELETE, donc les informations ne sont pas fiable, elles peuvent être modifiées par un utilisateur malveillant.

##### Disponibilité 
4/5 -> L'accés et la visibilité des informations est très facile, chaque utilisateur peut trouver les informations d'un ou plusieurs objets selon le besoin ainsi que la relation entre des objets de modèle différent, par exemple en cherchant une voiture on peut trouver sa marque ainsi que les informations de son proprietaire.

##### Trasabilité 
0/5 -> Aucune tracabilité sur qui a fait un changement ou modification et en quel moment.
***
### AUTEUR
#### Lamya Rayess lamya.rayess@lacatholille.com 















>>>>>>> refs/remotes/origin/main


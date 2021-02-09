INSERT INTO concessionnaire (id,libelle,phone) VALUES
(1, 'S Automobiles', '0762831445'),
(2, 'Audera', '0712131415'),
(3, 'Action Automobile', '0617425935'),
(4, 'Action Automobile', '0627415737'),
(5, 'Aramisauto', '0627415737');

INSERT INTO marque (id, libelle) VALUES
(1, 'Audi'),
(2, 'Peugeot'),
(3, 'Renault'),
(4, 'Fiat'),
(5, 'Mercedes');

INSERT INTO adresse (id,libelle,numero,pays,ville) VALUES
(1, 'Allee Leonie Vanhoutte', 45, 'France', 'Tourcoing'),
(2, 'Galerie de Valois', 140, 'France', 'Paris'),
(3, 'Rue Sainte', 10, 'France', 'Marseille'),
(5, 'Place Laganne', 70, 'France', 'Toulouse'),
(4, 'Rue Vasselot', 6, 'France', 'Rennes'),
(6, 'Rue Rouge Bouton', 20, 'France', 'Lille');



INSERT INTO concessionnaire_marques (marques, concessionnaire_id) VALUES
(1, 2),
(2, 1),
(3, 3),
(4, 3),
(2, 4),
(5, 4),
(1, 5),
(3, 5);

INSERT INTO voiture (couleur, id, kilometrage, prix, client, marque) VALUES
('Blanc', 1, 2000, 30000, 1, 1),
('Gris', 2, 127.32, 40600.99, 2, 2),
('Noir', 3, 1624.12, 50136.2, 5, 3),
('Rouge', 4, 0, 46021.1, 3, 4),
('Bleu', 5, 14720.12, 20426, 4, 5),
('Beige', 6, 0, 40962.2, 6, 5),
('Marron', 7, 150.21, 35031, 7, 4),
('Blanc', 8, 0, 60000, 8, 3),
('Noir', 9, 325.2, 45000, 9, 1),
('Gris', 10, 0, 50000, 10, 2);

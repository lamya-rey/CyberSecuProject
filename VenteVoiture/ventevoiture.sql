-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 10 nov. 2020 à 01:08
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `ventevoiture`
--

-- --------------------------------------------------------

--
-- Structure de la table `adresse`
--

DROP TABLE IF EXISTS `adresse`;
CREATE TABLE IF NOT EXISTS `adresse` (
  `id_adr` bigint(20) NOT NULL,
  `libelle_adr` varchar(255) DEFAULT NULL,
  `numero` int(11) NOT NULL,
  `pays` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_adr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `adresse`
--

INSERT INTO `adresse` (`id_adr`, `libelle_adr`, `numero`, `pays`, `ville`) VALUES
(1, 'Allee Leonie Vanhoutte', 10, 'France', 'Tourcoing'),
(2, 'Galerie de Valois', 140, 'France', 'Paris'),
(3, 'Rue Sainte', 10, 'France', 'Marseille'),
(5, 'Place Laganne', 70, 'France', 'Toulouse'),
(4, 'Rue Vasselot', 6, 'France', 'Rennes'),
(6, 'Rue Rouge Bouton', 20, 'France', 'Lille');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `prenom_cl` varchar(255) NOT NULL,
  `id_cl` bigint(20) NOT NULL,
  `mail_cl` varchar(255) DEFAULT NULL,
  `nom_cl` varchar(255) DEFAULT NULL,
  `phone_cl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_cl`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`prenom_cl`, `id_cl`, `mail_cl`, `nom_cl`, `phone_cl`) VALUES
('Lamya', 1, 'lamyaray97@gmail.com', 'Rayess', '0681719824'),
('Sara', 2, 'sara.audrey@gmail.com', 'Audrey', '0712035848'),
('Lina', 3, 'lina.naciri@gmail.com', 'Naciri', '0798426103'),
('Mehdi', 4, 'mehdi.fraid@gmail.com', 'Fraid', '0612385497'),
('Francois', 5, 'froncois.junior@gmail.com', 'Junior', '0631285476'),
('Soufiane', 6, 'soufiane.kayis@gmail.com', 'Kayis', '0715243987'),
('Sabrine', 7, 'sabrine.ouahi@gmail.com', 'Ouahi', '0618946378'),
('Mari', 8, 'mari.leonie@gmail.com', 'Leonie', '0712369852'),
('Samir', 9, 'samir.chatrab@gmail.com', 'Chatrab', '0712396485'),
('Kacim', 10, 'kacim.laredoute@gmail.com', 'Laredoute', '0712986543');

-- --------------------------------------------------------

--
-- Structure de la table `concessionnaire`
--

DROP TABLE IF EXISTS `concessionnaire`;
CREATE TABLE IF NOT EXISTS `concessionnaire` (
  `id_cons` bigint(20) NOT NULL,
  `libelle_cons` varchar(255) DEFAULT NULL,
  `phone_cons` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_cons`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `concessionnaire`
--

INSERT INTO `concessionnaire` (`id_cons`, `libelle_cons`, `phone_cons`) VALUES
(1, 'S Automobiles', '0762831445'),
(2, 'Audera', '0712131415'),
(3, 'Action Automobile', '0617425935'),
(4, 'Action Automobile', '0627415737'),
(5, 'Aramisauto', '0627415737');

-- --------------------------------------------------------

--
-- Structure de la table `concessionnaire_adresses`
--

DROP TABLE IF EXISTS `concessionnaire_adresses`;
CREATE TABLE IF NOT EXISTS `concessionnaire_adresses` (
  `adresses` bigint(20) NOT NULL,
  `concessionnaire_id_cons` bigint(20) NOT NULL,
  UNIQUE KEY `UK_diutkfwiplcicpr8et9gnm88o` (`adresses`),
  KEY `FK1qmpbob6lfbub4agun7jrqaap` (`concessionnaire_id_cons`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `concessionnaire_adresses`
--

INSERT INTO `concessionnaire_adresses` (`adresses`, `concessionnaire_id_cons`) VALUES
(4, 2),
(5, 2),
(1, 1),
(3, 3),
(2, 4),
(6, 5);

-- --------------------------------------------------------

--
-- Structure de la table `concessionnaire_marques`
--

DROP TABLE IF EXISTS `concessionnaire_marques`;
CREATE TABLE IF NOT EXISTS `concessionnaire_marques` (
  `marques` bigint(20) NOT NULL,
  `concessionnaire_id_cons` bigint(20) NOT NULL,
  KEY `FKe58rk2epq1mins7vo14oqbb5v` (`marques`),
  KEY `FKq0m3ajwb3h6i06yj1e0njrska` (`concessionnaire_id_cons`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `concessionnaire_marques`
--

INSERT INTO `concessionnaire_marques` (`marques`, `concessionnaire_id_cons`) VALUES
(1, 2),
(2, 1),
(3, 3),
(4, 3),
(2, 4),
(5, 4),
(1, 5),
(3, 5);

-- --------------------------------------------------------

--
-- Structure de la table `marque`
--

DROP TABLE IF EXISTS `marque`;
CREATE TABLE IF NOT EXISTS `marque` (
  `id_marq` bigint(20) NOT NULL,
  `libelle_marq` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_marq`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `marque`
--

INSERT INTO `marque` (`id_marq`, `libelle_marq`) VALUES
(1, 'Audi'),
(2, 'Peugeot'),
(3, 'Renault'),
(4, 'Fiat'),
(5, 'Mercedes');

-- --------------------------------------------------------

--
-- Structure de la table `voiture`
--

DROP TABLE IF EXISTS `voiture`;
CREATE TABLE IF NOT EXISTS `voiture` (
  `couleur` varchar(255) DEFAULT NULL,
  `id_voit` bigint(20) NOT NULL,
  `kilometrage` double DEFAULT NULL,
  `prix` double DEFAULT NULL,
  `client` bigint(20) DEFAULT NULL,
  `marque` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_voit`),
  KEY `FKgb6297dolb00scmh4g6sjdg5d` (`client`),
  KEY `FKtcvhwfspqfuuxf9aiuudygohy` (`marque`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `voiture`
--

INSERT INTO `voiture` (`couleur`, `id_voit`, `kilometrage`, `prix`, `client`, `marque`) VALUES
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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

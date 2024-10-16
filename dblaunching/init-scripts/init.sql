-- Création de la base de données
CREATE DATABASE IF NOT EXISTS beerdb CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Utilisation de la base de données
USE beerdb;

-- Création de la table beers
CREATE TABLE IF NOT EXISTS beers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    type VARCHAR(50) NOT NULL,
    origine VARCHAR(50) NOT NULL,
    gout VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Insertion de quelques données d'exemple
INSERT INTO beers (name, type, origine, gout) VALUES
('Blonde Artisanale', 'Blonde', 'Brasserie du Coin', 'Fruité'),
('Ambrée Tradition', 'Ambrée', 'Brasserie Ancestrale', 'Malt grillé'),
('IPA Explosive', 'IPA', 'Brasserie Moderne', 'Amer'),
('Stout Impérial', 'Stout', 'Brasserie du Château', 'Cacao');

CREATE TABLE IF NOT EXISTS comments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    beer_id INT NOT NULL,
    content TEXT NOT NULL,
    date_creation TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (beer_id) REFERENCES beers(id) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE INDEX idx_comment_beer ON comments(beer_id);

INSERT INTO comments (beer_id, content) VALUES
('1', 'elle a bon gout'),
('1', 'je suis ravis d''avoir essayé'),
('2' , 'plutôt bien');



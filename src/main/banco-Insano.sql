CREATE DATABASE IF NOT EXISTS palavroes;
USE palavroes;

CREATE TABLE palavrasFeias (
    id INT PRIMARY KEY AUTO_INCREMENT,
    feia VARCHAR(100) NOT NULL UNIQUE
);

INSERT INTO palavrasFeias (feia) VALUES
("bananão"),
("tampinha"),
("pateta"),
("boboca");

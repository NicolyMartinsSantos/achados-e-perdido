CREATE TABLE Usuario (
    idUsuario INT PRIMARY KEY AUTO_INCREMENT,
    nomeCompleto VARCHAR(255) NOT NULL,
    telefone VARCHAR(15),
    endereco VARCHAR(255)
);

CREATE TABLE ObjetoPerdido (
    idObjetoPerdido INT PRIMARY KEY AUTO_INCREMENT,
    imagem VARCHAR(255),
    descricao TEXT,
);

CREATE TABLE Categoria (
    idCategoria INT PRIMARY KEY AUTO_INCREMENT,
    idObjetoPerdido INT,
    tipoObjeto ENUM('animal', 'cartão', 'documento', 'objeto') NOT NULL,
    FOREIGN KEY (idObjetoPerdido) REFERENCES ObjetoPerdido(idObjetoPerdido)
);

CREATE TABLE Postagem (
    idPostagem INT PRIMARY KEY AUTO_INCREMENT,
    idUsuario INT,
    idObjetoPerdido INT,
    FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario),
    FOREIGN KEY (idObjetoPerdido) REFERENCES ObjetoPerdido(idObjetoPerdido)
);

CREATE TABLE Comentario (
    idComentario INT PRIMARY KEY AUTO_INCREMENT,
    idPostagem INT,
    idUsuario INT,
    mensagem TEXT,
    FOREIGN KEY (idPostagem) REFERENCES Postagem(idPostagem),
    FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario));



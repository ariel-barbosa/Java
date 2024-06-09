CREATE DATABASE db_usuario;
USE db_usuario;


CREATE TABLE tbl_usuario(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50),
    cpf VARCHAR(13),
    email VARCHAR(200),
    telefone VARCHAR(40)
);
			
            
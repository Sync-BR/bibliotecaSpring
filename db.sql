CREATE SCHEMA `biblioteca` ;

CREATE TABLE `biblioteca`.`livros` (
  `id` INT NOT NULL,
  `isbn` VARCHAR(45) NOT NULL,
  `titulo` VARCHAR(45) NOT NULL,
  `descricao` VARCHAR(100) NOT NULL,
  `editora` VARCHAR(45) NOT NULL,
  `ano` INT NOT NULL,
  `genero` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`, `titulo`));

CREATE TABLE `biblioteca`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(45) NOT NULL,
  `idade` INT NOT NULL,
  PRIMARY KEY (`id`));


{
  "id": 1,
  "isbn": "978-3-16-148410-0",
  "titulo": "O Senhor dos Anéis",
  "descricao": "Uma épica jornada de fantasia.",
  "editora": "HarperCollins",
  "ano": 1954,
  "genero": "Fantasia"
}

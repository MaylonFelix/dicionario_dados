SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema ServletCerveja
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ServletCerveja` ;
USE `ServletCerveja` ;

-- -----------------------------------------------------
-- Table `ServletCerveja`.`cerveja`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ServletCerveja`.`cerveja` (
  `idcerveja` INT NOT NULL,
  `cor` VARCHAR(45) NULL,
  `nome` VARCHAR(45) NULL,
  PRIMARY KEY (`idcerveja`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ServletCerveja`.`numero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ServletCerveja`.`numero` (
  `idnumero` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  PRIMARY KEY (`idnumero`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

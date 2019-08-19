CREATE SCHEMA `argolib` ;

CREATE TABLE `argolib`.`users` (
  `id` BIGINT(19) UNSIGNED NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(255) NOT NULL,
  `last_name` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);
  
CREATE TABLE `argolib`.`books` (
  `id` BIGINT(19) UNSIGNED NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(255) NOT NULL,
  `description` TEXT NOT NULL,
  `isbn` VARCHAR(45) NOT NULL,
  `page_count` BIGINT(19) UNSIGNED NOT NULL,
  `author` VARCHAR(255) NOT NULL,
  `date_published` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `isbn_UNIQUE` (`isbn` ASC) VISIBLE);

CREATE TABLE `argolib`.`reservations` (
  `id` BIGINT(19) NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(19) UNSIGNED NOT NULL,
  `book_id` BIGINT(19) UNSIGNED NOT NULL,
  `reservation_date` DATETIME NOT NULL,
  `expiration_date` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_reservation_user_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_reservation_book_idx` (`book_id` ASC) VISIBLE,
  CONSTRAINT `fk_reservation_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `argolib`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservation_book`
    FOREIGN KEY (`book_id`)
    REFERENCES `argolib`.`books` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

 CREATE TABLE `argolib`.`reviews` (
  `id` BIGINT(19) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(19) UNSIGNED NOT NULL,
  `book_id` BIGINT(19) UNSIGNED NOT NULL,
  `publish_date` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_review_user_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_review_book_idx` (`book_id` ASC) VISIBLE,
  CONSTRAINT `fk_review_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `argolib`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_review_book`
    FOREIGN KEY (`book_id`)
    REFERENCES `argolib`.`books` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
 ALTER TABLE `argolib`.`reviews` 
 ADD COLUMN `title` VARCHAR(255) NOT NULL AFTER `publish_date`,
 ADD COLUMN `body` TEXT NOT NULL AFTER `title`;

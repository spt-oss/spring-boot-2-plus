CREATE TABLE IF NOT EXISTS `foo`.`foo` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `foo_id` BIGINT UNSIGNED NOT NULL,
  `code` VARCHAR(64) NOT NULL COMMENT 'Code',
  PRIMARY KEY (`id`),
  CONSTRAINT `TEST-FOO_TEST_ID`
    FOREIGN KEY (`foo_id`)
    REFERENCES `foo`.`foo` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
COMMENT = 'Foo';

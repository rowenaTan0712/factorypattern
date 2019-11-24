ALTER TABLE `avengers`.`person_powers` 
ADD INDEX `person_id_idx` (`person_id` ASC),
ADD INDEX `power_id_idx` (`power_id` ASC);
;
ALTER TABLE `avengers`.`person_powers` 
ADD CONSTRAINT `person_id`
  FOREIGN KEY (`person_id`)
  REFERENCES `avengers`.`persons` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `power_id`
  FOREIGN KEY (`power_id`)
  REFERENCES `avengers`.`powers` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
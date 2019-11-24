ALTER TABLE `avengers`.`powers` 
CHANGE COLUMN `update_date` `update_date` DATETIME NULL ;

ALTER TABLE `avengers`.`powers` 
CHANGE COLUMN `damage` `power_range` INT(11) NOT NULL DEFAULT '20' ;


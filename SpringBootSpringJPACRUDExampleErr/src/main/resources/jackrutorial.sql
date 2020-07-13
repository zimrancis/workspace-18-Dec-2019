CREATE DATABASE `jackrutorial` /*!40100 DEFAULT CHARACTER SET utf8 */;

DROP TABLE IF EXISTS `jackrutorial`.`article`;
CREATE TABLE  `jackrutorial`.`article` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `title` varchar(100) NOT NULL default '',
  `category` varchar(100) NOT NULL default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
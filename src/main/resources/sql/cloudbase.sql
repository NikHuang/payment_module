/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 8.0.17 : Database - cloudbase
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cloudbase` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `cloudbase`;

/*Table structure for table `payment` */

DROP TABLE IF EXISTS `payment`;

CREATE TABLE `payment` (
  `id` varchar(32) NOT NULL COMMENT '主键，32位UID',
  `name` varchar(100) NOT NULL COMMENT '商品全程',
  `brief_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品简称',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `payment` */

insert  into `payment`(`id`,`name`,`brief_name`,`create_time`,`update_time`) values ('6464ea387cc74f5294ec9443e03b5509','小米手机 11款','小米11','2020-07-09 23:53:59','2020-07-09 23:53:59'),('6d43d0d96cb64fbb8a5f4de6389f383d','iphone 11 某某款','iphone11','2020-06-29 00:27:36','2020-06-29 00:27:36'),('9e1128cf5b4448e8ac9a33b7a7fbb7e7','小米手机 9款','小米','2020-07-08 00:32:08','2020-07-08 00:32:08'),('f0310951dfa44916a7f2c6fd2d7f992c','小米手机 8款','小米8','2020-07-08 00:32:31','2020-07-08 00:32:31');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

/*
 Navicat MySQL Data Transfer

 Source Server         : hotelTask
 Source Server Type    : MySQL
 Source Server Version : 50616
 Source Host           : localhost
 Source Database       : Hotel

 Target Server Type    : MySQL
 Target Server Version : 50616
 File Encoding         : utf-8

 Date: 03/27/2014 18:03:36 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `AdminUser`
-- ----------------------------
DROP TABLE IF EXISTS `AdminUser`;
CREATE TABLE `AdminUser` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `client`
-- ----------------------------
DROP TABLE IF EXISTS `client`;
CREATE TABLE `client` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `clientname` varchar(20) NOT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `shenfenzheng` varchar(255) DEFAULT NULL,
  `minzu` varchar(20) DEFAULT NULL,
  `dianhua` int(11) DEFAULT NULL,
  `roomno` int(11) DEFAULT NULL,
  `yuding` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `consumer`
-- ----------------------------
DROP TABLE IF EXISTS `consumer`;
CREATE TABLE `consumer` (
  `id` int(11) NOT NULL,
  `consumerno` int(11) NOT NULL,
  `food` float DEFAULT NULL,
  `dianhua` float DEFAULT NULL,
  `fruit` float DEFAULT NULL,
  PRIMARY KEY (`consumerno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `room`
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `roomno` int(11) NOT NULL,
  `statue` int(11) NOT NULL,
  `startdate` datetime DEFAULT NULL,
  `enddate` datetime DEFAULT NULL,
  PRIMARY KEY (`roomno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

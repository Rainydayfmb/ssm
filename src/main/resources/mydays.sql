/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : mydays

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2015-11-04 16:23:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `days_user`
-- ----------------------------
DROP TABLE IF EXISTS `days_user`;
CREATE TABLE `days_user` (
  `id` int(20) NOT NULL,
  `nickname` varchar(222) DEFAULT NULL,
  `state` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of days_user
-- ----------------------------

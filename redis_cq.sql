/*
Navicat MySQL Data Transfer

Source Server         : cq
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : redis_cq

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-04-01 17:21:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `ctm` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', '张三', '18', '2018-09-22 10:34:17');
INSERT INTO `tb_user` VALUES ('2', 'Honey', '22', '2018-09-22 10:34:17');
INSERT INTO `tb_user` VALUES ('3', '王五', '19', '2018-09-22 10:34:17');
INSERT INTO `tb_user` VALUES ('5', 'Tony', '66', null);
INSERT INTO `tb_user` VALUES ('6', 'Jack', '23', null);

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(255) DEFAULT '0',
  `sex` char(2) DEFAULT '0',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学员表';

-- ----------------------------
-- Records of t_student
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(3) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

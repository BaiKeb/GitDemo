/*
 Navicat Premium Data Transfer

 Source Server         : 456
 Source Server Type    : MySQL
 Source Server Version :
 Source Host           : localhost:3306
 Source Schema         : test001

 Target Server Type    : MySQL
 Target Server Version :
 File Encoding         : 65001

 Date: 15/06/2022 17:12:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` int(0) NULL DEFAULT 0,
  `id_number` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tel` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `addr` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` int(0) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `t_user_username_uk`(`username`) USING BTREE,
  UNIQUE INDEX `t_user_id_number_uk`(`id_number`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'xiaoming', '111111', 0, '15647641312345', '1515445554', '江苏', 0);
INSERT INTO `t_user` VALUES (2, 'tom', '111111', 0, '15647641312346', '1515445555', '日本', 0);
INSERT INTO `t_user` VALUES (3, 'lucy', '111111', 0, '15647641312347', '1515445556', '上海', 0);
INSERT INTO `t_user` VALUES (4, 'sam', '111111', 0, '15647641312348', '1515445557', '北京', 0);
INSERT INTO `t_user` VALUES (5, 'leo', '111111', 0, '15647641312349', '1515445558', '深圳', 0);
INSERT INTO `t_user` VALUES (6, 'marry', '111111', 0, '15647641312340', '1515445559', '南京', 1);
INSERT INTO `t_user` VALUES (7, 'admin', '123456', 0, NULL, NULL, NULL, 1);

SET FOREIGN_KEY_CHECKS = 1;

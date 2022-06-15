/*
 Navicat Premium Data Transfer

 Source Server         : c't'k'j
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : 116.63.68.169:3306
 Source Schema         : ctkj_charge_bjjy

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 15/06/2022 09:46:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for g_report_model
-- ----------------------------
DROP TABLE IF EXISTS `g_report_model`;
CREATE TABLE `g_report_model`  (
  `REP_TMP_ID` int(9) NOT NULL AUTO_INCREMENT,
  `REP_TYPE_ID` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '报表分类',
  `REP_TMP_CODE` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `REP_NAME` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `REP_CYCLE` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '报表周期:YMWDH',
  `URL_PAGE_CLASS` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '表格类名',
  `SORT_NO` decimal(9, 0) NULL DEFAULT NULL,
  `OBJECT_MAX_COUNT` decimal(5, 0) NULL DEFAULT NULL,
  `OBJECT_TYPE` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '对象类型:字典表185',
  `REP_TMP_STYLE` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `DATA_FLAG` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `RESERVED1` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  PRIMARY KEY (`REP_TMP_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of g_report_model
-- ----------------------------
INSERT INTO `g_report_model` VALUES (2, '02', '002', '测量点抄表电量表', 'Y,D,M,H', 'totalReport', 2, 500, '0', '01', '01', NULL);
INSERT INTO `g_report_model` VALUES (4, '03', '004', '大用户月每日电量报表', 'M', 'GReportSl', 4, 500, '8', '01', '01', NULL);
INSERT INTO `g_report_model` VALUES (5, '02', '005', '测量点抄见分时示度数据表', 'H', 'curveReport', 5, 500, '0', '01', '01', NULL);
INSERT INTO `g_report_model` VALUES (8, '02', '008', '分时设备报表', 'H,M', 'tmeterReport', 8, 500, '0', NULL, '01', NULL);
INSERT INTO `g_report_model` VALUES (22, '06', NULL, '51', 'D,H', '265512', NULL, NULL, '2', NULL, '', NULL);
INSERT INTO `g_report_model` VALUES (23, '456', NULL, '5464', 'M', '65465', NULL, NULL, '1', NULL, '', NULL);

SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE `handler` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `handler_name` varchar(32) DEFAULT NULL COMMENT 'handler名称',
  `handler_id` varchar(32) DEFAULT NULL COMMENT 'handler主键id',
  `prev_handler_id` varchar(32) DEFAULT NULL,
  `next_handler_id` varchar(32) DEFAULT NULL COMMENT '下一个handler',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of gateway_handler
-- ----------------------------
INSERT INTO `handler` VALUES ('16', 'Api接口限流', 'currentLimitHandler', null, 'blackListHandler');
INSERT INTO `handler` VALUES ('17', '黑名单拦截', 'blackListHandler', 'currentLimitHandler', 'conversationHandler');
INSERT INTO `handler` VALUES ('18', '会话验证', 'conversationHandler', 'blackListHandler', null);

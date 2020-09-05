CREATE TABLE `handler` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `handler_name` varchar(32) DEFAULT NULL COMMENT 'handler名称',
  `handler_bean_id` varchar(32) DEFAULT NULL COMMENT 'handler主键id',
  `pre_handler_bean_id` varchar(32) DEFAULT NULL,
  `next_handler_bean_id` varchar(32) DEFAULT NULL COMMENT '下一个handler',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of gateway_handler
-- ----------------------------
INSERT INTO `handler` VALUES ('1', 'Api接口限流', 'currentLimitHandler', null, 'blackListHandler');
INSERT INTO `handler` VALUES ('2', '黑名单拦截', 'blackListHandler', 'currentLimitHandler', 'conversationHandler');
INSERT INTO `handler` VALUES ('3', '会话验证', 'conversationHandler', 'blackListHandler', null);

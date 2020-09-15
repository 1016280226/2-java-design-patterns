CREATE TABLE `gateway_handler` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `handler_name` varchar(32) DEFAULT NULL COMMENT '处理器名称',
  `handler_bean_id` varchar(32) DEFAULT NULL COMMENT '处理器BeanID',
  `pre_handler_bean_id` varchar(32) DEFAULT NULL COMMENT '上一个处理器BeanID',
  `next_handler_bean_id` varchar(32) DEFAULT NULL COMMENT '下一个处理器BeanID',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of gateway_handler
-- ----------------------------
INSERT INTO `gateway_handler` VALUES ('1', 'Api接口限流', 'apiCurrentLimitHandler', null, 'blackListHandler');
INSERT INTO `gateway_handler` VALUES ('2', '黑名单拦截', 'blackListHandler', 'apiCurrentLimitHandler', 'conversationHandler');
INSERT INTO `gateway_handler` VALUES ('3', '会话验证', 'conversationHandler', 'blackListHandler', null);

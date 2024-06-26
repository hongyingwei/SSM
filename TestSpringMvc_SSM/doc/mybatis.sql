-- SOURCE d:\mybatis.sql
-- SOURCE ~/mybatis.sql
DROP DATABASE IF EXISTS mybatis;
CREATE DATABASE mybatis CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE mybatis;

DROP TABLE IF EXISTS `t_user`;

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
                          `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
                          `user_name` varchar(60) NOT NULL COMMENT '用户名称',
                          `password` char(20) NOT NULL COMMENT '密码',
                          `cnname` varchar(60) NOT NULL COMMENT '姓名',
                          `sex` tinyint(3) NOT NULL COMMENT '性别',
                          `mobile` varchar(20) NOT NULL COMMENT '手机号码',
                          `email` varchar(60) NOT NULL COMMENT '电子邮件',
                          `note` varchar(1024) DEFAULT NULL COMMENT '备注',
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB;

LOCK TABLES `t_user` WRITE;

INSERT INTO `t_user` (`id`, `user_name`, `password`, `cnname`, `sex`, `mobile`, `email`, `note`)
VALUES
    (1,'zhangsan','1','张三',1,'13188888888','zhangsan@woniuxy.com',''),
    (2,'lisi','1','李四',1,'13266666666','lisi@woniuxy.com',''),
    (3,'wanger','1','王二',1,'13344444444','wanger@woniuxy.com',''),
    (4,'zhao','1','赵大',1,'13422222222','zhaoda@woniuxy.com','');

UNLOCK TABLES;

SELECT * FROM t_user;

DROP TABLE IF EXISTS `t_student`;

CREATE TABLE `t_student` (
                             `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
                             `cnname` varchar(60) NOT NULL COMMENT '学生姓名',
                             `sex` tinyint(4) NOT NULL COMMENT '性别',
                             `note` varchar(1024) DEFAULT NULL COMMENT '备注',
                             PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT='学生信息表';

LOCK TABLES `t_student` WRITE;

INSERT INTO `t_student` (`id`, `cnname`, `sex`, `note`)
VALUES
    (1,'张三',1,'蜗牛学院');

UNLOCK TABLES;

SELECT * FROM t_student;

DROP TABLE IF EXISTS `t_student_selfcard`;

CREATE TABLE `t_student_selfcard` (
                                      `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
                                      `student_id` int(20) DEFAULT NULL COMMENT '学生编号',
                                      `native` varchar(60) NOT NULL COMMENT '籍贯',
                                      `issue_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '发证日期',
                                      `end_date` datetime NOT NULL COMMENT '结束日期',
                                      `note` varchar(1024) DEFAULT NULL COMMENT '备注',
                                      PRIMARY KEY (`id`),
                                      KEY `student_id` (`student_id`),
                                      CONSTRAINT `t_student_selfcard_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `t_student` (`id`)
) ENGINE=InnoDB COMMENT='身份证信息表';

LOCK TABLES `t_student_selfcard` WRITE;

INSERT INTO `t_student_selfcard` (`id`, `student_id`, `native`, `issue_date`, `end_date`, `note`)
VALUES
    (1,1,'成都','2016-11-09 17:55:36','2016-12-11 17:55:32','蜗牛学院16期');

UNLOCK TABLES;

SELECT * FROM t_student_selfcard;

DROP TABLE IF EXISTS `t_student_health`;

CREATE TABLE `t_student_health` (
                                         `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
                                         `student_id` int(20) DEFAULT NULL COMMENT '学生编号',
                                         `check_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '检查时间',
                                         `heart` varchar(60) NOT NULL COMMENT '心',
                                         `liver` varchar(60) NOT NULL COMMENT '肝',
                                         `lung` varchar(60) NOT NULL COMMENT '肺',
                                         `note` varchar(1024) DEFAULT NULL COMMENT '备注',
                                         PRIMARY KEY (`id`),
                                         KEY `student_id` (`student_id`),
                                         CONSTRAINT `t_student_health_male_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `t_student` (`id`)
) ENGINE=InnoDB COMMENT='学生健康信息表';

LOCK TABLES `t_student_health` WRITE;

INSERT INTO `t_student_health` (`id`, `student_id`, `check_date`, `heart`, `liver`, `lung`, `note`)
VALUES
    (1,1,'2016-11-09 16:37:23','好','好','好','好'),
    (2,1,'2017-11-09 17:37:27','好','好','不好','好');

UNLOCK TABLES;

SELECT * FROM t_student_health;

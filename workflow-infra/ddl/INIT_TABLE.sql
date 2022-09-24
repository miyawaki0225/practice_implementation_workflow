SET CHARSET utf8mb4;
CREATE DATABASE IF NOT EXISTS workflow DEFAULT CHARACTER SET utf8mb4;
USE workflow;

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee`(
    `id` VARCHAR(50) PRIMARY KEY COMMENT '従業員ID',
    `name` VARCHAR(50) COMMENT '従業員名',
    `age` INT COMMENT '従業員年齢'
);

/* ユーザーマスタ */
DROP TABLE IF EXISTS `m_user`;
CREATE TABLE IF NOT EXISTS `m_user` (
    `user_id` VARCHAR(50) COMMENT 'ユーザーID'
  , `password` VARCHAR(100) COMMENT 'パスワード'
  , `user_name` VARCHAR(50) COMMENT 'ユーザー名'
  , `birthday` DATE COMMENT '誕生日'
  , `age` INT COMMENT '年齢'
  , `gender` INT COMMENT '性別'
  , `department_id` INT COMMENT '部署番号'
  , `role` VARCHAR(50) COMMENT '役職'
  , PRIMARY KEY(`user_id`)
);

/* 部署マスタ */
CREATE TABLE IF NOT EXISTS `m_department` (
    `department_id` INT
  , `department_name` VARCHAR(50)
  , PRIMARY KEY(`department_id`)
);

/* 給料テーブル */
CREATE TABLE IF NOT EXISTS `t_salary` (
    `user_id` VARCHAR(50) COMMENT 'ユーザーID'
  , `year_month` VARCHAR(50) COMMENT '年月'
  , `salary` INT COMMENT '給料'
  , PRIMARY KEY(`user_id`, `year_month`)
);
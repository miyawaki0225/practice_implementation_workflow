USE workflow;

SET CHARACTER_SET_CLIENT = utf8mb4;
SET CHARACTER_SET_CONNECTION = utf8mb4;

INSERT INTO `workflow`.`employee`(`id`,`name`,`age`)VALUES('1','Tom',30);

/* ユーザーマスタ */
INSERT INTO `workflow`.`m_user` (
    `user_id`
  , `password`
  , `user_name`
  , `birthday`
  , `age`
  , `gender`
  , `department_id`
  , `role`
) VALUES
('system@co.jp', '$2a$10$rJyapIrvsHARwCNgporWLO6QIKXXezOpRrdb..7X0ea0VwZ5IldSy', 'システム管理者', '2000-01-01', 21, 1, 1, 'ROLE_ADMIN')
, ('user@co.jp', '$2a$10$rJyapIrvsHARwCNgporWLO6QIKXXezOpRrdb..7X0ea0VwZ5IldSy', 'ユーザー1', '2000-01-01', 21, 2, 2, 'ROLE_GENERAL')
;

/* 部署マスタ */
INSERT INTO `workflow`.`m_department` (
    `department_id`
  , `department_name`
) VALUES
(1, 'システム管理部')
, (2, '営業部')
;

/* 給料テーブル */
INSERT INTO `workflow`.`t_salary` (
    `user_id`
  , `year_month`
  , `salary`
) VALUES
('user@co.jp', '2020/11', 280000)
, ('user@co.jp', '2020/12', 290000)
, ('user@co.jp', '2021/01', 300000)
;
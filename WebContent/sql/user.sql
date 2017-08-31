CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `user_id` varchar(45) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  `password` varchar(100) NOT NULL,
  `user_name_display` varchar(45) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delete_flg` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

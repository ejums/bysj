#user表
INSERT INTO nice_test.user (username, password, nickname, sex, birthday, avatar, tel, email, create_time, term, region, autograph, synopsis) VALUES ('hjm0928', 'e10adc3949ba59abbe56e057f20f883e', '星残', '男', '1996-09-28', null, null, null,'2019-02-22 21:20:14', null, null, null, null);

#menu表
INSERT INTO nice_test.menu (name, parentId, url, icon, createTime, dataStatus, createUserId, createUser) VALUES ('首页', 0, '/index.html', 'iconfont el-i-home', '2019-03-07 17:01:21', 'active', null, null);
INSERT INTO nice_test.menu (name, parentId, url, icon, createTime, dataStatus, createUserId, createUser) VALUES ('试题管理', 0, '/question_index', null, '2019-03-07 17:37:09', 'active', null, null);
INSERT INTO nice_test.menu (name, parentId, url, icon, createTime, dataStatus, createUserId, createUser) VALUES ('试题库', 2, '#', null, '2019-03-07 17:42:13', 'active', null, null);
INSERT INTO nice_test.menu (name, parentId, url, icon, createTime, dataStatus, createUserId, createUser) VALUES ('试卷库', 2, '#', null, '2019-03-07 17:42:13', 'active', null, null);
INSERT INTO nice_test.menu (name, parentId, url, icon, createTime, dataStatus, createUserId, createUser) VALUES ('考试管理', 2, '#', null, '2019-03-07 17:42:13', 'active', null, null);
INSERT INTO nice_test.menu (name, parentId, url, icon, createTime, dataStatus, createUserId, createUser) VALUES ('统计分析', 2, '#', null, '2019-03-07 17:42:13', 'active', null, null);
INSERT INTO nice_test.menu (name, parentId, url, icon, createTime, dataStatus, createUserId, createUser) VALUES ('人员管理', 0, '#', '', '2019-03-07 17:42:59', 'active', null, null);
INSERT INTO nice_test.menu (name, parentId, url, icon, createTime, dataStatus, createUserId, createUser) VALUES ('个人', 0, '#', null, '2019-03-07 17:42:59', 'active', null, null);
INSERT INTO nice_test.menu (name, parentId, url, icon, createTime, dataStatus, createUserId, createUser) VALUES ('私有库', 3, '#', null, '2019-03-07 20:45:36', 'active', null, null);
INSERT INTO nice_test.menu (name, parentId, url, icon, createTime, dataStatus, createUserId, createUser) VALUES ('公开库', 3, '#', null, '2019-03-07 20:45:36', 'active', null, null);
INSERT INTO nice_test.menu (name, parentId, url, icon, createTime, dataStatus, createUserId, createUser) VALUES ('全局库', 3, '#', null, '2019-03-07 20:45:36', 'active', null, null);


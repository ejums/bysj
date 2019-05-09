
create database nice_test charset 'utf-8'
use nice_test;
create table login_record
(
    id           int auto_increment comment 'the logic no of this table'
        primary key,
    user_id      int                                   null comment 'the user id of logon',
    username     varchar(32)                           null comment 'the username of logon',
    login_time   datetime    default CURRENT_TIMESTAMP null comment 'the time of login',
    login_region varchar(32)                           null comment 'the region of logon user',
    login_ip     varchar(128)                          null comment 'the ip of login user',
    logout_time  datetime                              null comment 'the time of user logout',
    logout_way   varchar(20) default '1'               null comment 'the way of user logout, 1 as unknown way, 0 as normal way'
);

INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-03-19 00:08:09', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-03-19 00:08:09', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-03-19 00:10:08', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-03-19 00:17:19', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-03-19 00:21:48', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 10:45:39', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 10:48:35', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 10:49:13', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 10:49:37', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 10:50:06', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 10:50:43', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 11:58:15', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 11:58:45', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 12:11:09', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 14:55:31', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 14:55:42', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 14:57:16', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 14:58:27', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 15:02:12', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 15:03:28', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 15:07:38', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 15:09:46', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 15:11:36', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 15:22:19', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 15:23:05', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 15:24:40', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 15:32:25', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 15:32:25', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 15:44:47', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-15 16:00:01', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-21 16:35:53', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-23 08:27:07', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-23 13:25:12', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-24 16:48:55', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-26 13:11:28', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-26 13:14:24', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-26 13:16:28', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-26 13:18:19', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-26 13:20:14', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-26 13:21:38', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-26 13:23:33', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-26 13:24:52', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-26 13:41:29', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-26 23:23:57', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 04:29:35', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 04:47:20', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 04:48:10', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 04:50:13', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 04:52:06', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 05:07:26', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 05:08:39', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 05:09:53', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 05:12:28', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 05:12:43', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 05:13:16', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 06:24:10', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 08:36:57', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 09:08:45', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 09:41:01', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-04-27 09:51:02', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-05-07 14:26:35', null, '0:0:0:0:0:0:0:1', null, null);
INSERT INTO nice_test.login_record (user_id, username, login_time, login_region, login_ip, logout_time, logout_way) VALUES (1, null, '2019-05-07 14:27:27', null, '0:0:0:0:0:0:0:1', null, null);
create table menu
(
    id           int auto_increment comment 'this logic no of menu'
        primary key,
    name         varchar(32)                           null comment 'the name of menu',
    parentId     int         default 0                 null comment 'the parent menu id',
    url          varchar(64)                           null comment 'the url of menu',
    icon         varchar(64)                           null comment 'the icon class of menu',
    createUserId int                                   null comment 'the create user id of menu',
    createUser   varchar(32)                           null comment 'create user',
    createTime   datetime    default CURRENT_TIMESTAMP null comment 'create time',
    dataStatus   varchar(32) default 'active'          null comment 'data status,{active,expired,deprecated}'
);

INSERT INTO nice_test.menu (name, parentId, url, icon, createUserId, createUser, createTime, dataStatus) VALUES ('首页', 0, '/index.html', 'iconfont el-i-home', null, null, '2019-03-07 17:01:21', 'active');
INSERT INTO nice_test.menu (name, parentId, url, icon, createUserId, createUser, createTime, dataStatus) VALUES ('试题管理', 0, '/question_index', null, null, null, '2019-03-07 17:37:09', 'active');
INSERT INTO nice_test.menu (name, parentId, url, icon, createUserId, createUser, createTime, dataStatus) VALUES ('试题库', 2, '/library/private.html', '', null, null, '2019-03-07 17:42:13', 'active');
INSERT INTO nice_test.menu (name, parentId, url, icon, createUserId, createUser, createTime, dataStatus) VALUES ('试卷库', 2, '#', null, null, null, '2019-03-07 17:42:13', 'active');
INSERT INTO nice_test.menu (name, parentId, url, icon, createUserId, createUser, createTime, dataStatus) VALUES ('考试管理', 2, '#', null, null, null, '2019-03-07 17:42:13', 'active');
INSERT INTO nice_test.menu (name, parentId, url, icon, createUserId, createUser, createTime, dataStatus) VALUES ('统计分析', 2, '#', null, null, null, '2019-03-07 17:42:13', 'active');
INSERT INTO nice_test.menu (name, parentId, url, icon, createUserId, createUser, createTime, dataStatus) VALUES ('人员管理', 0, '#', '', null, null, '2019-03-07 17:42:59', 'active');
INSERT INTO nice_test.menu (name, parentId, url, icon, createUserId, createUser, createTime, dataStatus) VALUES ('个人', 0, '#', null, null, null, '2019-03-07 17:42:59', 'active');
create table question_choose
(
    id           int auto_increment comment 'this logic no of question'
        primary key,
    topic        varchar(512)                 null comment 'the topic of question',
    remarks      varchar(512)                 null comment 'the title of remarks',
    choices      varchar(512)                 null comment 'the choices of the question',
    answer       varchar(512)                 null comment 'the answer of question, it is a json string',
    type         tinyint                      null comment 'the type of choose question, 0:single choice question, 1: more choices question',
    subjectId    int                          null comment 'the subject id of question belonged',
    subject      varchar(128)                 null comment 'the subject of question belonged',
    createUser   varchar(32)                  null comment 'create user',
    createUserId int                          null comment 'the id of create user',
    permission   varchar(200)                 null comment 'the permission of this question',
    createDate   datetime                     null comment 'the add time of question',
    keyword      varchar(48)                  null comment 'the keyword of question',
    dataStatus   varchar(32) default 'active' null comment 'data status,{active,expired,deprecated}'
)
    charset = utf8mb4;

INSERT INTO nice_test.question_choose (topic, remarks, choices, answer, type, subjectId, subject, createUser, createUserId, permission, createDate, keyword, dataStatus) VALUES ('<p>《静夜思》是哪位诗人所作？</p>', '<p>考查学生对古诗词的熟悉</p>', '["<p>李白</p>","<p>李牧&nbsp;&nbsp;&nbsp;&nbsp;</p>","<p>苏轼</p>","<p>韩愈</p>"]', '["<p>李白</p>"]', 0, null, null, '星残', 1, '[''PRIVATE''', '2019-04-13 15:43:23', '小学,古诗词', 'active');
INSERT INTO nice_test.question_choose (topic, remarks, choices, answer, type, subjectId, subject, createUser, createUserId, permission, createDate, keyword, dataStatus) VALUES ('<p>3*5+5*3的结果为</p>', '<p>简单的四则运算</p>', '["<p>30</p>","<p>20</p>","<p>25</p>","<p>35</p>"]', '["<p>30</p>"]', 0, null, null, '星残', 1, '[''PRIVATE''', '2019-04-15 10:39:07', '小学,数学,四则运算', 'active');
INSERT INTO nice_test.question_choose (topic, remarks, choices, answer, type, subjectId, subject, createUser, createUserId, permission, createDate, keyword, dataStatus) VALUES ('<p>驾驶人有下列哪种违法行为一次记6分&nbsp;&nbsp;<br></p>', '', '["<p>使用其他车辆行驶证&nbsp;&nbsp;<br></p>","<p>饮酒后驾驶机动车&nbsp;&nbsp;<br></p>","<p>车速超过规定时速50%以上&nbsp;&nbsp;<br></p>","<p>违法占用应急车道行驶&nbsp;&nbsp;<br></p>"]', '["<p>违法占用应急车道行驶&nbsp;&nbsp;<br></p>"]', 0, null, null, '星残', 1, '[''PRIVATE''', '2019-04-23 13:26:33', '交通,科一,汽车', 'active');
INSERT INTO nice_test.question_choose (topic, remarks, choices, answer, type, subjectId, subject, createUser, createUserId, permission, createDate, keyword, dataStatus) VALUES ('<p>驾驶人有下列哪种违法行为一次记6分？&nbsp;&nbsp;<br></p>', '', '["<p>使用其他车辆行驶证&nbsp;&nbsp;<br></p>","<p>饮酒后驾驶机动车&nbsp;&nbsp;<br></p>","<p>车速超过规定时速50%以上&nbsp;&nbsp;<br></p>","<p>违法占用应急车道行驶&nbsp;&nbsp;<br></p>"]', '["<p>违法占用应急车道行驶&nbsp;&nbsp;<br></p>","<p>车速超过规定时速50%以上&nbsp;&nbsp;<br></p>","<p>饮酒后驾驶机动车&nbsp;&nbsp;<br></p>","<p>使用其他车辆行驶证&nbsp;&nbsp;<br></p>"]', 1, null, null, '星残', 1, '[''PRIVATE''', '2019-04-23 13:28:49', '交通,科一,汽车', 'active');
INSERT INTO nice_test.question_choose (topic, remarks, choices, answer, type, subjectId, subject, createUser, createUserId, permission, createDate, keyword, dataStatus) VALUES ('<p>在机场、商厦、地铁等公共场所乘自动扶梯时应靠（）站立,另一侧供有急事赶路的人快行。&nbsp;&nbsp;&nbsp;&nbsp;<br></p>', '', '["<p>左侧&nbsp;&nbsp;<br></p>","<p>右侧&nbsp;&nbsp;<br></p>","<p>中间&nbsp;&nbsp;&nbsp;<br></p>"]', '["<p>右侧&nbsp;&nbsp;<br></p>"]', 0, null, null, '星残', 1, '[''PRIVATE''', '2019-04-23 13:34:08', '常识', 'active');
INSERT INTO nice_test.question_choose (topic, remarks, choices, answer, type, subjectId, subject, createUser, createUserId, permission, createDate, keyword, dataStatus) VALUES ('<p>一般性的拜访多以（）为最佳交往时间。&nbsp;&nbsp;<br></p>', '', '["<p>1小时左右<br></p>","<p>半小时左右&nbsp;&nbsp;<br></p>","<p>十分钟左右&nbsp;&nbsp;&nbsp;<br></p>"]', '["<p>半小时左右&nbsp;&nbsp;<br></p>"]', 0, null, null, '星残', 1, '[''PRIVATE''', '2019-04-23 13:35:17', '心理学,社交', 'active');
INSERT INTO nice_test.question_choose (topic, remarks, choices, answer, type, subjectId, subject, createUser, createUserId, permission, createDate, keyword, dataStatus) VALUES ('<p>一拜访他人应选择（）,并应提前打招呼。<br></p>', '', '["<p>清晨<br></p>","<p>用餐时间<br></p>","<p>&nbsp;节假日的下午或平日的晚饭后&nbsp;<br></p>"]', '["<p>&nbsp;节假日的下午或平日的晚饭后&nbsp;<br></p>"]', 0, null, null, '星残', 1, '[''PRIVATE''', '2019-04-23 13:36:21', '心理学,社交', 'active');
INSERT INTO nice_test.question_choose (topic, remarks, choices, answer, type, subjectId, subject, createUser, createUserId, permission, createDate, keyword, dataStatus) VALUES ('<p>在参加各种社交宴请宾客中,要注意从座椅的（）侧入座,动作应轻而缓,轻松自然。&nbsp;&nbsp;<br></p>', '', '["<p>前侧&nbsp;&nbsp;<br></p>","<p>左侧&nbsp;&nbsp;<br></p>","<p>右侧&nbsp;&nbsp;<br></p>"]', '["<p>右侧&nbsp;&nbsp;<br></p>"]', 0, null, null, '星残', 1, '[''PRIVATE''', '2019-04-23 13:37:22', '心理学,社交', 'active');
create table question_completion
(
    id           int auto_increment comment 'this logic no of question'
        primary key,
    keyword      varchar(48)  null comment 'the keyword of question',
    topic        varchar(512) null comment 'the topic of question',
    answer       varchar(256) null comment 'the answers of question, it is a json string',
    remarks      varchar(512) null comment 'the remarks of question',
    subject      varchar(128) null comment 'the subject of question belonged',
    subjectId    int          null comment 'the subject id of question belonged',
    createUser   varchar(32)  null comment 'create user',
    createUserId int          null comment 'the id of create user',
    createDate   datetime     null comment 'the add time of question',
    permission   varchar(200) null comment 'the permission of this question',
    dataStatus   varchar(11)  null comment 'data status of this question'
);

INSERT INTO nice_test.question_completion (keyword, topic, answer, remarks, subject, subjectId, createUser, createUserId, createDate, permission, dataStatus) VALUES ('量词,常识', '<p>我看见一(&nbsp;&nbsp;&nbsp;&nbsp;)马奔跑在草原上。</p>', '["匹|群"]', '<p>考查学生对量词的运用</p>', null, null, '星残', 1, '2019-04-15 08:35:31', null, null);
INSERT INTO nice_test.question_completion (keyword, topic, answer, remarks, subject, subjectId, createUser, createUserId, createDate, permission, dataStatus) VALUES ('历史,常识', '<p>国际我国古典四大名著是（）（）（）（）&nbsp;&nbsp;<br></p>', '["红楼梦","水浒传","三国演义","西游记"]', '<p>考查对我国历史的熟悉</p>', null, null, '星残', 1, '2019-04-23 13:31:41', null, '1');
create table question_jquiz
(
    id            int auto_increment comment 'this logic no of question'
        primary key,
    topic         varchar(512)                 null comment 'the topic of question',
    answer        varchar(512)                 null comment 'the answers of question, it is a json string',
    answerKeyword varchar(512)                 null comment 'the key of answers of question',
    remarks       varchar(512)                 null comment 'the remarks of question',
    subject       varchar(128)                 null comment 'the subject of question belonged',
    subjectId     int                          null comment 'the subject id of question belonged',
    createUser    varchar(32)                  null comment 'create user',
    createUserId  int                          null comment 'the id of create user',
    createDate    datetime                     null comment 'the add time of question',
    permission    varchar(200)                 null comment 'the permission of this question',
    keyword       varchar(256)                 null comment 'the keyword of question',
    dataStatus    varchar(32) default 'active' null comment 'data status,{active,expired,deprecated}'
);

INSERT INTO nice_test.question_jquiz (topic, answer, answerKeyword, remarks, subject, subjectId, createUser, createUserId, createDate, permission, keyword, dataStatus) VALUES ('<p>请简单表述一下中国在饮食方面的礼仪&nbsp;&nbsp;<br></p>', '<p>此题没有正确答案，需要人工判分。&nbsp;&nbsp;<br></p>', '[]', '', null, null, '星残', 1, '2019-04-15 16:31:39', '["private"]', '礼仪', '1');
INSERT INTO nice_test.question_jquiz (topic, answer, answerKeyword, remarks, subject, subjectId, createUser, createUserId, createDate, permission, keyword, dataStatus) VALUES ('<p>请论述全球化对国家政治产生了哪些深刻的影响？&nbsp;&nbsp;<br></p>', '<p>全球化使国家主权受到一定的制约； 全球化对政府的治理提出了更高的要求。&nbsp;&nbsp;<br></p>', '[]', '', null, null, '星残', 1, '2019-04-23 13:32:48', '["private"]', '国际,经济,全球化', '1');
INSERT INTO nice_test.question_jquiz (topic, answer, answerKeyword, remarks, subject, subjectId, createUser, createUserId, createDate, permission, keyword, dataStatus) VALUES ('<p>请简单表述一下中国在饮食方面的礼仪&nbsp;&nbsp;&nbsp;&nbsp;<br></p>', '', '[]', '', null, null, '星残', 1, '2019-04-23 13:42:35', '["private"]', '礼仪,心理学', '1');
INSERT INTO nice_test.question_jquiz (topic, answer, answerKeyword, remarks, subject, subjectId, createUser, createUserId, createDate, permission, keyword, dataStatus) VALUES ('<p>请简单表述一下中国在饮食方面的礼仪&nbsp;&nbsp;<br></p>', '', '[]', '', null, null, '星残', 1, '2019-04-23 13:43:29', '["private"]', '礼仪,心理学', '1');
create table question_judge
(
    id           int auto_increment comment 'this logic no of question'
        primary key,
    keyword      varchar(48)  null comment 'the keyword of question',
    topic        varchar(512) null comment 'the topic of question',
    answer       tinyint      null comment 'the answers of question, 1 true 0 false',
    remarks      varchar(512) null comment 'the remarks of question',
    subjectId    varchar(128) null comment 'the subject of question belonged',
    subject      varchar(128) null comment 'the subject of question belonged',
    createUser   varchar(32)  null comment 'create user',
    createUserId int          null comment 'the id of create user',
    permission   varchar(200) null comment 'the permission of this question',
    createDate   datetime     null comment 'the add time of question',
    dataStatus   varchar(11)  null comment 'data status of this question'
);

INSERT INTO nice_test.question_judge (keyword, topic, answer, remarks, subjectId, subject, createUser, createUserId, permission, createDate, dataStatus) VALUES ('大学,极限', '<p>1=0.999.....</p>', 1, '<p>考查学生对极限的理解</p>', null, null, '星残', 1, '["private"]', '2019-04-13 17:26:49', '1');
INSERT INTO nice_test.question_judge (keyword, topic, answer, remarks, subjectId, subject, createUser, createUserId, permission, createDate, dataStatus) VALUES ('象棋,历史,常识', '<p>国际象棋起源于英国吗？&nbsp;&nbsp;<br></p>', 1, '', null, null, '星残', 1, '["private"]', '2019-04-23 13:29:39', '1');
INSERT INTO nice_test.question_judge (keyword, topic, answer, remarks, subjectId, subject, createUser, createUserId, permission, createDate, dataStatus) VALUES ('心理学,社交', '<p>与他人交谈完毕就可以立即转身离开。&nbsp;&nbsp;<br></p>', 0, '', null, null, '星残', 1, '["private"]', '2019-04-23 13:38:44', '1');
INSERT INTO nice_test.question_judge (keyword, topic, answer, remarks, subjectId, subject, createUser, createUserId, permission, createDate, dataStatus) VALUES ('常识,行为学', '<p>与使用手机时,手机不宜握在手里或挂在腰带上。<br></p>', 1, '', null, null, '星残', 1, '["private"]', '2019-04-23 13:39:24', '1');
INSERT INTO nice_test.question_judge (keyword, topic, answer, remarks, subjectId, subject, createUser, createUserId, permission, createDate, dataStatus) VALUES ('常识,心理学,行为学', '<p>行握手礼时,与多人同时握手时,可以交叉握手。&nbsp;&nbsp;<br></p>', 0, '', null, null, '星残', 1, '["private"]', '2019-04-23 13:40:07', '1');
INSERT INTO nice_test.question_judge (keyword, topic, answer, remarks, subjectId, subject, createUser, createUserId, permission, createDate, dataStatus) VALUES ('常识,心理学,行为学', '<p>与他人交谈时,要盯着他人的双眉到鼻尖的三角区域内。&nbsp;&nbsp;<br></p>', 0, '', null, null, '星残', 1, '["private"]', '2019-04-23 13:40:34', '1');
create table review
(
    id               int auto_increment
        primary key,
    context          varchar(500) null,
    reviewUserId     int          null,
    reviewUser       varchar(32)  null,
    reviewUserAvatar varchar(256) null,
    reviewTime       datetime     null,
    patternId        int          null,
    parentReviewId   int          null,
    dataStatus       varchar(11)  null comment 'data status of this question',
    good             int          null,
    bad              int          null
);


create table subject
(
    id           int auto_increment comment 'this logic no of question'
        primary key,
    name         varchar(128)                 null comment 'the name of subject',
    description  varchar(256)                 null comment 'the description of this subject',
    classifyId   int                          null comment 'the classify id of subject',
    classify     varchar(128)                 null comment 'the classify of subject',
    createUser   varchar(32)                  null comment 'create user',
    createUserId int                          null comment 'the id of create user',
    createDate   datetime                     null comment 'the create time of this subject',
    permission   varchar(200)                 null comment 'the permission of this subject',
    dataStatus   varchar(32) default 'active' null comment 'data status,{active,expired,deprecated}'
);


create table term
(
    id             int auto_increment comment 'this logic no of term'
        primary key,
    name           varchar(128)  null comment 'this name of term',
    avatar         varchar(512)  null comment 'the avatar of term',
    level          int           null comment 'the level of term',
    memberRank     varchar(256)  null comment 'the member level of term, json data [{rank:1,name:**},...]',
    description    varchar(512)  null comment 'this description of term',
    createDate     datetime      null comment 'create time of term',
    createUserId   int           null comment 'create user of term',
    createUserName varchar(32)   null comment 'create username of term',
    lastModifyTime datetime      null comment 'last modify time of term',
    lastActiveTime datetime      null comment 'last active time of term',
    leader         varchar(32)   null comment 'leader of term',
    leaderId       varchar(32)   null comment 'leader id of term',
    memberNumber   int default 1 null comment 'the number of member in term',
    dueTime        datetime      null comment 'the due time of term'
);


create table testpaper
(
    id             int auto_increment
        primary key,
    name           varchar(128)                       null,
    subjectId      int                                null,
    subject        varchar(128)                       null,
    createUserId   int                                null,
    createUser     varchar(128)                       null,
    createDateTime datetime default CURRENT_TIMESTAMP null,
    totalScore     int(3)   default 100               null,
    totalTime      int(3)   default 60                null,
    topics         varchar(500)                       null comment '{choose:[],jQuiz:[],completion:[],judge:[]}',
    description    varchar(200)                       null,
    keyword        varchar(200)                       null,
    permission     varchar(200)                       null comment 'the permission of this question',
    dataStatus     varchar(11)                        null comment 'data status of this question'
);


create table testplan
(
    id             int auto_increment
        primary key,
    name           varchar(128)                       null,
    remarks        varchar(200)                       null,
    testId         int                                null,
    testName       varchar(128)                       null,
    subjectId      int                                null,
    subject        varchar(128)                       null,
    createUserId   int                                null,
    createUser     varchar(128)                       null,
    createDateTime datetime default CURRENT_TIMESTAMP null,
    startTime      datetime                           null,
    endTime        datetime                           null,
    terms          varchar(200)                       null,
    joinNumber     int                                null,
    dataStatus     varchar(11)                        null comment 'data status of this question'
);


create table testscore
(
    id              int auto_increment
        primary key,
    testPlanId      int                                null,
    testPlanName    varchar(128)                       null,
    participantId   int                                null,
    participantName varchar(128)                       null,
    createDateTime  datetime default CURRENT_TIMESTAMP null,
    score           int                                null
);


create table user
(
    id          int auto_increment comment 'user logic id'
        primary key,
    username    varchar(32)                          null comment 'user login name',
    password    varchar(32)                          null comment 'user login password',
    nickname    varchar(16)                          null comment 'user nickname, display name',
    sex         varchar(1) default '男'               null comment 'user sex',
    birthday    date                                 null comment 'user birthday',
    avatar      varchar(256)                         null comment 'the uri of the user profile photo',
    tel         varchar(16)                          null comment 'user phone, one of login way instead username',
    email       varchar(64)                          null comment 'user email, one of login way instead username',
    create_time datetime   default CURRENT_TIMESTAMP null comment 'user create time',
    term        varchar(200)                         null comment 'user term, json data, [{id, name,level:{rank,name}},...]',
    roles       varchar(200)                         null comment 'the user having roles',
    region      varchar(32)                          null comment 'the user region,<json data>',
    autograph   varchar(64)                          null comment 'the sign of user',
    synopsis    varchar(512)                         null comment 'the user synopsis',
    identity    tinyint                              null
);

INSERT INTO nice_test.user (username, password, nickname, sex, birthday, avatar, tel, email, create_time, term, roles, region, autograph, synopsis, identity) VALUES ('hjm0928', 'e10adc3949ba59abbe56e057f20f883e', '星残', '男', '1996-09-28', 'default.jpg', null, null, '2019-02-22 21:20:14', null, null, null, null, null, null);
create definer = root@localhost view v_question_all_show as select md5(concat('choose', `nice_test`.`question_choose`.`id`))  AS `id`,
                                                                   if((`nice_test`.`question_choose`.`type` = 0), '单选', '多选') AS `type`,
                                                                   `nice_test`.`question_choose`.`topic`                      AS `topic`,
                                                                   `nice_test`.`question_choose`.`keyword`                    AS `keyword`,
                                                                   `nice_test`.`question_choose`.`createUser`                 AS `createUser`,
                                                                   `nice_test`.`question_choose`.`createUserId`               AS `createUserId`,
                                                                   `nice_test`.`question_choose`.`createDate`                 AS `createDate`
                                                            from `nice_test`.`question_choose`
                                                            union
                                                            select md5(concat('completion', `nice_test`.`question_completion`.`id`)) AS `id`,
                                                                   '填空'                                                              AS `type`,
                                                                   `nice_test`.`question_completion`.`topic`                         AS `topic`,
                                                                   `nice_test`.`question_completion`.`keyword`                       AS `keyword`,
                                                                   `nice_test`.`question_completion`.`createUser`                    AS `createUser`,
                                                                   `nice_test`.`question_completion`.`createUserId`                  AS `createUserId`,
                                                                   `nice_test`.`question_completion`.`createDate`                    AS `createDate`
                                                            from `nice_test`.`question_completion`
                                                            union
                                                            select md5(concat('judge', `nice_test`.`question_judge`.`id`)) AS `id`,
                                                                   '判断'                                                    AS `type`,
                                                                   `nice_test`.`question_judge`.`topic`                    AS `topic`,
                                                                   `nice_test`.`question_judge`.`keyword`                  AS `keyword`,
                                                                   `nice_test`.`question_judge`.`createUser`               AS `createUser`,
                                                                   `nice_test`.`question_judge`.`createUserId`             AS `createUserId`,
                                                                   `nice_test`.`question_judge`.`createDate`               AS `createDate`
                                                            from `nice_test`.`question_judge`
                                                            union
                                                            select md5(concat('jquiz', `nice_test`.`question_jquiz`.`id`)) AS `id`,
                                                                   '简答'                                                    AS `type`,
                                                                   `nice_test`.`question_jquiz`.`topic`                    AS `topic`,
                                                                   `nice_test`.`question_jquiz`.`keyword`                  AS `keyword`,
                                                                   `nice_test`.`question_jquiz`.`createUser`               AS `createUser`,
                                                                   `nice_test`.`question_jquiz`.`createUserId`             AS `createUserId`,
                                                                   `nice_test`.`question_jquiz`.`createDate`               AS `createDate`
                                                            from `nice_test`.`question_jquiz`;

-- comment on column v_question_all_show.topic not supported: the topic of question

-- comment on column v_question_all_show.keyword not supported: the keyword of question

-- comment on column v_question_all_show.createUser not supported: create user

-- comment on column v_question_all_show.createUserId not supported: the id of create user

-- comment on column v_question_all_show.createDate not supported: the add time of question

INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('4bc32826ebdeb72e8443466308f37df6', '单选', '<p>《静夜思》是哪位诗人所作？</p>', '小学,古诗词', '星残', 1, '2019-04-13 15:43:23');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('c265320fcd082587cbbf2b6ad5e07ee3', '单选', '<p>3*5+5*3的结果为</p>', '小学,数学,四则运算', '星残', 1, '2019-04-15 10:39:07');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('27773de30f2668e34073b813f8d273a7', '单选', '<p>驾驶人有下列哪种违法行为一次记6分&nbsp;&nbsp;<br></p>', '交通,科一,汽车', '星残', 1, '2019-04-23 13:26:33');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('daf053571b85e7af64601c1c77305da3', '多选', '<p>驾驶人有下列哪种违法行为一次记6分？&nbsp;&nbsp;<br></p>', '交通,科一,汽车', '星残', 1, '2019-04-23 13:28:49');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('ebb9e0f2f834481e84212db16d38887c', '单选', '<p>在机场、商厦、地铁等公共场所乘自动扶梯时应靠（）站立,另一侧供有急事赶路的人快行。&nbsp;&nbsp;&nbsp;&nbsp;<br></p>', '常识', '星残', 1, '2019-04-23 13:34:08');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('b22978e41a393fc23a345e04e9fc1ffd', '单选', '<p>一般性的拜访多以（）为最佳交往时间。&nbsp;&nbsp;<br></p>', '心理学,社交', '星残', 1, '2019-04-23 13:35:17');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('6a7c70b799c34278bb25f00af78d8040', '单选', '<p>一拜访他人应选择（）,并应提前打招呼。<br></p>', '心理学,社交', '星残', 1, '2019-04-23 13:36:21');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('73b9f15bf2edc6787d1af52d8a4e3c79', '单选', '<p>在参加各种社交宴请宾客中,要注意从座椅的（）侧入座,动作应轻而缓,轻松自然。&nbsp;&nbsp;<br></p>', '心理学,社交', '星残', 1, '2019-04-23 13:37:22');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('a5c187c3c6007b0aac3d0cce922c8edf', '填空', '<p>我看见一(&nbsp;&nbsp;&nbsp;&nbsp;)马奔跑在草原上。</p>', '量词,常识', '星残', 1, '2019-04-15 08:35:31');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('bf776add4d2d08099e8f6915107aed26', '填空', '<p>国际我国古典四大名著是（）（）（）（）&nbsp;&nbsp;<br></p>', '历史,常识', '星残', 1, '2019-04-23 13:31:41');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('1256db16c9c3ee2f9463fe547433950d', '判断', '<p>1=0.999.....</p>', '大学,极限', '星残', 1, '2019-04-13 17:26:49');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('e06eb0f114ebbc1f2f262f9976f0c715', '判断', '<p>国际象棋起源于英国吗？&nbsp;&nbsp;<br></p>', '象棋,历史,常识', '星残', 1, '2019-04-23 13:29:39');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('84b50f423d987710abfe89d72cc3550f', '判断', '<p>与他人交谈完毕就可以立即转身离开。&nbsp;&nbsp;<br></p>', '心理学,社交', '星残', 1, '2019-04-23 13:38:44');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('7b3492a59cf60349e7f15c4d0d6f8bed', '判断', '<p>与使用手机时,手机不宜握在手里或挂在腰带上。<br></p>', '常识,行为学', '星残', 1, '2019-04-23 13:39:24');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('b3a41e9faa90e0aa3bad31c385f14252', '判断', '<p>行握手礼时,与多人同时握手时,可以交叉握手。&nbsp;&nbsp;<br></p>', '常识,心理学,行为学', '星残', 1, '2019-04-23 13:40:07');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('efa137549e0680ed158874008de8f281', '判断', '<p>与他人交谈时,要盯着他人的双眉到鼻尖的三角区域内。&nbsp;&nbsp;<br></p>', '常识,心理学,行为学', '星残', 1, '2019-04-23 13:40:34');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('8d05364acdf35ca2130b2747d7a1cd7d', '简答', '<p>请简单表述一下中国在饮食方面的礼仪&nbsp;&nbsp;<br></p>', '礼仪', '星残', 1, '2019-04-15 16:31:39');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('f90e3f6fb69acf64508a3473844966ee', '简答', '<p>请论述全球化对国家政治产生了哪些深刻的影响？&nbsp;&nbsp;<br></p>', '国际,经济,全球化', '星残', 1, '2019-04-23 13:32:48');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('6f86b19b13f443c1c9240dcbe1aec87d', '简答', '<p>请简单表述一下中国在饮食方面的礼仪&nbsp;&nbsp;&nbsp;&nbsp;<br></p>', '礼仪,心理学', '星残', 1, '2019-04-23 13:42:35');
INSERT INTO nice_test.v_question_all_show (id, type, topic, keyword, createUser, createUserId, createDate) VALUES ('69ae73f1a52599fb98729baf08e73072', '简答', '<p>请简单表述一下中国在饮食方面的礼仪&nbsp;&nbsp;<br></p>', '礼仪,心理学', '星残', 1, '2019-04-23 13:43:29');
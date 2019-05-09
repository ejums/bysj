#drop the database if exists nad create
drop database if exists nice_test;
create database nice_test charset 'utf8';

#open nice_test;
use nice_test;

#create table user, the table using saving the user information
create table user(
  id int(11) auto_increment comment 'user logic id'primary key,
  username varchar(32) comment 'user login name',
  password varchar(32) comment 'user login password',
  nickname varchar(16) comment 'user nickname, display name',
  sex varchar(1) default '男' comment 'user sex',
  birthday date comment 'user birthday',
  avatar varchar(256) comment 'the uri of the user profile photo',
  tel varchar(16) comment 'user phone, one of login way instead username',
  email varchar(64) comment 'user email, one of login way instead username',
  create_time datetime default CURRENT_TIMESTAMP comment 'user create time',
  term varchar(200) comment 'user term, json data, [{id, name,level:{rank,name}},...]',
  roles varchar(200) comment 'the user having roles',
  region varchar(32) comment 'the user region,<json data>',
  autograph varchar(64) comment 'the sign of user',
  synopsis varchar(512) comment 'the user synopsis'
) charset 'utf8';

#create table login_record;
create table login_record(
  id int(11) auto_increment comment 'the logic no of this table' primary key,
  user_id  int(11) comment 'the user id of logon',
  username  varchar(32) comment 'the username of logon',
  login_time datetime default CURRENT_TIMESTAMP comment 'the time of login',
  login_region varchar(32) comment 'the region of logon user',
  login_ip varchar(128) comment 'the ip of login user',
  logout_time datetime comment 'the time of user logout',
  logout_way varchar(20) default '1' comment 'the way of user logout, 1 as unknown way, 0 as normal way'
) charset 'utf8';

#create table organization
create table term(
     id integer(11) primary key  auto_increment comment 'this logic no of term',
     name varchar(128) comment 'this name of term',
     avatar varchar(512) comment 'the avatar of term',
     level int comment 'the level of term',
     memberRank varchar(256) comment 'the member level of term, json data [{rank:1,name:**},...]',
     description varchar(512) comment 'this description of term',
     createDate DATETIME comment 'create time of term',
     createUserId int(11) comment 'create user of term',
     createUserName varchar(32) comment 'create username of term',
     lastModifyTime DATETIME comment 'last modify time of term',
     lastActiveTime DATETIME comment 'last active time of term',
     leader varchar(32) comment 'leader of term',
     leaderId varchar(32) comment 'leader id of term',
     memberNumber int default 1 comment 'the number of member in term',
     dueTime datetime comment 'the due time of term'
)charset 'utf8';
#菜单
create table menu(
     id integer(11) primary key  auto_increment comment 'this logic no of menu',
     name varchar(32) comment 'the name of menu',
     parentId integer(11) comment 'the parent menu id' default 0,
     url varchar(64) comment 'the url of menu',
     icon varchar(64) comment 'the icon class of menu',
     createUserId int(11) comment 'the create user id of menu',
     createUser varchar(32) comment 'create user',
     createTime datetime default CURRENT_TIMESTAMP  comment 'create time',
     dataStatus varchar(32) default 'active' comment 'data status,{active,expired,deprecated}'
) charset 'utf8';

#科目
#create table subject
create table subject(
    id integer(11) primary key  auto_increment comment 'this logic no of question',
    name varchar(128) comment 'the name of subject',
    description varchar(256) comment  'the description of this subject',
    classifyId integer(11) comment 'the classify id of subject',
    classify varchar(128) comment 'the classify of subject',
    createUser varchar(32) comment 'create user',
    createUserId integer(11) comment 'the id of create user',
    createDate DATETIME comment 'the create time of this subject',
    permission varchar(200) comment 'the permission of this subject',
    dataStatus varchar(32) default 'active' comment 'data status,{active,expired,deprecated}'
) charset 'utf8';

#选择题
#create table question, the table is this system main item;
create table question_choose (
  id          integer(11) primary key auto_increment
  comment 'this logic no of question',
  topic varchar(512) comment 'the topic of question',
  remarks       varchar(512) comment 'the title of remarks ',
  choices     varchar(512) comment 'the choices of the question',
  answer      varchar(20) comment 'the answer of question, it is a json string',
  remark        tinyint comment 'the remark of choose question, 0:single choice question, 1: more choices question',
  subjectId int(11) comment 'the subject id of question belonged',
  subject varchar(128) comment 'the subject of question belonged',
  createUser varchar(32) comment 'create user',
  createUserId integer(11) comment 'the id of create user',
  permission varchar(200) comment 'the permission of this question',
  createDate DATETIME comment 'the add time of question',
  keyword     varchar(48) comment 'the keyword of question',
  dataStatus varchar(32) default 'active' comment 'data status,{active,expired,deprecated}'
)charset 'utf8MB4';

#简答题
create table question_jquiz(
  id          integer(11) primary key auto_increment
  comment 'this logic no of question',
  topic varchar(512) comment 'the topic of question',
  answer      varchar(512) comment 'the answers of question, it is a json string',
  answerKeyword varchar(512) comment  'the key of answers of question',
  remarks       varchar(512) comment 'the remarks of question ',
  subject varchar(128) comment 'the subject of question belonged',
  subjectId int(11) comment 'the subject id of question belonged',
  createUser varchar(32) comment 'create user',
  createUserId integer(11) comment 'the id of create user',
  createDate DATETIME comment 'the add time of question',
  permission varchar(200) comment 'the permission of this question',
  keyword     varchar(256) comment 'the keyword of question',
  dataStatus varchar(32) default 'active' comment 'data status,{active,expired,deprecated}'
)charset 'utf8';

#填空题
create table question_completion(
  id          integer(11) primary key auto_increment
  comment 'this logic no of question',
  keyword     varchar(48) comment 'the keyword of question',
  topic varchar(512) comment 'the topic of question',
  answer      varchar(256) comment 'the answers of question, it is a json string',
  remarks       varchar(512) comment 'the remarks of question ',
  subject varchar(128) comment 'the subject of question belonged',
  subjectId int(11) comment 'the subject id of question belonged',
  createUser varchar(32) comment 'create user',
  createUserId integer(11) comment 'the id of create user',
  createDate DATETIME comment 'the add time of question',
  permission varchar(200) comment 'the permission of this question',
  dataStatus varchar(11) comment 'data status of this question'
)charset 'utf8';

#判断题
create table question_judge(
  id          integer(11) primary key auto_increment
  comment 'this logic no of question',
  keyword     varchar(48) comment 'the keyword of question',
  topic varchar(512) comment 'the topic of question',
  answer  tinyint comment 'the answers of question, 1 true 0 false',
  remarks   varchar(512) comment 'the remarks of question ',
  subjectId varchar(128) comment 'the subject of question belonged',
  subject varchar(128) comment 'the subject of question belonged',
  createUser varchar(32) comment 'create user',
  createUserId integer(11) comment 'the id of create user',
  permission varchar(200) comment 'the permission of this question',
  create_date DATETIME comment 'the add time of question',
  dataStatus varchar(11) comment 'data status of this question'
) charset 'utf8';

#试卷表
create table testPaper(
    id          integer(11) primary key auto_increment,
    name varchar(128),
    subjectId integer(11),
    subject varchar(128),
    createUserId integer(11),
    createUser varchar(128),
    createDateTime DATETIME default current_timestamp,
    totalScore int(3) default 100,
    totalTime int(3) default 60,
    topics varchar(500) comment '{choose:[],jQuiz:[],completion:[],judge:[]}',
    description varchar(200),
    keyword varchar(200),
    permission varchar(200) comment 'the permission of this question',
    dataStatus varchar(11) comment 'data status of this question'
);

#考试安排表
create table testPlan(
    id integer(11) primary key auto_increment,
    name varchar(128),
    remarks varchar(200),
    testId integer(11),
    testName varchar(128),
    subjectId integer(11),
    subject varchar(128),
    createUserId integer(11),
    createUser varchar(128),
    createDateTime DATETIME default current_timestamp,
    startTime datetime,
    endTime datetime,
    terms varchar(200),
    joinNumber int,
    dataStatus varchar(11) comment 'data status of this question'
);

create table testScore(
      id integer(11) primary key auto_increment,
      testPlanId int(11),
      testPlanName varchar(128),
      participantId int(11),
      participantName varchar(128),
      createDateTime datetime default current_timestamp,
      score int
) charset 'utf8';

create table review(
    id integer(11) primary key auto_increment,
    context varchar(500),
    reviewUserId int(11),
    reviewUser varchar(32),
    reviewUserAvatar varchar(256),
    reviewTime datetime,
    patternId int(11),
    parentReviewId int(11),
    dataStatus varchar(11) comment 'data status of this question',
    good int,
    bad int
) charset 'utf8';

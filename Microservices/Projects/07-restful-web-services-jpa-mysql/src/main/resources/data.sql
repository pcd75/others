insert into user_details(id, birth_date,name)
values(10001,current_date(),'nath');

insert into user_details(id, birth_date,name)
values(10002,current_date(),'adi');

insert into user_details(id, birth_date,name)
values(10003,current_date(),'asd');

insert into role(id, role_name, user_id)
values(21,'admin',10001);

insert into role(id, role_name, user_id)
values(22,'employee',10002);

insert into role(id, role_name, user_id)
values(23,'employee',10003);
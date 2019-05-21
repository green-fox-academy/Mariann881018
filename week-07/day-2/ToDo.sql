create database if not exists todoApp;
show databases;
use todoApp;

create table persons (
id int auto_increment primary key,
name varchar(30) not null,
age smallint
);

create table tasks (
id int auto_increment primary key,
job varchar(30) not null
);

create table todos (
exerciseID int auto_increment primary key,
pID int,
tID int,
taskStatus enum('Todo','Doing','Review','Done'),
foreign key (pID) references persons(id),
foreign key (tID) references tasks(id)
);

insert into persons (name,age) 
values ("Barna", 25),
		("Alex", 23),
        ("Tojas", 31),
        ("Andrea", 18);
        
insert into tasks (job) 
values  ("work"),
		("learn"),
        ("check");

insert into todos (pID, tID,taskStatus) 
values  (1,1,'Todo'),
		(1,2, 'Doing'),
        (2,3, 'Review'),
        (2,2, 'Done'),
        (3,1, 'Todo'),
        (4,2, 'Doing');

select * from todos;        
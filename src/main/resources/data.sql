/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  THABO64
 * Created: Feb 12, 2018
 */


--example

insert into subject (subject_name) values('Maths');
insert into subject (subject_name) values('English');

insert into mark (subject_id,marks)  values(1, 58.7);
insert into mark (subject_id,marks)  values(1, 78.7);
insert into mark (subject_id,marks)  values(2, 48.7);

insert into student (student_id, firstname, lastname, username, password, cellphone) values(1, 'Glen', 'Mogane', 'Tswalano', 'mogane42', 0617262421);
insert into student (student_id, firstname, lastname, username, password, cellphone) values(2, 'Dave', 'Van Dyk', 'Davey', 'dave42', 0836183698);
insert into student (student_id, firstname, lastname, username, password, cellphone) values(3, 'Tumi', 'Mashego', 'TumiM', 'tumi42', 0725547896);

insert into grade (grade_id,grade_year,grade,student_id) values(1, 2010, 5, 1);
insert into grade (grade_id,grade_year,grade,student_id) values(2, 2011, 6, 1);
insert into grade (grade_id,grade_year,grade,student_id) values(3, 2012, 7, 1);
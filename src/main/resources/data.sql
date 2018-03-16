/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  THABO64
 * Created: Feb 12, 2018
 */

insert into subject (subject_name) values('Maths');
insert into subject (subject_name) values('English');

insert into mark (subject_id,marks)  values(1, 58.7);
insert into mark (subject_id,marks)  values(1, 78.7);
insert into mark (subject_id,marks)  values(2, 48.7);

insert into student (student_id, firstname, surname, dob, gender, zip, citizenship, id_number, username, password, cellphone) values(1, 'Glen', 'Mogane', '1995-09-10', 'Male', 1502, 'South African', 9509106101083, 'Tswalano', 'mogane@42', 0617262421);

insert into grade (grade_id,grade_year,grade,student_id) values(1, 2010, 5, 1);
insert into grade (grade_id,grade_year,grade,student_id) values(2, 2011, 6, 1);
insert into grade (grade_id,grade_year,grade,student_id) values(3, 2012, 7, 1);
insert into grade (grade_id,grade_year,grade,student_id) values(4, 2013, 8, 1);
insert into grade (grade_id,grade_year,grade,student_id) values(5, 2014, 9, 1);
insert into grade (grade_id,grade_year,grade,student_id) values(6, 2015, 10, 1);

insert into school (school_id, emis_number, school_name, province, district, region) values(1, 706121341, 'Clever Kids Primary School', 'Gauteng', 'Montana', 'Eastern');

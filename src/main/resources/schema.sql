/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  THABO64
 * Created: Feb 12, 2018
 */



---example 
create table subject (
    id integer auto_increnent not null,
	subject_name varchar(32) not null
);

create table mark(
      id integer auto_increment not null,
	  subject_id integer ,
	  marks double ,
	  subject_id_fk foreign key references subjets (subject_id)  
);

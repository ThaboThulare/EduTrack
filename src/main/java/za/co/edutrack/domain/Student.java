/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.edutrack.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Tswalano
 */

@Entity
@Table(name = "student")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "mark_id")
    Mark mark;
    
    @Column(name = "firstname")
    private String firstname;
    
    @Column(name = "surname")
    private String surname;
    
     @Column(name = "dob")
    private String dob;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "zip")
    private Integer zip;
    
    @Column(name = "citizenship")
    private String citizenship;
    
    @Column(name = "id_number")
    private Float id_number;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "cellphone")
    private Integer cellphone;

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public Float getId_number() {
        return id_number;
    }

    public void setId_number(Float id_number) {
        this.id_number = id_number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCellphone() {
        return cellphone;
    }

    public void setCellphone(Integer cellphone) {
        this.cellphone = cellphone;
    }

    
}

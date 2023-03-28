package com.lolo.app.rest.model;

import jakarta.persistence.*;

@Entity
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;

    @Column
    private String surname;
    @Column
    private int age;
    @Column
    private String occupation;

    public long getID(){
        return id;
    }

    public void setID(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getOccupation(){
        return occupation;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }


}

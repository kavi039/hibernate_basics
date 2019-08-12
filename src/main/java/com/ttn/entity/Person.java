package com.ttn.entity;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {

    @Id
    private Integer id;
    private String name;
    private int age;

    @CollectionTable(joinColumns = @JoinColumn(name = "id"))
    @ElementCollection
    Set<String> hobbies=new HashSet<String>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<String> hobbies) {
        this.hobbies = hobbies;
    }
}

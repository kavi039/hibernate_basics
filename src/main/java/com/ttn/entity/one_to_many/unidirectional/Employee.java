package com.ttn.entity.one_to_many.unidirectional;

import org.hibernate.annotations.Cascade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;
import java.util.HashSet;

@Entity
@Table(name = "oneToManyUnidirectionalEmployee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    Integer id;
    String name;
    Integer age;
    @OneToMany(cascade = CascadeType.ALL)
//    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(joinColumns = @JoinColumn(name="USER_ID")
            ,inverseJoinColumns = @JoinColumn(name = "VEHICAL_ID"))
    Collection<Vehicle> vehicle= new HashSet<Vehicle>();

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Collection<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(Collection<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }
}

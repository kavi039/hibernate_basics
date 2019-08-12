package com.ttn.entity.many_to_one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ManyToManyBidirectionalVehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer vehicleId;
    String vehicleName;
    @ManyToMany(mappedBy = "vehicle")
    List<Employee> personList = new ArrayList<Employee>();

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public List<Employee> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Employee> personList) {
        this.personList = personList;
    }
}
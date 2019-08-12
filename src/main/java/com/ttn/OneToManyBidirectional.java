package com.ttn;

import com.ttn.entity.one_to_many.bydirectional.Employee;
import com.ttn.entity.one_to_many.bydirectional.Vehicle;
import com.ttn.util.HibernateUtil;
import org.hibernate.Session;

public class OneToManyBidirectional {

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setName("Hibernate");
        employee.setAge(27);
        employee.setId(1);
        Vehicle vehicle=new Vehicle();
        vehicle.setVehicleName("Car");
        vehicle.setEmployee(employee);
        Vehicle vehicle2=new Vehicle();
        vehicle2.setEmployee(employee);
        vehicle2.setVehicleName("Bike");
//        employee.getVehicle().add(vehicle);
//        employee.getVehicle().add(vehicle2);
        Session session= HibernateUtil.getSession();
        session.beginTransaction();
        session.save(employee);
        session.save(vehicle);
        session.save(vehicle2);
        session.getTransaction().commit();
        session.close();
    }
}

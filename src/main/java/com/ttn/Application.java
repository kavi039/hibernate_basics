package com.ttn;

import com.ttn.entity.one_to_one.Person;
import com.ttn.entity.one_to_one.Vehicle;
import com.ttn.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;

public class Application {

    public static void main(String[] args) {
        Person person=new Person();
        person.setName("Hibernate");
        person.setAge(27);
//        person.setId(2);
        Vehicle vehicle=new Vehicle();
        vehicle.setVehicleName("Car");
        person.setVehicle(vehicle);
//        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("kkkkkk");
//          SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class).addAnnotatedClass(Vehicle.class).buildSessionFactory();
        SessionFactory sessionFactory=new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Vehicle.class).buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(vehicle);
        session.save(person);
//        person.setName(".................");
        session.getTransaction().commit();
        //Using util class get session
       /* Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();*/
    }
}

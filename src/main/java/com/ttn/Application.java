package com.ttn;

import com.ttn.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {

    public static void main(String[] args) {
        Person person=new Person();
        person.setName("Hibernate");
        person.setAge(27);
        person.setId(2);
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
    }
}

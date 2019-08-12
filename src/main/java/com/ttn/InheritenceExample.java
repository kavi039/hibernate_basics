package com.ttn;

import com.ttn.entity.inheritence.single_table.*;
import com.ttn.util.HibernateUtil;
import org.hibernate.Session;

public class InheritenceExample {
    public static void main(String arg[]){
       //MappedSuperclass single table
        Account account = new Account();
        account.setBalance(90000);
        account.setId(1);
        DebitAccount debitAccount=new DebitAccount();
        debitAccount.setOwner("Peter");
        debitAccount.setBalance(23000);
        debitAccount.setInterestRate(23);
        debitAccount.setId(2);
        debitAccount.setOverdraftFee(2300);
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.save(debitAccount);
        session.save(account);
        session.getTransaction().commit();
       //MappedSuperclass
           }
}

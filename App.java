package com.vicky.hibernateDemo.hibernateDemo2;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.vicky.hibernateDemo.service.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SampleModel model=new SampleModel(102,"vicky","ABC@gmail.com","andheri");
        try {
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session=factory.getCurrentSession();
        Transaction trans=session.beginTransaction();
        session.save(model);
        trans.commit();
        }
        catch(Exception e)
        {
        	System.out.println("message"+e.getMessage());
        }
    }
}

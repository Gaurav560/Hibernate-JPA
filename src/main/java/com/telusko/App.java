package com.telusko;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien a3=new Alien();
        a3.setAid(9);
        a3.setAname("Maria");
      a3.setTech("Hardware");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
        EntityManager em=emf.createEntityManager();
        Alien a=em.find(Alien.class,1);
        System.out.println(a);

        em.getTransaction().begin();
        em.persist(a3);
        em.getTransaction().commit();
    }
}

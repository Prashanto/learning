package com.pklearning.hibernate.secondarytable;

import com.pklearning.hibernate.secondarytable.airport.Passenger;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("pklearning-hibernate-secondarytable");
        EntityManager em= emf.createEntityManager();

        em.getTransaction().begin();
        Passenger john=new Passenger(1,"John Smith");
        john.setCity("New York");
        john.setStreet("Flower st");
        john.setNumber("3");
        john.setZipCode("1234");
        john.setAreaCode("91");
        john.setPrefix("40");
        john.setLineNumber("123456");
        Passenger jake=new Passenger(2,"Jake Cullen");
        jake.setCity("Sydney");
        jake.setStreet("Hull st");
        jake.setNumber("120");
        jake.setZipCode("2000");
        jake.setAreaCode("99");
        jake.setPrefix("56");
        jake.setLineNumber("987456");
        em.persist(john);
        em.persist(jake);
        em.getTransaction().commit();
        em.close();
    }
}
package com.pklearning.hibernate;

import com.pklearning.hibernate.airport.Airport;
import com.pklearning.hibernate.airport.Passenger;
import com.pklearning.hibernate.airport.Ticket;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("pklearning-hibernate");
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();;

        Airport airport=new Airport(1, "Kempegowda International Airport");

        Passenger prashanto=new Passenger(1,"Prashanto Kumar");
        Passenger niharika=new Passenger(2, "Niharika Roy");
        prashanto.setAirport(airport);
        niharika.setAirport(airport);


        airport.addPassengers(prashanto);
        airport.addPassengers(niharika);

        Ticket ticket1=new Ticket(1,"PK001");
        ticket1.setPassenger(prashanto);
        Ticket ticket2=new Ticket(2,"PK002");
        ticket2.setPassenger(prashanto);

        prashanto.addTickets(ticket1);
        prashanto.addTickets(ticket2);

        Ticket ticket3 =new Ticket(3,"NR001");
        ticket3.setPassenger(niharika);
        niharika.addTickets(ticket3);

        em.persist(airport);
        em.persist(prashanto);
        em.persist(niharika);
        em.persist(ticket1);
        em.persist(ticket2);
        em.persist(ticket3);



        em.getTransaction().commit();
        em.close();
    }
}

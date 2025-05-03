package com.pklearning.hibernate.airport;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "PASSENGER")
public class Passenger {

    @Id
    @Column(name="ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "AIRPORT_ID")
    private Airport airport;

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(this.tickets);
    }

    public void addTickets(Ticket ticket) {
        this.tickets.add(ticket);
    }

    @OneToMany(mappedBy = "passenger")
    private List<Ticket> tickets =new ArrayList<>();

    public Passenger(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Passenger() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}

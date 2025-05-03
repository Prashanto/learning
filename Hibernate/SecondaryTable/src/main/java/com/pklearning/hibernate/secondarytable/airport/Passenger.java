package com.pklearning.hibernate.secondarytable.airport;

import com.pklearning.hibernate.secondarytable.util.Constants;
import jakarta.persistence.*;

@Entity
@Table(name = Constants.table_passengers)
//For single secondary table
//@SecondaryTable(name = Constants.table_addresses, pkJoinColumns = @PrimaryKeyJoinColumn(name = "PASSENGER_ID", referencedColumnName = "PASSENGER_ID") )

//For multiple secondary table
@SecondaryTables(
        {
                @SecondaryTable(name=Constants.table_addresses, pkJoinColumns = @PrimaryKeyJoinColumn(name = Constants.passenger_id, referencedColumnName = Constants.passenger_id)),
                @SecondaryTable(name = Constants.table_phones,pkJoinColumns = @PrimaryKeyJoinColumn(name = Constants.passenger_id, referencedColumnName = Constants.passenger_id))
        }
)

public class Passenger {

    @Id
    @Column(name = "PASSENGER_ID")
    private int id;

    @Column(name = "PASSENGER_NAME", table = Constants.table_passengers)
    private String name;

    @Column(name = "STREET", table = Constants.table_addresses, columnDefinition = "varchar(25) not null")
    private String street;
    @Column(name = "NUMBER", table = Constants.table_addresses, columnDefinition = "varchar(25) not null")
    private String number;
    @Column(name = "ZIP_CODE", table = Constants.table_addresses, columnDefinition = "varchar(25) not null")
    private String zipCode;
    @Column(name = "CITY", table = Constants.table_addresses, columnDefinition = "varchar(25) not null")
    private String city;

    @Column(name = "AREA_CODE", table = Constants.table_phones, columnDefinition = "varchar(25) not null")
    private String areaCode;
    @Column(name = "PREFIX", table = Constants.table_phones, columnDefinition = "varchar(25) not null")
    private String prefix;
    @Column(name = "LINE_NUMBER", table = Constants.table_phones, columnDefinition = "varchar(25) not null")
    private String lineNumber;


    public Passenger() {
    }

    public Passenger(int id, String name) {
        this.id = id;
        this.name = name;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }
}

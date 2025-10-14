package com.projetoTEA5.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Responsible extends Person {

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(nullable = false)
    private String cep;

    @Column(name = "public_place", nullable = false)
    private String publicPlace;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(nullable = false)
    private String neighbourhood;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String complement;

    public Responsible() {
    }

    public Responsible(String fullName, String cpf, LocalDate birthDate, String gender, User user, String contactNumber, String cep, String publicPlace, String houseNumber, String neighbourhood, String city, String state, String complement) {
        super(fullName, cpf, birthDate, gender, user);
        this.contactNumber = contactNumber;
        this.cep = cep;
        this.publicPlace = publicPlace;
        this.houseNumber = houseNumber;
        this.neighbourhood = neighbourhood;
        this.city = city;
        this.state = state;
        this.complement = complement;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}

package com.projetoTEA5.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Responsible extends Person {

    private String email;
    private String contact_number;
    private String cep;
    private String public_place;
    private String house_number;
    private String neighbourhood;
    private String city;
    private String state;
    private String complement;

    public Responsible() {
    }

    public Responsible(Long id, String full_name, String cpf, String birth_date, String gender, String email, String contact_number, String cep, String public_place, String house_number, String neighbourhood, String city, String state, String complement) {
        super(id, full_name, cpf, birth_date, gender);
        this.email = email;
        this.contact_number = contact_number;
        this.cep = cep;
        this.public_place = public_place;
        this.house_number = house_number;
        this.neighbourhood = neighbourhood;
        this.city = city;
        this.state = state;
        this.complement = complement;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPublic_place() {
        return public_place;
    }

    public void setPublic_place(String public_place) {
        this.public_place = public_place;
    }

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
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

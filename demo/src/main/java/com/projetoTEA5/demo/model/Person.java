package com.projetoTEA5.demo.model;

public class Person {

    private Long id;
    private String full_name;
    private String cpf;
    private String birth_date;
    private String gender;

    public Person() {
    }

    public Person(Long id, String full_name, String cpf, String birth_date, String gender) {
        this.id = id;
        this.full_name = full_name;
        this.cpf = cpf;
        this.birth_date = birth_date;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

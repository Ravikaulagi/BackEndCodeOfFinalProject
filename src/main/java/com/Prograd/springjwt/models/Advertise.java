package com.Prograd.springjwt.models;

import javax.persistence.*;

@Entity
@Table(name = "advertise")
public class Advertise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public void Advertise()
    {}
    @Column(name = "companyname",nullable = false)
    private String companyname;
    @Column(name="city",nullable = false)
    private String city;
    @Column(name = "title",nullable = false)
    private String title;
    @Column(name = "firstname",nullable = false)
    private String firstname;
    @Column(name="lastname",nullable = false)
    private String lastname;
   @Column(name = "mobileno",nullable = false)
    private int mobileno;
   @Column(name = "landlineno",nullable = false)
    private int landlineno;

    public int getLandlineno() {
        return landlineno;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getMobileno() {
        return mobileno;
    }

    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }

    public Integer getId() {
        return id;
    }

    public void setLandlineno(int landlineno) {
        this.landlineno = landlineno;
    }
}

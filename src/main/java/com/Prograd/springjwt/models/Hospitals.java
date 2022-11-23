package com.Prograd.springjwt.models;


import javax.persistence.*;

@Entity
@Table(name = "Medicals")
public class Hospitals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public void Hospitals()
    {
    }

    @Column(name="hospitalname",nullable = false)
    private String hospitalname;

    @Column(name="phoneno",nullable = false)
    private int phoneno;

    @Column(name = "address",nullable = false)
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

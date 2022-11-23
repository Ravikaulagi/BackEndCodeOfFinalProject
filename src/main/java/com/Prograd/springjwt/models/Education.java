package com.Prograd.springjwt.models;


import javax.persistence.*;

@Entity
@Table(name = "Education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public void  Education(){};
     @Column(name = "institutename",nullable = false)
    private String institutename;

     @Column(name="phoneno",nullable = false)
    private int PhoneNo;

     @Column(name="address",nullable = false)
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.PhoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adreess) {
        this.address = adreess;
    }
}

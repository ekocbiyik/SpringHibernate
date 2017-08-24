package com.ekocbiyik.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by enbiya on 22.08.2017.
 */
@Entity
@Table(name = "t_personel")
public class Personel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "personel_id")
    private int personelId;

    @Column(name = "user_name")
    private String username;

    @Column(name = "password")
    private String password;

//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "vehicle_id")// bu değer db'de oluşturulacak kolonun adı!!!
//    private Vehicle vehicle;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "person")
    private List<Vehicle> vehicle = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")//önemi yok, sadece ifade etmek için
    private Address address;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")//doğaçlama
    private Set<Course> courses = new HashSet<>();

    public int getPersonelId() {
        return personelId;
    }

    public void setPersonelId(int personelId) {
        this.personelId = personelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(List<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

//    public Vehicle getVehicle() {
//        return vehicle;
//    }
//
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
}

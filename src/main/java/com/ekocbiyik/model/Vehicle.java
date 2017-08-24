package com.ekocbiyik.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by enbiya on 22.08.2017.
 */
@Entity
@Table(name = "t_vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vehicle_id")
    private int vehicleId;

    @Column(name = "vehicle_name")
    private String vehicleName;

    @ManyToOne
    @JoinColumn(name = "personel_id")
    private Personel person;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Personel getPerson() {
        return person;
    }

    public void setPerson(Personel person) {
        this.person = person;
    }
}

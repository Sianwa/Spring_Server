package com.example.ds_project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class ToyInformation {

    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private Integer dateOfManufacture;
    private Integer batchNumber;

    public ToyInformation(Integer id, String name, String description, Integer price, Integer dateOfManufacture,Integer batchNumber) {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Integer dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public Integer getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Integer batchNumber) {
        this.batchNumber = batchNumber;
    }
}


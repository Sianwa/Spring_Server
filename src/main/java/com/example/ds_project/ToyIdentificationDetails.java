package com.example.ds_project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 @Entity // This tells Hibernate to make a table out of this class
 public class ToyIdentificationDetails {
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
     private Integer id;
     private Integer toy_code;
     private String toy_name;

     public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }

     public Integer getToy_code() {
         return toy_code;
     }

     public void setToy_code(Integer toy_code) {
         this.toy_code = toy_code;
     }

     public String getToy_name() {
         return toy_name;
     }

     public void setToy_name(String toy_name) {
         this.toy_name = toy_name;
     }
 }


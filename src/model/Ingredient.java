package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Date;
/**
 *
 * @author imkir
 */
public class Ingredient {
    private final int id = 0;
    private final String name;
    private final Date expiryDate;

    public Ingredient(int id, String name, Date expiryDate) {
        //this.id = id;
        this.name = name;
        this.expiryDate = expiryDate;
    }
    public Ingredient(String name, Date expiryDate){
         this.name = name;
        this.expiryDate = expiryDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", expiryDate=" + expiryDate +
               '}';
    }

   
}

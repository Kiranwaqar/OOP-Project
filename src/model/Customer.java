/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
/**
 *
 * @author imkir
 */
public class Customer {
   private String preference;
    private List<String> allergies;

    public Customer(String preference, List<String> allergies) {
        this.preference = preference;
        this.allergies = allergies;
    }

    public String getPreference() {
        return preference;
    }

    public List<String> getAllergies() {
        return allergies;
    }   
}

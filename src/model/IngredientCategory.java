/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
  import java.util.List;
import model.Ingredient;
/**
 *
 * @author imkir
 */
public abstract class IngredientCategory {
  
   

   
    protected List<Ingredient> ingredients;

    // Abstract method to be implemented by subclasses to fetch all ingredients
   
public abstract List<Ingredient> getAllIngredients();

   
         
        
   
}



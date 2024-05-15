package model;
import java.util.Date;
import java.util.List;


public class Ingredient {
 


    private static int lastId = 0;
    private int id;
    private final String name;
    private final Date expiryDate;
    private String category;
     
    
    
    public Ingredient(int id, String name, Date expiryDate, String category) {
        this.id = ++lastId;
        this.name = name;
        this.expiryDate = expiryDate;
        this.category = category;
       
    }
 // Constructor with only name parameter (overloaded)
    public Ingredient(String name) {
        this.id = ++lastId;
        this.name = name;
        this.expiryDate = null; // Set default expiryDate to null
        this.category = ""; // Set default category to an empty string
    }
    
    // Constructor with name and category parameters
    public Ingredient(String name, String category) {
        this.id = ++lastId;
        this.name = name;
        this.expiryDate = null; // Set default expiryDate to null
        this.category = category;
    }
    

    // Getters and setters for id, name, expiryDate, category

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    // Getters and setters for allergens and dietaryRestrictions through IngredientDetails

  
    //public List<String> getDietaryRestrictions() {
      //  return details.getDietaryRestrictions();
    //}

    //ublic void setDietaryRestrictions(List<String> dietaryRestrictions) {
       // details.setDietaryRestrictions(dietaryRestrictions);
//    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", expiryDate=" + expiryDate +
                ", category='" + category + '\'' +
                
                
                '}';
    }

}

    


    


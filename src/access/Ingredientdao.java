package access;



import static gui.homeadmin.updateTable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Ingredient;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Ingredient;
public class Ingredientdao {
     private static Map<String, List<Ingredient>> categorizedIngredients = new HashMap<>();
    // Retrieves all ingredients from the database
  //  public static List<Ingredient> getAllIngredients() {
      //  List<Ingredient> ingredients = new ArrayList<>();
        //String sql = "SELECT id, name, expiry_date,category FROM Ingredients";
        //try (Connection conn = ConnectionProviderClass.getCon();
          //   Statement stmt = conn.createStatement();
            // ResultSet rs = stmt.executeQuery(sql)) {
            
            //while (rs.next()) {
              //  Ingredient ingredient = new Ingredient(
                //    rs.getInt("id"),
                  //  rs.getString("name"),
                    //rs.getDate("expiry_date"),
                      //   rs.getString("category")
                //);
                //ingredients.add(ingredient);
            //}
       // } catch (SQLException e) {
         //   e.printStackTrace();
     //   }
     //  return ingredients;
    
   // }
     private static List<Ingredient> fetchIngredientsFromDatabase() {
        List<Ingredient> ingredients = new ArrayList<>();
        String sql = "SELECT id, name, expiry_date, category FROM Ingredients";
        try (Connection conn = ConnectionProviderClass.getCon();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Ingredient ingredient = new Ingredient(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDate("expiry_date"),
                    rs.getString("category")
                );
                ingredients.add(ingredient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ingredients;
    }
    // Categorize ingredients
   private static void categorizeIngredients(List<Ingredient> ingredients) {
       for (Ingredient ingredient : ingredients) {
            String category = ingredient.getCategory();
            if (!categorizedIngredients.containsKey(category)) {
                categorizedIngredients.put(category, new ArrayList<>());
           }
            categorizedIngredients.get(category).add(ingredient);
        }
   }
public static List<Ingredient> getAllIngredients() {
        // Fetch ingredients from the database
        List<Ingredient> ingredients = fetchIngredientsFromDatabase();
        
        // Clear existing categorized ingredients
        categorizedIngredients.clear();
        
        // Categorize ingredients
        for (Ingredient ingredient : ingredients) {
            String category = ingredient.getCategory();
            if (!categorizedIngredients.containsKey(category)) {
                categorizedIngredients.put(category, new ArrayList<>());
            }
            categorizedIngredients.get(category).add(ingredient);
        }
        
        return ingredients;
    }
    // Adds a new ingredient to the database
    public static boolean addIngredient(Ingredient ingredient) {
      //  String sql = "INSERT INTO Ingredients (name, expiry_date,category) VALUES (?, ?,?)";
        //try (Connection conn = ConnectionProviderClass.getCon();
          // PreparedStatement pstmt = conn.prepareStatement(sql)) {
           
            //pstmt.setString(1, ingredient.getName());
            //pstmt.setDate(2, new java.sql.Date(ingredient.getExpiryDate().getTime()));
             //pstmt.setString(3, ingredient.getCategory());
            //pstmt.executeUpdate();
            
            //System.out.println("Product added successfully");
            //return true;
        //} catch (SQLException e) {
          //  e.printStackTrace();
            //return false;
        //}
        
    //}
   // Adds a new ingredient to the database

    String sql = "INSERT INTO Ingredients (name, expiry_date, category) VALUES (?, ?, ?)";
    try (Connection conn = ConnectionProviderClass.getCon();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        pstmt.setString(1, ingredient.getName());
        pstmt.setDate(2, new java.sql.Date(ingredient.getExpiryDate().getTime()));
        pstmt.setString(3, ingredient.getCategory());
        pstmt.executeUpdate();
        
        System.out.println("Ingredient added successfully");
        return true;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}


    // Deletes an ingredient from the database based on its ID
    public static void deleteIngredient(int id) {
        String sql = "DELETE FROM Ingredients WHERE id = ?";
        try (Connection conn = ConnectionProviderClass.getCon();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Updates an existing ingredient in the database
    public static void updateIngredient(Ingredient ingredient) {
       // String sql = "UPDATE Ingredients SET name = ?, expiry_date = ?,category=?, WHERE id = ?";
        //try (Connection conn = ConnectionProviderClass.getCon();
          //   PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            //pstmt.setString(1, ingredient.getName());
            //pstmt.setDate(2, new java.sql.Date(ingredient.getExpiryDate().getTime()));
             //pstmt.setString(3, ingredient.getCategory());
            //pstmt.setInt(4, ingredient.getId());
            //pstmt.executeUpdate();
        //} catch (SQLException e) {
          //  e.printStackTrace();
        //}
    
    
    String sql = "UPDATE Ingredients SET name = ?, expiry_date = ?, category = ? WHERE id = ?";
    try (Connection conn = ConnectionProviderClass.getCon();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        pstmt.setString(1, ingredient.getName());
        pstmt.setDate(2, new java.sql.Date(ingredient.getExpiryDate().getTime()));
        pstmt.setString(3, ingredient.getCategory());
        pstmt.setInt(4, ingredient.getId());
        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }}
    public static Map<String, List<Ingredient>> getCategorizedIngredients() {
        return categorizedIngredients;
}
}

package access;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Ingredient;
public class Ingredientdao {
    
    // Retrieves all ingredients from the database
    public static List<Ingredient> getAllIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        String sql = "SELECT id, name, expiry_date FROM Ingredients";
        try (Connection conn = ConnectionProviderClass.getCon();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Ingredient ingredient = new Ingredient(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDate("expiry_date")
                );
                ingredients.add(ingredient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ingredients;
    }

    // Adds a new ingredient to the database
    public static boolean addIngredient(Ingredient ingredient) {
        String sql = "INSERT INTO Ingredients (name, expiry_date) VALUES (?, ?)";
        try (Connection conn = ConnectionProviderClass.getCon();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, ingredient.getName());
            pstmt.setDate(2, new java.sql.Date(ingredient.getExpiryDate().getTime()));
            pstmt.executeUpdate();
            System.out.println("Product added successfully");
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
        String sql = "UPDATE Ingredients SET name = ?, expiry_date = ? WHERE id = ?";
        try (Connection conn = ConnectionProviderClass.getCon();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, ingredient.getName());
            pstmt.setDate(2, new java.sql.Date(ingredient.getExpiryDate().getTime()));
            pstmt.setInt(3, ingredient.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

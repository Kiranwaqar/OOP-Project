/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import model.Ingredient;

import model.SweetIngredient;
import model.UserInputHandler;
/**
 *
 * @author imkir
 */
public class Sweet extends javax.swing.JFrame {

    /**
     * Creates new form Sweet
     */
    public Sweet() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Are you allergic to anything in specific?");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Do you dislike chocolate or cream?");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(80, 80, 80)
                        .addComponent(jButton1))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addContainerGap(780, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addContainerGap(510, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         // Get the user input from the text fields
    String allergenInput = jTextField1.getText();
    String proteinInput = jTextField2.getText();
    
    // Call the handleUserInput method with the user inputs
    handleUserInput(allergenInput, proteinInput);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
         String userInput = jTextField1.getText();

    // Process the user input (for example, display it in a label)
    jLabel1.setText("You entered: " + userInput);

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
         String userInput = jTextField2.getText();

    // Process the user input (for example, display it in a label)
    jLabel2.setText("You entered: " + userInput);
    }//GEN-LAST:event_jTextField2ActionPerformed
public void handleUserInput(String allergenInput, String proteinInput) {
    Ingredient[] chocolateCakeIngredients = SweetIngredient.chocolateCakeIngredients;
    Ingredient[] fruitSaladIngredients = SweetIngredient.fruitSaladIngredients;

    jLabel3.setText(""); // Clear the label text before updating

    boolean discardFirstDish = false;
    boolean discardSecondDish = false;

    // Check the allergen input against the ingredients of the first dish (Chocolate Cake)
    for (Ingredient ingredient : chocolateCakeIngredients) {
        if (allergenInput.equalsIgnoreCase(ingredient.getName())) {
            discardFirstDish = true;
            break;
        }
    }

    // Check the allergen input against the ingredients of the second dish (Fruit Salad)
    for (Ingredient ingredient : fruitSaladIngredients) {
        if (allergenInput.equalsIgnoreCase(ingredient.getName())) {
            discardSecondDish = true;
            break;
        }
    }

    // Check the protein input against the ingredients of the first dish if it's not already discarded
    if (!discardFirstDish) {
        for (Ingredient ingredient : chocolateCakeIngredients) {
            if (proteinInput.equalsIgnoreCase(ingredient.getName())) {
                discardFirstDish = true;
                break;
            }
        }
    }

    // Check the protein input against the ingredients of the second dish if it's not already discarded
    if (!discardSecondDish) {
        for (Ingredient ingredient : fruitSaladIngredients) {
            if (proteinInput.equalsIgnoreCase(ingredient.getName())) {
                discardSecondDish = true;
                break;
            }
        }
    }

    if (discardFirstDish && discardSecondDish) {
        // Both dishes are discarded
        jLabel3.setText("Sorry, both dishes contain an allergen or don't match your preferred protein. No recommendation available.");
    } else if (discardFirstDish) {
        // First dish is discarded, recommend the second dish
        jLabel3.setText("We recommend the dish: Fruit Salad");
    } else if (discardSecondDish) {
        // Second dish is discarded, recommend the first dish
        jLabel3.setText("We recommend the dish: Chocolate Cake");
    } else {
        // Neither dish is discarded, recommend both dishes
        jLabel3.setText("Both dishes are suitable: Chocolate Cake and Fruit Salad");
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sweet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sweet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sweet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sweet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sweet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

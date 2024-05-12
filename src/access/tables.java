package access;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


//import DaoDataAccess.dbOperations;
import javax.swing.JOptionPane;

/**
 *
 * @author imkir
 */
public class tables {
    public static void main(String[] args){
        try{
         // String userTable="create table user (id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(11),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),admin_password varchar(200) default '123', unique(email))";
          //String adminDetails="insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) value('Admin','admin@gmail.com','12345678910','Pakistan','admin','What primary school did you attend?','ABC','true')";
          //String categoryTable="create table category (id int AUTO_INCREMENT primary key,name varchar(200))";
          //String productTable="create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),quantity varchar(200),price varchar(200))";
        //String billTable="create table bill(id int primary key,name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
       // String ingredientsTable = "CREATE TABLE Ingredients ("
//+ "id INT AUTO_INCREMENT PRIMARY KEY, "
//+ "name VARCHAR(255) NOT NULL, "
//+ "expiry_date DATE NOT NULL)";
// String admintable = "CREATE TABLE admin (password VARCHAR(200) DEFAULT '123')";
 



            
         //dbOperations.setDataOrDelete(userTable, "User Table Created Successfully.");
         // dbOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfully.");
         // dbOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully.");
          //dbOperations.setDataOrDelete(productTable, "Product Table Created Successfully.");
          // dbOperations.setDataOrDelete(billTable, "Bill Table Created Successfully.");
           //dbOperations.setDataOrDelete(ingredientsTable, "Ingredients Table Created Successfully.");
        //dbOperations.setDataOrDelete(admintable, "Admin Table Created Successfully.");
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,e); 
        }
    }
}

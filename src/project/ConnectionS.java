/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
/**
 *
 * @author kongu
 */
public class ConnectionS {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/billings","root","12345");
            System.out.print("fff");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
    public static void main(String arg[]){
        new ConnectionS();
    }
}

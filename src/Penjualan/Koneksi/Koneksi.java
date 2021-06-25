/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penjualan.Koneksi;

/**
 *
 * @author Decki
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    private static Connection Conn;
    public static Connection getConnection(){
        if(Conn==null){
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Conn = DriverManager.getConnection("jdbc:mysql://localhost/DB_Jual","root","");
            }catch(SQLException ex){
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Conn;
    }
}
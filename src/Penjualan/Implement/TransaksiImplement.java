/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penjualan.Implement;

/**
 *
 * @author Decki
 */
import com.mysql.jdbc.Connection;
import Penjualan.Koneksi.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TransaksiImplement {
    public int UrutanDatabase(){
        Connection Con = (Connection) Koneksi.getConnection();
        int Jumlah = 0;
        try{
            String SQL = "SELECT count(*) AS Urutan FROM Penjualan";
            Statement St = (Statement) Con.createStatement();
            ResultSet RS = St.executeQuery(SQL);
            while(RS.next()){
                Jumlah = RS.getInt("Urutan");
            }
            St.close();
            RS.close();            
        }catch(Exception e){
            e.printStackTrace();
        }
        return ++Jumlah;
    }
    public ArrayList<String> viewKodeBarang() throws SQLException{
        ArrayList<String> viewNamaBarang = new ArrayList();
        try{
            Statement StKB = Koneksi.getConnection().createStatement();
            ResultSet RSKB = StKB.executeQuery("SELECT Kode_Barang, Nama_Barang FROM Barang");
            while(RSKB.next()){
                viewNamaBarang.add(RSKB.getString("Kode_Barang") + " - " + (RSKB.getString("Nama_Barang")));                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return viewNamaBarang;
    }
    public ArrayList<String> viewIDPelanggan() throws SQLException{
        ArrayList<String> viewNamaPelanggan = new ArrayList();
        try{
            Statement StIP = Koneksi.getConnection().createStatement();
            ResultSet RSIP = StIP.executeQuery("SELECT IDPelanggan, Nama FROM Pelanggan");
            while(RSIP.next()){
                viewNamaPelanggan.add(RSIP.getString("IDPelanggan") + " - " + (RSIP.getString("Nama")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return viewNamaPelanggan;
    }
}
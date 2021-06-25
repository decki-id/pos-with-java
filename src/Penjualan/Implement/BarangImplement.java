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
import Penjualan.Entity.Barang;
import Penjualan.Interface.BarangInterface;
import Penjualan.Koneksi.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BarangImplement implements BarangInterface{
    public Barang insert(Barang o) throws SQLException{
        PreparedStatement PS=Koneksi.getConnection().prepareStatement
        ("Insert Into Barang Values(?,?,?,?)");
        PS.setString(1, o.getKodeBarang());
        PS.setString(2, o.getNamaBarang());
        PS.setString(3, o.getStockBarang() + " ");
        PS.setString(4, o.getHargaBarang() + " ");
        PS.executeUpdate();
        return o;
    }
    public void update(Barang o) throws SQLException{
        PreparedStatement PS=Koneksi.getConnection().prepareStatement
        ("Update Barang set Nama_Barang=?,Stock_Barang=?,Harga_Barang=? where Kode_Barang=?");
        PS.setString(1, o.getNamaBarang());
        PS.setString(2, o.getStockBarang());
        PS.setString(3, o.getHargaBarang());
        PS.setString(4, o.getKodeBarang());
        PS.executeUpdate();
    }
    public void delete(String Kode_Barang) throws SQLException{
        PreparedStatement PS=Koneksi.getConnection().prepareStatement
        ("Delete From Barang where Kode_Barang=?");
        PS.setString(1, Kode_Barang);
        PS.executeUpdate();
    }
    public List<Barang> getAll() throws SQLException{
        Statement St=Koneksi.getConnection().createStatement();
        ResultSet RS=St.executeQuery("Select * From Barang");
        List<Barang> AL = new ArrayList<Barang>();
        while(RS.next()){
            Barang B = new Barang();
            B.setKodeBarang(RS.getString("Kode_Barang"));
            B.setNamaBarang(RS.getString("Nama_Barang"));
            B.setStockBarang(RS.getString("Stock_Barang"));
            B.setHargaBarang(RS.getString("Harga_Barang"));
            AL.add(B);
        }
        return AL;
    }
}
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
import Penjualan.Entity.Pelanggan;
import Penjualan.Koneksi.Koneksi;
import Penjualan.Interface.PelangganInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PelangganImplement implements PelangganInterface{
    public Pelanggan insert(Pelanggan o) throws SQLException{
        PreparedStatement PS=Koneksi.getConnection().prepareStatement
        ("Insert Into Pelanggan Values(?,?,?,?,?)");
        PS.setString(1, o.getIDPelanggan());
        PS.setString(2, o.getNama());
        PS.setString(3, o.getJenisKelamin());
        PS.setString(4, o.getAlamat());
        PS.setString(5, o.getNomorTelepon());
        PS.executeUpdate();
        return o;
    }
    public void update(Pelanggan o) throws SQLException{
        PreparedStatement PS=Koneksi.getConnection().prepareStatement
        ("Update Pelanggan set Nama=?,JenisKelamin=?,Alamat=?,NomorTelepon=? where IDPelanggan=?");
        PS.setString(1, o.getNama());
        PS.setString(2, o.getJenisKelamin());
        PS.setString(3, o.getAlamat());
        PS.setString(4, o.getNomorTelepon());
        PS.setString(5, o.getIDPelanggan());
        PS.executeUpdate();
    }
    public void delete(String IDPelanggan) throws SQLException{
        PreparedStatement PS=Koneksi.getConnection().prepareStatement
        ("Delete From Pelanggan where IDPelanggan=?");
        PS.setString(1, IDPelanggan);
        PS.executeUpdate();
    }
    public List<Pelanggan> getAll() throws SQLException{
        Statement St=Koneksi.getConnection().createStatement();
        ResultSet RS=St.executeQuery("Select * From Pelanggan");
        List<Pelanggan> AL = new ArrayList<Pelanggan>();
        while(RS.next()){
            Pelanggan P = new Pelanggan();
            P.setIDPelanggan(RS.getString("IDPelanggan"));
            P.setNama(RS.getString("Nama"));
            P.setJenisKelamin(RS.getString("JenisKelamin"));
            P.setAlamat(RS.getString("Alamat"));
            P.setNomorTelepon(RS.getString("NomorTelepon"));
            AL.add(P);
        }
        return AL;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penjualan.Interface;

/**
 *
 * @author Decki
 */
import Penjualan.Entity.Barang;
import java.sql.SQLException;
import java.util.List;

public interface BarangInterface {
    Barang insert(Barang o) throws SQLException;
    void update(Barang o) throws SQLException;
    void delete(String Kode_Barang) throws SQLException;
    List getAll() throws SQLException;
}

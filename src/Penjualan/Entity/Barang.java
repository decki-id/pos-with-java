/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penjualan.Entity;

/**
 *
 * @author W1704
 */
public class Barang {
    private String Kode_Barang;
    private String Nama_Barang;
    private int Stock_Barang;
    private double Harga_Barang;
    String Jumlah = String.valueOf(Stock_Barang);
    String Harga = String.valueOf(Harga_Barang);
        public String getKodeBarang(){
            return Kode_Barang;
        }
        public void setKodeBarang(String Kode_Barang){
            this.Kode_Barang = Kode_Barang;
        }
        public String getNamaBarang(){
            return Nama_Barang;
        }
        public void setNamaBarang(String Nama_Barang){
            this.Nama_Barang = Nama_Barang;
        }
        public String getStockBarang(){
            return Jumlah;
        }
        public void setStockBarang(String Stock_Barang){
            this.Jumlah = Stock_Barang;
        }
        public String getHargaBarang(){
            return Harga;
        }
        public void setHargaBarang(String Harga_Barang){
            this.Harga = Harga_Barang;
        }
}

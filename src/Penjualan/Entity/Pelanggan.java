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
public class Pelanggan {
    private int IDPelanggan;
    private String Nama;
    private String JenisKelamin;
    private String Alamat;
    private String NomorTelepon;
    String ID_Pelanggan = String.valueOf(IDPelanggan);
        public String getIDPelanggan(){
            return ID_Pelanggan;
        }
        public void setIDPelanggan(String IDPelanggan){
            this.ID_Pelanggan = IDPelanggan;
        }
        public String getNama(){
            return Nama;
        }
        public void setNama(String Nama){
            this.Nama = Nama;
        }
        public String getJenisKelamin(){
            return JenisKelamin;
        }
        public void setJenisKelamin(String JenisKelamin){
            this.JenisKelamin = JenisKelamin;
        }
        public String getAlamat(){
            return Alamat;
        }
        public void setAlamat(String Alamat){
            this.Alamat = Alamat;
        }
        public String getNomorTelepon(){
            return NomorTelepon;
        }
        public void setNomorTelepon(String NomorTelepon){
            this.NomorTelepon = NomorTelepon;
        }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan5.kambingglobal;

/**
 *
 * @author 
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program untuk menampilkan jumlah kambing Global
 */
public class PBOIF210119084Latihan5KambingGlobal {
    int jumlahKambing = 88;
    
  //method untuk memnampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumalh kambing : " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah ditambah : " + jumlahKambing);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210119084Latihan5KambingGlobal kambingSusu = new PBOIF210119084Latihan5KambingGlobal();
        
        //menampilkan jumlah kambing ysng ada saaat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    }
    
}

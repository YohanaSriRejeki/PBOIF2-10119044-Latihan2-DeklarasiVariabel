/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg1011904.latihan2.deklarasivariable;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : PBOIF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini berfungsi untuk menampilkan deklarasi variabel
 */
public class PBOIF21011904Latihan2DeklarasiVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variable
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        // Memberi nilai ke variable
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        // Menampilkan hasil
        System.out.println();
        System.out.println("Isi variable nilai = " + nilaiInt);
        System.out.println("Isi variable PHI = " + PHI);
        System.out.println("Isi variable logika = " + nilaiLogika);
        System.out.println("Isi variable karakter = " + nilaiKarakter);
    }
    
}

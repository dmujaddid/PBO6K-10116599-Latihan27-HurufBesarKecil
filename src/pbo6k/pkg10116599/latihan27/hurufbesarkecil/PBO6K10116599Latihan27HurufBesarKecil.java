/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program menampilkan formatting kalimat menjadi
 *                      huruf besar dan kecil dimana user menginputkan
                        sendiri kalimat nya
 * 
 */
public class PBO6K10116599Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Variabel
        String Kalimat;
        
        System.out.print("Masukkan Kalimat : ");
        Scanner scan = new Scanner(System.in);
        Kalimat = scan.next();
         String str = Kalimat;
         String str1 = str.toUpperCase();
         String str2 = str.toLowerCase();
       
        System.out.println();
        System.out.println("===Hasil Formatting===");
        System.out.println("Huruf Besar : " +str1);
        System.out.println("Huruf Kecil : " +str2);
        
    }
    
}

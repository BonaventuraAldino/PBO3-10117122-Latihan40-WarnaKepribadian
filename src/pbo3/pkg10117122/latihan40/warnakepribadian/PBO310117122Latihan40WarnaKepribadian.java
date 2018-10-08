/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author lenovo
 * NAMA  : Bonaventura Aldino Senda Seni
 * KELAS : IF-3
 * NIM   : 10117122
 * Deskripsi Program : User memilih warna dan memasukan nama, menampilakan 
 *                     kepribadian user berdasarkan warna yang dipilihnya.
 * 
 */
public class PBO310117122Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Color wrn = new Color();
        User usr = new User();
        Scanner scn = new Scanner(System.in);

        wrn.menampilkanTemplate();
        wrn.pilihWarnaFavorit();
        usr.memasukkanNama();

        System.out.println("\n====HASIL TEST KEPRIBADIAN " + 
                usr.namaUser.toUpperCase()+"====");
        wrn.tesKepribadian(wrn.namaWarna,usr.namaUser);
        
        System.out.println();
        System.out.println("(Developed by : Bonaventura Aldino Senda Seni)");
    }
    
}

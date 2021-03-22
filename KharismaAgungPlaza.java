/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kharismaagungplaza;
import java.util.Scanner;

/**
 *
 * @author 62896
 */
public class KharismaAgungPlaza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pembeli;
        int barang1, barang2, barang3, barang4, barang5, total_harga;
        
        System.out.println("----------------------------------------");
        System.out.println("        Kharsima Agung Plaza (KAP)      ");
        System.out.println("         Promo Belanja Berhadiah        ");
        System.out.println("    Khusus Pembelian 5 Barang Pertama   ");
        System.out.println("   Dengan harga minimum Rp. 10.000,00   ");
        System.out.println("----------------------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        pembeli = scan.nextLine();
        
        System.out.print("Masukkan harga barang ke-1 : ");
        barang1 = scan.nextInt();
        
        System.out.print("Masukkan harga barang ke-2 : ");
        barang2 = scan.nextInt();
        
        System.out.print("Masukkan harga barang ke-3 : ");
        barang3 = scan.nextInt();
        
        System.out.print("Masukkan harga barang ke-4 : ");
        barang4 = scan.nextInt();
        
        System.out.print("Masukkan harga barang ke-5 : ");
        barang5 = scan.nextInt();
        
        total_harga = barang1 + barang2 + barang3 + barang4 + barang5;
        
        System.out.println("Total harga pembeian atas nama "+ pembeli + " adalah Rp "+ total_harga);
        
        if (total_harga >= 10000){
            System.out.println("Selamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
            System.out.println("--------------------------------------");
            System.out.println("             Terima Kasih             ");
            System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
        }
        
    }
    
}

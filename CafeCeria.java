/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeceria;
import java.util.Scanner;

/**
 *
 * @author 62896
 */
public class CafeCeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        String pilihan, nama;
        
        System.out.println("            CAFE CERIA            ");
        System.out.println("          ANEKA MINUMAN           ");
        System.out.println("----------------------------------");
        System.out.println("          SPECIAL MENU :          ");
        System.out.println("          1. Soft drinks          ");
        System.out.println("          2. Mix juice            ");
        System.out.println("          3. Nescafe              ");
        System.out.println("          4. Soda milk            ");
        System.out.println("          5. Tea                  ");
        System.out.println("----------------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        
        System.out.print("Silahkan masukkan pilihan anda : ");
        pilihan = scan.nextLine();
        
        switch (pilihan){
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case "2":
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Minuman tidak tersedia");
        }
        
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih "+ nama + " telah berkunjung diCafe Ceria");
        
        
    }
    
}

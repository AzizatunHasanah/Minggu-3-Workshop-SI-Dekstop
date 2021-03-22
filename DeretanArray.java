/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deretanarray;
import java.util.Scanner;

/**
 *
 * @author 62896
 */
public class DeretanArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int deret;
        
        System.out.print("Masukkan Jumlah Deret : ");
        deret = scan.nextInt();
        
        int[] angka = new int[deret];
        
        for (int i=0; i < angka.length; i++){
            angka[i] = (int)(Math.random() * 100);
            System.out.print(angka[i] + " ");
        }
        System.out.println();
    }
    
}

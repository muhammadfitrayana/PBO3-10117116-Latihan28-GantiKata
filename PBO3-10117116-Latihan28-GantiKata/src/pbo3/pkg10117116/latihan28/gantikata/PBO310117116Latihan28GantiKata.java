/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Mengganti Kata
 *  
 */
public class PBO310117116Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Kalimat,Kata,Ubah;
        
        Scanner input = new Scanner(System.in);
    
        System.out.println("====Program Mengganti Kata====");
        System.out.println("");
        System.out.print("Masukan Kalimat : ");
        Kalimat = input.nextLine();
        
        System.out.print("Ganti Kata   : ");
        Kata = input.nextLine();
        
        System.out.print("Menjadi Kata : ");
        Ubah = input.nextLine();
        
        String Ganti = Kalimat.replace(Kata, Ubah);
        System.out.println("");
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat Awal : " + Kalimat);
        System.out.println("Kalimat Baru : " + Ganti);
    }
    
}

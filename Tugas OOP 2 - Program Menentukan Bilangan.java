package oop.pkg2.bilangan.ganjil.genap;

import java.util.Scanner;

public class OOP2BilanganGanjilGenap 
{
    public static void main(String[] args) 
    {
        int angka;
        System.out.println("Program Menentukan Bilangan Bulat Positif (Ganjil - Genap) / Negatif (Ganjil - Genap) / NOL ");
        System.out.println();
        System.out.print("Masukkan Sebuah Bilangan : ");
        
        //Input dari user disimpan dalam variabel angka
        Scanner input = new Scanner(System.in);
        angka = input.nextInt();
        
        if (angka == 0){
            System.out.println("Angka " +angka+ " adalah Bilangan NOL");
        }
        else if (angka % 2 == 0 && angka > 0){
            System.out.println("Angka " +angka+ " adalah Bilangan Genap Positif");
        }
        else if (angka % 2 == 0 && angka < 0){
            System.out.println("Angka " +angka+ " adalah Bilangan Genap Negatif");
        }
        else if (angka % 2 !=0 && angka > 0){
            System.out.println("Angka " +angka+ " adalah Bilangan Ganjil Positif");
        }
        else {
            System.out.println("Angka " +angka+ " adalah Bilangan Ganjil Negatif");
        }
        System.out.println();
    }    
}

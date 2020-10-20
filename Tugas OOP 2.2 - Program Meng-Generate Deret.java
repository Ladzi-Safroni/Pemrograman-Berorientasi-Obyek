package oop.pkg2.program.meng.generate.deret;

import java.util.Scanner;

public class OOP2ProgramMengGenerateDeret 
{

    public static void main(String[] args) 
    {
        Scanner deret = new Scanner(System.in);
        int d, n;
        float jumlah, x, rata2;
        System.out.println("PROGRAM MENG-GENERATE DERET");
        System.out.println();
        System.out.print("Banyaknya Data : ");
        n = deret.nextInt();
        jumlah=0;
        d=1;
        System.out.println();
        while (d<=n)
        {
            System.out.print("Data ke-"+d+" : ");
            x=deret.nextFloat();
            jumlah += x;
            d++;
        }
        System.out.println();
        System.out.println("Jumlah    : "+jumlah);
        rata2 = jumlah / n;
        System.out.println("Rata-rata : "+rata2);
        System.out.println();
    }
}

package kalkulator.sederhana;

import java.util.Scanner;

public class method03 {
    public static int penjumlahan(int a, int b) {
        int hasil = a + b;
        return hasil;

    }

    public static int pengurangan(int a, int b) {
        int hasil = a - b;
        return hasil;
    }

    public static int perkalian(int a, int b) {
        int hasil = a * b;
        return hasil;
    }

    public static double pembagian(double a, double b) {
        double hasil = a / b;
        return hasil;
    }

    public static int sisahasilbagi(int a, int b) {
        int hasil = a % b;
        return hasil;

    }
    public static void main(String[] args) {
        Scanner hd = new Scanner(System.in);
        System.out.println("==========KALKULATOR SEDERHANA==========");
        System.out.println("Anda Berada Pada Kalkulator Penjumlahan");
        int a,b,c;
        System.out.print("Masukkan angka pertama :");
        a = hd.nextInt();
        System.out.print("Masukkan angka kedua :");
        b = hd.nextInt();
        c = penjumlahan(a,b);
        System.out.println("Hasil nya adalah "+c);
        System.out.println("\n====================");
        System.out.println("Anda Berada Pada Kalkulator Pengurangan");
        int d,e,f;
        System.out.print("Masukkan angka pertama :");
        d = hd.nextInt();
        System.out.print("Masukkan angka kedua :");
        e = hd.nextInt();
        f = pengurangan(d,e);
        System.out.println("Hasil nya adalah "+f);
        System.out.println("\n====================");
        System.out.println("Anda Berada Pada Kalkulator Perkalian");
        int g,h,i;
        System.out.print("Masukkan angka pertama :");
        g = hd.nextInt();
        System.out.print("Masukkan angka kedua :");
        h = hd.nextInt();
        i = perkalian(g,h);
        System.out.println("Hasil nya adalah "+i);
        System.out.println("\n====================");
        System.out.println("Anda Berada Pada Kalkulator Pembagian");
        double j,k,l;
        System.out.print("Masukkan angka pertama :");
        j = hd.nextInt();
        System.out.print("Masukkan angka kedua :");
        k = hd.nextInt();
        l = pembagian(j,k);
        System.out.println("Hasil nya adalah "+l);
        System.out.println("\n====================");
        System.out.println("Anda Berada Pada Kalkulator Sisa Hasil Bagi");
        int m,n,o;
        System.out.print("Masukkan angka pertama :");
        m = hd.nextInt();
        System.out.print("Masukkan angka kedua :");
        n = hd.nextInt();
        o = sisahasilbagi(m,n);{
        if (m<n) {
            System.out.println("Hasil Tidak ditemukan");
            
        }else if (m>n) {
            System.out.println("Hasil nya adalah "+o);
        }
    }
        
        
    }
}

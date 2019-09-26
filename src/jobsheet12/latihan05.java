/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class latihan05 {

    public static void hasil(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Nilai terbesar adalah " + a);

        } else if (b > a && b > c) {
            System.out.println("Nilai terbesar adalah " + b);
        } else if (c > a && c > b) {
            System.out.println("Nilai terbesar adalah " + c);

        }
    }
    public static void main(String[] args) {
        Scanner hd = new Scanner(System.in);
        System.out.print("Masukkan Bilangan I = ");
        int a = hd.nextInt();
        System.out.print("Masukkan Bilangan II = ");
        int b = hd.nextInt();
        System.out.print("Masukkan Bilangan III = ");
        int c = hd.nextInt();
        hasil(a, b, c);
    }
}

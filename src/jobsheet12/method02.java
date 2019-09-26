package jobsheet12;

import java.util.Scanner;

public class method02 {

    public static double kecepatan(int a, int b) {
        double hasil = a / b;
        return hasil;

    }

    public static void main(String[] args) {
        Scanner hd = new Scanner(System.in);
        int jarak, waktu;
        System.out.print("Masukkan Jarak : ");
        jarak = hd.nextInt();
        System.out.print("Masukkan waktu tempuh : ");
        waktu = hd.nextInt();
        double kec = kecepatan(jarak, waktu);
        System.out.println("Kecepatan : " + kec + " km/jam");
    }
}

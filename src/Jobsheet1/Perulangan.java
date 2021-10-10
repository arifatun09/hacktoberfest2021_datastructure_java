package Jobsheet1;
//Nama  : ARIFATUN NISA
//Kelas : MI-1E
//NIM   : 2031710118

import java.util.Scanner;
public class Perulangan {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int nim, banyakHari;
        System.out.println("==Menampilkan Nama Hari Menggunakan NIM==");
        System.out.print("Masukkan NIM Anda: ");
        nim = input.nextInt();

        banyakHari = nim%100;
        if (banyakHari < 10) {
            banyakHari += 10;
        }


        String[] hari = {"Senin", "Selas", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        System.out.println("Banyak Hari yang diperoleh: " + banyakHari);
        System.out.println();
        System.out.println("=====HARI=====");
        for (int i=0; i<banyakHari; i++) {
            System.out.print(hari[i%7] + " ");
        }

    }
}


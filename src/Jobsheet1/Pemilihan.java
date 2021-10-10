package Jobsheet1;
//Nama  : ARIFATUN NISA
//Kelas : MI-1E
//NIM   : 2031710118

import java.util.Scanner;
public class Pemilihan {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiTugas, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        String nilaiHuruf = "", ket;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas\t: " );
        nilaiTugas = input.nextInt();
        System.out.print("Masukkan Nilai UTS\t\t: " );
        nilaiUTS = input.nextInt();
        System.out.print("Masukkan Nilai UAS\t\t: " );
        nilaiUAS = input.nextInt();
        System.out.println("==============================");

        nilaiAkhir = (double)nilaiTugas*20/100 + (double)nilaiUTS*35/100 + (double)nilaiUAS*45/100 ;
        if (nilaiAkhir>80 && nilaiAkhir<=100){
            nilaiHuruf="A";
        }else if (nilaiAkhir>73 && nilaiAkhir<=80){
            nilaiHuruf="B+";
        }else if (nilaiAkhir>65 && nilaiAkhir<=73) {
            nilaiHuruf = "B";
        }else if (nilaiAkhir>60 && nilaiAkhir<=65) {
            nilaiHuruf = "C+";
        }else if (nilaiAkhir>50 && nilaiAkhir<=60) {
            nilaiHuruf = "C";
        }else if (nilaiAkhir>39 && nilaiAkhir<=50) {
            nilaiHuruf = "D";
        }else if (nilaiAkhir<=39) {
            nilaiHuruf = "E";
        }

        if (nilaiHuruf.equals("A")|| nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")){
            ket = "SELAMAT LULUS";
        }
        else {
            ket = "TIDAK LULUS";
        }

        System.out.println("==============================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("==============================");
        System.out.println(ket);

    }
}

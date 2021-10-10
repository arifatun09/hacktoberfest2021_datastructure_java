package Jobsheet1;
//Nama  : ARIFATUN NISA
//Kelas : MI-1E
//NIM   : 2031710118

public class Fungsi {
    public static void main (String[] args) {
        System.out.println("==Bilangan Fibonacci Perulangan==");
        fibonacciPerulangan();

        System.out.println();
        int i;
        int a=9;
        System.out.println("==Bilangan Fibonacci Rekusif==");
        for (i = 0; i < a; i++) {
            System.out.print(fibonacciRekursif(i) + " ");
        }
    }

    static void fibonacciPerulangan(){
        int bil1 = 0, bil2 = 1, jumlah ;
        System.out.print(bil1 + " ");
        System.out.print(bil2 + " ");

        for (int i = 0; i < 7; i++) {
            jumlah = bil1 + bil2;
            System.out.print(jumlah + " ");
            bil1 = bil2;
            bil2 = jumlah;
        }

    }

    static int fibonacciRekursif(int a) {
        if(a == 0 || a == 1){        //Base case
            return a;
        } else {                     //Recursion call
            return fibonacciRekursif(a - 1) + fibonacciRekursif(a - 2);
        }
    }
}

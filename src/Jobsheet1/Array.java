package Jobsheet1;
//Nama  : ARIFATUN NISA
//Kelas : MI-1E
//NIM   : 2031710118

public class Array {
    public static void main (String[] args) {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[][] bunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        int [] harga = {75000, 50000, 60000, 10000};

        System.out.println("===Jumlah Stok Bunga===");
        for (int i = 0; i < bunga.length; i++) {
            int totalBunga = 0;
            for (int j = 0; j < bunga[i].length; j++) {
                totalBunga += bunga[j][i];
            }
            System.out.println("Stok Bunga " + namaBunga[i] + "\t = " + totalBunga);
        }
        System.out.println();
        System.out.println("===Informasi Bunga Mati pada Cabang RoyalGarden 1===");
        System.out.println("Bunga Aglonema\t: 1");
        System.out.println("Bunga Keladi\t: 2");
        System.out.println("Bunga Alocasia\t: 0");
        System.out.println("Bunga Mawar\t\t: 5");
        bunga[0][0]-=1;
        bunga[0][1]-=2;
        bunga[0][2]-=0;
        bunga[0][3]-=5;

        System.out.println();
        System.out.println("===Update Stok Bungga di Cabang RoyalGarden 1===");
        int pendapatan = 0;
        for (int i = 0; i <=0; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Stok Bunga " + namaBunga[j] + "\t = " + bunga[i][j]);
                pendapatan += (bunga[i][j] * harga[j]);
            }
        }
        System.out.println("Pendapatan pada Cabang RoyalGarden 1: Rp" + pendapatan);
    }

}

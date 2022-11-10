/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parif;

/**
 *
 * @author ACER
 */
public class Nomor1 {

    //overloading 1
    public String myMethhod(String nama) {
        return nama;
    }
    //overloading 2

    public String myMethhod(String nama, String alamat) {
        return nama + alamat;
    }
    //overloading 3

    public String myMethhod(String nama, String alamat, String nim) {
        return nama + alamat + nim;
    }
    //overloading 4

    public String myMethhod(String nama, String alamat, String nim, String ukuranBaju) {
        return nama + alamat + nim + ukuranBaju;
    }

    //overloading 5
    public String myMethhod(String nama, String alamat, String nim, String ukuranBaju, String tempatLahir) {
        return nama + alamat + nim + ukuranBaju + tempatLahir;
    }

    //overloading 6
    public String myMethhod(String nama, String alamat, String nim, String ukuranBaju, String tempatLahir, String tanggalLahir) {
        return nama + alamat + nim + ukuranBaju + tempatLahir + tanggalLahir;
    }

    //overloading 7
    public int myMethod(int nilai1) {
        return nilai1;
    }
    //overloading 8

    public int myMethod(int nilai1, int nilai2) {
        return nilai1 + nilai2;
    }

    //overloading 9
    public double myMethod(double nilai1) {
        return nilai1;
    }

    //overloading 10
    public int myMethod(int nilai1, int nilai2, int nilai3, int nilai4, int nilai5, int nilai6, int nilai7) {
        return nilai1 + nilai2 + nilai3 + nilai4 + nilai5 + nilai6 + nilai7;
    }

    //overloading 11
    public double myMethod(double nilai1, double nilai2, double nilai3, double nilai4, double nilai5, double nilai6, double nilai7) {
        return nilai1 + nilai2 + nilai3 + nilai4 + nilai5 + nilai6 + nilai7;
    }

    //overloading 12
    public double myMethod(double nilai1, double nilai2) {
        return nilai1 + nilai2;
    }

    //overloading 13
    public int myMethod(int nilai1, int nilai2, int nilai3) {
        return nilai1 + nilai2 + nilai3;
    }

    //overloading 14
    public int myMethod(int nilai1, int nilai2, int nilai3, int nilai4) {
        return nilai1 + nilai2 + nilai3 + nilai4;
    }

    //overloading 15
    public int myMethod(int nilai1, int nilai2, int nilai3, int nilai4, int nilai5) {
        return nilai1 + nilai2 + nilai3 + nilai4 + nilai5;
    }

    //overloading 16
    public double myMethod(double nilai1, double nilai2, double nilai3) {
        return nilai1 + nilai2 + nilai3;
    }

    //overloading 17
    public double myMethod(double nilai1, double nilai2, double nilai3, double nilai4) {
        return nilai1 + nilai2 + nilai3 + nilai4;
    }

    //overloading 18
    public double myMethod(double nilai1, double nilai2, double nilai3, double nilai4, double nilai5) {
        return nilai1 + nilai2 + nilai3 + nilai4 + nilai5;
    }

    //overloading 19
    public int myMethod(int nilai1, int nilai2, int nilai3, int nilai4, int nilai5, int nilai6) {
        return nilai1 + nilai2 + nilai3 + nilai4 + nilai5 + nilai6;
    }

    //overloading 20
    public double myMethod(double nilai1, double nilai2, double nilai3, double nilai4, double nilai5, double nilai6) {
        return nilai1 + nilai2 + nilai3 + nilai4 + nilai5 + nilai6;
    }

//    method main
    public static void main(String[] args) {
        Nomor1 main = new Nomor1();

        String str1 = "MUH. PARIF";
        String overloading = main.myMethhod(str1);
        System.out.println(overloading);

        String nama = "MUH. PARIF";
        String alamat = "RAPPOGADING";
        String overloading2 = main.myMethhod(nama, alamat);
        System.out.println(overloading2);

        String nama1 = "MUH. PARIF";
        String alamat1 = "RAPPOGADING";
        String nim1 = "D0221044";
        String overloading3 = main.myMethhod(nama1, alamat1, nim1);
        System.out.println(overloading3);

        String nama2 = "MUH. PARIF";
        String alamat2 = "RAPPOGADING";
        String nim2 = "D0221044";
        String ukuranBaju = "XL";
        String overloading4 = main.myMethhod(nama2, alamat2, nim2, ukuranBaju);
        System.out.println(overloading4);

        String nama3 = "MUH. PARIF";
        String alamat3 = "RAPPOGADING";
        String nim3 = "D0221044";
        String ukuranBaju3 = "XL";
        String tempatLahir = "Rappogading";
        String overloading5 = main.myMethhod(nama3, alamat3, nim3, ukuranBaju3, tempatLahir);
        System.out.println(overloading5);

        String nama4 = "MUH. PARIF";
        String alamat4 = "RAPPOGADING";
        String nim4 = "D0221044";
        String ukuranBaju4 = "XL";
        String tempatLahir4 = "Rappogading";
        String tanggalLahir = "24 November";
        String overloading6 = main.myMethhod(nama4, alamat4, nim4, ukuranBaju4, tempatLahir4, tanggalLahir);
        System.out.println(overloading6);

        int nilai1 = 1;
        int overloading7 = main.myMethod(nilai1);
        System.out.println(overloading7);

        int nilai2 = 1;
        int nilai3 = 2;
        int overloading8 = main.myMethod(nilai2, nilai3);
        System.out.println(overloading8);

        int nilai4 = 4;
        int nilai5 = 5;
        int nilai6 = 6;
        int overloading9 = main.myMethod(nilai4, nilai5, nilai6);
        System.out.println(overloading9);

        int nilai7 = 7;
        int nilai8 = 8;
        int nilai9 = 9;
        int nilai10 = 10;
        int overloading10 = main.myMethod(nilai7, nilai8, nilai9, nilai10);
        System.out.println(overloading10);

        int nilai11 = 7;
        int nilai12 = 8;
        int nilai13 = 9;
        int nilai14 = 10;
        int nilai15 = 10;
        int overloading11 = main.myMethod(nilai11, nilai12, nilai13, nilai14, nilai15);
        System.out.println(overloading11);

        int nilai16 = 7;
        int nilai17 = 8;
        int nilai18 = 9;
        int nilai19 = 10;
        int nilai20 = 10;
        int nilai21 = 10;
        int overloading12 = main.myMethod(nilai16, nilai17, nilai18, nilai19, nilai20, nilai21);
        System.out.println(overloading12);

        int nilai22 = 7;
        int nilai23 = 8;
        int nilai24 = 9;
        int nilai25 = 10;
        int nilai26 = 10;
        int nilai27 = 10;
        int nilai28 = 10;
        int overloading13 = main.myMethod(nilai22, nilai23, nilai24, nilai25, nilai26, nilai27, nilai28);
        System.out.println(overloading13);

        double db1 = 1;
        double overloading14 = main.myMethod(db1);
        System.out.println(overloading14);

        double db2 = 2;
        double db3 = 3;
        double overloading15 = main.myMethod(db1, db2);
        System.out.println(overloading15);

        double db4 = 2;
        double db5 = 3;
        double db6 = 3;
        double overloading16 = main.myMethod(db1, db2, db3);
        System.out.println(overloading16);

        double db7 = 2;
        double db8 = 3;
        double db9 = 3;
        double db10 = 3;
        double overloading17 = main.myMethod(db1, db2, db3, db4);
        System.out.println(overloading17);

        double db11 = 2;
        double db12 = 3;
        double db13 = 3;
        double db14 = 3;
        double db15 = 3;
        double overloading18 = main.myMethod(db11, db12, db13, db14, db15);
        System.out.println(overloading18);

        double db16 = 2;
        double db17 = 3;
        double db18 = 3;
        double db19 = 3;
        double db20 = 3;
        double db21 = 3;
        double overloading19 = main.myMethod(db21, db12, db13, db14, db15, db16);
        System.out.println(overloading19);

        double db22 = 2;
        double db23 = 3;
        double db24 = 3;
        double db25 = 3;
        double db26 = 3;
        double db27 = 3;
        double db28 = 3;
        double overloading20 = main.myMethod(db21, db22, db23, db24, db25, db26, db27);
        System.out.println(overloading20);

    }
}

/*package SORULAR;

import java.util.Scanner;

public class denem2 {
    public static void main(String[] args) {

        double kmFiyat =1;
        double B = 500;
        double BNormF = B * kmFiyat;
        double C = 700;
        double CNormF = C * kmFiyat;
        double D = 900;
        double DNormF = D * kmFiyat;
        double biletFiyat = 0;


        Scanner scan = new Scanner(System.in);

        System.out.println(("lütfen gitmek istediğiniz şehri secin giriniz; B,C,D :  "));
        String sehir = scan.nextLine().toUpperCase();

        System.out.print("lütfen yaşınızı giriniz: ");
        int yas = scan.nextInt();

        System.out.println("Biletiniz gidiş  dönüş mü E veya H ");
       char yon=scan.next().charAt(0);

        // B ŞEHRİ

        if (sehir.equals("B")) {
            System.out.println("BNormF = " + BNormF);
            if (yas < 12) {
                if (yon=='e') {
                    biletFiyat = BNormF - (BNormF * ((0.50 + 0.20)));
                } else {
                    biletFiyat = BNormF - (BNormF * (0.50));
                }
            } else if (yas <= 24) {
                if (yon.equals("e")) {
                    biletFiyat = BNormF - (BNormF * ((0.10 + 0.20)));
                } else {
                    biletFiyat = BNormF - (BNormF * (0.10));
                }
            } else if (yas < 65) {
                if (yon.equals("e")) {
                    biletFiyat = BNormF - (BNormF * 0.20);
                } else {
                    biletFiyat = BNormF;
                }
            } else {
                if (yon.equals("e")){
                    biletFiyat = BNormF - (BNormF * ((0.30 + 0.20)));
                } else {
                    biletFiyat = BNormF - (BNormF * (0.30));
                }
            }
            //C ŞEHRİ
        } else if (sehir.equals("C")) {
            System.out.println("CNormF = " + CNormF);
            if (yas < 12) {
                if (yon.equals("e")) {
                    biletFiyat = CNormF - (CNormF * ((0.50 + 0.20)));
                } else {
                    biletFiyat = CNormF - (CNormF * (0.50));
                }
            } else if (yas <= 24) {
                if (yon.equals("e")) {
                    biletFiyat = CNormF - (CNormF * ((0.10 + 0.20)));
                } else {
                    biletFiyat = CNormF - (CNormF * (0.10));
                }
            } else if (yas < 65) {
                if (yon.equals("e")) {
                    biletFiyat = CNormF - (CNormF * 0.20);
                } else {
                    biletFiyat = CNormF;
                }
            } else {
                if (yon.equals("e")) {
                    biletFiyat = CNormF - (CNormF * ((0.30 + 0.20)));
                } else {
                    biletFiyat = CNormF - (CNormF * (0.30));
                }
            }

            //D ŞEHRİ
        } else if (sehir.equals("D")) {
            System.out.println("DNormF = " + DNormF);
            if (yas < 12) {
                if (yon.equals("e")) {
                    biletFiyat = DNormF - (DNormF * ((0.50 + 0.20)));
                } else {
                    biletFiyat = DNormF - (DNormF * (0.50));
                }
            } else if (yas <= 24) {
                if (yon.equals("e")) {
                    biletFiyat = DNormF - (DNormF * ((0.10 + 0.20)));
                } else {
                    biletFiyat = DNormF - (DNormF * (0.10));
                }
            } else if (yas < 65) {
                if (yon.equals("e")) {
                    biletFiyat = DNormF - (DNormF * 0.20);
                } else {
                    biletFiyat = DNormF;
                }
            } else {
                if (yon.equals("e")) {
                    biletFiyat = DNormF - (DNormF * ((0.30 + 0.20)));
                } else {
                    biletFiyat = DNormF - (DNormF * (0.30));
                }
            }System.out.println(biletFiyat);
        }

    }



        }*/







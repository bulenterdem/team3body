package SORULAR;

import java.util.Scanner;

public class UcakIndirimHesaplama {

    /*A şehrinden uçmak isteyen bir kişi
        B şehrine 500km
        C şehrine  700km  D şehrine  900 km mesafededir.
        //km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat %50 indirim 12 ve 24
        yas arasindaysa 10% 65 yasindan buyukse 30% gidis donus alirsa20% bu
        kosullara gore yolcudan gideceği mesafeyi isteyip ucak biletini hesaplayan program

         */
    public static void main(String[] args) {

        ucakBiletFiyatiHesapla();

    }

    private static void ucakBiletFiyatiHesapla() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Biletiniz gidis - donus mü (Evet ise 'E' tusuna, Hayır ise 'H' tusuna basınız.) ? : ");
        char gidisDonusmu = scan.next().charAt(0);



        System.out.println("Hangi sehre gitmek istiyorsunuz (B, C, D)? : ");
        char sehir = scan.next().charAt(0);

        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();
        if (yas<=0){
            System.out.println("Yanlis Giris Yaptiniz !..");
            return;
        }

        /*
        A şehrinden uçmak isteyen bir kişi
        B şehrine 500km
        C şehrine 700km
        D şehrine 900 km mesafededir.
         */


        double birimFiyat = 1;
        double biletFiyatiB = 500*birimFiyat;
        double biletFiyatiC = 700*birimFiyat;
        double biletFiyatiD = 900*birimFiyat;

        if (gidisDonusmu=='e' || gidisDonusmu=='E'){
            if (sehir == 'b' || sehir == 'B'){
                if (yas<12){
                    System.out.println("Bilet Fiyati : " + (biletFiyatiB * 0.8) * 0.5);

                } else if (yas <=24 ) {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiB * 0.8) * 0.9);

                } else if (yas >=65 ) {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiB * 0.8) * 0.7);

                } else {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiB * 0.8));
                }


                //C sehri icin olan kisim :


            } else if (sehir == 'c' || sehir == 'C') {
                if (yas<12){
                    System.out.println("Bilet Fiyati : " + (biletFiyatiC * 0.8) * 0.5);

                } else if (yas <=24 ) {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiC * 0.8) * 0.9);

                } else if (yas >=65 ) {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiC * 0.8) * 0.7);

                } else {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiC * 0.8));
                }



                //D sehri icin olan kisim :

            } else if (sehir == 'd' || sehir == 'D') {
                if (yas<12){
                    System.out.println("Bilet Fiyati : " + (biletFiyatiD * 0.8) * 0.5);

                } else if (yas <=24 ) {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiD * 0.8) * 0.9);

                } else if (yas >=65 ) {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiD * 0.8) * 0.7);

                } else {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiD * 0.8));
                }

            }

        } else if (gidisDonusmu=='h' || gidisDonusmu=='H') {
            if (sehir == 'b' || sehir == 'B'){
                if (yas<12){
                    System.out.println("Bilet Fiyati : " + (biletFiyatiB * 0.5));

                } else if (yas <=24 ) {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiB * 0.9));

                } else if (yas >=65 ) {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiB * 0.7));

                } else {
                    System.out.println("Bilet Fiyati : " + biletFiyatiB);
                }


                //C sehri icin olan kisim :


            } else if (sehir == 'c' || sehir == 'C') {
                if (yas<12){
                    System.out.println("Bilet Fiyati : " + (biletFiyatiC * 0.5));

                } else if (yas <=24 ) {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiC * 0.9));

                } else if (yas >=65 ) {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiC * 0.7));

                } else {
                    System.out.println("Bilet Fiyati : " + biletFiyatiC);
                }



                //D sehri icin olan kisim :

            } else if (sehir == 'd' || sehir == 'D') {
                if (yas<12){
                    System.out.println("Bilet Fiyati : " + (biletFiyatiD * 0.8) * 0.5);

                } else if (yas <=24 ) {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiD * 0.8) * 0.9);

                } else if (yas >=65 ) {
                    System.out.println("Bilet Fiyati : " + (biletFiyatiD * 0.8) * 0.7);

                } else {
                    System.out.println("Bilet Fiyati : " + biletFiyatiD);
                }

            }

        }
    }

}








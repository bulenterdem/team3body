package SORULAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrtalamaHesaplama {

    /*
    2.Klavyeden toplam öğrenci sayısını giriniz. Toplam öğrenci sayısı boyutunda vize,
     ödev ve final notlarını tutacak 3 dizi değişkeni tanımlayınız.

(a)Klavyeden her öğrencinin vize, ödev ve final notlarını girip tanımlanan dizi değişkenlerine atayan
JAVA kodlarını yazınız

(b)Her öğrencinin aşağıdaki gibi genel not ortalamasını hesaplayan JAVA kodlarını yazınız
Genel Not Ortalaması = 0.30*Vize+0.20*Ödev+0.50*Final

(c) Aşağıdaki ekran görüntüsünü oluşturan JAVA kodlarını yazınız).
 Genel Not Ortalamasına göre Sınıf Ortalaması için 1. Tuşuna Basınız

Genel Not Ortalamalarının Standart Sapması için     2. Tuşuna Basınız
 Genel not ortalamalarının modu için    3. Tuşuna basınız.

Genel not ortalamasının küçükten büyüğe sıralanmış hali için 4. Tuşuna basınız

Bir tuşa basınız [1-4]

(d)Klavyeden 1 tuşuna basıldığında genel not ortalamalarının ortalamasını hesaplayan JAVA kodunu

yazınız

(e)Klavyeden 2 tuşuna basıldığında genel not ortalamalarının standart sapmasını hesaplayan JAVA kodlarını yazınız

(f)Klavyeden 3 tuşuna basıldığında genel not ortalamalarının modunu hesaplayan JAVA kodlarını yazınız
(g)Klavyeden 4 tuşuna basıldığında genel not ortalamalarını küçükten büyüğe sıralayan JAVA kodlarını yazınız
     */

    public static void main(String[] args) {


        raporVizeOdevFinalOrtalamaStandartSapma();
    }



 {

        }
        public static void raporVizeOdevFinalOrtalamaStandartSapma(){

            Scanner scan = new Scanner(System.in);
            System.out.print("Ogrenci sayisini giriniz : ");

            int lenght = scan.nextInt();

            double[] vizeNotlari= new double[lenght];

            double[] odevNotlari= new double[lenght];

            double[] finalNotlari= new double[lenght];

            double[] genelNotOrtalamasi= new double[lenght];

            for (int i = 0; i <vizeNotlari.length; i++) {

                System.out.println("Sirasiyla ogrenci vize notlarini giriniz : ");
                vizeNotlari[i]= scan.nextDouble();

                if (vizeNotlari[i] < 0 || vizeNotlari[i] > 100 )
                    System.out.println("Girilen Not Geçersiz. ");

            }

            for (int i = 0; i <odevNotlari.length ; i++) {

                System.out.println("Sirasiyla ogrenci odev notlarini giriniz : ");
                odevNotlari[i]= scan.nextDouble();

                if (odevNotlari[i] < 0 || odevNotlari[i] > 100 )
                    System.out.println("Girilen Not Geçersiz. ");

            }

            for (int i = 0; i <finalNotlari.length ; i++) {

                System.out.println("Sirasiyla ogrenci final notlarini giriniz : ");
                finalNotlari[i]= scan.nextDouble();

                if (finalNotlari[i] < 0 || finalNotlari[i] > 100 )
                    System.out.println("Girilen Not Geçersiz. ");

            }

            for(int i = 0; i < genelNotOrtalamasi.length ; i++){

                genelNotOrtalamasi[i]= (vizeNotlari[i]*0.3) + (odevNotlari[i]*0.2) +
                        (finalNotlari[i] *0.5);

            }
            for(int i = 0; i < genelNotOrtalamasi.length ; i++){

                genelNotOrtalamasi[i]= (vizeNotlari[i]*0.3) + (odevNotlari[i]*0.2) +
                        (finalNotlari[i] *0.5);

            }
            double sinifNotOrtalamasi=0;

            for (int i = 0; i < genelNotOrtalamasi.length; i++) {

                sinifNotOrtalamasi += genelNotOrtalamasi[i]/genelNotOrtalamasi.length;

            }
            double standartSapmaVeri=0;

            for (double each : genelNotOrtalamasi) {

                standartSapmaVeri += (Math.pow((each - sinifNotOrtalamasi), 2) / (genelNotOrtalamasi.length - 1));

            }
            double standartSapma= Math.sqrt(standartSapmaVeri);

            System.out.println("Genel Not Ortalamasına Göre Sınıf Ortalaması İçin '1' Tuşuna Basınız"+
                    "Genel Not Ortalamalarının Standart Sapması İçin '2' Tuşuna Basınız"+
            "Genel Not Ortalamalarının Modu İçin '3' Tuşuna Basınız"+
           " Genel Not Ortalamasının Küçükten Büyüğe Sıralanmış Hali İçin '4' Tuşuna Basınız"+
            "Vize Notlarını Görmek İçin '5' Tuşuna Basınız"+
           " Ödev Notlarını Görmek İçin '6' Tuşuna Basınız"+
           " Final Notlarını Görmek İçin '7' Tuşuna Basınız"+
           " Genel Not Ortalamaları İçin '8' Tuşuna Basınız");




            int girilen = scan.nextInt();

            if (girilen==1){
                System.out.println("Sınıf Ortalaması : " + sinifNotOrtalamasi);

            } else if (girilen==2) {
                System.out.println("Standart Sapma : " + standartSapma );

            } else if (girilen==4) {

                Arrays.sort(genelNotOrtalamasi);
                System.out.println("Genel Not Ortalamasının Küçükten Büyüğe Sıralanmış Hali : " + Arrays.toString(genelNotOrtalamasi));

            } else if (girilen==5) {

                System.out.println("Vize Notlari : " + Arrays.toString(vizeNotlari));

            } else if (girilen==6) {

                System.out.println("Ödev Notlari : " + Arrays.toString(odevNotlari));

            } else if (girilen==7) {

                System.out.println("Final Notlari : " + Arrays.toString(finalNotlari));

            }
            else if (girilen==8) {

                System.out.println("Genel Not Ortalamalari : " + Arrays.toString(genelNotOrtalamasi));

            } else {
                System.out.println("Yanlış Değer Girdiniz!.. ");
            }

        }

    }



















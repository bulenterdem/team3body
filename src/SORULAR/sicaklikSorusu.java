package SORULAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sicaklikSorusu {

    // / Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
    //// 100 girildiğinde veri girişi sonlandırılsın.
    //// Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        ArrayList<Double>gununsicaklari=new ArrayList<>();

        int sonlandirmadegeri=100;

        double girilenSicaklik=0;
        int sayac=0;

        do {
            System.out.println(" listeye eklemek icin bir sicaklik degeri girin "
                    +"\nsicaklik girisini sonlandirmak icin 100 girin");
            girilenSicaklik= scan.nextDouble();

            if (girilenSicaklik!=100) {

                gununsicaklari.add(girilenSicaklik);
                sayac++;
            }


        } while (girilenSicaklik!=100);    {

            System.out.println("veri girisi sonlandirildi");
        }
        System.out.println(gununsicaklari);
        Collections.sort(gununsicaklari);

        System.out.println("Gunun en dusuk sicakligi :" + gununsicaklari.get(0));
        System.out.println("Gunun en yuksek sicakligi :" + gununsicaklari.get(sayac-1));


    }
}

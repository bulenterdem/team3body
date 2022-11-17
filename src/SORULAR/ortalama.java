package SORULAR;

import java.util.Arrays;
import java.util.Scanner;

public class ortalama {

    public static void main(String[] args) {

        genelOrtalamSapmaHesaplama();

    }

    public static void genelOrtalamSapmaHesaplama() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen ogrenci sayisini giriniz: ");

        int length=scan.nextInt();

        double[] vizeNotu = new double[length];

        double[] odevNotu= new double[length];

        double[] finalNotu= new double[length];

        double[] genelOrtalama = new double[length];




        for (int i = 0; i <vizeNotu.length; i++) {

            System.out.println(" Ogrenci vize notlarini giriniz : ");
            vizeNotu[i]= scan.nextDouble();

            if (vizeNotu[i] < 0 ||vizeNotu[i] > 100 )
                System.out.println("Girilen Not Geçersiz. ");

        }

        for (int i = 0; i < odevNotu.length; i++) {

            System.out.println(" Ogrenci odev notlarini giriniz : ");
            odevNotu[i]= scan.nextDouble();

            if (odevNotu[i] < 0 ||odevNotu[i] > 100 )
                System.out.println("Girilen Not Geçersiz. ");

        }
        for (int i = 0; i <finalNotu.length ; i++) {

            System.out.println("ogrenci final notlarini giriniz : ");
            finalNotu[i] = scan.nextDouble();

            if (finalNotu[i] < 0 || finalNotu[i] > 100)
                System.out.println("Girilen Not Geçersiz. ");

        }
        for(int i = 0; i < genelOrtalama.length ; i++){

            genelOrtalama[i]= (vizeNotu[i]*0.3) + (odevNotu[i]*0.2) +
                    (finalNotu[i] *0.5);

        }
        double sinifOrtalama=0;
        for (int i = 0; i < genelOrtalama.length; i++) {

            sinifOrtalama += genelOrtalama[i] / genelOrtalama.length;

        }
        double standartSapma=0;

        for (double each : genelOrtalama) {

            standartSapma += (Math.pow((each - sinifOrtalama), 2) / (genelOrtalama.length - 1));

        }
        standartSapma= Math.sqrt(standartSapma);

        System.out.println("Genel Not Ortalamasına Göre Sınıf Ortalaması İçin '1' Tuşuna Basınız"+
                "\nGenel Not Ortalamalarının Standart Sapması İçin '2' Tuşuna Basınız"+
                "\nGenel Not Ortalamalarının Modu İçin '3' Tuşuna Basınız"+
                "\n Genel Not Ortalamasının Küçükten Büyüğe Sıralanmış Hali İçin '4' Tuşuna Basınız"+
                "\nVize Notlarını Görmek İçin '5' Tuşuna Basınız"+
                "\n Ödev Notlarını Görmek İçin '6' Tuşuna Basınız"+
                " \nFinal Notlarını Görmek İçin '7' Tuşuna Basınız"+
                " \nGenel Not Ortalamaları İçin '8' Tuşuna Basınız");

        int girilen = scan.nextInt();

        if (girilen==1){
            System.out.println("Sınıf Ortalaması : " + sinifOrtalama);

        } else if (girilen==2) {
            System.out.println("Standart Sapma : " + standartSapma );

        } else if (girilen==4) {

            Arrays.sort(genelOrtalama);
            System.out.println("Genel Not Ortalamasının Küçükten Büyüğe Sıralanmış Hali : "
                    + Arrays.toString(genelOrtalama));

        } else if (girilen==5) {

            System.out.println("Vize Notlari : " + Arrays.toString(vizeNotu));

        } else if (girilen==6) {

            System.out.println("Ödev Notlari : " + Arrays.toString(odevNotu));

        } else if (girilen==7) {

            System.out.println("Final Notlari : " + Arrays.toString(finalNotu));

        }
        else if (girilen==8) {

            System.out.println("Genel Not Ortalamalari : " + Arrays.toString(genelOrtalama));

        } else {
            System.out.println("Yanlış Değer Girdiniz!.. ");
        }



    }
}

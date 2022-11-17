package SORULAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class saticiSorusu {
    /*
    // ekrandan n tane saticinin isminin ve aylik satislarinin
 // girildigini dusunelim
 // satislari 10.000 tl nin uzerindeki odul alacak
 // saticinin ismini ekrana yazdiracak bir program yazinin
     */
    public static void main(String[] args) {

        int saticiSayisi;
        int odulLimiti =10000;

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac adet satici icin bilgi gireceksiniz, belirtiniz");
        saticiSayisi= scan.nextInt();

        String[] saticiIsimleri = new String[saticiSayisi];
        int[] satisTutarlari = new int[saticiSayisi];

        ArrayList<String> odulAlacakSaticilar = new ArrayList<>();

        for (int i = 1; i <= saticiSayisi  ; i++) {
            System.out.println("Lutfen " + i + ". saticinin ismini giriniz");
            saticiIsimleri[i-1] = scan.next();

            System.out.println("Lutfen " + i + ". saticinin aylik satis tutarini giriniz");
            satisTutarlari[i-1] = scan.nextInt();

        }

        System.out.println(Arrays.toString(saticiIsimleri));
        System.out.println(Arrays.toString(satisTutarlari));

        for (int i = 0; i < satisTutarlari.length; i++) {
            if(satisTutarlari[i] >= odulLimiti){
                odulAlacakSaticilar.add(saticiIsimleri[i]);

            }

        }
        System.out.println("odul alacak saticilar : " + odulAlacakSaticilar);
    }

    }




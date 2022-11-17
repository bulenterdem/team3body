package SORULAR;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrtalamakazancHesaplama {
    /*


     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
     * yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
     * method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
     * gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
     * kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler) 2. Adım :
     * Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun.
     * (gunlukKazanclar) 3. Adım : While döngüsü ile kullanıcıdan 7 günlük
     * kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle. 4. Adım :
     * getOrtalamaKazanc() adlı method ile ortalama kazancı alın. 5. Adım :
     * getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile
     * tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o
     * günleri return yap. 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı
     * method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * ortalama kazançtan aşağıysa o günleri return yap.
     */

    public static void main(String[] args) {

        double kazanc = 0;


        List<String> haftaninGunleri = new ArrayList<>();
        haftaninGunleri.add("pazartesi");
        haftaninGunleri.add("sali");
        haftaninGunleri.add("carsamba");
        haftaninGunleri.add("persembe");
        haftaninGunleri.add("cuma");
        haftaninGunleri.add("cumartesi");
        haftaninGunleri.add("pazar");

        List<Double> kazancListesi = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int gunler = 0;
        int sayac = haftaninGunleri.size();
        while (sayac > 0) {


            System.out.println("gunluk kazancinizi giriniz");
            System.out.println(haftaninGunleri.get(gunler));

            double gunlukkazanc = scan.nextDouble();
            kazancListesi.add(gunlukkazanc);
            gunler++;
            sayac--;

        }

        double toplamKazanc = 0;

        for (int i = 0; i < kazancListesi.size(); i++) {

            toplamKazanc += kazancListesi.get(i);


        }

        double ortalamakazanc = toplamKazanc / haftaninGunleri.size();

        List<String> ortalamaKazancUstuGun = new ArrayList<>();
        for (int i = 0; i < kazancListesi.size(); i++) {

            if (kazancListesi.get(i) > ortalamakazanc) {

                ortalamaKazancUstuGun.add(haftaninGunleri.get(i));
            }

        }

        List<String> ortalamaKazancAltiGun = new ArrayList<>();
        for (int i = 0; i < kazancListesi.size(); i++) {

            if (kazancListesi.get(i) < ortalamakazanc) {

                ortalamaKazancAltiGun.add(haftaninGunleri.get(i));


            }
        }
        System.out.println("ortalama kazanc :" +ortalamakazanc);
        System.out.println("toplam kazanc: " + toplamKazanc);
        System.out.println("haftanin gunleri: " + haftaninGunleri);
        System.out.println("ortalama alti gun:" + ortalamaKazancAltiGun);
        System.out.println("ortalama ustu gun:" + ortalamaKazancUstuGun);
    }
}

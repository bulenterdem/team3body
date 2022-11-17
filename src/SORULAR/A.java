package SORULAR;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

import static java.time.temporal.ChronoField.*;

public class A {
    public static void main(String[] args) {




        /*
        rkadaslar sizden birkac method yazmanizi istiyorum
Yil degiskeni icin 2013 ila 2099 arasinda random sayi uretin
ay degiskeni icin 1 ila 12 arasinda random sayi uretin
gun degiskeni icin 1 ila 28 arasinda random sayi uretin
LocalDate clasini kullanarak bu uc degiskeni bir method icine gonderin ve
random tarih uretin
degiskenleri class seviyesinde static olarak tanimlayinki asagidaki her method icinde kullanilabilsin (edited)
bunu yaptiktan sonra 2. bir adim daha isteyecem
urettiginiz tarih haftasonuna veya resmi tatillere denk gelmemeli
cozemesiniz bile lutfen yapmaya calisin ben isyerim icin bunu bir arkadasimla hazir
 method haline getirmistim (edited)
         */


/*
Yil degiskeni icin 2013 ila 2099 arasinda random sayi uretin
ay degiskeni icin 1 ila 12 arasinda random sayi uretin
gun degiskeni icin 1 ila 28 arasinda random sayi uretin
 */
           Random random = new Random();
        int rndGun = (int) (Math.random() * (28 - 1 + 1) + 1);
        int rndAy = (int) (Math.random() * (12 - 1 + 1) + 1);
        int rndYil = (int) (Math.random() * (2099 - 2013 + 1) + 2013);
            System.out.println(rndYil);
            System.out.println(rndAy);
            System.out.println(rndGun);
        /*LocalDate clasini kullanarak bu uc degiskeni bir method icine gonderin ve
        random tarih uretin
        degiskenleri class seviyesinde static olarak tanimlayinki asagidaki her method icinde kullanilabilsin (edited)
        bunu yaptiktan sonra
        */




            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.YYYY EEEE");
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE");
            LocalDate zaman = LocalDate.now();
            LocalDate tarih = LocalDate.of(rndGun,rndAy,rndYil);
            System.out.println(tarih.format(dtf1));
            //System.out.println(zaman.format(dtf2));

         /*
          int rndGun = (int) (Math.random() * (28 - 1 + 1) + 1);
        int rndAy = (int) (Math.random() * (12 - 1 + 1) + 1);
        int rndYil = (int) (Math.random() * (2022 - 2013 + 1) + 2013);
          */

        /*
        YEAR.checkValidValue(year);
        MONTH_OF_YEAR.checkValidValue(month);
        DAY_OF_MONTH.checkValidValue(dayOfMonth);
         */
        }
    }


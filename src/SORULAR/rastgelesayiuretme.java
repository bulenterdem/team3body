package SORULAR;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.stream.DoubleStream;

public class rastgelesayiuretme {

    /*
    Yil degiskeni icin 2013 ila 2099 arasinda random sayi uretin
    ay degiskeni icin 1 ila 12 arasinda random sayi uretin
    gun degiskeni icin 1 ila 28 arasinda random sayi uretin
    LocalDate clasini kullanarak bu uc degiskeni bir method icine gonderin ve random tarih uretin
    degiskenleri class seviyesinde static olarak tanimlayinki asagidaki her method icinde kullanilabilsin (edited)
    bunu yaptiktan sonra 2. bir adim daha isteyecem
        urettiginiz tarih haftasonuna veya resmi tatillere denk gelmemeli
     */


    public static void main(String[] args) {


Random random= new Random();
        DoubleStream yil= random.doubles(2013,2100);
        DoubleStream ay= random.doubles(1,13);
        DoubleStream gun= random.doubles(1,32);

        System.out.println(yil);

        }



    }


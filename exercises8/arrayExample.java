package exercises8;

import java.util.Scanner;

public class arrayExample {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * int [] sayilar= {1, 2, 4}; for(int i=0; i<sayilar.length; i++) {
         * System.out.println(sayilar[i]); }
         */
        Scanner ahmet = new Scanner(System.in);

        int diziuzunluğu = ahmet.nextInt();

        String[] isimler = new String[diziuzunluğu];

        for (int i = 0; i < isimler.length; i++) {
            //System.out.println("dizinin " + (i) + ". değeri");
            isimler[i] = ahmet.nextLine();
        }

        for (int i = 0; i < isimler.length; i++) {
            System.out.println(isimler[i]);

        }

    }
}

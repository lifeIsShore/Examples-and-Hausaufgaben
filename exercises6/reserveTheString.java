package exercises6;
import java.util.Scanner;
public class reserveTheString {

    //Write a static java method Reverse that takes a String as a parameter and returns
    //the reverse of that string.
    public static void main (String[] args) {
        Scanner ahmet=new Scanner(System.in);
        String kelime =ahmet.nextLine();
        String str= kelime, nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println(kelime);

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);
    }
}

package exercises5;

public class fibonacci {

    /*
     Java code to print the first 20 values of the Fibonacci Series using for loop.
      Solutions with while loop will not be accepted.
     (The Fibonacci sequence is a set of integers (the Fibonacci numbers) that starts with a zero, followed
      by a one, then by another one, and then by a series of steadily increasing numbers.
     The sequence follows the rule that each number is equal to the sum of the preceding two numbers.
     (0,1,1,2,3,5,…..))
        Fibonacci formula: n = (n-1) + (n-2)
        0	1	1	2	3	5	8
        0+1=1
                1+1=2
        1+2=3
        2+3=5
        3+5=8
      */
    public static void main(String[] args) {
        int a =1;
        int b =0;
        int c;
        for(int i=2; i<=20; i++) {
            c=b;
            b=a;
            a=c+b;
    // if you want to change the fibo num. you can change in the for loop or you can write a scanner to take a input
            System.out.println(a);
        }
    }
}

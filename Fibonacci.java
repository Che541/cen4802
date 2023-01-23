/**
* Simple method that takes an integer 1 or greater and return the Fibonacci sequence term at that place.
* First term is 0.
*
* @author           Che Zavala
* @param    input   the nth place for the term of the Fibonacci sequence you wish to receive 
* @return           the term at the place specified
*/


import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Enter an integer (1 or more) to find the nth term of the Fibonacci sequence: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        int result = fib(input - 1);

        String place = "th";
        if (input == 1) place = "st";
        if (input == 2) place = "nd";
        if (input == 3) place = "rd";

        System.out.println("The " + input + place + " term of the Fibonacci sequence is " + result);

        in.close();
    }

    public static int fib(int n){
        if (n == 0) return 0;

        if (n == 1 || n== 2) return 1;

        return fib(n - 1) + fib(n - 2);
    }

}
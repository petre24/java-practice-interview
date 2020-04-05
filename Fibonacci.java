
/******************************************************************************
* author: P. Quintua
* file: Fibonacci.java
*
* description: This is a program which will print Fibonacci series, 
*               e.g. 1 1 2 3 5 8 13 ... up to a given number.
******************************************************************************/

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Input a number to extend the Fibonacci series: ");
    System.out.println();
    long numberOfTerms = keyboard.nextLong();

    System.out.println("Fibonacci series up to " + numberOfTerms + " numbers: ");

    for (int i = 1; i <= numberOfTerms; i++) {
      System.out.print(fibonacci(i) + " ");
    }

    keyboard.close();
  }

  public static int fibonacci(int number) {
    if (number == 1 || number == 2)
      return 1;

    return fibonacci(number - 1) + fibonacci(number - 2);
  }
}

// ## Approximate Euler Number Calculator ## \\

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      //  System.out.println("Enter a number that you want to calculate factorial of");
        System.out.printf("Enter that how many term that you want to use in calculation >>> ");
        int number = scanner.nextInt();
        Main mainObj = new Main();
        mainObj.apprE(number);
        Main mainObj2 = new Main();
        mainObj2.digitByDigit(number);

    }

    public double factorial(int n) {

        double result = 1;

        if (n < 0) {
            System.out.println("You had to enter a positive number!");
        }

        else {

            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }

        return result;
    }

    public double apprE(int termCount) {

        double value = 1;
        for (int i = 1; i < termCount; i++) {

            value += 1 / factorial(i);

        }

        System.out.println("Approximate e number based on number of terms that you entered is " +value);
        return value;
    }

    public String digitByDigit(int entNumber) {

        String a = "";
        int lenght = Integer.toString(entNumber).length();

        for (int i = 0; i <lenght; i++) {
            a+=Integer.toString(entNumber).charAt(i);
            a+=" ";
        }
        System.out.println("The number you entered is "+a);
        return a;

    }

 }

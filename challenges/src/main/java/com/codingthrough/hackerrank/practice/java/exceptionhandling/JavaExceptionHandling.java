package com.codingthrough.hackerrank.practice.java.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Problem Statement:
 * Exception handling is the process of responding to the
 * occurrence, during computation, of exceptions – anomalous
 * or exceptional conditions requiring special processing –
 * often changing the normal flow of program execution. (Wikipedia)
 * Java has built-in mechanism to handle exceptions. Using
 * the try statement we can test a block of code for errors.
 * The catch block contains the code that says what to do if exception occurs.
 * <p>
 * This problem will test your knowledge on try-catch block.
 * <p>
 * You will be given two integers x and y as input, you have
 * to compute x/y. If x and y are not 32 bit signed integers or
 * if y is zero, exception will occur and you have to report it.
 * Read sample Input/Output to know what to report in case of exceptions.
 * <p>
 * Sample Input 1:
 * 10
 * 3
 * <p>
 * Sample Output 1:
 * 3
 * <p>
 * Sample Input 2:
 * 10
 * Hello
 * <p>
 * Sample Output 2:
 * java.util.InputMismatchException
 * <p>
 * Sample Input 3:
 * 10
 * 0
 * <p>
 * Sample Output 3:
 * java.lang.ArithmeticException: / by zero
 * <p>
 * Sample Input 4:
 * 23.323
 * 0
 * <p>
 * Sample Output 4:
 * java.util.InputMismatchException
 */
public class JavaExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getCanonicalName());
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}

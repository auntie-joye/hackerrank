package com.codingthrough.hackerrank.practice.java.advanced;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Problem Statement:
 * You are given a class Solution and an inner class Inner.Private.
 * The main method of class Solution takes an integer num as input.
 * The power2 in class Inner.Private checks whether a number is a
 * power of 2. You have to call the method power2 of the class
 * Inner.Private from the main method of the class Solution.
 * <p>
 * Constraints:
 * 1?num?230
 * Sample Input
 * 8
 * <p>
 * Sample Output:
 * 8 is power of 2
 * An instance of class: Solution.Inner.Private has been created
 */
public class CanYouAccess {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Object o;

        Class<?> privateClass = Inner.class.getDeclaredClasses()[0];
        Constructor<?> constructor = privateClass.getDeclaredConstructor(Inner.class);
        constructor.setAccessible(true);

        Inner inner = new Inner();
        o = constructor.newInstance(inner);

        Method method = privateClass.getDeclaredMethod("power2", int.class);
        method.setAccessible(true);
        Object result = method.invoke(o, n);

        System.out.println(n + " " + result);
        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
    }

    static class Inner {
        private class Private {
            private String power2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }
}

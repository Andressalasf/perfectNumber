package com.mycompany.mavenproject1;

import java.util.Scanner;


public class Mavenproject1 {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int number = 496;
        int count = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {

                count = i + count;

            }

        }

        if (count == number) {
            System.out.println("El numero " + number + " es perfecto");

        }

        long endTime = System.nanoTime() - startTime;
        System.out.println("El tiempo en nanosegundos es: " + endTime);

    }
}

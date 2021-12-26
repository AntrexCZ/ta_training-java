package com.epam.training.andrii_iesmienieiev;

import java.util.Collections;
import java.util.Scanner;

/**
 * Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */

public class ReverseArgs {
    public static void main(String[] args) {
        System.out.println("Enter your arguments : ");
        Scanner scanner = new Scanner(System.in);

        StringBuilder str = new StringBuilder(scanner.nextLine());
        System.out.println("Before : " + str);
        str.reverse();
        System.out.println("After : " + str);
    }

}
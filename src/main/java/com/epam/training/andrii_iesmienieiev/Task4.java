package com.epam.training.andrii_iesmienieiev;

import java.util.Scanner;

/**
 * 4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
 * */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number : ");
        int value = scanner.nextInt();
        int sum = 0;
        int com = 1;

        while (value != 0 ) { // подсчитать произведение чисел
            sum = sum + value % 10;
            com *= value % 10;
            value = value / 10;

        }
        System.out.println("Сумма введенных чисел = " + sum);
        System.out.println("Прозведение введенных чисел = " + com);
    }
}

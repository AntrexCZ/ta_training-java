package com.epam.training.andrii_iesmienieiev;

import java.util.Scanner;

/**
 *  5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 * */

public class Task5 {

    public static void setMonth (int monthNumber){
        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        String s;
        try {
            s = month[monthNumber - 1];
            System.out.println("This month is " + s);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This month doesn't exist");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter month number : ");
        int n = scanner.nextInt();
        setMonth(n);
    }
}

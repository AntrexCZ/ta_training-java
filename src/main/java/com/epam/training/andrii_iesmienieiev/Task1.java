package com.epam.training.andrii_iesmienieiev;

/**
 Приветствовать любого пользователя при вводе его имени через командную строку.
**/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter your name : ");
        Scanner scanner = new Scanner(System.in);

        // String input
        String name = scanner.nextLine();

        // Alphabetic validation
        if (CheckAlphabetic(name)) {
            System.out.println("Greetings " + name);
        } else {
            System.out.println("Entered name has errors");
        }
        scanner.close();

    } public static boolean CheckAlphabetic(String input){
        for (int i = 0; i != input.length() ; i++) {
            if(!Character.isLetter(input.charAt(i))){
                return false;
            }
        } return true;
    }
}
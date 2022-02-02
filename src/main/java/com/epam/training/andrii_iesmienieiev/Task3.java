package com.epam.training.andrii_iesmienieiev;

/**
* 3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
* */

public class Task3 {
    public static void main(String[] args) {
        int [] a = {1, 3, 5, 7, 9} ;
        for (int i : a) {
            System.out.println(i);
            System.out.print(i);
        }
    }
}

package lesson3.Java_Beginner_chapter_1;

import java.util.Random;

//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
public class Task10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = (int) (10 + Math.random() * 6);
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(number + "! = " + factorial);
    }
}
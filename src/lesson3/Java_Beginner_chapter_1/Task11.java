package lesson3.Java_Beginner_chapter_1;

import java.util.Random;

//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.
public class Task11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt();
        boolean validate = true;
        if (number > 0) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    validate = false;
                }
            }
            if (validate) {
                System.out.println(number + " is a prime number");
            }
        } else {
            System.out.println(number + " isn't a prime number");
        }
    }
}
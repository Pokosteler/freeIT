package lesson3.Java_Beginner_chapter_1;

import java.util.Random;

//Найдите сумму первых n целых чисел, которые делятся на 3.
public class Task12 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt();
        int amount = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    amount += i;
                }
            }
            System.out.println("amount: " + amount);
        } else {
            System.out.println(n + " - negative value or zero");
        }
    }
}
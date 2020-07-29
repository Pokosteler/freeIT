package lesson3.javaBeginnerChapter1;

import java.util.Scanner;

//Найдите сумму первых n целых чисел, которые делятся на 3.
public class Task12 {
    public static void main(String[] args) {
        int amount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int i = 3;
        while (n > 0) {
            if (i % 3 == 0) {
                amount += i;
                n--;
            }
            i++;
        }
        System.out.println("amount: " + amount);
    }
}
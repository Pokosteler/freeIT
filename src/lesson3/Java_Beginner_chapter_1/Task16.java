package lesson3.Java_Beginner_chapter_1;

import java.util.Random;
import java.util.Scanner;

//Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = sc.nextInt();
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        int amount = 0;
        int randomNumber[] = new int[arrayLength];
        Random rand = new Random();
        for (int i = 0; i < arrayLength; i++) {
            randomNumber[i] = rand.nextInt();
            System.out.print(randomNumber[i] + " ");
            if (maxNumber <= randomNumber[i]) {
                maxNumber = randomNumber[i];
                maxIndex = i;
            }
            if (minNumber > randomNumber[i]) {
                minNumber = randomNumber[i];
                minIndex = i;
            }
        }
        if (minIndex > maxIndex) {
            for (int i = maxIndex; i <= minIndex; i++) {
                amount += randomNumber[i];
            }
        }
        if (minIndex < maxIndex) {
            for (int i = minIndex; i <= maxIndex; i++) {
                amount += randomNumber[i];
            }
        }
        System.out.println("\namount: " + minNumber + " + " + maxNumber + " = " + amount);
    }
}
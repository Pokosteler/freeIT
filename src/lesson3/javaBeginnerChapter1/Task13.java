package lesson3.javaBeginnerChapter1;

import java.util.Random;
import java.util.Scanner;

//Создать последовательность случайных чисел, найти и вывести наибольшее
//из них.
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = sc.nextInt();
        int maxNumber = Integer.MIN_VALUE;
        int randomNumber[] = new int[arrayLength];
        Random rand = new Random();
        for (int i = 0; i < arrayLength; i++) {
            randomNumber[i] = rand.nextInt();
            System.out.print(randomNumber[i] + " ");
            if (maxNumber <= randomNumber[i]) {
                maxNumber = randomNumber[i];
            }
        }
        System.out.println("\nmax number of array: " + maxNumber);
    }
}
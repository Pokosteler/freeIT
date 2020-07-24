package lesson3.Java_Beginner_chapter_1;

import java.util.Random;
import java.util.Scanner;

//Создать массив, заполнить его случайными элементами, распечатать,
//перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//еще один массив).
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = sc.nextInt();
        int randomNumber[] = new int[arrayLength];
        Random rand = new Random();
        for (int i = 0; i < arrayLength; i++) {
            randomNumber[i] = rand.nextInt();
            System.out.print(randomNumber[i] + " ");
        }
        System.out.println();
        for (int i = arrayLength - 1; i >= 0; i--) {
            System.out.print(randomNumber[i] + " ");
        }
    }
}
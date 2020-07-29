package lesson3.javaBeginnerChapter1;

import java.util.Scanner;

//Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = sc.nextInt();
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        int randomNumber[] = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            randomNumber[i] = (int) (Math.random() * 10) + 1;
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
        System.out.println("\nmax number: " + maxNumber + ", index: " + maxIndex);
        System.out.println("min number: " + minNumber + ", index: " + minIndex);
    }
}
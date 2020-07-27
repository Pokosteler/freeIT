package lesson3.javaBeginnerChapter1;

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
        System.out.println("\nmin: " + minNumber);
        System.out.println("max: " + maxNumber);
        int betweenMinAndMax[] = new int[Math.abs(minIndex - maxIndex) - 1];
        int j = 0;
        if (minIndex > maxIndex) {
            for (int i = maxIndex + 1; i < minIndex; i++) {
                amount += randomNumber[i];
                betweenMinAndMax[j] = randomNumber[i];
                j++;
            }
        }
        if (minIndex < maxIndex) {
            for (int i = minIndex + 1; i < maxIndex; i++) {
                amount += randomNumber[i];
                betweenMinAndMax[j] = randomNumber[i];
                j++;
            }
        }
        System.out.print("sum = ");
        for (int i = 0; i < betweenMinAndMax.length; i++) {
            if (i < betweenMinAndMax.length - 1) {
                System.out.print(betweenMinAndMax[i] + " + ");
            } else {
                System.out.print(betweenMinAndMax[i]);
            }
        }
        System.out.println(" = " + amount);
    }
}
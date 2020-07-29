package lesson3.javaBeginnerChapter1;

import java.util.Scanner;

//Создайте число. Определите, является ли число трехзначным. Определите, является
//ли его последняя цифра семеркой. Определите, является ли число четным.
public class Task6 {
    public static void main(String[] args) {
        int amount = 0;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        temp = number;
        while (temp != 0) {
            amount++;
            temp /= 10;
        }
        if (amount == 3) {
            System.out.println(number + " is" +
                    " a three-digit number");
        } else {
            System.out.println(number + " isn't a three-digit number");
        }
        if (number % 10 == 7) {
            System.out.println("The last digit of " + number + " is seven");
        } else {
            System.out.println("The last digit of " + number + " isn't seven");
        }
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}
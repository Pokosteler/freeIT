package lesson3.homework4;

import java.util.Scanner;

// Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
public class Homework4 {
    public static void main(String[] args) {
        int amount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("\nEnter B: ");
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            amount += a;
        }
        System.out.println("\n" + a + " * " + b + " = " + amount);
    }
}
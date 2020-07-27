package lesson3.homework7;

// Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
public class Homework7 {
    public static void main(String[] args) {
        int amount = 0;
        for (int i = 1; i <= 99; i += 2) {
            amount += i;
        }
        System.out.println("amount = " + amount);
    }
}
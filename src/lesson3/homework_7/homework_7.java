package lesson3.homework_7;

// Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
public class homework_7 {
    public static void main(String[] args) {
        int amount = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                amount += i;
            }
        }
        System.out.println("amount = " + amount);
    }
}
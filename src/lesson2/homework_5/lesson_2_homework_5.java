package lesson2.homework_5;

// Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе.
public class lesson_2_homework_5 {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        int c = -21;
        int countPositive = 0;
        int countNegative = 0;
        if (a > 0) {
            countPositive++;
        } else if (a < 0) {
            countNegative++;
        }
        if (b > 0) {
            countPositive++;
        } else if (b < 0) {
            countNegative++;
        }
        if (c > 0) {
            countPositive++;
        } else if (c < 0) {
            countNegative++;
        }
        System.out.println("Количество положительных чисел в исходном наборе: " + countPositive);
        System.out.println("Количество отрицательных чисел в исходном наборе: " + countNegative);
    }
}
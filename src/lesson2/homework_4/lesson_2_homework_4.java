package lesson2.homework_4;

// Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
public class lesson_2_homework_4 {
    public static void main(String[] args) {
        int a = -1;
        int b = -2;
        int c = 3;
        int count = 0;
        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }
        System.out.println("Количество положительных чисел в исходном наборе: " + count);
    }
}
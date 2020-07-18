package lesson2.homework_6;

// Даны 2 числа. Вывести большее из них
public class lesson_2_homework_6 {
    public static void main(String[] args) {
        int a = 17;
        int b = 8;
        if (a > b) {
            System.out.println("Наибольшее число: " + a);
        }
        if (b > a) {
            System.out.println("Наибольшее число: " + b);
        }
        if (a == b) {
            System.out.println("a = b");
        }
    }
}
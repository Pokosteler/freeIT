package lesson2.homework_3;

// Дано целое число. Если оно является положительным, то прибавить к нему 1.
// Если отрицательным, то вычесть из него 2.
// Если нулевым, то заменить его на 10. Вывести полученное число
public class lesson_2_homework_3 {
    public static void main(String[] args) {
        int number = -10;
        if (number > 0) {
            number += 1;
        }
        if (number < 0) {
            number -= 2;
        }
        if (number == 0) {
            number = 10;
        }
        System.out.println(number);
    }
}
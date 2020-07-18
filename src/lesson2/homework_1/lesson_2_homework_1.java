package lesson2.homework_1;

// В переменную записываем число.
// Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
// Например, "это однозначное положительное число".
// Достаточно будет определить, является ли число однозначным, двухзначным или трехзначным и более.
public class lesson_2_homework_1 {
    public static void main(String[] args) {
        int number = 0;
        String message = "";
        int count = 0;
        if (number == 0) {
            message += "Это число - ноль";
        } else {
            if (number > 0) {
                message += "положительное число";
            } else if (number < 0) {
                message += "отрицательное число";
            }
            while (number != 0) {
                count++;
                number /= 10;
            }
            message = "Это " + count + "-значное " + message;
        }
        System.out.println(message);
    }
}
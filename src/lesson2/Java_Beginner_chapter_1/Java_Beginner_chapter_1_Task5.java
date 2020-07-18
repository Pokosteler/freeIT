package lesson2.Java_Beginner_chapter_1;

// Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
public class Java_Beginner_chapter_1_Task5 {
    public static void main(String[] args) {
        int x = 2630;
        boolean validator;
        int x1 = ((x - x % 1000) % 10000) / 1000;
        int x2 = ((x - x % 100) % 1000) / 100;
        int x3 = ((x - x % 10) % 100) / 10;
        int x4 = x % 10;
        if (x1 != x2 && x1 != x3 && x1 != x4 && x2 != x3 && x2 != x4 && x3 != x4) {
            validator = true;
        } else {
            validator = false;
        }
        System.out.println(validator);
    }
}
package lesson3.Java_Beginner_chapter_1;

//Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//произведение, т.е. факториал числа.
public class Task9 {
    public static void main(String[] args) {
        double averageSum = 0;
        double sum = 0;
        int n = 0;
        int x = (int) (Math.random() * 20);
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
            n++;
        }
        if (n != 0) {
            averageSum = factorial / n;
        } else {
            averageSum = 0;
        }
        System.out.println("averageSum:" + averageSum);
    }
}
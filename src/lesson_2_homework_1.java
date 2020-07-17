public class lesson_2_homework_1 {
    public static void main(String[] args) {
        int number = 13;
        String message = "это ";
        int count = 0;
        if (number == 0) {
            count = 1;
        }
        while (number != 0) {
            count++;
            number /= 10;
        }
        message += count + "-значное";
        if (number >= 0) {
            message += " положительное число";
        } else {
            message += " отрицательное число";
        }
        System.out.println(message);
    }
}
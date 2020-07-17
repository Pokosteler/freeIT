public class lesson_2_homework_5 {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        int c = -21;
        int countPositive = 0;
        int countNegative = 0;
        if (a >= 0) {
            countPositive++;
            if (b >= 0) {
                countPositive++;
            } else {
                countNegative++;
            }
            if (c >= 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        } else {
            countNegative++;
            if (b >= 0) {
                countPositive++;
            } else {
                countNegative++;
            }
            if (c >= 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }
        System.out.println("Количество положительных чисел в исходном наборе: " + countPositive);
        System.out.println("Количество отрицательных чисел в исходном наборе: " + countNegative);
    }
}
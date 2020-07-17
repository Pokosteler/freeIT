public class lesson_2_homework_2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 0;
        if (a < b + c && b < c + a && c < b + a) {
            System.out.println("Такой треугольник существует");
        } else {
            System.out.println("Такого треугольника не существует");
        }
    }
}
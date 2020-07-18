package lesson2.Java_Beginner_chapter_1;

// Определить число, полученное выписыванием в обратном порядке цифр
// любого 4-х значного натурального числа n.
public class Java_Beginner_chapter_1_Task4 {
    public static void main(String[] args) {
        int x = 2675;
        while (x != 0) {
            System.out.print(x % 10);
            x = (x - x % 10) / 10;
        }
    }
}
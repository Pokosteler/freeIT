package lesson3.javaBeginnerChapter1;

import java.util.Scanner;

//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//полностью закрыть круглой картонкой радиусом r.
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        if (r * r >= (a * a + b * b) / 4) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
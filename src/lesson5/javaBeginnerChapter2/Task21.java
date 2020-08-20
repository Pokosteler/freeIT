package lesson5.javaBeginnerChapter2;

import java.util.Scanner;

//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string(class String): ");
        String str = sc.nextLine();
        String newText = "";
        str = str.trim().replaceAll(" +", " ");
        if (str.length() != 0) {
            long start = System.nanoTime();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    newText += str.charAt(i);
                }
            }
            long end = System.nanoTime();
            System.out.println("String: " + newText);
            System.out.println("Total execution time: " + (end - start));
        }

        System.out.print("Enter string(class StringBuilder): ");
        StringBuilder str2 = new StringBuilder(sc.nextLine());
        StringBuilder newText2 = new StringBuilder();
        if (str2.length() != 0) {
            long start = System.nanoTime();
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) != ' ') {
                    newText2.append(str2.charAt(i));
                }
            }
            long end = System.nanoTime();
            System.out.println("String: " + newText2);
            System.out.println("Total execution time: " + (end - start));
        }
        System.out.println(newText2);

        System.out.print("Enter string(class StringBuffer): ");
        StringBuffer str3 = new StringBuffer(sc.nextLine());
        StringBuffer newText3 = new StringBuffer();
        if (str3.length() != 0) {
            long start = System.nanoTime();
            for (int i = 0; i < str3.length(); i++) {
                if (str3.charAt(i) != ' ') {
                    newText3.append(str3.charAt(i));
                }
            }
            long end = System.nanoTime();
            System.out.println("String: " + newText3);
            System.out.println("Total execution time: " + (end - start));
        }
        System.out.println(newText3);
    }
}
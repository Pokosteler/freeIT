package lesson5.javaBeginnerChapter2;

import java.util.Scanner;

//Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.
public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int count = 0;
        str = str.trim().replaceAll(" +", " ");
        if (str.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' || i == str.length() - 1) {
                    count++;
                }
            }
        }
        System.out.println("Text consists of " + count + " word(s)");
    }
}
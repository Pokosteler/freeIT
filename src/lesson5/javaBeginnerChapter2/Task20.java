package lesson5.javaBeginnerChapter2;

import java.util.Scanner;

//Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов.
public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String newText = "";
        str = str.trim().replaceAll(" +", " ");
        if (str.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    newText += str.charAt(i - 1);
                }
                if (i == str.length() - 1) {
                    newText += str.charAt(i);
                }
            }
        }
        System.out.println(newText);
    }
}
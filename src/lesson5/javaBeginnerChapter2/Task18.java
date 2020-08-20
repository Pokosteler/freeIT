package lesson5.javaBeginnerChapter2;

import java.util.Scanner;

//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество.
public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int count = 0;
        char symbol;
        if (str.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                symbol = str.charAt(i);
                if (!Character.isLetter(symbol) && !Character.isDigit(symbol) && !Character.isSpaceChar(symbol)) {
                    count++;
                }
            }
        }
        System.out.println("Text consists of " + count + " punctuation(s)");
    }
}
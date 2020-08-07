package lesson5.javaBeginnerChapter2;

import java.util.Scanner;

//Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//абзацев <p>.
public class Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String myStr = str.replaceAll("<p[^>]*>", "<p>");
        System.out.println("Total string: " + myStr);
    }
}
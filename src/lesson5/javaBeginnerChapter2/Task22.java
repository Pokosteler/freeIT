package lesson5.javaBeginnerChapter2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//записаных по правилам Java, с помощью регулярных выражений и вывести их на
//страницу.
public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        Pattern p = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
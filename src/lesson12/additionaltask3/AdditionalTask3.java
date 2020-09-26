package lesson12.additionaltask3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

//Проверка на цензуру:
//Создаете 2 файла.
//1 - й. Содержит исходный текст.
//2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
//определите сами, хотите каждое слово на новой строке, хотите через запятую
//разделяйте, ваша программа делайте как считаете нужным.
//Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
//встретилось ни одного недопустимого слова, то выводите сообщение о том что
//текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
//сообщение, кол-во предложений не прошедших проверку и сами предложения
//подлежащие исправлению.
public class AdditionalTask3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader
                ("src/lesson12/additionaltask3/FileInput.txt"));
             BufferedReader blackListFile = new BufferedReader(new FileReader
                     ("src/lesson12/additionaltask3/BlackList.txt"))) {
            String text = br.readLine();
            String[] sentences = text.split("[.]");
            String blackList = blackListFile.readLine();
            String[] blackListWords = blackList.split("/");
            ArrayList<String> failedCensorshipCheck = new ArrayList<>();
            for (String sentence : sentences) {
                for (String word : blackListWords) {
                    if (sentence.contains(word)) {
                        failedCensorshipCheck.add(sentence);
                    }
                }
            }
            if (failedCensorshipCheck.size() == 0) {
                System.out.println("Text pass inspection");
            } else {
                System.out.println("Text failed censorship check");
                System.out.println("Amount of sentences not verified: " + failedCensorshipCheck.size());
                System.out.println(failedCensorshipCheck.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

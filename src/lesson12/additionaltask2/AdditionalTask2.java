package lesson12.additionaltask2;

import java.io.*;

//Текстовый файл содержит текст. После запуска программы в другой файл
//должны записаться только те предложения, в которых от 3-х до 5-ти слов. Если в
//предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//слов в предложении, оно попадает в новый файл.
//
//Пишем все в ООП стиле. Создаём класс TextFormater
//в котором два статических метода:
//1. Метод принимает строку и возвращает кол-во слов в строке.
//2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//есть возвращает true, если нет false
//
//В main считываем файл.
//Разбиваем текст на предложения. Используя методы класса TextFormater
//определяем подходит ли нам предложение. Если подходит добавляем его в новый файл
public class AdditionalTask2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader
                ("src/lesson12/additionaltask2/FileInput.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter
                     ("src/lesson12/additionaltask2/FileOutput.txt"))) {
            String text = br.readLine();
            String[] sentences = text.split("[.]");
            TextFormater textFormater = new TextFormater();
            for (String sentence : sentences) {
                if (textFormater.palindrome(sentence.trim()) ||
                        (textFormater.wordCount(sentence) >= 3 && textFormater.wordCount(sentence) <= 5)) {
                    bw.write(sentence + ".");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

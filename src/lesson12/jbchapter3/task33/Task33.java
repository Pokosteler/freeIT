package lesson12.jbchapter3.task33;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
//препинания и слов.
public class Task33 {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader
                ("freeIT/src/lesson12/jbchapter3/task33/File.txt")) {
            int result = fileReader.read();
            StringBuilder textFromFile = new StringBuilder();
            while (result != -1) {
                textFromFile.append((char) result);
                result = fileReader.read();
            }
            fileReader.close();

            String[] words = textFromFile.toString().split("[, !?.@]+");

            int countOfPunctuations = 0;
            Pattern p = Pattern.compile("[^a-zA-Z0-9 $]+");
            Matcher m = p.matcher(textFromFile.toString());
            while (m.find()) {
                countOfPunctuations++;
            }

            System.out.println(textFromFile);
            System.out.println("Text consists of " + countOfPunctuations + " punctuation(s) and " + words.length + " word(s)");
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
        }
    }
}
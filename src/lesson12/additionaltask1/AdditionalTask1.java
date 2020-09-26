package lesson12.additionaltask1;

import java.io.*;

//В исходном файле находятся слова, каждое слово на новой строке. После
//запуска программы должен создать файл, который будет содержать в себе
//только палиндромы
public class AdditionalTask1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader
                ("src/lesson12/additionaltask1/FileInput.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter
                     ("src/lesson12/additionaltask1/FileOutput.txt"))) {
            String word;
            while ((word = br.readLine()) != null) {
                char arrayStringBackwards[] = new char[word.length()];
                for (int i = word.length() - 1; i >= 0; i--) {
                    arrayStringBackwards[word.length() - i - 1] = word.charAt(i);
                }
                if (word.equalsIgnoreCase(String.valueOf(arrayStringBackwards))) {
                    bw.write(word + "\n");
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

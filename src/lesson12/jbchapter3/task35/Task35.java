package lesson12.jbchapter3.task35;

import java.io.*;
import java.util.Random;

//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
//распечатать числа и их среднее арифметическое.
public class Task35 {
    public static void main(String[] args) throws IOException {
        DataOutputStream file;
        try {
            file = new DataOutputStream(new BufferedOutputStream(new
                    FileOutputStream("freeIT/src/lesson12/jbchapter3/task35/File.dat")));
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            file.writeInt(random.nextInt(20));
        }
        file.close();

        DataInputStream dataInputStream;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new
                    FileInputStream("freeIT/src/lesson12/jbchapter3/task35/File.dat")));
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        int res = dataInputStream.readInt();
        int amount = 0;
        int count = 0;
        while (true) {
            System.out.print(res + "\t");
            try {
                res = dataInputStream.readInt();
                amount += res;
                count++;
            } catch (EOFException e) {
                break;
            }
        }
        dataInputStream.close();
        System.out.println("Average: " + (amount / count));
    }
}
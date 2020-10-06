package lesson14.library;

import java.util.ArrayList;
import java.util.List;

//1)Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг.
// Некоторые из них можно выдавать на руки некоторые - только в читальный зал.
// Посетители могут брать одновременно по несколько книг на руки и в читальный зал.
public class LaunchingLibrary {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        threads.add(new Thread(new Library()));
        for (Thread t : threads) {
            t.start();
        }
    }
}

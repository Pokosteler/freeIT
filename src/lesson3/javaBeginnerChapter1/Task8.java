package lesson3.javaBeginnerChapter1;

import java.util.Random;

//Имеется целое число (задать с помощью Random rand = new Random(); int x =
//rand.nextInt() ). Это число – количество денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже.
public class Task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int amountOfMoney = rand.nextInt();
        if (amountOfMoney >= 0) {
            if ((amountOfMoney % 10 > 4 && amountOfMoney % 10 < 10) || (amountOfMoney % 100 > 10 && amountOfMoney % 100 < 15) || amountOfMoney % 10 == 0) {
                System.out.println(amountOfMoney + " рублей");
            } else {
                if (amountOfMoney % 10 == 1 && amountOfMoney % 100 != 11) {
                    System.out.println(amountOfMoney + " рубль");
                }
                if ((amountOfMoney % 10 == 2 && amountOfMoney % 100 != 12) || (amountOfMoney % 10 == 3 && amountOfMoney % 100 != 13) || (amountOfMoney % 10 == 4 && amountOfMoney % 100 != 14)) {
                    System.out.println(amountOfMoney + " рубля");
                }
            }
        } else {
            System.out.println(amountOfMoney + " - amount of money can't be negative");
        }
    }
}
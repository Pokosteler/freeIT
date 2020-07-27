package lesson3.javaBeginnerChapter1;

//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.
public class Task11 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100) + 1;
        boolean validator = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                validator = false;
            }
        }
        if (validator) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " isn't a prime number");
        }
    }
}
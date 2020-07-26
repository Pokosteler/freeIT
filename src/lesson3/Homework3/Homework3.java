package lesson3.Homework3;

// Вычислить: 1+2+4+8+...+256
public class Homework3 {
    public static void main(String[] args) {
        int element = 1;
        int amount = element;
        while (element < 256) {
            element *= 2;
            amount += element;
        }
        System.out.println("\namount: " + amount);
    }
}
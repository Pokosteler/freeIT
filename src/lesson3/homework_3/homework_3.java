package lesson3.homework_3;

// Вычислить: 1+2+4+8+...+256
public class homework_3 {
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
package tictactoe;

import java.util.Scanner;

//Написать игру крестики нолики (двумерный массив размерностью 3х3).
//1. Не используя классы и методы - все в методе main
//2. Не используя утильные классы (Arrays и Math)
//3. Игра должна продолжаться до тех пор, пока не будет выявлен победитель
// (три "О" или три "Х" в ряд или по диагонали) или пока не закончатся свободные клетки
public class Tictactoe {
    public static void main(String[] args) {
        String field[][] = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = "e"; // empty cage
                System.out.print(field[i][j] + " \t");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        Integer numberOfMoves = 9;
        while (numberOfMoves > 0) {
            System.out.print("Enter value: "); // "x" or "o"
            String value = sc.next();
            System.out.print("Enter x: ");
            Integer x = sc.nextInt();
            System.out.print("Enter y: ");
            Integer y = sc.nextInt();
            if (field[x][y] == "e") {
                field[x][y] = value;
                numberOfMoves--;
            } else {
                System.out.println("This cage is already filled!");
            }
            for (int a = 0; a < 3; a++) {
                for (int b = 0; b < field.length; b++) {
                    System.out.print(field[a][b] + " \t");
                }
                System.out.println();
            }
            for (int i = 0; i < 3; i++) {
                if ((field[i][0].equals(field[i][1]) && field[i][2].equals(field[i][1]) && field[i][0] != "e" && field[i][1] != "e" && field[i][2] != "e") ||
                        (field[0][i].equals(field[1][i]) && field[2][i].equals(field[1][i]) && field[0][i] != "e" && field[1][i] != "e" && field[2][i] != "e")) {
                    System.out.print("You win!");
                    numberOfMoves = 0;
                }
            }
            if ((field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) && field[1][1] != "e" && field[0][0] != "e" && field[2][2] != "e") || (field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0]) && field[1][1] != "e" && field[0][2] != "e" && field[2][0] != "e")) {
                System.out.print("You win!");
                numberOfMoves = 0;
            }
        }
    }
}
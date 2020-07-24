package lesson3.Java_Beginner_chapter_1;

//Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
//таким образом:
//1 1 1 1 1
//0 1 1 1 0
//0 0 1 0 0
//0 1 1 1 0
//1 1 1 1 1
public class Task17 {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (((i == 1 || i == 3 || i == 2) && (j == 0 || j == 4)) || (i == 2 && (j == 1 || j == 3))) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
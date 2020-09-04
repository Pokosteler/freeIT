package lesson9.jbchapter2.task28;

//Написать класс, который умеет хранить в себе массив любых типов данных (int, long
//etc.). Реализовать метод get(int index), который возвращает любой элемент
//массива по индексу.
public class Task28 {
    public static void main(String[] args) {
        Box<Object> myBox = new Box<>();
        myBox.setArray(new Object[]{"Hello", 3f, 80});
        System.out.println(myBox.get(1));
    }
}

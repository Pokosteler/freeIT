package lesson9.jbchapter2.task28;

//Написать класс, который умеет хранить в себе массив любых типов данных (int, long
//etc.). Реализовать метод get(int index), который возвращает любой элемент
//массива по индексу.
public class Task28 {
    public static void main(String[] args) {
        Box<String> myBoxString = new Box<>();
        Box<Integer> myBoxInteger = new Box<Integer>();
        myBoxString.setArray(new String[]{"Hello", "World"});
        myBoxInteger.setArray(new Integer[]{3, 80});
        System.out.println(myBoxString.get(1));
        System.out.println(myBoxInteger.get(0));
    }
}

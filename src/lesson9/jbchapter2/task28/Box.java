package lesson9.jbchapter2.task28;

public class Box<T> {
    private T[] array;

    public void setArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T get(int index) {
        return array[index];
    }
}
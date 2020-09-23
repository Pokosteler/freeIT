package lesson12.additionaltask4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
//сериализации произвести обратный процесс
public class AdditionalTask4 {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("car.dat"));
             ObjectInputStream objectinputStream = new ObjectInputStream(new FileInputStream("car.dat"))) {
            Car car = new Car("BMV", 180, 10000);
            objectOutputStream.writeObject(car);
            car = (Car) objectinputStream.readObject();
            System.out.printf("Brand: %s \t Price: %d \tSpeed: %d", car.getBrand(), car.getPrice(), car.getSpeed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

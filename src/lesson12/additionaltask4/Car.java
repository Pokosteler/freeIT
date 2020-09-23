package lesson12.additionaltask4;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private Integer speed;
    private Integer price;

    public Car(String brand, Integer speed, Integer price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

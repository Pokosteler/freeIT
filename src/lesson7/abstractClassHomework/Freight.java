package lesson7.abstractClassHomework;

public class Freight extends Ground {
    private Integer weightCapacity;

    public Double powerKilowatts() {
        return getPower() * 0.74;
    }

    public void cargoCapacity(Integer cargo) {
        if (getWeightCapacity() >= cargo) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    public String description() {
        return "Weight capacity: " + getWeightCapacity() + " t; Number of wheels: " + getNumberOfWheels() +
                "; Fuel consumption: " + getFuelConsumption() + "gallon; Power: " + getPower() +
                "horsepower; Power in kilowatts: " + powerKilowatts() + "kilowatts; Brand: " + getBrand() + "; Mass: "
                + getMass() + "kg; Maximum speed: " + getMaximumSpeed() + "km/h";
    }

    public Integer getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(Integer weightCapacity) {
        this.weightCapacity = weightCapacity;
    }
}

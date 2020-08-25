package lesson7.abstractClassHomework;

public class Passenger extends Ground {
    private String bodyworkType;
    private Integer numberOfPassengers;

    public Double powerKilowatts() {
        return getPower() * 0.74;
    }

    private Integer calculationOfFuelConsumption(Integer distance) {
        return (getFuelConsumption() / 100) * distance;
    }

    public String distanceAndFuel(int seconds, int minutes, int hours) {
        String timeString = (hours + (minutes / 60) + (seconds / 3600)) + "ч, " +
                (minutes % 60 + (seconds / 60)) + "мин, " + (seconds % 60) + "сек";
        Integer time = (hours + (minutes / 60) + (seconds / 3600)) + (minutes % 60 + (seconds / 60)) + (seconds % 60);
        Integer distance = time * getMaximumSpeed();
        return "За время " + timeString + " ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " +
                getMaximumSpeed() + " км/ч " + "проедет " + distance + " км  и израсходует " +
                calculationOfFuelConsumption(distance) + " литров топлива.";
    }

    public String description() {
        return "Bodywork type: " + getBodyworkType() + "; Number of passengers: " + getNumberOfPassengers() +
                "; Number of wheels: " + getNumberOfWheels() + "; Fuel consumption: " + getFuelConsumption() +
                "gallon; Power: " + getPower() + "horsepower; Power in kilowatts: " + powerKilowatts() +
                "kilowatts; Brand: " + getBrand() + "; Mass: " + getMass() + "kg; Maximum speed: " + getMaximumSpeed()
                + "km/h";
    }

    public String getBodyworkType() {
        return bodyworkType;
    }

    public void setBodyworkType(String bodyworkType) {
        this.bodyworkType = bodyworkType;
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(Integer numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}

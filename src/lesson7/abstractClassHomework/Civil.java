package lesson7.abstractClassHomework;

public class Civil extends Air {
    private Integer numberOfPassengers;
    private Boolean availabilityBusinessClass;

    public Double powerKilowatts() {
        return getPower() * 0.74;
    }

    public void capacityPassengers(Integer passenger) {
        if (getNumberOfPassengers() >= passenger) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }

    public String description() {
        return "Number of passengers: " + getNumberOfPassengers() + " Availability business class: " +
                getAvailabilityBusinessClass() + "; Wingspan: " + getWingspan() +
                "m; Minimum runway length for take off: " + getMinimumRunwayLengthForTakeOff() + "; Power: " +
                getPower() + "horsepower; Power in kilowatts: " + powerKilowatts() + "kilowatts; Brand: " + getBrand() + "; Mass: " + getMass() + "kg; Maximum speed: " +
                getMaximumSpeed() + "km/h";
    }

    public Boolean getAvailabilityBusinessClass() {
        return availabilityBusinessClass;
    }

    public void setAvailabilityBusinessClass(Boolean availabilityBusinessClass) {
        this.availabilityBusinessClass = availabilityBusinessClass;
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(Integer numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}

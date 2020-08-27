package lesson7.abstractClassHomework;

public class Military extends Air {
    private Boolean availabilityEjectionSystem;
    private Integer NumberOfMissilesOnBoard;

    public Double powerKilowatts() {
        return getPower() * 0.74;
    }

    public void shot() {
        if (getNumberOfMissilesOnBoard() != 0) {
            System.out.println("Ракета пошла…");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void ejection() {
        if (getAvailabilityEjectionSystem()) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    public String description() {
        return "Availability ejection system: " + getAvailabilityEjectionSystem() + "; Number of missiles on board: " +
                getNumberOfMissilesOnBoard() + "; Wingspan: " + getWingspan() +
                "m; Minimum runway length for take off: " + getMinimumRunwayLengthForTakeOff() + "; Power: " +
                getPower() + "horsepower; Power in kilowatts: " + powerKilowatts() + "kilowatts; Brand: " + getBrand()
                + "; Mass: " + getMass() + "kg; Maximum speed: " +
                getMaximumSpeed() + "km/h";
    }

    public void setAvailabilityEjectionSystem(Boolean availabilityEjectionSystem) {
        this.availabilityEjectionSystem = availabilityEjectionSystem;
    }

    public Boolean getAvailabilityEjectionSystem() {
        return availabilityEjectionSystem;
    }

    public Integer getNumberOfMissilesOnBoard() {
        return NumberOfMissilesOnBoard;
    }

    public void setNumberOfMissilesOnBoard(Integer numberOfMissilesOnBoard) {
        NumberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }
}
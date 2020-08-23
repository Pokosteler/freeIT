package lesson7.javaBeginnerChapter2.task26;

public class ElectricKettle extends SmallElectricalAppliances implements Configuration {
    public ElectricKettle(String name) {
        super(name);
    }

    @Override
    public void turn(Boolean switcher) {
        if (switcher == true) {
            System.out.println("Электрический чайник включен в розетку");
        } else {
            System.out.println("Электрический чайник не включен в розетку");
        }
    }
}
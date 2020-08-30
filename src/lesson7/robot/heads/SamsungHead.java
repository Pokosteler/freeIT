package lesson7.robot.heads;

public class SamsungHead implements IHead {
    final int price;

    public SamsungHead() {
        this.price = 15;
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

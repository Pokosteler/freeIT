package lesson7.robot.heads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead() {
        this.price = 2;
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

package lesson7.robot.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead() {
        this.price = 3;
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

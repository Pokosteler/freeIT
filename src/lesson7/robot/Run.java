package lesson7.robot;

import lesson7.robot.hands.SamsungHand;
import lesson7.robot.hands.SonyHand;
import lesson7.robot.hands.ToshibaHand;
import lesson7.robot.heads.SamsungHead;
import lesson7.robot.heads.SonyHead;
import lesson7.robot.heads.ToshibaHead;
import lesson7.robot.legs.SamsungLeg;
import lesson7.robot.legs.SonyLeg;
import lesson7.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot robot1 = new Robot(new SonyHead(15), new SamsungHand(4), new ToshibaLeg(1));
        Robot robot2 = new Robot(new SamsungHead(7), new ToshibaHand(3), new SonyLeg(2));
        Robot robot3 = new Robot(new ToshibaHead(10), new SonyHand(2), new SamsungLeg(3));
        robot1.action();
        System.out.println("Цена robot1: " + robot1.getPrice());
        robot2.action();
        robot2.getPrice();
        System.out.println("Цена robot2: " + robot2.getPrice());
        robot3.action();
        robot3.getPrice();
        System.out.println("Цена robot3: " + robot3.getPrice());
        if (robot1.getPrice() > robot2.getPrice()) {
            if (robot1.getPrice() > robot3.getPrice()) {
                System.out.println("robot1 самый дорогой");
            } else {
                System.out.println("robot3 самый дорогой");
            }
        } else {
            if (robot2.getPrice() > robot3.getPrice()) {
                System.out.println("robot2 самый дорогой");
            } else {
                System.out.println("robot3 самый дорогой");
            }
        }
    }
}

package lesson7.javaBeginnerChapter2.task25;

import java.util.Scanner;

//Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
//банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
//50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
//снимающую деньги. На вход передается сумма денег. На выход – булевское
//значение (операция удалась или нет). При снятии денег функция должна
//рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
//конструктор с тремя параметрами – количеством купюр.
public class Task25 {
    public static void main(String[] args) {
        ATM atm = new ATM(0, 0, 0);
        atm.print();
        Scanner sc = new Scanner(System.in);
        System.out.print("How much $20 would you like to add? ");
        Integer twentyDollars = sc.nextInt();
        System.out.print("How much $50 would you like to add? ");
        Integer fiftyDollars = sc.nextInt();
        System.out.print("How much $100 would you like to add? ");
        Integer hundredDollars = sc.nextInt();
        atm.addMoney(twentyDollars, fiftyDollars, hundredDollars);
        atm.print();
        System.out.print("How much $20 would you like to withdraw? ");
        Integer withdrawTwentyDollars = sc.nextInt();
        System.out.print("How much $50 would you like to withdraw? ");
        Integer withdrawFiftyDollars = sc.nextInt();
        System.out.print("How much $100 would you like to withdraw? ");
        Integer withdrawHundredDollars = sc.nextInt();
        atm.withdrawMoney(withdrawTwentyDollars, withdrawFiftyDollars, withdrawHundredDollars);
    }
}
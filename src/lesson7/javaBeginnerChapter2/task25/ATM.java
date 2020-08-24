package lesson7.javaBeginnerChapter2.task25;

import java.util.Scanner;

public class ATM {
    private Integer twentyDollars;
    private Integer fiftyDollars;
    private Integer hundredDollars;
    private Integer bankAccount;

    public ATM(Integer twentyDollars, Integer fiftyDollars, Integer hundredDollars) {
        this.twentyDollars = twentyDollars;
        this.fiftyDollars = fiftyDollars;
        this.hundredDollars = hundredDollars;
    }

    public void startWork() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much $20 would you like to add? ");
        Integer twentyDollars = sc.nextInt();
        System.out.print("How much $50 would you like to add? ");
        Integer fiftyDollars = sc.nextInt();
        System.out.print("How much $100 would you like to add? ");
        Integer hundredDollars = sc.nextInt();
        addMoney(twentyDollars, fiftyDollars, hundredDollars);
        print();
        System.out.print("How much money would you like to withdraw? ");
        if (withdrawMoney(sc.nextInt())) {
            System.out.print("Operation succeeded");
        } else {
            System.out.print("Operation failed");
        }
    }

    public void addMoney(Integer twentyDollars, Integer fiftyDollars, Integer hundredDollars) {
        this.twentyDollars += twentyDollars;
        this.fiftyDollars += fiftyDollars;
        this.hundredDollars += hundredDollars;
        this.bankAccount = this.getTwentyDollars() * 20 + this.fiftyDollars * 50 + this.hundredDollars * 100;
    }

    public Boolean withdrawMoney(Integer money) {
        Scanner sc = new Scanner(System.in);
        if (this.bankAccount > 0) {
            if (this.bankAccount >= money) {
                if (money > 0) {
                    if (money >= 20) {
                        System.out.print("You can get " + (money / 20) + " x 20$");
                    }
                    if (money >= 50) {
                        System.out.print(" or " + (money / 50) + " x 50$");
                    }
                    if (money >= 100) {
                        System.out.print(" or " + (money / 100) + " x 100$");
                    }
                    if (money >= 20) {
                        System.out.println("\nPress 1 to receive the sum in 20$ money");
                    }
                    if (money >= 50) {
                        System.out.println("Press 2 to receive the sum in 50$ money");
                    }
                    if (money >= 100) {
                        System.out.println("Press 3 to receive the sum in 100$ money");
                    }
                    switch (sc.nextInt()) {
                        case 1:
                            this.bankAccount -= (money / 20) * 20;
                            System.out.println("You got " + money / 20 + " x 20$");
                            break;
                        case 2:
                            this.bankAccount -= (money / 50) * 50;
                            System.out.println("You got " + money / 50 + " x 50$");
                            break;
                        case 3:
                            this.bankAccount -= (money / 100) * 100;
                            System.out.println("You got " + money / 100 + " x 100$");
                            break;
                    }
                    print();
                    return true;
                }
                if (money == 0) {
                    return true;
                }
            }
        }
        if (this.bankAccount == 0) {
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println("Current balance: " + getBankAccount() + "$");
    }

    public int getTwentyDollars() {
        return twentyDollars;
    }

    public void setTwentyDollars(Integer twentyDollars) {
        this.twentyDollars = twentyDollars;
    }

    public int getFiftyDollars() {
        return fiftyDollars;
    }

    public void setFiftyDollars(Integer fiftyDollars) {
        this.fiftyDollars = fiftyDollars;
    }

    public int getHundredDollars() {
        return hundredDollars;
    }

    public void setHundredDollars(Integer hundredDollars) {
        this.hundredDollars = hundredDollars;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Integer bankAccount) {
        this.bankAccount = bankAccount;
    }
}
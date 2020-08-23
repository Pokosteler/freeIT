package lesson7.javaBeginnerChapter2.task25;

public class ATM {
    private int twentyDollars;
    private int fiftyDollars;
    private int hundredDollars;

    public ATM(int twentyDollars, int fiftyDollars, int hundredDollars) {
        this.twentyDollars = twentyDollars;
        this.fiftyDollars = fiftyDollars;
        this.hundredDollars = hundredDollars;
    }

    public void addMoney(int twentyDollars, int fiftyDollars, int hundredDollars) {
        this.twentyDollars += twentyDollars;
        this.fiftyDollars += fiftyDollars;
        this.hundredDollars += hundredDollars;
    }

    public Boolean withdrawMoney(int twentyDollars, int fiftyDollars, int hundredDollars) {
        if (this.twentyDollars >= twentyDollars && this.fiftyDollars >= fiftyDollars && this.hundredDollars >= hundredDollars) {
            this.twentyDollars -= twentyDollars;
            this.fiftyDollars -= fiftyDollars;
            this.hundredDollars -= hundredDollars;
            print();
            return true;
        }
        System.out.println("Wrong operation!");
        return false;
    }

    public void print() {
        System.out.println("Current balance: " + this.twentyDollars + " x 20$, " + this.fiftyDollars + " x 50$, " + this.hundredDollars + " x 100$");
    }

    public int getTwentyDollars() {
        return twentyDollars;
    }

    public void setTwentyDollars(int twentyDollars) {
        this.twentyDollars = twentyDollars;
    }

    public int getFiftyDollars() {
        return fiftyDollars;
    }

    public void setFiftyDollars(int fiftyDollars) {
        this.fiftyDollars = fiftyDollars;
    }

    public int getHundredDollars() {
        return hundredDollars;
    }

    public void setHundredDollars(int hundredDollars) {
        this.hundredDollars = hundredDollars;
    }
}

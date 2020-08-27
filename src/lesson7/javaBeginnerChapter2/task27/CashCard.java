package lesson7.javaBeginnerChapter2.task27;

abstract class CashCard extends BankCard {
    private Boolean debit;

    public CashCard(String name) {
        super(name);
    }

    public Boolean getDebit() {
        return debit;
    }

    public void setDebit(Boolean debit) {
        this.debit = debit;
    }
}
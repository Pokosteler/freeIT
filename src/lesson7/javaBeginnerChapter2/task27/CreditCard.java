package lesson7.javaBeginnerChapter2.task27;

abstract class CreditCard extends BankCard {
    private Boolean credit;
    private Integer limit;

    public CreditCard(String name) {
        super(name);
    }

    public Boolean getCredit() {
        return credit;
    }

    public void setCredit(Boolean credit) {
        this.credit = credit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
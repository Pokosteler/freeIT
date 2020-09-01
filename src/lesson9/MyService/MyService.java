package lesson9.MyService;

@Version(Nougat = "1.0")
public class MyService {
    private Integer firstValue;
    private Integer secondValue;

    MyService() {
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof MyService) && (((MyService) o).getFirstValue() == this.firstValue) && (((MyService) o).getSecondValue() == this.secondValue)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return firstValue + secondValue;
    }

    @MethodService(value = true)
    private void thisClassInfo() {
        System.out.println("firstValue: " + firstValue);
        System.out.println("secondValue: " + secondValue);
    }

    public Integer getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(Integer firstValue) {
        this.firstValue = firstValue;
    }

    public Integer getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(Integer secondValue) {
        this.secondValue = secondValue;
    }
}

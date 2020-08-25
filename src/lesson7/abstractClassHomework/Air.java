package lesson7.abstractClassHomework;

public class Air extends Transport {
    private Integer wingspan;
    private Integer minimumRunwayLengthForTakeOff;

    public Integer getWingspan() {
        return wingspan;
    }

    public void setWingspan(Integer wingspan) {
        this.wingspan = wingspan;
    }

    public Integer getMinimumRunwayLengthForTakeOff() {
        return minimumRunwayLengthForTakeOff;
    }

    public void setMinimumRunwayLengthForTakeOff(Integer minimumRunwayLengthForTakeOff) {
        this.minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff;
    }
}

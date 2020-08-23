package lesson7.javaBeginnerChapter2.task24;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getNumberOfSeconds() {
        return this.hours * 3600 + this.minutes * 60 + seconds;
    }

    public String comparisonOfTwoObjects(Time object) {
        int firstObject = getNumberOfSeconds();
        int secondObject = object.getNumberOfSeconds();
        if (firstObject == secondObject) {
            return "first object = second object";
        } else if (firstObject > secondObject) {
            return "first time > second time";
        } else {
            return "first time < second time";
        }
    }

    public void printTime() {
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds contains " + getNumberOfSeconds() + " seconds");
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
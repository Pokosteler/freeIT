package lesson7.javaBeginnerChapter2.task24;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds % 60;
        this.minutes = minutes % 60 + (seconds / 60);
        this.hours = hours + (minutes / 60) + (seconds / 3600);
    }

    public int getNumberOfSeconds() {
        return getHours() * 3600 + getMinutes() * 60 + getSeconds();
    }

    public String comparisonOfTwoObjects(Time time) {
        int firstTime = getNumberOfSeconds();
        int secondTime = time.getNumberOfSeconds();
        if (firstTime == secondTime) {
            return "first time = second time";
        } else if (firstTime > secondTime) {
            return "first time > second time";
        } else {
            return "first time < second time";
        }
    }

    public void printTime() {
        System.out.println(getHours() + " hours " + getMinutes() + " minutes " + getSeconds() + " seconds contains " + getNumberOfSeconds() + " seconds");
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
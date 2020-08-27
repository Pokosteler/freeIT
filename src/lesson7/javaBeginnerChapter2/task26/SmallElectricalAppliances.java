package lesson7.javaBeginnerChapter2.task26;

abstract class SmallElectricalAppliances extends HomeAppliance {
    private Boolean presenceOfBatteries;

    public SmallElectricalAppliances(String name) {
        super(name);
    }

    public Boolean getPresenceOfBatteries() {
        return presenceOfBatteries;
    }

    public void setPresenceOfBatteries(Boolean presenceOfBatteries) {
        this.presenceOfBatteries = presenceOfBatteries;
    }
}
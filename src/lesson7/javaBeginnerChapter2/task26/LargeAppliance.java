package lesson7.javaBeginnerChapter2.task26;

abstract class LargeAppliance extends HomeAppliance {
    private Integer mass;

    public LargeAppliance(String name) {
        super(name);
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }
}
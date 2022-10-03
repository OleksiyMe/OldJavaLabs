package lab11;

import java.lang.reflect.WildcardType;

public final class ScrumMaster extends Employee implements ScrumMember, WFH {
    public ScrumMaster(String name, int age, char gender, String id,  double salary) {
        super(name, age, gender, id, "Scrum Master", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is scedule meetings");
    }

    public void coaching() {
        System.out.println(getName()+" is coaching");
    }

    @Override
    public void dailyStandUp() {
        System.out.println(getName()+" is daily standapping");
    }

    @Override
    public void sprintPlanning() {
        System.out.println(getName()+" is sprint planning");
    }
    @Override
    public void workFromHome() {
        System.out.println(getName()+" is working from home");
    }
}

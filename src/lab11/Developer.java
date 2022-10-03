package lab11;

public class Developer extends Employee implements ScrumMember, WFH{
    public Developer(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is coding");
    }

    public void fixBug() {
        System.out.println(getName()+" is fixing the bug.");
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

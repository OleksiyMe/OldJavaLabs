package lab11;

public final class BusinessAnalyst extends Employee implements ScrumMember, WFH{
    public BusinessAnalyst(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Business Analyst", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is gathering requirement documents.");
    }

    public void analyze() {
        System.out.println(getName()+" is analyzing requirements.");
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

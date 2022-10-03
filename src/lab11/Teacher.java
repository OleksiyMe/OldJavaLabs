package lab11;

public final class Teacher extends Employee implements WFH{
    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is preparing class material");
    }

    public void teach() {
        System.out.println(getName()+" is teaching");
    }

    @Override
    public void workFromHome() {
        System.out.println(getName()+" is working from home");
    }
}

package lab12_oop_exceptions.restaurantTask;

public abstract class Employee {

    private String name;
    private int age;
    private final char gender;
    private final String id;
    private String jobTitle;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null||name.isEmpty()){
            throw new NoSuchPersonException("Person can not be null or empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            throw new NoSuchPersonException("Age can not be negative or zero: "+age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle==null||jobTitle.isEmpty()){
            throw new NoSuchPersonException("JobTitle can not be null or empty");
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            throw new NoSuchJobException("Salary can not be negative or zero: "+salary);
        }
        this.salary = salary;
    }

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        if (gender!='M'&&gender!='F'){
            throw new NoSuchPersonException("Gender must be 'F' or 'M': "+gender);
        }
        this.gender = gender;
        if (id==null||id.isEmpty()){
            throw new NoSuchPersonException("id can not be null or empty");
        }
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public abstract void work();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}



package lab10.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer {

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double hourlyRate;
    private String programmingLanguage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty() || name == null) {
            System.err.println("name can not be set to null/empty/blank: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.err.println("Age can not be less than 18");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender != 'M' && gender != 'F') {
            System.err.println("gender can only be set to 'M' or 'F': " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if (jobTitle == null || jobTitle.isBlank()) {
            System.err.println("jobTitle can not be set to null/empty/blank: " + jobTitle);
            System.exit(1);

        }

        this.jobTitle = jobTitle;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            System.err.println("hourlyRate can not be negative: " + hourlyRate);
            System.exit(1);
        }
        this.hourlyRate = hourlyRate;
    }

    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage){
        ArrayList<String> list=new ArrayList<>(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));

    //    String[] languages = {"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"};
       if (!list.contains(programmingLanguage)) {
                System.err.println("Invalid programming language: "+programmingLanguage);
                System.exit(1);
            }
       this.programmingLanguage=programmingLanguage;

        }

    public Developer(String name, int age, char gender, String id, String jobTitle, double hourlyRate, String programmingLanguage) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setHourlyRate(hourlyRate);
        setProgrammingLanguage(programmingLanguage);
    }

    public double getSalary(){
        return hourlyRate*40*52;   // 40 hours a week 52 weeks in a year
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + getSalary() +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
    public void coding() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }
    public void fixingBugs() {
        System.out.println(name + " is fixing bugs");
    }






}












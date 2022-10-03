package lab07_ClassAndObject;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public boolean isEmployed, isMarried;
    public String batch;
    public int groupNumber;
    public String programmingLanguage;

    public void setInfo(String name, int age, char gender, boolean isEmployed,
                        boolean isMarried, String batch, int groupNumber, String programmingLanguage) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isEmployed = isEmployed;
      this.isMarried = isMarried;
        this.batch = batch;
        this.groupNumber = groupNumber;
        this.programmingLanguage = programmingLanguage;
    }

    public void study(){

        System.out.println(name+" is studing "+programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
             //   ", isEmployed=" + isEmployed +
            //    ", isMarried=" + isMarried +
                ", batch='" + batch + '\'' +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}

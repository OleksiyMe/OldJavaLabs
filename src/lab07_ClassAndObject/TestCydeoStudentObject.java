package lab07_ClassAndObject;

public class TestCydeoStudentObject {
    public static void main(String[] args) {

        CydeoStudent student1 =new CydeoStudent();
        student1.setInfo("Suzanna",23, 'f',true,
                true, "Java Developer Batch 1", 1,
                "Java");

        System.out.println("student1 = " + student1);

        CydeoStudent student2 = new CydeoStudent();
        student2.setInfo("Mark",33, 'm',true,
                false, "Java Developer Batch 1", 1,
                "Java");
        System.out.println("student2 = " + student2);

        CydeoStudent student3 = new CydeoStudent();
        student3.setInfo("Daniel",35, 'm',false,
                false, "Java SDET", 15,
                "Java");
        System.out.println("student2 = " + student3);


student2 = student1;
student1.setInfo("Maria",21, 'f',false, false, "Java Developer Batch 1", 1,"Java");

        System.out.println("student2 = " + student2);
        System.out.println("student1 = " + student1);



    }
}

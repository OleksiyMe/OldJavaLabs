package lab004_Debug;

public class Debug {
    public static void main(String[] args) {


        System.out.println("hello");

        String name = "Mike";
        int age = 20;

        if (name.equals("Mike") && age == 20) {

            System.out.println("correct");
        } else System.out.println("wrong");

        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.println("Apple");
                method1();
            }
            else{
                System.out.println("Orange");
         method2();
            }
        }

    }

    private static void method2() {
        System.out.println("inside method2");
    }

    private static void method1() {
        System.out.println("inside method1");
    }


}

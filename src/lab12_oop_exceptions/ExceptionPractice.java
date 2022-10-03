package lab12_oop_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPractice {
    public static void main(String[] args) throws FileNotFoundException {

        String str = null;

        try {
            String result = str.repeat(3);
            System.out.println(result);
            System.out.println("Try block");

        } catch (RuntimeException e) {
            e.printStackTrace();

            str = "Java";
            String result = str.repeat(3);
            System.out.println(result);
        }
        System.out.println("Code after try-catch block");
        System.out.println("==============================================");


        new FileInputStream("C:\\Users\\kid\\IdeaProjects\\JavaLab\\hs_err_pid7336.log");

    }

    public static void method1() throws Exception {
        new FileInputStream("C:\\Users\\kid\\IdeaProjects\\JavaLab\\hs_err_pid7336.log");
    }

    public static void method2() {
        try {
            new FileInputStream("C:\\Users\\kid\\IdeaProjects\\JavaLab\\hs_err_pid7336.log");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
        public static void method3 () {

    //    method1();
        method2();

        }


    }

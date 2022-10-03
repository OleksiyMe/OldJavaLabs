package lab05_String;

import java.util.Locale;

public class StringMethodsPractice {
    public static void main(String[] args) {

        String name2 = "Cydeo School";
        String name = "Josh Daniel Aaron";
        //             0123456789012


        char ch = name.charAt(5);
        char last= name.charAt(name.length()-1);
        System.out.println("ch = " + ch);
        System.out.println("last = " + last);

        System.out.println("====================================================");
        String email="cydeo_school@gmail.com";



        int beginningIndex=email.indexOf('@')+1;
        int endingIndex=email.lastIndexOf('.');
        String domain=email.substring(beginningIndex, endingIndex);
        System.out.println("domain = " + domain);

        System.out.println("================================================");

        String s2 = "I study at CYDEO school";
        String school = s2.substring(s2.indexOf('C'));
        System.out.println(school);
        System.out.println("===================================================");

String s3="Java is my favorite programming language";

        System.out.println(s3.toLowerCase().contains("java"));
        System.out.println("=====================================================");

        String s4="Cydeo School";

        System.out.println(s4.startsWith("Cy2d"));

        System.out.println(s4.endsWith("ool"));


    }

}

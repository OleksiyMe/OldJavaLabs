package lab05_String;

import java.util.Locale;

public class Reverse {

    public static void main(String[] args) {

        String word = "Wooden Spoon";
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {

            char each = word.charAt(i);
            result += "" + each;
        }

        System.out.println("result = " + result);
        System.out.println("=======================================================");

        String school = "Cydeo School";

        int index1 = school.indexOf('e');
        System.out.println("index1 = " + index1);

        int index2 = school.indexOf('j');
        System.out.println("index2 = " + index2);

        String str = "Java Programming Language";

        int index3 = str.indexOf("a ");
        System.out.println("index3 = " + index3);

        System.out.println("=================================================");

        String s1 = "WOODEN SPOON";

        s1 = s1.toLowerCase();
        System.out.println(s1);

        s1 = s1.toUpperCase();
        System.out.println(s1);
        System.out.println("=================================================");

        String sentence ="Today is Thursday, and Thursday is a Lab day";

        sentence= sentence.replace("Thursday","Friday");

        System.out.println("sentence = " + sentence);


    }
}

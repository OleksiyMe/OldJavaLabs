package lab06;

public class CustomMethodsPractice2 {
    public static void main(String[] args) {
        System.out.println(comboString("Hello", "Cydeo"));
        System.out.println(left2("Hello"));
        System.out.println(right2("java"));


    }

    public static String comboString(String a,String b) {
        if (a.length()>b.length()) return b+a+b;
        else if (b.length()>a.length()) return a+b+a;
        else return a+b;
    }

    public static String left2(String str){

        if(str.length()<3) return str;
        String s1 = str.substring(0,2);
        String s2 =str.substring(2);

        return s2+s1;
    }

    public static String right2(String str) {
        if(str.length()<3) return str;
String s1=str.substring(0,str.length()-2);
String s2 = str.substring((str.length()-2));
return s2+s1;

    }

    public static String frontAgain(String str){

        return "";
    }

}

package lab06;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        System.out.println(helloName("Oleksiy"));
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(extraEnd("Hello"));
        System.out.println("========================================");
        System.out.println(firstTwo("Hello!"));

        System.out.println(withoutEnd("aba"));

    }

    public static String helloName(String name) {

        return "Hello " + name + "!";
    }

    public static String makeAbba(String a, String b) {
        String result = "";
        result += a;
        result += b;
        result += b;
        result += a;
        return result;

    }


    public static String extraEnd(String str) {

        if (str.length() < 2) return str;

        str = str.substring(str.length() - 2);

        String result = str.repeat(3);
        return result;


    }

    public static String firstTwo(String str) {
        if (str.length() < 2) return str;
        str = "" + str.charAt(0) + str.charAt(1);
        return str;
    }

    public static String withoutEnd(String str) {
if (str.length()>3) return str.substring(1,str.length()-1);
return str;

    }

}

package lab07_ClassAndObject;

public class TestAddressObjects {
    public static void main(String[] args) {

        Address address1=new Address();

        address1.setInfo("115", "Richler av",
      "Kleinburg", "ON", "L4H 3Y6");

        Address address2=new Address();
        address2.setInfo("11523", "Green str",
                "Maple", "CA", "12434");
        Address address3=new Address();
        address3.setInfo("113b", "Army blv",
                "Albuquerque", "WA", "889523");

        System.out.println( address1 +"\n===========================");

        System.out.println( address2+"\n============================");
        System.out.println( address3);

    }
}

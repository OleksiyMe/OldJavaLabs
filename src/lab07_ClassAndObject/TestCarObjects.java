package lab07_ClassAndObject;

public class TestCarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand="BMW";
        car1.year=2022;
        car1.model="X6";
        car1.color="Black";
        car1.price=50_000;

        System.out.println("car1 = " + car1);

        Car car2=new Car();
        car2.brand="Audi";
        car2.year=2021;
        car2.model="Q4";
        car2.color="Red";
        car2.price=45_000;

        System.out.println("car2 = " + car2);

        Car car3=new Car();
        car3.setInfo("Lanca", "Aero", 1999, "Gold", 30_000);

        System.out.println("car3 = " + car3);
        car2.drive();

        Car car4=new Car();

        car4=null;
car4.drive();

    }
}

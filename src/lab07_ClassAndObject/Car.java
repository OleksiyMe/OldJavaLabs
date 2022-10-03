package lab07_ClassAndObject;

public class Car {

    public String brand, model, color;
    public int year;
    public double price;


    public String toString() {
        return year + " " + brand + " " + model +
                " " + color + " $" + price;
    }

    public void setInfo(String brand, String model, int year,
                        String color, double price){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
    }

    public void drive(){
        System.out.println("Driving "+brand+ " "+model);
    }

}

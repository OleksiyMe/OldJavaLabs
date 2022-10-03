package lab01;

public class CoinChange {

    public static void main(String[] args) {

        int priceInCents =75;
        int change = 100 - priceInCents;   //35 cents / 1 quarter 1 dime
        int quarter = (int)change/25;
        int dime = (int)(change-quarter*25)/10;
        int nickel= (int)(change-quarter*25-dime*10)/5;



        System.out.println("qarter "+quarter+" nickel "+nickel+" dime " +dime);


    }
}

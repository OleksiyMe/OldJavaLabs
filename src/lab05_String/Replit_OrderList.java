package lab05_String;

import java.util.Scanner;

public class Replit_OrderList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String shoppingList = "", answerYesNo = "yes";
        double totalCost = 0;

        for (int i = 1; !answerYesNo.equals("no"); i++) {
            System.out.println("Enter Item" + i + " and its price:");
            String itemName = input.nextLine();
            double itemPrice = input.nextDouble();
            totalCost += itemPrice;
            input.nextLine();
            System.out.println("Add one more item?");
            answerYesNo = input.nextLine();
            shoppingList += "Item" + i + ": " + itemName + " Price: " + itemPrice;
            if (!answerYesNo.equals("no")) shoppingList += ", ";
        }

        System.out.println(shoppingList + "\nTotal price: " + totalCost);
        input.close();

        /*Scanner scan = new Scanner(System.in);
        String answerYesNo = "", bigList = "";
        double totalCost = 0;
        for (int i = 1; !answerYesNo.equals("no"); i++) {
            System.out.println("Enter the name of item " + i);
            String itemName = scan.next();
            System.out.println("Enter the price of the " + itemName);
            double itemPrice = scan.nextDouble();
            System.out.println("How many " + itemName + " will you buy?");
            int itemQantity = scan.nextInt();
            bigList += (itemName + " x " + itemQantity + " - $" + itemPrice * itemQantity + "\n");
            totalCost += (itemPrice * itemQantity);
            System.out.println("Do you want to add more items to the shopping list?");
            answerYesNo = scan.next();
        }
        System.out.println("SHOPPING LIST:\n" + bigList + "Total cost: $" + totalCost);*/
    }
}



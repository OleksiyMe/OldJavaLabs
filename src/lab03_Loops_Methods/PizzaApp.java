package lab03_Loops_Methods;

import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {

        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please log in before placing the order");

        makeOrder(loginPizza());


    }

    private static void makeOrder(String email) {
        for (int i = 0; i == 0; ) {


            System.out.println("Which pizza would you like to have (Please type pizza name. To create your own pizza please type spesial?");
            Scanner scanner = new Scanner(System.in);
            String pizzaChoice = scanner.next();


            if (checkPizzaThatWeHave(pizzaChoice)) { //valid pizza

                if (pizzaChoice.equalsIgnoreCase("special")) {
                    System.out.println("Build your special");
                    //build your own pizza
                } else {
                    //get your ready pizza from the menu
                    System.out.println("We have receive your order. Price is $19.99");

                }

                System.out.println("your order num is " + generateOrderNumber(email));
                break;

            } else {
                System.out.println("invalid pizza. Try again");
            }


        }

    }

    public static String generateOrderNumber(String email) {  //order_m0i1k2e@gmail.com

        String orderNumber = "order_";

        for (int i = 0; email.length() > i + i; i++) {

            orderNumber += email.substring(i,i+1);
            orderNumber+=i;



        }
return orderNumber;

    }

    public static boolean checkPizzaThatWeHave(String pizzaChoice) {

        String pizza1 = "Margarita", pizza2 = "Salami",
                pizza3 = "Veggie", pizza4 = "FourChhese",
                pizzaSpesial = "Special";

        return pizzaChoice.equalsIgnoreCase(pizza1) || pizzaChoice.equalsIgnoreCase(pizza2) ||
                pizzaChoice.equalsIgnoreCase(pizza3) ||
                pizzaChoice.equalsIgnoreCase(pizza4) || pizzaChoice.equalsIgnoreCase(pizzaSpesial);

    }


    private static String loginPizza() {
        //Create 3 vars email(str) account number(int)  password and assign values

        String email = "a@gmail.com", password = "Kobra";
        int accountNumber = 112; //>100 <1000


        //create the selection flow for the login type
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your log in type. Email:1, Account Number:2");
        int loginType = scanner.nextInt();


        for (int i = 3; i > 0; ) {

            switch (loginType) {
                case 1:
                    //Enter your email
                    System.out.println("Enter your email:");
                    String givenEmail = scanner.next();


                    if (!isInputValid(givenEmail)) {
                        System.out.println("Invalid Email Address");
                        continue;
                    }

                    if (!isInputValid(givenEmail)) {
                        System.out.println("Invalid Email. Please try again...");
                        continue;
                    }


                    if (!isEmailDomainValid(givenEmail)) {
                        System.out.println("Invalid Domain");
                        continue;
                    }

                    //Enter your password
                    System.out.println("Please enter your password:");
                    String givenPassword = scanner.next();

                    //Check if log in successful
                    if ((email.equals(givenEmail) && password.equals(givenPassword))) {
                        System.out.println("Successfully logged in with email");
                        break;

                    } else { //invalid checking
                        if (i != 1) {
                            System.out.println("Invalid credentials. Left " + (i - 1) + " chances to try");
                            i--;
                            continue;

                        } else {
                            System.out.println("Your account is locked - try tomorrow");

                            System.exit(0); //stop the execution of JVM
                        }

                    }


                case 2:
                    System.out.println("Choose account number please(from 100 to 1000)?");
                    int an = scanner.nextInt();


                    if (!isInputValid(an)) {
                        System.out.println("Invalid account number.try again");
                        continue;
                    } else if (i != 1) { //invalid checking

                        System.out.println("Please enter your password:");
                        givenPassword = scanner.next();

                        //Check if log in successful
                        if ((an == accountNumber) && password.equals(givenPassword)) {
                            System.out.println("Successfully logged in with account number");
                            break;

                        } else { //invalid checking
                            if (i != 1) {
                                System.out.println("Invalid credentials. Left " + (i - 1) + " chances to try");
                                i--;
                                continue;

                            } else {
                                System.out.println("Your account is locked - try tomorrow");

                                System.exit(0); //stop the execution of JVM
                            }


                            break;  //stop the switch case
                        }
                    }


                    break;  //stop the switch case

            }

            break;  //stop the for LOOP
        }

        return email;
    }

    private static boolean isInputValid(int an) {
        boolean checkAccountNo = an >= 100 && an < 1000;
        return checkAccountNo;

    }

    private static boolean isEmailDomainValid(String givenEmail) {
        //Check if domain is valid  //gmail and hotmail domain - > mike@gmail.com
        String domain = givenEmail.substring((givenEmail.indexOf('@')) + 1, givenEmail.indexOf('.'));
        boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");
        return checkDomain;
    }

    public static boolean isInputValid(String givenEmail) {

        //Check if the email address is valid: //if  @ available , and @ before .
        int firstSignOfIndex = givenEmail.indexOf('@');  // -1
        int secondSignOfIndex = givenEmail.indexOf('.');

        boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0;

        return !checkEmail && isEmailDomainValid(givenEmail);
    }
}

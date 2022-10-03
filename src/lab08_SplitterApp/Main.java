package lab08_SplitterApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Budget Planner!");


        //Ask how many ppl in the budget planner?
        System.out.println("How many people will split the budget?");

        //Users DB
        ArrayList<User> userList = prepareUserLists(scanner);


        //Expenses DB
        ArrayList<Expense> expenseList = new ArrayList<>();

        System.out.println("Added user count : " + userList.size());

        String[] optionList = prepareOptionList();


        while (true) {

            System.out.println("What would you like to do?");

            for (int i = 0; i < optionList.length; i++) {

                System.out.println(optionList[i] + ":" + (i + 1));

            }

            int request = scanner.nextInt();

            switch (request - 1) {
                case 0:

                    //ask expanse name,amount,user

                    Expense expense = new Expense();

                    System.out.println("Expense name: ");
                    expense.expenseName = scanner.next();

                    System.out.println("Expense Amount: ");
                    expense.amount = scanner.nextInt();


                    System.out.println("Which user made this expense? Just type user id: ");

                    //show all users: id:0 name: Ozzy
                    for (User user : userList) {
                        System.out.println("id: " + userList.indexOf(user) + "name:" + user.name);
                    }


                    int userId = scanner.nextInt();
                    if (userId > userList.size() - 1 || userId < 0) {
                        System.err.println("No such user");
                        break;
                    }

                    User user = userList.get(userId);

                    expense.user = user.name;


                    expenseList.add(expense);

                    break;
                case 1:

                    System.out.println("Please provide user ID");

                    //show all users: id:0 name: Ozzy
                    for (User user1 : userList) {
                        System.out.println("id: " + userList.indexOf(user1) + "name:" + user1.name);
                    }
                    userId = scanner.nextInt();

                    if (userId > userList.size() - 1 || userId < 0) {
                        System.err.println("No such user");
                        break;
                    }
                    double sum = 0;
                    int expenceCount = 0;
                    for (Expense expense1 : expenseList) {
                        if (expense1.user.equals(userList.get(userId).name)) {
                            expenceCount++;
                            System.out.println(expenceCount + ") " + expense1.expenseName + ", expense amount:" + expense1.amount +
                                    ", expense by:" + expense1.user);
                            sum += expense1.amount;

                        }

                    }
                    System.out.println((userList.get(userId).name) + " spent $" + sum);
                    System.out.println("=================================== \n");

                    break;


                case 2:

                    for (int i = 0; i < expenseList.size(); i++) {
                        System.out.println(i + " - " + expenseList.get(i).expenseName + ", expense amount:" + expenseList.get(i).amount + ", expense by:" + expenseList.get(i).user);
                    }
                    break;   //break till 12:30
                case 3:
                    double totalAmmount = 0;
                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);


                    makeSplit(totalAmmount, splitList);

                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);

            }

        }


    }

    public static void makeSplit(double totalAmmount, ArrayList<Split> splitList) {

        double ammount = totalAmmount / splitList.size();

        for (Split split : splitList) {
            if (split.ammount > ammount) {
                System.out.println(split.userName + " needs to take bask  " + (split.ammount - ammount));
            } else {

                System.out.println(split.userName + " needs to pay " + (ammount - split.ammount));

            }


        }


    }

    public static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

        ArrayList<Split> splitList = new ArrayList<>();

        for (Expense each : expenseList) {

            Split split = existSplitList(each.user, splitList);
            if (split != null) {
                split.ammount += each.amount;
            } else {
                Split willBeAdded = new Split();
                willBeAdded.userName = each.user;
                willBeAdded.ammount = each.amount;
                splitList.add(willBeAdded);


            }
            splitList.add(split);
        }
        return splitList;

    }

    public static Split existSplitList(String userName, ArrayList<Split> splitList) {
        for (Split split : splitList) {
            if (split.userName.equals(userName)) {
                return split;
            }
        }
        return null;
    }


    public static ArrayList<User> prepareUserLists(Scanner scanner) {

        ArrayList<User> userList = new ArrayList<>();

        int userCount = scanner.nextInt();

        for (int i = 0; i < userCount; i++) {

            User user = new User();

            System.out.println("Name: ");
            user.name = scanner.next();

            System.out.println("Email: ");
            user.email = scanner.next();

            userList.add(user);

        }

        return userList;

    }

    public static String[] prepareOptionList() {



                /*
        Creating options
        1 : Make Expense
        2 : List Specific Person Expense
        3 : List All Expenses
        4 : Make Split
        5 : List All Users
        6 : Close the budget
        */

        String[] optionList = {"Make Expense", "List Specific Person Expense", "List All Expenses", "Make Split", "List All Users", "Close the budget"};

        return optionList;

    }


}
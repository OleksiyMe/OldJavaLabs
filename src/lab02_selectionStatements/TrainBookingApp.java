package lab02_selectionStatements;

import java.util.Scanner;

public class TrainBookingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you have a bag (true or false)");
        boolean hasBag = scanner.nextBoolean();

        System.out.println("Direct transport only? (Yes:true, No:false)");
        boolean nonStop = scanner.nextBoolean();

        System.out.println("Chose your travel type (Train:1, Bus:2, Flight:3)"); //corrected semicolon
        int transportType = scanner.nextInt();

        System.out.println("From:");
        String from = scanner.next();

        System.out.println("To:");
        String destination = scanner.next();

        String train1 = "TR001";
        String train2 = "TR002";
        String train3 = "TR003";
        String train4 = "TR004";
        String bus1 = "BUS001";
        String bus2 = "BUS002";
        String bus3 = "BUS003";
        String flight1 = "FL001";
        String flight2 = "FL002";
        String flight3 = "FL003";

        if (!(from.equalsIgnoreCase("Berlin") && destination.equalsIgnoreCase("Amsterdam"))) {
            System.out.println("For now we can only serve your Berlin-Amsterdam transportation. Please change your destination");
            return;  //stop JVM
        }

        switch (transportType) {
            case 1:
                if (nonStop && hasBag) {
                    System.out.println("Yoy can take " + train3);
                    return; //stop code
                } else if (!nonStop && hasBag) {
                    System.out.println("Yoy can take " + train4);
                } else if (nonStop && !hasBag) {
                    System.out.println("Yoy can take " + train1);
                } else System.out.println("You can take " + train1 + train2 + train3 + train4);
                break;
            case 2:
                System.out.println("You can take " + bus1+bus2+bus3);

                break;

            case 3://flight
                if (nonStop&&hasBag){

                    System.out.println("Could not find a flight for you");
                    return;
                } else if (!nonStop && hasBag) {
                    System.out.println("You can take "+flight1);
                    return;
                } else if (nonStop&&!hasBag) {
                    System.out.println("take "+flight2);
                    return;
                }else {
                    System.out.println("You can take"+ flight1 +flight2 +flight3);
                    return;
                }

                //break;
            default:
                System.out.println("No transport for you. Invalid type");
        }


    }
}


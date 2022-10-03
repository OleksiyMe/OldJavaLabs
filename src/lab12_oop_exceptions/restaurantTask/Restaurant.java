package lab12_oop_exceptions.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {


    private String ownerName;
    private String location;
    private double numberOfStars;

    private final ArrayList<Server> servers;
    private final ArrayList<Chef> chefs;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(double numberOfStars) {
        if (numberOfStars <= 0 ||numberOfStars>5) {
            throw new IllegalArgumentException("Number of stars must be 1-5: " + numberOfStars);
        }
        this.numberOfStars = numberOfStars;
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    public Restaurant(String ownerName, String location, double numberOfStars) {
        setOwnerName(ownerName);
        setLocation(location);
        setNumberOfStars(numberOfStars);
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    public void hireServer(Server server) {
        if (server == null) {
            throw new NullPointerException("Server object can not be null");
        }
        servers.add(server);

    }

    public void hireServer(Server[] serverarray) {

        for (Server each : serverarray) {
            if (each == null) {
                throw new NullPointerException("Server object can not be null");
            }
        }

        this.servers.addAll(Arrays.asList(serverarray));

    }

    public void hireChef(Chef chef) {
        if (chef == null) {
            throw new NullPointerException("Chef object can not be null");
        }
        chefs.add(chef);
    }

    public void hireChef(Chef[] arraychef) {
        for (Chef each : arraychef) {
            if (each == null) {
                throw new NullPointerException("Chef object can not be null");
            }
        }
        chefs.addAll(Arrays.asList(arraychef));
    }

    public void terminateChef(String employeeID) {
        chefs.removeIf(p -> p.getId().equalsIgnoreCase(employeeID));
    }

    public void terminateServer(String employeeID) {
        servers.removeIf(p -> p.getId().equalsIgnoreCase(employeeID));
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "ownerName='" + ownerName + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + servers.size() +
                ", number of chefs=" + chefs.size() +
                '}';
    }

}
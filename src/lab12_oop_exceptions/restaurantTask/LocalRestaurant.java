package lab12_oop_exceptions.restaurantTask;

public class LocalRestaurant {

    public static void main(String[] args) {


        Employee employee1 = new Server("Emilie", 35, 'F', "A01", 55_000);

        System.out.println(employee1);

        employee1.work();
        ((Server) employee1).takeOrder();
        ((Server) employee1).cleanTable();

        Employee employee2 = new Chef("Daniel", 42, 'M', "B01", "Chef", 85_000);

        System.out.println("employee2 = " + employee2);
        employee2.work();
        ((Chef) employee2).makeOrder();
        //  ( (Chef)employee2).washDishes();
      /*  try {
            ((Server) employee2).takeOrder();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }*/
        //  Restaurant restaurant=new Chef("Daniel", 42, 'M', "B01", "Chef", 85_000);

        Restaurant restaurant = new Restaurant("Josh", "7925 Green Str", 4.5);
        System.out.println(restaurant);

        restaurant.hireServer((Server) employee1);
        restaurant.hireChef((Chef) employee2);


        System.out.println(restaurant);

        Chef newChef=((Server)employee1).promoteToChef();

Server server=new Server("Olha", 25, 'F', "A02", 55_000);

restaurant.hireServer(server);
restaurant.hireChef(newChef);


        System.out.println(restaurant);
    /*    restaurant.terminateChef("B01");
        System.out.println(restaurant);
*/

        for (Chef each : restaurant.getChefs()) {
            System.out.println(each);

        }
        System.out.println();
        for (Server each : restaurant.getServers()) {
            System.out.println(each);

        }

   /*    Server s=null;
        Chef ch=null;

     //   restaurant.hireServer(s);
        restaurant.hireChef(ch);*/




    }


}

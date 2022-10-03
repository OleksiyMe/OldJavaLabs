package lab13_collection_map;

import lab12_oop_exceptions.restaurantTask.Employee;
import lab12_oop_exceptions.restaurantTask.Chef;
import lab12_oop_exceptions.restaurantTask.Server;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] nums = new int[3];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        System.out.println(Arrays.toString(nums));
        nums = new int[5];
        System.out.println(Arrays.toString(nums));
        System.out.println("==================================");

        int[] scores1 = {10, 20, 30, 40, 50};
        // int[] scores2 = new int[]{10, 20, 30, 40, 50};

        int[][] arr2D = {}; //for 1D array
        int[][][] add3D = {};  //for 2D array

        System.out.println("===========================================");
        Employee[] employees = {new Chef("Emilie", 36, 'F', "A34", "Master Chef", 80_000),
                new Server("Bob", 32, 'M', "A32", 75_000)
        };

        System.out.println(Arrays.toString(employees));

       /* ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.poll();

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.poll();
        Vector<Integer>vector=new Vector<>(); */


    }


}

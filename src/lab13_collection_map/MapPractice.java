package lab13_collection_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Object> car1 = new LinkedHashMap<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("body", "SUV");
        car1.put("year", 2022);  //autoboxing
        car1.put("auto", true);  //autoboxing
        car1.put("price", 45000);  //autoboxing


        System.out.println(car1);
        System.out.println(car1.size());
        System.out.println(car1.get("price"));
        car1.replace("price", 65_000);
        System.out.println("price after replace() " + car1.get("price"));
        car1.put("price", 55000);
        System.out.println("price after put() with key \"price\" and different value " + car1.get("price"));

        System.out.println("===========================================================");
        System.out.println("printing all the values");
        for (Object eachValue : car1.values()) {
            System.out.println(eachValue);
        }
        System.out.println("printing all the keys");
        for (String eachKey : car1.keySet()) {
            System.out.println(eachKey);
        }
        System.out.println("printing all the Entries");
        for (Map.Entry<String, Object> eachEntry : car1.entrySet()) {
            System.out.println(eachEntry.getKey() + ": " + eachEntry.getValue());
            if (eachEntry.getKey().equals("year")) eachEntry.setValue(2019);
            if (eachEntry.getKey().equals("price")) eachEntry.setValue(50_000);

        }
        System.out.println(car1);
        System.out.println("---------------------------------------------------------");


        Map<String, Object> car2 = new LinkedHashMap<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new LinkedHashMap<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        System.out.println("-----------------------------------");
        Map<Integer, Map<String, Object>> cars = new LinkedHashMap<>();
        cars.put(1, car1);
        cars.put(2, car2);
        cars.put(3, car3);

        System.out.println(cars);

        cars.get(2).replace("year", 2018);
        cars.get(2).replace("price", 40_000);
        System.out.println(cars);

        cars.forEach((k, v) -> {

            for (Map.Entry<String, Object> eachEntry : v.entrySet()) {
                if (eachEntry.getKey().contains("price")) {
                    eachEntry.setValue( ((Integer)eachEntry.getValue() * 1.1) );

                }
            }
        });


            System.out.println(cars);
            car1.put("brand", "BMW");
            car1.put("model", "X5");
            car1.put("body", "SUV");
            car1.put("year", 2022);  //autoboxing
            car1.put("auto", true);  //autoboxing
            car1.put("price", 45000);  //autoboxing
            car2.put("brand", "Audi");
            car2.put("model", "Q7");
            car2.put("color", "Gray");
            car2.put("year", 2022);
            car2.put("price", 50000);
            car2.put("electric", false);
            car3.put("brand", "Tesla");
            car3.put("model", "Model Y");
            car3.put("color", "White");
            car3.put("year", 2020);
            car3.put("price", 60000);
            car3.put("electric", true);
            System.out.println(cars);

            for (Map<String, Object> eachMap : cars.values()) {

                eachMap.replace("price", (Integer) (eachMap.get("price")) * 1.1);

            }

            System.out.println(cars);



    }
}

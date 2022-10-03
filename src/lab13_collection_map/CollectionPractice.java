package lab13_collection_map;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(200);

        System.out.println(list);
        System.out.println("==========================================");

        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("Breanna");
        names.add("Bella");
        names.add("Daniel");
        names.add("James");
        names.add("James");
        names.add("James");

        System.out.println(names);
        for (String each : names) {
            System.out.println(each);
        }

        Set<String> employees = new HashSet<>();
        employees.add("James");
        employees.add("Breanna");
        employees.add("Bella");
        employees.add("Daniel");
        employees.add("James");
        employees.add("James");
        employees.add("James");
  System.out.println(employees);
        for (String each : employees) {
            System.out.println(each);
        }
        System.out.println("===============================================");

        System.out.println(new ArrayList<>(employees).get(0));

        System.out.println("test forEach()");
        employees.forEach(p->{
            System.out.println(p);

        });

        System.out.println("=================================");
        List<String> words =new ArrayList<>(Arrays.asList(
                "java", "c#", "python", "c++", "ruby"

                ) );
        System.out.println(words);
        words.removeIf(p->p.contains("c"));
        System.out.println(words);

        words=Arrays.asList(
                "java", "c#", "python", "c++", "ruby"

        ) ;
        List<String> wordsResult =new ArrayList<>();
        System.out.println("======");
        words.forEach(c->{
         if ( !(c.contains("c")) )    wordsResult.add(c);
// c.replace("c","***");
            System.out.println(c);
        });
        System.out.println("======");
        System.out.println(words);
        System.out.println(wordsResult);




    }
}

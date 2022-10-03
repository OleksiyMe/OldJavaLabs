package lab05_String;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java Java Python C# Ruby";
        String temp =sentence;


        int countJava=0;

        while (temp.contains("Java")){
            System.out.println("temp = " + temp);
            countJava++;
            temp=temp.replaceFirst("Java","");

        }

        System.out.println("countJava = " + countJava);
        System.out.println("temp = " + temp);




    }
}

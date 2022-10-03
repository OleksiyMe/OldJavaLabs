package lab05_String;

public class FrequencyOfWord {
    public static void main(String[] args) {

        /*String sentence="Java Java Java Java Python C# Ruby";

        String temp =sentence;// "Java Java Java Java Python C# Ruby"

        int original_length=sentence.length();


        temp=temp.replace("Java", "aaa");
        int new_length=temp.length();

        System.out.println("original_length = " + original_length);
        System.out.println("new_length = " + new_length);

        int totalNumberOfJava=original_length-new_length;

        System.out.println("totalNumberOfJava = " + totalNumberOfJava);*/

        String sentence = "Java Java Java Java Python C# Ruby";
        String temp = sentence;// "Java Java Java Java Python C# Ruby"

        int totalNumberOfJava = sentence.length() - temp.length();
        System.out.println("totalNumberOfJava = " + totalNumberOfJava);





    }

}

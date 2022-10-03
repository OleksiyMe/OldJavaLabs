package lab05_String;

public class FrequencyOfWord3 {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java Java PytJavahon C# Ruby";

        int countJava = 0;
        String temp = "";

        for (int i = 0; i < sentence.length() - 3; i++) {

            temp = sentence.substring(i, i + 4);
            if (temp.equals("Java")) {
                System.out.println("temp = " + temp);
                countJava++;
            }


        }
        System.out.println("countJava = " + countJava);


    }
}

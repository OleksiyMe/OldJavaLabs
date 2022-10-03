package lab08_SplitterApp;
import java.util.Scanner;
public class Laziz_task {
    public static void main(String[] args) {


        // DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        // WRITE YOUR CODE BELOW

        sentence = sentence.toLowerCase();
        int javaCount=sentence.replace("java", "java1").length()-sentence.length();
        int pythonCount=sentence.replace("python","python1").length()-sentence.length();


        if (javaCount == pythonCount&&javaCount!=0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}


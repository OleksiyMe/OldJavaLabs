package lab05_String;

public class PrintEach {
    public static void main(String[] args) {

        String word = "Wooden Spoon";


        System.out.print(word.charAt(0));
        System.out.print(word.charAt(1));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(3));
        System.out.print(word.charAt(4));
        System.out.print(word.charAt(5));
        System.out.print(word.charAt(6));
        System.out.print(word.charAt(7));
        System.out.print(word.charAt(8));
        System.out.print(word.charAt(9));
        System.out.print(word.charAt(10));
        System.out.println(word.charAt(11));


        for (int i = 0; i < word.length(); i++) {
            char each=word.charAt(i);
            System.out.print(each);
        }




    }
}

package lab01;

public class SwapNumbers {
    public static void main(String[] args) {

        int n1 =10;
        int n2 =20;

        int n3 =n1;

        n1=n2;
        n2=n3;


        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);;

        System.out.println("======================");

        n2=n1+n2;
        n1=n2-n1;
        n2=n2-n1
        ;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);;



    }

}

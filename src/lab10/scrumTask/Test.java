package lab10.scrumTask;

public class Test {
    public static void main(String[] args) {

        Tester tester1 =
                new Tester("Helen", 24, 'F', "A23", "QA", 40);

        System.out.println(tester1);
        tester1.testing();

        Developer developer1 =
                new Developer("Lorriane", 26, 'F', "C23", "QA",60,"Java"  );

        System.out.println(developer1);
        developer1.coding();
        developer1.fixingBugs();



    }
}

package lab10.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester[] testers ={new Tester("Olha",23,'F',"A1","QA", 45),
                new Tester("Emilt",25,'F',"A2","QA", 45),
                new Tester("Bella",28,'F',"A3","QA", 45),

        };

        Developer[] developers =
        {new Developer("Olha",23,'F',"b1","FrontEndDev", 55, "Java"),
                new Developer("Gena",45,'F',"b2","BackEndDev", 55, "Java"),
                new Developer("Lena",34,'F',"b3","Full-StackDev", 55, "Java"),
                new Developer("Alex",34,'M',"b4","SoftwareDev", 55, "Java"),
        };

ScrumTeam scrumTeam=new ScrumTeam("Bilal","Hasan","Lucy",14);

scrumTeam.addTester(testers);
scrumTeam.addDeveloper(developers);

        System.out.println(scrumTeam);


        System.out.println("=========================");
        System.out.println("Testers:");

        for (Tester eachTester : scrumTeam.getTesters()) {
            System.out.println("\t"+eachTester.getName() +" salary $"+eachTester.getSalary());
        }
        System.out.println("Developers:");
        for (Developer eachDeveloper : scrumTeam.getDevelopers()) {
            System.out.println("\t"+eachDeveloper.getName() +" salary $"+eachDeveloper.getSalary());
        }




    }
}

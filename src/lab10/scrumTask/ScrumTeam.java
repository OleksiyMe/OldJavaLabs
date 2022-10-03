package lab10.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

  private String  PO, BA, SM;

  private ArrayList<Tester> testers=new ArrayList<>();
  private ArrayList<Developer> developers=new ArrayList<>();

  public ArrayList<Tester> getTesters() {
    return testers;
  }

  public ArrayList<Developer> getDevelopers() {
    return developers;
  }


  private int daysOfSprint;

  public String getPO() {
    return PO;
  }

  public void setPO(String PO) {
    termiate(PO,"Invalid PO name"+PO);

    this.PO = PO;
  }

  public String getBA() {
    return BA;
  }

  public void setBA(String BA) {
    termiate(BA,"Invalid BA name "+BA);
    this.BA = BA;
  }

  public String getSM() {
    return SM;
  }

  public void setSM(String SM) {
    termiate(SM,"Invalid SM name "+SM);
    this.SM = SM;
  }

  public int getDaysOfSprint() {
    return daysOfSprint;
  }

  public void setDaysOfSprint(int daysOfSprint) {
    if (daysOfSprint<0) {
      System.err.println("Invalid days of sprint "+daysOfSprint);
      System.exit(1);
    }
    this.daysOfSprint = daysOfSprint;
  }

  private static void termiate(String arg, String err){
    if (arg==null||arg.trim().isEmpty()) {
      System.err.println(err);
      System.exit(1);
    }

  }

  public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
    setPO(PO);
    setBA(BA);
    setSM(SM);
    setDaysOfSprint(daysOfSprint);
  }

  public void addTester(Tester tester){
    testers.add(tester);
  }

  public void addTester(Tester [] tester){
    this.testers.addAll( Arrays.asList(tester) );
  }

  public void addDeveloper(Developer developer){
    developers.add(developer);
  }

  public void addDeveloper(Developer [] developers){
    this.developers.addAll( Arrays.asList(developers) );
  }

  public void removeTester(String id){
    testers.removeIf(p->p.getId().equals(id));

  }
  public void removeDeveloper(String id){
    developers.removeIf(p->p.getId().equals(id));

  }

  public String toString() {
    return "ScrumTeam{" +
            "PO='" + PO + '\'' +
            ", BA='" + BA + '\'' +
            ", SM='" + SM + '\'' +
            ", testers=" + testers.size() +
            ", developers=" + developers.size()+
            '}';
  }

}

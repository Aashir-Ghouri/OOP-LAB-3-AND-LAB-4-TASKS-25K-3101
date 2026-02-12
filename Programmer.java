public class Programmer {
    String id;
    String name;
    String langpref;
    int problems;

    Programmer(String Pid, String Pname, String Plangpref, int Pproblems){
        this.id = Pid;
        this.name = Pname;
        this.langpref = Plangpref;
        this.problems = Pproblems;
    }

    public void DisplayInformation(){
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Preffered Language : " + this.langpref);
        System.out.println("Number of Problems : " + this.problems);
    }

    public void SetProblems(int NewProblems){
        this.problems = NewProblems;
        System.out.println("Problems updated successfully!");
    }


    public static void main(String[] args){
        Programmer p1 = new Programmer("AB-123", "Aashir Ghouri", "Java", 100);
        Programmer p2 = new Programmer("Cd-456", "Ali Butt", "C++", 75);

        p1.DisplayInformation();
        p2.DisplayInformation();

        p2.SetProblems(90);

        p2.DisplayInformation();
    }
}

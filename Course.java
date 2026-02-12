public class Course {
    String code;
    String name;
    int crhours;

    Course(String Pcode, String Pname, int Pcrhours){
        this.code = Pcode;
        this.name = Pname;
        this.crhours = Pcrhours;
    }

    public void DisplayCourse(){
        System.out.println("Code : " + this.code);
        System.out.println("Name : " + this.name);
        System.out.println("Credit hours : " + this.crhours);
    }

    public static void main(String[] args){
        Course c1 = new Course("ABC123", "OOP", 3);
        Course c2 = new Course("DEF456", "Calculus", 3);

        c1.DisplayCourse();
        c2.DisplayCourse();
    }
}

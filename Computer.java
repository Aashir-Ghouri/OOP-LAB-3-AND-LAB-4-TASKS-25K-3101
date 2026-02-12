public class Computer {
    String id;
    String cpu;
    String ram;
    String os;

    Computer(String Pid, String Pcpu, String Pram, String Pos){
        this.id = Pid;
        this.cpu = Pcpu;
        this.ram = Pram;
        this.os = Pos;
    }

    public void DisplayInformation(){
        System.out.println("ID : " + this.id);
        System.out.println("CPU : " + this.cpu);
        System.out.println("Ram : " + this.ram);
        System.out.println("OS : " + this.os);
    }

    public static void main(String[] args){
        Computer pc1 = new Computer("A1", "i5", "8 GB", "Windows 10");
        Computer pc2 = new Computer("B2", "i7", "16 GB", "Linux");

        pc1.DisplayInformation();
        pc2.DisplayInformation();
    }
}

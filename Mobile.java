public class Mobile {
    String brand;
    String model;
    double price;

    Mobile(){
        this.brand = "null";
        this.model = "null";
        this.price = 0.0;
    }

    Mobile(String Pbrand, String Pmodel, double Pprice){
        this.brand = Pbrand;
        this.model = Pmodel;
        this.price = Pprice;
    }

    public void DisplayInformation(){
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
        System.out.println("Price : " + this.price);
    }

    public static void main(String[] args){
        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile("Samsung","A32",50000.0);

        mobile1.DisplayInformation();
        mobile2.DisplayInformation();



    }
}

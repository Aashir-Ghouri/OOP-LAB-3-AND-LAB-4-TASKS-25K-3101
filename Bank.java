public class Bank {

    int accNum;
    String accHolder;
    double accBal;
    
    Bank(int PaccNum, String PaccHolder){
        accNum = PaccNum;
        accHolder = PaccHolder;
    }

    Bank(int PaccNum, String PaccHolder, double PaccBal){
        accNum = PaccNum;
        accHolder = PaccHolder;
        accBal = PaccBal;
    }

    public void display(){
        System.out.println("Account id : "+this.accNum);
        System.out.println("Account name : "+this.accHolder);
        System.out.println("Account balance : "+this.accBal);
    }

    public static void main(String[] args){
        Bank acc1 = new Bank(230,"Aashir Ghouri", 1000.0);
        Bank acc2 = new Bank(130,"Hammad");

        acc1.display();
        acc2.display();

    }
}



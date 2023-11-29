
package Lab3;
import java.util.Scanner;
public class Account {
    Scanner input= new Scanner(System.in);
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void debit(double withdraw){
       if(withdraw>balance) {
           System.out.println("Debit amount Exceeded withdraw amount");
           return;
       }
        else {
           setBalance(balance - withdraw);
       }
    }
    public void Display(){
        System.out.println("How much money is added to your Account?");
        balance=input.nextInt();
        System.out.println("Balance is: "+getBalance());
        System.out.println("How much Money you want to Withdraw?");
         debit(input.nextDouble());
        System.out.println("the Remained amount is"+getBalance());
    }
}

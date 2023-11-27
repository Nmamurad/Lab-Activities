import java.util.Scanner;
public class Lab1 {
    Scanner input= new Scanner(System.in);

     private  String name;
      private Boolean value;
      private int number;



    public Lab1(int number) {
        this.number = number;
    }
    public Lab1 (String Name, int Number){
        this.name=Name;
        this.number=Number;

    }
public Lab1(String Name, int Number, Boolean Value){
    this.name=Name;
    this.number=Number;
    this.value=Value;
}
    public int getNumber() {
        return number;
    }

    public Boolean getValue() {
        return value;
    }

    public String getName() {
        return name;
    }



public void Display(){
        System.out.println("The Informations are:");
        System.out.println(" Number:"+getNumber()+"\n"+
                            "Name: "+getName()+"\n"+
                             "Value:"+getValue());




}
}
        ;



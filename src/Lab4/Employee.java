package Lab4;
 import java.util.Scanner;

public class Employee {
     Scanner input = new Scanner(System.in);
    private String name;
    private int age;

    public int getAge() {

        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }
    public void Display(){

        System.out.println("Employee Name:");
        String x=input.next();
        setName(x);
        System.out.println("Employye age:");
        int y= input.nextInt();
        setAge(y);

    }
}

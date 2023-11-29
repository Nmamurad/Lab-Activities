package Lab4;
import java.util.Scanner;
public class EmployeeTest {
    static Scanner input1 = new Scanner(System.in);
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        parttime obj2 = new parttime();
        fulltime obj3 = new fulltime();
        System.out.println("1.Part Time 2. Full Time ");
        System.out.println("Employee type:");
        int empt= input1.nextInt();
        obj1.Display();
        switch (empt) {
            case 1:
               if(empt==1){

                   obj2.parttime();
               }

               break;
            case 2:
                if(empt==2)
                    obj3.fulltime();
                break;
        }
    }
}

package Lab4;

import java.sql.SQLOutput;

public class parttime extends Employee {
    private double SalaryRate;

    public double getSalaryRate() {

        return SalaryRate;
    }
int workingh;
    public void setSalaryRate() {
        this.SalaryRate=workingh*8;
    }
    public void parttime()
    {
        System.out.println("Working Hours");
        workingh=input.nextInt();
        setSalaryRate();
        System.out.println("Part time Employee Information");
        System.out.println("Name         Age           Salary\n" +
                          "------       -----         ---------\n" +
                          super.getName()+"         "+super.getAge()+"           "+getSalaryRate());
    }

}

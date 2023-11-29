package Lab4;

public class fulltime extends Employee {
    private double Yearlysalary;

    public double getYearlysalary() {

        return Yearlysalary;
    }
    int msalary;
    public void setYearlysalary( ) {

        Yearlysalary=msalary*12;
    }
    public void fulltime(){
        System.out.println("MOnthly salary:");
        msalary=input.nextInt();
        setYearlysalary();
        System.out.println("Full time Employee Information");
        System.out.println("Name         Age           Salary\n" +
                "------       -----         ---------\n" +
                super.getName()+"         "+super.getAge()+"           "+getYearlysalary());
    }
}

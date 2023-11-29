package Lab1;

public class CarWatch {
    int hour;
    int min;
    int sec;

    public CarWatch (int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMin() {
        return this.min;
    }

    public int getSec() {
        return this.sec;
    }

    public void Display1() {
        System.out.println("The time on the Car watch is    >>>   " + getHour() + ":" + getMin() + ":" + getSec() + ":");
    }
}

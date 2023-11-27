public class AppleWatch  {
    int hour;
    int min;
    int sec;

    public AppleWatch (int hour, int min, int sec) {
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

    public void Display2() {
        System.out.println("The time on the Apple watch is   >>>   " + getHour() + ":" + getMin() + ":" + getSec() + ":");
    }
}


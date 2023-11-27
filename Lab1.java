import java.util.Scanner;
public class Lab1 {

                int hour;
                int min;
                int sec;

                public Lab1 (int hour, int min, int sec) {
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

                public void Display() {
                        System.out.println("The time on the watch is    >>>   " + getHour() + ":" + getMin() + ":" + getSec() + ":");
                }
        }





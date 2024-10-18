package _02_enums._01_base;

import _02_enums._01_base.DayOfWeek;
import _02_enums._01_base.DayOfWeekBloch;
import _02_enums._01_base.DayOfWeekClass;

public class Main {
    public static void main(String[] args) {
        var monday = new DayOfWeekClass("Monday");
        System.out.println(monday);

        var sunday = DayOfWeekBloch.SUNDAY;

        var friday = DayOfWeek.FRIDAY;
    }
}

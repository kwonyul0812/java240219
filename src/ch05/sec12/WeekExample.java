package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1 -> today = Week.MONDAY;
            case 2 -> today = Week.TUESDAY;
            case 3 -> today = Week.WEDNESDAY;
            case 4 -> today = Week.THURSDAY;
            case 5 -> today = Week.FRIDAY;
            case 6 -> today = Week.SATURDAY;
            case 7 -> today = Week.SUNDAY;
        }

        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("열심히 자바를 공부합니다.");
        }
    }
}

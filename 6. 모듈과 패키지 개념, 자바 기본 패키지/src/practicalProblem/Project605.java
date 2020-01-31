package practicalProblem;

import java.util.Calendar;

public class Project605 {

    public static void main(String[] args) {

        int hour;
        int minute;

        Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);

        System.out.println("현재시간은 " + hour + "시" + minute + "분 입니다");

        if (4 < hour && hour < 12) {
            System.out.println("Good Morning");
        } else if (12 <= hour && hour < 18) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Night");
        }
    }
}

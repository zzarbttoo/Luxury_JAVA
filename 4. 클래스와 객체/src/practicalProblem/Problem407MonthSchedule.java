package practicalProblem;

import java.util.Scanner;

public class Problem407MonthSchedule {
    int day;
    int date;

    Problem407Day[] days;


    public Problem407MonthSchedule(int day) {
        this.day = day;
        days = new Problem407Day[day];

        for (int i = 0; i < day; i++) {
            days[i] = new Problem407Day();

        }
    }

    public static void main(String[] args) {
        Problem407MonthSchedule april = new Problem407MonthSchedule(30);
        april.run();
    }


    void run() {

        for (int i = 0; i < this.day; i++) {
            this.days[i] = new Problem407Day();
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("이번달 스케쥴 관리 프로그램");

        while (true) {
            System.out.print("할일:1, 보기:2, 끝내기:3 >>");
            int choose = scan.nextInt();
            if (choose == 3) {
                finish();
                break;
            }
            System.out.print("날짜(1~" + this.day + ")?");
            date = scan.nextInt();

            if (choose == 1) {
                input(days[date], scan);
            } else {
                view(days);
            }

        }
        scan.close();

    }

    void input(Problem407Day day, Scanner scan) {
        System.out.print("할일(빈칸없이입력)?");
        String string = scan.next();
        day.set(string);
    }

    void view(Problem407Day day[]) {
        day[date].show();
    }

    void finish() {
        System.out.println("프로그램을 종료합니다");
    }


}

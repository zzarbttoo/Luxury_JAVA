package practicalProblem;

import java.util.Scanner;

public class Project609 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int man, cpu;
        String manState = null, cpuState = null, state = null;

        while (true) {

            System.out.print("[가위(1), 바위(2), 보(3), 끝내기(4)] >>");
            man = scan.nextInt();
            cpu = (int) ((Math.random()) * 3 + 1);

            if (man == 4) {
                break;
            }

            switch (man) {
                case 1:
                    manState = "가위";
                    if (cpu == 1) {
                        cpuState = "가위";
                        state = "비겼습니다";
                    } else if (cpu == 2) {
                        cpuState = "바위";
                        state = "컴퓨터가 이겼습니다";
                    } else {
                        cpuState = "보";
                        state = "철수가 이겼습니다";
                    }
                    break;
                case 2:
                    manState = "바위";
                    if (cpu == 1) {
                        cpuState = "가위";
                        state = "철수가 이겼습니다";
                    } else if (cpu == 2) {
                        cpuState = "바위";
                        state = "비겼습니다";
                    } else {
                        cpuState = "보";
                        state = "컴퓨터가 이겼습니다";
                    }
                    break;
                case 3:
                    manState = "보";
                    if (cpu == 1) {
                        cpuState = "가위";
                        state = "컴퓨터가 이겼습니다";
                    } else if (cpu == 2) {
                        cpuState = "바위";
                        state = "철수가 이겼습니다";
                    } else {
                        cpuState = "보";
                        state = "비겼습니다";
                    }
                    break;
            }
            System.out.println("철수(" + manState + ") : 컴퓨터(" + cpuState + ")");
            System.out.println(state);
        }

    }
}


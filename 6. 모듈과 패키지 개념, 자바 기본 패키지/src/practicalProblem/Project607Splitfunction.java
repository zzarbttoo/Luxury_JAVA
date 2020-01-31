package practicalProblem;

import java.util.Scanner;

public class Project607Splitfunction {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            //scan.next를 쓰면 공백을 포함하지 않는다
            String input = scan.nextLine();
            String[] words = input.split("\\s");

            if (input.equals("그만")) {
                System.out.println("종료합니다..");
                break;
            }
            System.out.println("어절 개수는 " + words.length);
        }

        scan.close();
    }


}

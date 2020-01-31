package practicalProblem;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Project07StringTokenizer {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            int length = 0;
            StringTokenizer stk = new StringTokenizer(input);

            if (input.equals("그만")) {
                scan.close();
                break;
            }

            while (stk.hasMoreTokens()) {
                length++;
                stk.nextToken();
            }
            System.out.println("어절의 개수는 " + length);
        }

    }
}

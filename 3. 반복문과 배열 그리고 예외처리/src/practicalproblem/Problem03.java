package practicalproblem;

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {

        int result;

        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요");

        result = scan.nextInt();
        while (result > 0) {
            for (int i = 0; i < result; i++) {
                System.out.print("*");
            }
            result--;
            System.out.println();
        }

        scan.close();
    }
}


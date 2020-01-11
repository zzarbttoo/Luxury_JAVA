package practicalproblem;

import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        int ArrayInt[];
        ArrayInt = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("양의 정수 10개를 입력하시오");

        for (int i = 0; i < 10; i++) {
            ArrayInt[i] = scan.nextInt();
        }
        System.out.println("3의 배수는");
        for (int j = 0; j < 10; j++) {
            if (ArrayInt[j] % 3 == 0) {
                System.out.print(ArrayInt[j] + " ");
            }
        }
    }
}

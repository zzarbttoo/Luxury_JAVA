package practicalProblem;

import java.util.Scanner;

public class Project611 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String order;
        String put = scan.nextLine();
        StringBuffer input = new StringBuffer(put);

        while (true) {

            System.out.print("명령:");
            order = scan.nextLine();
            String[] orderArray = order.split("!");

            if (orderArray[0] == null) {
                System.out.println("잘못된 명령입니다!");
            } else if (input.indexOf(orderArray[0]) == -1) {
                System.out.println("찾을 수 없습니다!");
            } else {
                int i= input.indexOf(orderArray[0]);
                input.replace(input.indexOf(orderArray[0]), input.indexOf(orderArray[0]) + orderArray[0].length(), orderArray[1]);
                System.out.println(input);
            }
        }

    }
}

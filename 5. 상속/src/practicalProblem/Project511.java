package practicalProblem;

import java.util.Scanner;

public class Project511 extends Project511Calc {

    int a, b;

    public Project511(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {

        int a = 0, b = 0;
        String operator;

        Project511 exmpl = new Project511(a, b);

        Scanner scan = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>>");
        a = scan.nextInt();
        b = scan.nextInt();
        operator = scan.next();

        switch (operator) {
            case "+":
                exmpl.add(a, b);
                break;
            case "-":
                exmpl.sub(a, b);
                break;
            case "/":
                exmpl.div(a, b);
                break;
            case "*":
                exmpl.mul(a, b);
                break;

        }


    }

    @Override
    public void add(int a, int b) {

        System.out.println(a + b);
        return;
    }

    @Override
    public void sub(int a, int b) {

        System.out.println(a - b);
        return;

    }

    @Override
    public void mul(int a, int b) {

        System.out.println(a * b);
        return;
    }

    @Override
    public void div(int a, int b) {

        System.out.println(a / b);
        return;
    }
}

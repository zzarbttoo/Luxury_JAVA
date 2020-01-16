package practicalProblem;

import java.util.Scanner;

public class Problem411 {

    public static void main(String[] args) {

        int answer;

        Scanner scan = new Scanner(System.in);
        System.out.print("두 정수의 연산자를 입력하시오>>");
        int a = scan.nextInt();
        int b = scan.nextInt();
        String operater = scan.next();

        if (operater.equals("*")) {

            Mul mul = new Mul();
            mul.setvalue(a, b);
            answer = mul.calculate();

        } else if (operater.equals("/")) {

            Div div = new Div();
            div.setvalue(a, b);
            answer = div.calculate();

        } else if (operater.equals("+")) {

            Add add = new Add();
            add.setvalue(a, b);
            answer = add.calculate();

        } else {

            Sub sub = new Sub();
            sub.setvalue(a, b);
            answer = sub.calculate();
        }

        System.out.println(answer);
        scan.close();
    }

}

class Add {
    int a;
    int b;

    public void setvalue(int a, int b) {
        this.a = a;
        this.b = b;
        return;
    }

    int calculate() {
        return a + b;
    }

}

class Sub {
    int a;
    int b;

    void setvalue(int a, int b) {
        this.a = a;
        this.b = b;
        return;
    }

    int calculate() {
        return a - b;

    }
}

class Mul {
    int a;
    int b;

    void setvalue(int a, int b) {
        this.a = a;
        this.b = b;
        return;
    }

    int calculate() {
        return a * b;
    }
}

class Div {
    int a;
    int b;

    void setvalue(int a, int b) {
        this.a = a;
        this.b = b;
        return;
    }

    int calculate() {
        return a / b;
    }

}

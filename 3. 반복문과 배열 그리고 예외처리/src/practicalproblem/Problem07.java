package practicalproblem;

public class Problem07 {
    public static void main(String[] args) {
        int ArrayInt[] = new int[10];
        int sum = 0;
        System.out.print("랜덤한 정수들 :");
        for (int i = 0; i < 10; i++) {
            ArrayInt[i] = (int) (Math.random() * 10 + 1);
            System.out.print(" " + ArrayInt[i]);
            sum += ArrayInt[i];
        }
        System.out.println();
        System.out.print("평균은" + " " + sum / ArrayInt.length);
    }
}

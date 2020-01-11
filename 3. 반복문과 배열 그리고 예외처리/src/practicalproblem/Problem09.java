package practicalproblem;

public class Problem09 {
    public static void main(String[] args) {
        int ArrayInt[][] = new int[4][4];
        for (int i = 0; i < ArrayInt.length; i++) {
            for (int j = 0; j < ArrayInt[0].length; j++) {
                ArrayInt[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(" " + ArrayInt[i][j]);
            }
            System.out.println();
        }
    }
}

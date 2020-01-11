package practicalproblem;

public class Problem01WhileTest {
//    100미만 짝수의 합, 값=2450
    public static void main(String[] args){
        int sum=0, i=0;
        while(i<100){
            sum=sum+i;
            i += 2;
        }
        System.out.println(sum);
    }
}

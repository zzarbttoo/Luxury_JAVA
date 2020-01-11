package practicalproblem;

public class Problem01DoWhileTest {

    public static void main(String[] args){
        int i=0, sum=0;
        do{
            sum=sum+i;
            i+=2;
        }while(i<100);

        System.out.println(sum);
    }
}

package practicalproblem;

public class Problem13 {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if(i<10){
                if(i%3==0){
                    System.out.println( i + " 박수 " + "짝");
                }
            }
            else{
                if(Math.floor(i/10)%3==0 && (i%10)%3!=0){
                    System.out.println( i + " 박수 " + "짝");
                }
                else if(Math.floor(i/10)%3!=0 && (i%10)%3==0){
                    System.out.println( i + " 박수 " + "짝");
                }
                else if(i%10==0 && i%3==0){
                    System.out.println( i + " 박수 " + "짝");
                }
                else if(Math.floor(i/10)%3==0 && (i%10)%3==0){
                    System.out.println( i + " 박수 " + "짝짝");
                }
            }
        }

    }
}

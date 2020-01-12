package practicalproblem;

public class Problem11Average {
    public void main(String[] args){
        int sum=0;
        for(int i=0;i<args.length;i++){
            sum+= Integer.parseInt(args[i]);
        }
        System.out.println(sum/args.length);
    }
}

package practicalProblem;

import java.util.Scanner;

public class Problem405CircleManager{

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        Problem405Circle c[]= new Problem405Circle[3];

        for(int i=0;i<c.length;i++){
            System.out.print("x, y, radius>>");
            double x=scan.nextDouble();
            double y=scan.nextDouble();
            int radius=scan.nextInt();

            c[i]=new Problem405Circle(x,y,radius);
        }

        for(int i=0;i<c.length;i++){
            c[i].show();
        }

        scan.close();
    }

}
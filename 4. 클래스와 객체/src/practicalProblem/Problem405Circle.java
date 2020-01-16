package practicalProblem;

public class Problem405Circle{
    private double x, y;
    private int radius;
    public Problem405Circle(double x, double y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    
    }

    public void show(){
        System.out.println("(" + x + "," + y + ")" + radius);
    }


}



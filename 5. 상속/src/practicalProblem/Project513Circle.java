package practicalProblem;

public class Project513Circle implements Project513Shape {

    int radius;

    public static void main(String[] args) {
        Project513Shape donut = new Project513Circle(10);
        donut.redraw();
        System.out.println("면적은 " + donut.getArea());
    }

    public Project513Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println(" 반지름이" + radius + "인 원입니다");
    }

    @Override
    public double getArea() {

        return PI * Math.pow(radius, 2);
    }
}

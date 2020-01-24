package practicalProblem;

public class Project505ColorPoint extends Point {

    String color;

    public static void main(String[] args) {
        Project505ColorPoint cp = new Project505ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다");

    }

    public Project505ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String toString() {

        return color + "색의" + "( " + getX() + "," + getY() + " ) 의 점";
    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setXY(int x, int y) {
        move(x, y);
    }

    @Override
    protected void move(int x, int y, int z) {
        super.move(x, y);
    }


}

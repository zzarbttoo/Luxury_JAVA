package practicalProblem;

public class Project507Point3D extends Point {

    int z;

    public static void main(String[] args) {
        Project507Point3D p = new Project507Point3D(1, 2, 3);
        System.out.println(p.toString());

        p.moveUp();
        System.out.println(p.toString() + "입니다.");

        p.moveDown();
        p.move(10, 10);
        System.out.println(p.toString());

        p.move(100, 200, 300);
        System.out.println(p.toString());

    }

    public Project507Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    protected void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }

    public String toString(){

        return "(" + getX() + ", " + getY() + ", " + z +") 의 점";
    }

    private void moveUp() {
        z++;
    }

    private void moveDown() {
        z--;
    }


}

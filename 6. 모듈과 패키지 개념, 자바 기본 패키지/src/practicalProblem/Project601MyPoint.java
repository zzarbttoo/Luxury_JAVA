package practicalProblem;

public class Project601MyPoint {

    int x, y;

    public static void main(String[] args) {
        Project601MyPoint p = new Project601MyPoint(3, 60);
        Project601MyPoint q = new Project601MyPoint(4, 50);
        System.out.println(p);
        if (p.equals(q)) {
            System.out.println("같은 점");
        } else {
            System.out.println("다른 점");
        }
    }

    public Project601MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + "," + y + ")";
    }

}

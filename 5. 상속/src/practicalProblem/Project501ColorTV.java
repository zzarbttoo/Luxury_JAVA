package practicalProblem;

public class Project501ColorTV extends TV {

    int color;

    public Project501ColorTV(int size, int color) {
        super(size);
        this.color = color;

    }

    @Override
    protected int getSize() {
        return super.getSize();
    }

    public static void main(String[] args) {
        Project501ColorTV myTV = new Project501ColorTV(32, 1024);
        myTV.printProperty();
    }

    public void printProperty() {
        System.out.print( getSize() + "인치 " + color + "컬러");
    }
}

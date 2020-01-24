package practicalProblem;

public class Project503Won2Dallar extends Converter {

    double exchange;

    public Project503Won2Dallar(double exchange) {
        this.exchange = exchange;
    }

    public static void main(String args[]) {
        Project503Won2Dallar toDallar = new Project503Won2Dallar(1200);
        toDallar.run();
    }

    @Override
    protected double convert(double src) {

        super.ratio = 1 / exchange;
        return src * super.ratio;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }

    @Override
    public void run() {
        super.run();
    }
}

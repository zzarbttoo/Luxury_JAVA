package practicalProblem;

public class Problem401TV{

    String company;
    int year;
    int inch;

    public Problem401TV(String company, int year, int inch){

        this.company=company;
        this.year=year;
        this.inch=inch;
    }

    public void show(){

        System.out.println(company+ "에서 만든 " + year + "년형 " + inch + "인치 TV" );
        return;

    }


   
}
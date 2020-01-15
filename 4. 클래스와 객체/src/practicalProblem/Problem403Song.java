package practicalProblem;

public class Problem403Song{


    String title;
    String artist;
    String country;
    int year;

    public Problem403Song(){}

    public Problem403Song(String title, String artist, String country, int year){

        this.title=title;
        this.artist=artist;
        this.country=country;
        this.year=year;

    }
    
    public void show(){
        System.out.println(year+ "년 " + country + "국적의 " + artist + "가 부른 " + title);
    }

    public static void main(String[] args){
        Problem403Song song= new Problem403Song("Dancing Queen", "ABBA" , "스웨덴", 1978);
        song.show();

    }

}
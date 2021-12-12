package constructor;

public class Film {
    String title;
    int yearOfProduction;


    public Film(String myTitle, int myYearOfProduction){
    this.title = myTitle;
    this.yearOfProduction = myYearOfProduction;
        System.out.println(myTitle);
        System.out.println(myYearOfProduction);
    }

}

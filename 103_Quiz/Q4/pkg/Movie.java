package pkg;
public class Movie{
private String movieName;
private double rating;
private int numRating;
private int revenue;

public Movie(){
    movieName="Avengers";
    rating = 8.0;
    numRating = 33;
    revenue =623357910;
}
public Movie(String name, double rate, int numRate, int rev){
    movieName=name;
    rating = rate;
    numRating =numRate;
    revenue = rev;
}

//methods
public void movieToString(){
    System.out.println("Movie: "+movieName);
    System.out.println("Rating: "+rating);
    System.out.println("Number of Ratings: "+numRating);
    System.out.println("Revenue: "+revenue);
    System.out.println();
}
public String getMovieName(){
    return movieName;
}
public int getRevenue(){
    return revenue;
}
public void addRating(double x){
    rating = ((numRating*rating)+x)/(numRating+1);
    numRating++;
    return;
}
public double getRating(){
    return rating;
}
public boolean compareRatings(double ratingTwo){
double x = ratingTwo.getRating();
if(rating > x){
return true;
}  
return false;
}



}
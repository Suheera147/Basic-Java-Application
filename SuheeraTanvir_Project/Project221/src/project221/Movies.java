//Team 14 221 Project
package project221;

/**
 *
 * @author Suheera
 */
public class Movies implements TicketsInterface{
    private int movieId;
    private String movieName;
    private double moviePrice;
    private String releaseDate;
    private int movieDuration;
    private double rating;
    private String genre;
 
    public Movies(int movieId, String movieName, double moviePrice, String releaseDate, int movieDuration, double rating, String genre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.moviePrice = moviePrice;
        this.releaseDate = releaseDate;
        this.movieDuration = movieDuration;
        this.rating = rating;
        this.genre = genre;
    }
    
    public Movies() {
    }

    @Override
    public String toString() {
        return "\n\n MOVIE PLAYED IN THIS HALL" + 
                "\n Movie ID            : " + movieId + 
                "\n Movie Name     : " + movieName + 
                "\n Movie Price       : " + moviePrice + 
                "\n Release Date   : " + releaseDate + 
                "\n Movie Duration : " + movieDuration + 
                "\n Rating                : " + rating + 
                "\n Genre                 : " + genre;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }
    
    public double getmoviePrice() {
        return moviePrice;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public double getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public double CalculateTotalPrice(int noOfTickets, double price) {
        double totPrice;
        
        totPrice = noOfTickets * price;
        
        if(noOfTickets > 15)
            totPrice *= 0.80;
        else if (noOfTickets > 10)
            totPrice *= 0.85;
        else if (noOfTickets > 5)
            totPrice *= 0.90;
        
        
        return totPrice;
    }
 
}

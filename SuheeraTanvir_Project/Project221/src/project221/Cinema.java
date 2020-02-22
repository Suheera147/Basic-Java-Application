//Team 14 221 Project
package project221;

/**
 *
 * @author Suheera
 */
import java.util.LinkedList;

public class Cinema extends EntertainmentHalls {

    private int numofSalon;
    private LinkedList<Movies> moviesList = new LinkedList<Movies>();

    public Cinema(int hallId, String hallName, String location, int hallCapacity, int numofSalon) {
        super(hallId, hallName, location, hallCapacity);
        this.numofSalon = numofSalon;
        this.moviesList = moviesList;
    }

    public Cinema() {
        super(0, "", "", 0);
    }

    @Override
    public String toString() {
        return super.toString() + "\n Number of Salon  : "
                + numofSalon
                + moviesList + "\n\n\n\n";
    }

    public LinkedList<Movies> getMoviesList() {
        return moviesList;
    }

    public boolean addMovie(Movies movie) {
        if (searchMovies(movie.getMovieId()) != null) {
            return false;
        } else {
            moviesList.add(movie);
            return true;

        }
    }

    public boolean removeMovie(int id) {

        for (int i = 0; i < moviesList.size(); i++) {
            Movies temp = moviesList.get(i);
            if (temp.getMovieId() == id) {
                moviesList.remove(i);
                return true;
            }
        }
        return false;

    }

    public Movies searchMovies(int id) {
        for (int i = 0; i < moviesList.size(); i++) {
            Movies temp = moviesList.get(i);
            if (temp.getMovieId() == id) {

                return temp;
            }

        }

        return null;
    }

    @Override
    public int compareTo(EntertainmentHalls t) {
        return hallId - t.hallId;
    }

    @Override
    public String writetoFile() {
        String res = hallId + "*" + hallName + "*" + location + "*" + hallCapacity
                + "*" + "cinema" + "*" +  + numofSalon + "*" +  + moviesList.size()
                + System.lineSeparator();

        for (Movies m : moviesList) {
            res += m.getMovieId() + "*" + m.getMovieName() + "*" + m.getmoviePrice()
                    + "*" + m.getReleaseDate() + "*" + m.getMovieDuration() + "*"
                    + m.getRating() + "*" + m.getGenre()
                    + System.lineSeparator();
        }
        return res;
    }

}

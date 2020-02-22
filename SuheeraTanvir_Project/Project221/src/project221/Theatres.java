//Team 14 221 Project
package project221;

/**
 *
 * @author Suheera
 */
import java.util.LinkedList;

public class Theatres extends EntertainmentHalls {

    private String productionGroup;
    LinkedList<Plays> playsList = new LinkedList<Plays>();

    public Theatres(int hallId, String hallName, String location, int hallCapacity, String productionGroup) {
        super(hallId, hallName, location, hallCapacity);
        this.playsList = playsList;
        this.productionGroup = productionGroup;

    }
    
    

    @Override
    public String toString() {
        return super.toString() + "\n Production Group : "
                + productionGroup
                + playsList + "\n\n\n\n";

    }
    
    public LinkedList<Plays> getPlaysList() {
        return playsList;
    }

    public boolean addPlay(Plays play) {
        if (searchPlay(play.getPlayId()) != null) {
            return false;
        } else {
            playsList.add(play);
            return true;

        }

    }

    public boolean removePlay(int id) {

        for (int i = 0; i < playsList.size(); i++) {
            Plays temp = playsList.get(i);
            if (temp.getPlayId() == id) {
                playsList.remove(i);
                return true;
            }
        }
        return false;

    }

    public Plays searchPlay(int id) {
        for (int i = 0; i < playsList.size(); i++) {
            Plays temp = playsList.get(i);
            if (temp.getPlayId() == id) {

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
                + "*" + "theatre" + "*" + productionGroup + "*" + playsList.size()
                + System.lineSeparator();

        for (Plays p : playsList) {
            res += p.getPlayId()+ "*" + p.getPlayName() + "*" + p.getPlayPrice()
                    + "*" + p.getActingGroup() + "*" + p.getPlayDuration() + "*"
                    + p.getNumofActors()+ "*" + p.getGenre()
                    + System.lineSeparator();
        }
        return res;
    }
    
    

}

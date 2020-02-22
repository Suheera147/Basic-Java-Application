//Team 14 221 Project
package project221;

/**
 *
 * @author Suheera
 */
public class Plays implements TicketsInterface{
    private int playId;
    private String playName;
    private double playPrice;
    private String actingGroup;
    private int playDuration;
    private int numofActors;
    private String genre;
    
    public Plays(int playId, String playName, double playPrice, String actingGroup, int playDuration, int numofActors, String genre) {
        this.playId = playId;
        this.playName = playName;
        this.playPrice = playPrice;
        this.actingGroup = actingGroup;
        this.playDuration = playDuration;
        this.numofActors = numofActors;
        this.genre = genre;
    }

    @Override
    public String toString(){
        return "\n\n PLAY PERFORMED IN THIS HALL" + 
                "\n Play ID                    : " + playId + 
                "\n Play name             : " + playName +
                "\n Play Price               : " + playPrice + 
                "\n Play Acting Group : " + actingGroup + 
                "\n Play Duration         : " + playDuration +
                "\n Number of Actors  : " + numofActors + 
                "\n Genre                      : " + genre;
    }
    
    public int getPlayId() {
        return playId;
    }

    public String getPlayName() {
        return playName;
    }
    
    public double getPlayPrice() {
        return playPrice;
    }

    public String getActingGroup() {
        return actingGroup;
    }

    public int getPlayDuration() {
        return playDuration;
    }

    public int getNumofActors() {
        return numofActors;
    }

    public String getGenre() {
        return genre;
    }
    
    

    @Override
    public double CalculateTotalPrice(int noOfTickets, double price) {
        double totPrice;
        
        totPrice = noOfTickets * price;
        
        if(noOfTickets > 15)
            totPrice *= 0.70;
        else if (noOfTickets > 10)
            totPrice *= 0.75;
        else if (noOfTickets > 5)
            totPrice *= 0.85;
        
        
        return totPrice;
    }
    
}

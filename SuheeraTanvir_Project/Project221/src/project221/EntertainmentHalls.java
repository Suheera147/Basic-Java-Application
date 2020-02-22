//Team 14 221 Project
package project221;

/**
 *
 * @author Suheera
 */
public abstract class EntertainmentHalls implements Comparable<EntertainmentHalls>{
    protected int hallId;
    protected String hallName;
    protected String location;
    protected int hallCapacity;

    public EntertainmentHalls(int hallId, String hallName, String location, int hallCapacity) {
        this.hallId = hallId;
        this.hallName = hallName;
        this.location = location;
        this.hallCapacity = hallCapacity;
    }

    @Override
    public String toString() {
        return " ENTERTAINMENT HALL!" + 
                "\n\n Hall ID                    : " + hallId + 
                "\n Hall Name             : " + hallName + 
                "\n Location                 : " + location + 
                "\n Hall Capacity         : " + hallCapacity;
    }
    
    public int getId() {
        return hallId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.hallId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EntertainmentHalls other = (EntertainmentHalls) obj;
        if (this.hallId != other.hallId) {
            return false;
        }
        return true;
    } 
 
    public abstract String writetoFile();
    
    
}

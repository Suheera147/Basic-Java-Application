//Team 14 221 Project
package project221;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suheera
 */
public class EntertainmentHallsSys {

    public static Set<EntertainmentHalls> hallsList = new LinkedHashSet<>();

    public static boolean checkID(int id) {
        Iterator<EntertainmentHalls> i = hallsList.iterator();
        while (i.hasNext()) {
            EntertainmentHalls g = i.next();
            if (g.getId() == id) {
                return true;
            }
        }

        return false;
    }

    public static boolean addHall(EntertainmentHalls hall) {
        if (searchHall(hall.getId()) != null) {
            return false;
        } else {
            hallsList.add(hall);
            return true;

        }
    }

    public static EntertainmentHalls searchHall(int id) {
        for (EntertainmentHalls e : hallsList) {
            if (id == e.getId()) {
                return e;
            }
        }
        return null;
    }

    public static boolean removeHalls(int id) {
        for (EntertainmentHalls e : hallsList) {
            if (id == e.getId()) {
                hallsList.remove(e);
                return true;
            }
        }
        return false;
    }

    public static String display() {
        String display = "";
        for (EntertainmentHalls e : hallsList) {
            display += e.toString();
            display += "*";
        }
        return display;
    }

    public static void readFromFile() {
        File file = new File("EntertainmentHalls.txt");
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String[] line = sc.nextLine().split("\\*");
                int id = Integer.parseInt(line[0]);
                String name = line[1];
                String location = line[2];
                int capacity = Integer.parseInt(line[3]);

                if (line[4].equalsIgnoreCase("cinema")) {
                    int numofSalon = Integer.parseInt(line[5]);
                    Cinema c = new Cinema(id, name, location, capacity, numofSalon);

                    for (int i = 0; i < Integer.parseInt(line[6]); i++) {
                        String[] mov = sc.nextLine().split("\\*");
                        Movies m = new Movies(Integer.parseInt(mov[0]), mov[1], Double.parseDouble(mov[2]), mov[3], Integer.parseInt(mov[4]), Double.parseDouble(mov[5]), mov[6]);
                        c.addMovie(m);
                    }

                    hallsList.add(c);

                } else if (line[4].equalsIgnoreCase("theatre")) {
                    String productionGroup = line[5];
                    Theatres t = new Theatres(id, name, location, capacity, productionGroup);

                    for (int i = 0; i < Integer.parseInt(line[6]); i++) {
                        String[] play = sc.nextLine().split("\\*");
                        Plays p = new Plays(Integer.parseInt(play[0]), play[1], Double.parseDouble(play[2]), play[3], Integer.parseInt(play[4]), Integer.parseInt(play[5]), play[6]);
                        t.addPlay(p);
                    }

                    hallsList.add(t);

                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EntertainmentHallsSys.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void writeToFile() {
        PrintWriter output = null;
        try {
            File f = new File("EntertainmentHalls.txt");
            output = new PrintWriter(f);
            String out = "";

            for(EntertainmentHalls hall : hallsList){
               out += hall.writetoFile();
            }
            
            output.print(out);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EntertainmentHallsSys.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            output.close();
        }
    }

    public static String[] getHallId() {

        int i = 0;

        TreeSet<EntertainmentHalls> gt = new TreeSet<>();
        gt.addAll(hallsList);
        String[] HallId = new String[gt.size()];
        for (EntertainmentHalls g : gt) {
            HallId[i] = g.getId() + "";
            i++;
        }

        return HallId;
    }
    
        public static double searchCalculate(int id, int noOfTickets) {
       
        for (EntertainmentHalls hall : hallsList) {

            if (hall instanceof Cinema) {
                for (Movies m : ((Cinema) hall).getMoviesList()) {
                    if (m.getMovieId() == id) {
                        return (m.CalculateTotalPrice(noOfTickets, m.getmoviePrice()));

                    }
                }
            } else {
                for (Plays p : ((Theatres) hall).getPlaysList()) {

                    if (p.getPlayId() == id) {
                        return (p.CalculateTotalPrice(noOfTickets, p.getPlayPrice()));
                    }
                }
            }
        }

        return -1;

    }

    /*public static double searchCalculate(int id, int noOfTickets) {
        Cinema temp = new Cinema();

        for (EntertainmentHalls hall : hallsList) {

            if (hall.getClass() == temp.getClass()) {
                for (Movies m : ((Cinema) hall).getMoviesList()) {
                    if (m.getMovieId() == id) {
                        return (m.CalculateTotalPrice(noOfTickets, m.getmoviePrice()));

                    }
                }
            } else {
                for (Plays p : ((Theatres) hall).getPlaysList()) {

                    if (p.getPlayId() == id) {
                        return (p.CalculateTotalPrice(noOfTickets, p.getPlayPrice()));
                    }
                }
            }
        }

        return -1;

    }*/
    

}

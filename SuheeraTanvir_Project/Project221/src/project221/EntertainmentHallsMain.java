//Team 14 221 Project
package project221;

import GUI.MainFrame;

public class EntertainmentHallsMain {

   
    public static void main(String[] args) {
        
        EntertainmentHallsSys.readFromFile();
        //System.out.println(EntertainmentHallsSys.display());
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        
        EntertainmentHallsSys.searchCalculate(20, 2);
        //to add forms here
        
        
    }
    
}

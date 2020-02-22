package GUI;

import project221.Cinema;
import project221.EntertainmentHallsSys;
import project221.Theatres;

public class AddHalls extends javax.swing.JFrame {

    MainFrame obj;
    AddMovies mObj;
    AddPlays pObj;

    public AddHalls(MainFrame ob) {
        initComponents();
        obj = ob;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroupHallType = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        buttonClose = new javax.swing.JButton();
        buttonAddPlays = new javax.swing.JButton();
        buttonAddMovies = new javax.swing.JButton();
        labelAddHallFrame = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldHallID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textFieldHallName = new javax.swing.JTextField();
        textFieldHallLocation = new javax.swing.JTextField();
        textFieldHallCapacity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textFieldNoOfSalon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textFieldProductionGroup = new javax.swing.JTextField();
        buttonClear = new javax.swing.JButton();
        RadioButtonCinema = new javax.swing.JRadioButton();
        RadioButtonTheatre = new javax.swing.JRadioButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD HALLS FRAME");

        jLabel2.setText("Hall Type : ");

        buttonClose.setText("CLOSE");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        buttonAddPlays.setText("ADD PLAYS");
        buttonAddPlays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddPlaysActionPerformed(evt);
            }
        });

        buttonAddMovies.setText("ADD MOVIES");
        buttonAddMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddMoviesActionPerformed(evt);
            }
        });

        jLabel3.setText("Hall ID : ");

        jLabel4.setText("Hall Name : ");

        jLabel5.setText("Hall Location : ");

        jLabel6.setText("Hall Capacity : ");

        jLabel7.setText("FOR CINEMAS - No Of Salon : ");

        jLabel8.setText("FOR THEATRES - Production Group : ");

        buttonClear.setText("CLEAR");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonGroupHallType.add(RadioButtonCinema);
        RadioButtonCinema.setSelected(true);
        RadioButtonCinema.setText("Cinema");

        buttonGroupHallType.add(RadioButtonTheatre);
        RadioButtonTheatre.setText("Theatre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelAddHallFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textFieldHallID, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                        .addComponent(textFieldHallName)
                                        .addComponent(textFieldHallCapacity)
                                        .addComponent(textFieldHallLocation))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RadioButtonCinema)
                                        .addGap(30, 30, 30)
                                        .addComponent(RadioButtonTheatre))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textFieldNoOfSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldProductionGroup))))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAddMovies, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAddPlays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioButtonCinema)
                    .addComponent(RadioButtonTheatre))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldHallID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldHallName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldHallLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textFieldHallCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNoOfSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldProductionGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddHallFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAddMovies)
                    .addComponent(buttonAddPlays))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        textFieldHallCapacity.setText("");
        textFieldHallID.setText("");
        textFieldHallLocation.setText("");
        textFieldHallName.setText("");
        textFieldNoOfSalon.setText("");
        textFieldProductionGroup.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void buttonAddMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddMoviesActionPerformed

        if (RadioButtonTheatre.isSelected()) {
            labelAddHallFrame.setText("A Theatre cannot add Movies!");
        } else {
            if (textFieldHallID.getText().equals("") || textFieldHallName.getText().equals("")
                    || textFieldHallLocation.getText().equals("") || textFieldHallCapacity.getText().equals("")
                    || textFieldNoOfSalon.getText().equals("")) {
                labelAddHallFrame.setText("PLEASE FILL IN ALL THE FIELDS FIRST ");
            } else {
                if (EntertainmentHallsSys.searchHall(Integer.parseInt(textFieldHallID.getText())) != null) {
                    labelAddHallFrame.setText("A Hall with this ID already exists !");
                } else {
                    Cinema c = new Cinema(Integer.parseInt(textFieldHallID.getText()), textFieldHallName.getText(),
                            textFieldHallLocation.getText(), Integer.parseInt(textFieldHallCapacity.getText()),
                            Integer.parseInt(textFieldNoOfSalon.getText()));
                    EntertainmentHallsSys.addHall(c);
                    mObj = new AddMovies(this, c);
                    mObj.setVisible(true);
                    setVisible(false);
                    obj.setComboBox();
                }
            }
        }

    }//GEN-LAST:event_buttonAddMoviesActionPerformed

    private void buttonAddPlaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddPlaysActionPerformed

        if (RadioButtonCinema.isSelected()) {
            labelAddHallFrame.setText("A Cinema cannot add Plays!");
        } else {
            if (textFieldHallID.getText().equals("") || textFieldHallName.getText().equals("")
                    || textFieldHallLocation.getText().equals("") || textFieldHallCapacity.getText().equals("")
                    || textFieldProductionGroup.getText().equals("")) {
                labelAddHallFrame.setText("PLEASE FILL IN ALL THE FIELDS FIRST ");
            } else {
                if (EntertainmentHallsSys.searchHall(Integer.parseInt(textFieldHallID.getText())) != null) {
                    labelAddHallFrame.setText("A Hall with this ID already exists !");
                } else {
                    Theatres t = new Theatres(Integer.parseInt(textFieldHallID.getText()), textFieldHallName.getText(),
                            textFieldHallLocation.getText(), Integer.parseInt(textFieldHallCapacity.getText()),
                            textFieldProductionGroup.getText());
                    pObj = new AddPlays(this, t);
                    pObj.setVisible(true);
                    setVisible(false);
                }

            }
        }

    }//GEN-LAST:event_buttonAddPlaysActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButtonCinema;
    private javax.swing.JRadioButton RadioButtonTheatre;
    private javax.swing.JButton buttonAddMovies;
    private javax.swing.JButton buttonAddPlays;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonClose;
    private javax.swing.ButtonGroup buttonGroupHallType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelAddHallFrame;
    private javax.swing.JTextField textFieldHallCapacity;
    private javax.swing.JTextField textFieldHallID;
    private javax.swing.JTextField textFieldHallLocation;
    private javax.swing.JTextField textFieldHallName;
    private javax.swing.JTextField textFieldNoOfSalon;
    private javax.swing.JTextField textFieldProductionGroup;
    // End of variables declaration//GEN-END:variables
}

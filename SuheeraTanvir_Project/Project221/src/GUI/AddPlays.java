package GUI;

import java.awt.event.KeyEvent;
import project221.Cinema;
import project221.EntertainmentHalls;
import static project221.EntertainmentHallsSys.hallsList;
import project221.Movies;
import project221.Plays;
import project221.Theatres;

public class AddPlays extends javax.swing.JFrame {

    AddHalls obj;
    Theatres t;

    public AddPlays(AddHalls ob, Theatres th) {
        initComponents();
        obj = ob;
        t = th;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAdd = new javax.swing.JButton();
        textFieldPlayID = new javax.swing.JTextField();
        textFieldPlayName = new javax.swing.JTextField();
        textFieldPlayPrice = new javax.swing.JTextField();
        textFieldActingGroup = new javax.swing.JTextField();
        textFieldPlayDuration = new javax.swing.JTextField();
        textFieldNoOfActors = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelPlayAdded = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboBoxGenre = new javax.swing.JComboBox<>();
        buttonAddPlay = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        labelPrompt = new javax.swing.JLabel();
        labelPlayAdded2 = new javax.swing.JLabel();
        labelPlayAdded3 = new javax.swing.JLabel();
        labelPlayAdded4 = new javax.swing.JLabel();
        labelPlayAdded5 = new javax.swing.JLabel();

        buttonAdd.setText("ADD");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD PLAYS");

        textFieldPlayID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPlayIDActionPerformed(evt);
            }
        });
        textFieldPlayID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldPlayIDKeyPressed(evt);
            }
        });

        jLabel1.setText("PlayID : ");

        jLabel2.setText("Play Name : ");

        jLabel3.setText("Play Price : ");

        jLabel4.setText("Acting Group : ");

        jLabel5.setText("Play Duration : ");

        jLabel6.setText("No Of Actors : ");

        labelPlayAdded.setText("16 : Funnies * Comedy");

        jLabel7.setText("Genre : ");

        comboBoxGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Adventure", "Animation", "Biography", "Children", "Comedy", "Documentary", "Drama", "Fantasy", "History", "Horror", "Life", "Mystery", "Romance", "SciFi", "Short", "Thriller", "Tragedy", "Young Adult" }));

        buttonAddPlay.setText("ADD");
        buttonAddPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddPlayActionPerformed(evt);
            }
        });

        buttonClear.setText("CLEAR");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonClose.setText("CLOSE");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        labelPlayAdded2.setText("17 : HiEveryone * Life");

        labelPlayAdded3.setText("18 : WE ARE YOUNG * Comedy");

        labelPlayAdded4.setText("19 : Honey Bunny * Children");

        labelPlayAdded5.setText("20 : Life is Short * Tragedy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonAddPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(textFieldPlayName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFieldPlayID, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFieldPlayPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textFieldPlayDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFieldActingGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textFieldNoOfActors, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelPlayAdded, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPlayAdded2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPlayAdded3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPlayAdded4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPlayAdded5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPlayID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPlayName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldPlayPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldActingGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldPlayDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldNoOfActors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(labelPlayAdded)
                        .addGap(18, 18, 18)
                        .addComponent(labelPlayAdded2)
                        .addGap(18, 18, 18)
                        .addComponent(labelPlayAdded3)
                        .addGap(18, 18, 18)
                        .addComponent(labelPlayAdded4)
                        .addGap(18, 18, 18)
                        .addComponent(labelPlayAdded5)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboBoxGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddPlay)
                    .addComponent(labelPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonClear)
                    .addComponent(buttonClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        textFieldActingGroup.setText("");
        textFieldNoOfActors.setText("");
        textFieldPlayDuration.setText("");
        textFieldPlayID.setText("");
        textFieldPlayName.setText("");
        textFieldPlayPrice.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void textFieldPlayIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPlayIDKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            for (EntertainmentHalls hall : hallsList) {

                if (hall instanceof Theatres) {
                    for (Plays p : ((Theatres) hall).getPlaysList()) {

                        if (p.getPlayId() == Integer.parseInt(textFieldPlayID.getText())) {
                            textFieldPlayName.setText(p.getPlayName());
                            textFieldPlayPrice.setText(p.getPlayPrice() + "");
                            textFieldActingGroup.setText(p.getActingGroup());
                            textFieldPlayDuration.setText(p.getPlayDuration() + "");
                            textFieldNoOfActors.setText(p.getNumofActors() + "");
                            
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_textFieldPlayIDKeyPressed

    private void textFieldPlayIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPlayIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPlayIDActionPerformed

    private void buttonAddPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddPlayActionPerformed
       if(textFieldPlayID.getText().equals("") || textFieldPlayName.getText().equals("") || 
                textFieldPlayPrice.getText().equals("") || textFieldActingGroup.getText().equals("") || 
                textFieldPlayDuration.getText().equals("") || textFieldNoOfActors.getText().equals(""))
            labelPrompt.setText("Please Fill in ALL the fields! ");
        else {
            boolean flag;
            Plays p = new Plays(Integer.parseInt(textFieldPlayID.getText()), textFieldPlayName.getText(),
            Double.parseDouble(textFieldPlayPrice.getText()), textFieldActingGroup.getText(),
            Integer.parseInt(textFieldPlayDuration.getText()), Integer.parseInt(textFieldNoOfActors.getText()),
            (String)comboBoxGenre.getSelectedItem());   
            flag = t.addPlay(p);
            if(flag == false)
                labelPrompt.setText("A Play with this ID already exists!");
            else
                labelPrompt.setText("Play has been added");    
        }
    }//GEN-LAST:event_buttonAddPlayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAddPlay;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonClose;
    private javax.swing.JComboBox<String> comboBoxGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelPlayAdded;
    private javax.swing.JLabel labelPlayAdded2;
    private javax.swing.JLabel labelPlayAdded3;
    private javax.swing.JLabel labelPlayAdded4;
    private javax.swing.JLabel labelPlayAdded5;
    private javax.swing.JLabel labelPrompt;
    private javax.swing.JTextField textFieldActingGroup;
    private javax.swing.JTextField textFieldNoOfActors;
    private javax.swing.JTextField textFieldPlayDuration;
    private javax.swing.JTextField textFieldPlayID;
    private javax.swing.JTextField textFieldPlayName;
    private javax.swing.JTextField textFieldPlayPrice;
    // End of variables declaration//GEN-END:variables
}

package GUI;

import javax.swing.DefaultComboBoxModel;
import project221.Cinema;
import project221.EntertainmentHalls;
import project221.EntertainmentHallsSys;
import static project221.EntertainmentHallsSys.hallsList;
import project221.Movies;
import project221.Plays;
import project221.Theatres;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setComboBox();
    }

    public void setComboBox() {
        comboBoxHallIDs.setModel(new DefaultComboBoxModel<>(EntertainmentHallsSys.getHallId()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaMainFrame = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSearchForHall = new javax.swing.JToggleButton();
        buttonDisplayAllHallInfo = new javax.swing.JButton();
        textFieldMoviePlayID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldNoOfTickets = new javax.swing.JTextField();
        buttonCalculatePrice = new javax.swing.JButton();
        labelPricePrompt = new javax.swing.JLabel();
        buttonAddNewHall = new javax.swing.JButton();
        comboBoxHallIDs = new javax.swing.JComboBox<>();
        buttonDeleteHal = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        checkBoxWantDiscount = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HALL & TICKET INFORMATION");

        TextAreaMainFrame.setEditable(false);
        TextAreaMainFrame.setColumns(20);
        TextAreaMainFrame.setRows(5);
        TextAreaMainFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextAreaMainFrameMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TextAreaMainFrame);

        jLabel1.setText("Hall ID : ");

        jLabel2.setText("Movie/Play ID : ");

        buttonSearchForHall.setText("Display Hall Info");
        buttonSearchForHall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchForHallActionPerformed(evt);
            }
        });

        buttonDisplayAllHallInfo.setText("Display All Hall Info");
        buttonDisplayAllHallInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDisplayAllHallInfoActionPerformed(evt);
            }
        });

        jLabel3.setText("Number of Tickets : ");

        buttonCalculatePrice.setText("Calculate Price ");
        buttonCalculatePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculatePriceActionPerformed(evt);
            }
        });

        buttonAddNewHall.setText("ADD NEW HALL");
        buttonAddNewHall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddNewHallActionPerformed(evt);
            }
        });

        buttonDeleteHal.setText("Delete Hall");
        buttonDeleteHal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteHalActionPerformed(evt);
            }
        });

        buttonClose.setText("CLOSE");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        checkBoxWantDiscount.setText("Want Discount ?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonDeleteHal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(comboBoxHallIDs, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(checkBoxWantDiscount)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(textFieldMoviePlayID)
                                                    .addComponent(textFieldNoOfTickets, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                                            .addGap(25, 25, 25)))
                                    .addComponent(labelPricePrompt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonSearchForHall, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDisplayAllHallInfo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(buttonAddNewHall)
                                .addGap(27, 27, 27)
                                .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(buttonCalculatePrice)))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxHallIDs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSearchForHall)
                    .addComponent(buttonDisplayAllHallInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonDeleteHal)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldMoviePlayID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldNoOfTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(checkBoxWantDiscount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCalculatePrice)
                .addGap(18, 18, 18)
                .addComponent(labelPricePrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddNewHall)
                    .addComponent(buttonClose))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddNewHallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddNewHallActionPerformed
        setVisible(false);
        AddHalls add = new AddHalls(this);
        add.setVisible(true);
    }//GEN-LAST:event_buttonAddNewHallActionPerformed

    private void buttonDisplayAllHallInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDisplayAllHallInfoActionPerformed
        TextAreaMainFrame.setText(EntertainmentHallsSys.display());
    }//GEN-LAST:event_buttonDisplayAllHallInfoActionPerformed

    private void buttonSearchForHallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchForHallActionPerformed
        TextAreaMainFrame.setText(EntertainmentHallsSys.searchHall(Integer.parseInt((String) comboBoxHallIDs.getSelectedItem())).toString());

    }//GEN-LAST:event_buttonSearchForHallActionPerformed

    private void buttonCalculatePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculatePriceActionPerformed
        double totPrice = -1;

        if (textFieldNoOfTickets.getText().equals("") || textFieldMoviePlayID.getText().equals("")) {
            labelPricePrompt.setText("PLEASE FILL IN BOTH FIELDS FIRST !");
        } else {
            int no = Integer.parseInt(textFieldNoOfTickets.getText());
            int id = Integer.parseInt(textFieldMoviePlayID.getText());

            if (checkBoxWantDiscount.isSelected()) {
                totPrice = EntertainmentHallsSys.searchCalculate(id, no);
            } else {
                for (EntertainmentHalls hall : hallsList) {

                    if (hall instanceof Cinema) {
                        for (Movies m : ((Cinema) hall).getMoviesList()) {
                            if (m.getMovieId() == id) {
                                totPrice = m.getmoviePrice() * no;

                            }
                        }
                    } else {
                        for (Plays p : ((Theatres) hall).getPlaysList()) {

                            if (p.getPlayId() == id) {
                                totPrice = p.getPlayPrice() * no;
                            }
                        }
                    }
                }
            }

            if (totPrice > 0) {
                labelPricePrompt.setText("The customer needs to pay $ " + totPrice + ".");
            } else {
                labelPricePrompt.setText("A MOVIE/PLAY WITH THIS ID DOES NOT EXIST!");
            }
        }

    }//GEN-LAST:event_buttonCalculatePriceActionPerformed

    private void buttonDeleteHalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteHalActionPerformed
        EntertainmentHallsSys.removeHalls(Integer.parseInt((String) comboBoxHallIDs.getSelectedItem()));
        setComboBox();
        labelPricePrompt.setText("Hall has been removed !");    
    }//GEN-LAST:event_buttonDeleteHalActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        EntertainmentHallsSys.writeToFile();
        dispose();
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void TextAreaMainFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAreaMainFrameMouseClicked
        labelPricePrompt.setText("Sorry, but you cannot edit this text area :) ");
    }//GEN-LAST:event_TextAreaMainFrameMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextAreaMainFrame;
    private javax.swing.JButton buttonAddNewHall;
    private javax.swing.JButton buttonCalculatePrice;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonDeleteHal;
    private javax.swing.JButton buttonDisplayAllHallInfo;
    private javax.swing.JToggleButton buttonSearchForHall;
    private javax.swing.JCheckBox checkBoxWantDiscount;
    private javax.swing.JComboBox<String> comboBoxHallIDs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPricePrompt;
    private javax.swing.JTextField textFieldMoviePlayID;
    private javax.swing.JTextField textFieldNoOfTickets;
    // End of variables declaration//GEN-END:variables
}

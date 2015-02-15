/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.deb.ui;

import is.deb.teams.Player;
import is.deb.teams.Team;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author evadoggsteingrimsdottir
 */
public class SelectPlayersUI extends javax.swing.JFrame {

    private java.util.List <javax.swing.JCheckBox> checkBoxHomeTeam = new java.util.ArrayList<>();;
    private java.util.List <javax.swing.JCheckBox> checkBoxAwayTeam = new java.util.ArrayList<>();;
    private ScoringUI scoringUI = new ScoringUI();
    private Team[] teams;
    
    /**
     * Creates new form SelectPlayersUI
     */
    public SelectPlayersUI() {
        initComponents();
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        panelHomePlayers.setLayout(new BoxLayout(panelHomePlayers, BoxLayout.Y_AXIS));
        panelAwayPlayers.setLayout(new BoxLayout(panelAwayPlayers, BoxLayout.Y_AXIS));
        
        teams = scoringUI.getTeams();
        Player[] homePlayers = teams[0].getPlayers();
        Player[] awayPlayers = teams[1].getPlayers();
        createPlayerSelection(homePlayers, panelHomePlayers, "checkHome");
        createPlayerSelection(awayPlayers, panelAwayPlayers, "checkAway");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHomePlayers = new javax.swing.JPanel();
        panelAwayPlayers = new javax.swing.JPanel();
        btnConfirmTeams = new javax.swing.JButton();
        checkAllHomePlayers = new javax.swing.JCheckBox();
        checkAllAwayPlayers = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panelHomePlayers.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout panelHomePlayersLayout = new javax.swing.GroupLayout(panelHomePlayers);
        panelHomePlayers.setLayout(panelHomePlayersLayout);
        panelHomePlayersLayout.setHorizontalGroup(
            panelHomePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );
        panelHomePlayersLayout.setVerticalGroup(
            panelHomePlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelAwayPlayers.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout panelAwayPlayersLayout = new javax.swing.GroupLayout(panelAwayPlayers);
        panelAwayPlayers.setLayout(panelAwayPlayersLayout);
        panelAwayPlayersLayout.setHorizontalGroup(
            panelAwayPlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );
        panelAwayPlayersLayout.setVerticalGroup(
            panelAwayPlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        btnConfirmTeams.setText("Staðfesta");
        btnConfirmTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmTeamsActionPerformed(evt);
            }
        });

        checkAllHomePlayers.setText("Velja alla leikmenn");
        checkAllHomePlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAllHomePlayersActionPerformed(evt);
            }
        });

        checkAllAwayPlayers.setText("Velja alla leikmenn");
        checkAllAwayPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAllAwayPlayersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHomePlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(panelAwayPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(checkAllHomePlayers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirmTeams)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkAllAwayPlayers)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAwayPlayers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHomePlayers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmTeams)
                    .addComponent(checkAllHomePlayers)
                    .addComponent(checkAllAwayPlayers)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmTeamsActionPerformed
        boolean validHomeTeam = setSelectedTeam(teams[0].getPlayers(),checkBoxHomeTeam);
        boolean validAwayTeam = setSelectedTeam(teams[1].getPlayers(),checkBoxAwayTeam);
        if(validHomeTeam && validAwayTeam) {
            scoringUI.setVisible(true);
            this.setVisible(false);
        }
        scoringUI.setPlayers(teams);
        
    }//GEN-LAST:event_btnConfirmTeamsActionPerformed

    private boolean setSelectedTeam(Player[] players, List<JCheckBox> boxes) {
        int numberOfSelectedPlayers = 0;
        for(int i = 0; i<boxes.size(); i++) {
            if(boxes.get(i).isSelected()) {
                players[i].playerIsPlaying(true);
                numberOfSelectedPlayers++;
            }
        }
        return numberOfSelectedPlayers ==14;
    }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void checkAllHomePlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllHomePlayersActionPerformed
        boolean selected = checkAllHomePlayers.isSelected();
        selectAllPlayers(checkBoxHomeTeam,selected);
        if(selected) {
            checkAllHomePlayers.setText("Velja engan leikmann");
        }
        else {
            checkAllHomePlayers.setText("Velja all leikmenn");
        }
    }//GEN-LAST:event_checkAllHomePlayersActionPerformed

    private void checkAllAwayPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllAwayPlayersActionPerformed
        boolean selected = checkAllAwayPlayers.isSelected();
        selectAllPlayers(checkBoxAwayTeam,selected);
        if(selected) {
            checkAllAwayPlayers.setText("Velja engan leikmann");
        }
        else {
            checkAllAwayPlayers.setText("Velja all leikmenn");
        }
    }//GEN-LAST:event_checkAllAwayPlayersActionPerformed

    private void selectAllPlayers(List<JCheckBox> boxes, boolean value) {
        for(int i = 0; i<boxes.size(); i++) {
            boxes.get(i).setSelected(value);
        }
    }
    private void createPlayerSelection(Player[] players, JPanel panel, String name){
        for(int i=0; i<players.length; i++) {
            javax.swing.JCheckBox box = new javax.swing.JCheckBox(name+i);
            box.setText(players[i].getPlayerName());
            box.setHorizontalTextPosition(SwingConstants.LEFT);
            panel.add(box);
            if(name.equals("checkHome")) {
                checkBoxHomeTeam.add(box); 
            }
            else {
                checkBoxAwayTeam.add(box);
            }
            
        }
        pack();  // this will tell the JFrame's panel to layout all the components
      }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectPlayersUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectPlayersUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectPlayersUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectPlayersUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectPlayersUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmTeams;
    private javax.swing.JCheckBox checkAllAwayPlayers;
    private javax.swing.JCheckBox checkAllHomePlayers;
    private javax.swing.JPanel panelAwayPlayers;
    private javax.swing.JPanel panelHomePlayers;
    // End of variables declaration//GEN-END:variables
}

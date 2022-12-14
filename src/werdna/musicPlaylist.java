/*
 * Click nbfs://nbhost
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getIconWidth() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getIconHeight() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package werdna;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.*;
import java.awt.Component;
import javax.swing.border.*;
import java.awt.Toolkit;

/**
 *
 * @author Andre
 */
public class musicPlaylist extends javax.swing.JFrame {

    /**
     * Creates new form musicPlaylist
     */
    
    public musicPlaylist() {
        initComponents();
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }catch(ClassNotFoundException e)
        {
            System.exit(501);
        }
        lblGenreImage.setText("");
        lblGenreImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/genreimages/music-note.jpeg")));
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/genreimages/music-note.jpeg")));
        //lblGenreImage.setBounds(100, 100, 10, 10);
        
        //this.setIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Data/music-note.jpeg"))); 
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGetLibrary = new javax.swing.JButton();
        jpDisplay = new javax.swing.JPanel();
        btnQuit = new javax.swing.JButton();
        cmbGenres = new javax.swing.JComboBox<String>();
        lblGenreImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Music Library");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btnGetLibrary.setText("Get Library");
        btnGetLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetLibraryActionPerformed(evt);
            }
        });

        jpDisplay.setBorder(javax.swing.BorderFactory.createTitledBorder("Display"));

        javax.swing.GroupLayout jpDisplayLayout = new javax.swing.GroupLayout(jpDisplay);
        jpDisplay.setLayout(jpDisplayLayout);
        jpDisplayLayout.setHorizontalGroup(
            jpDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        jpDisplayLayout.setVerticalGroup(
            jpDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        cmbGenres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenresActionPerformed(evt);
            }
        });

        lblGenreImage.setText("genre image");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbGenres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGetLibrary, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addComponent(lblGenreImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jpDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGetLibrary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbGenres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(lblGenreImage)
                        .addGap(0, 259, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetLibraryActionPerformed
        // TODO add your handling code here:
        JPanel display = jpDisplay;
        cmbGenres.removeAllItems();
        
        JLabel[] labels = new JLabel[100];
        String[] existingGenres = new String[100];
        
        for(Component c : display.getComponents())
        {
            display.remove(c);
        }
        
        /*
        JLabel label = new JLabel();
        
        label.setText("This is at test");
        
        display.add(label);
        
        label.setBounds(20,20,200,50);
        */
        
        int verticalPadding = 20;
        int pos = 0;
        int genrePos = 1;
        
        try
        {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://Data\\musicLibrary.accdb");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM library");
            ResultSet test = st.executeQuery("SELECT COUNT(*) AS COUNT FROM library");
            
            //rs.last();
            //int count = rs.getRow();
            //rs.first();
            
            //labels = new JLabel[count];
            //existingGenres = new String[count+1];
            existingGenres[0] = "All";
            
            /*
            int count = Integer.parseInt(st.executeQuery("SELECT COUNT(*) FROM library").getString("COUNT"));
            System.out.print(count);
            */
            while(rs.next())
            {
                labels[pos] = new JLabel();
                labels[pos].setText(String.format("%s written by %s", rs.getString("Title"), rs.getString("Artist")));
                
                display.add(labels[pos]);
                labels[pos].setBounds(20, verticalPadding, 500, 20);
                
                verticalPadding += 20;
                pos++;
                boolean genreExist = false;
                for(String genre : existingGenres)
                {
                    if(genre == null)                   {break;}
                    if(genre.equals(rs.getString("Genre")))  {genreExist=true;break;}
                    
                }
                if(!genreExist)
                {
                    existingGenres[genrePos] = rs.getString("Genre");
                    genrePos++;
                }
                
            }
        }
        catch(SQLException e)
        {
            System.exit(102);
        }
        
        for(String genre : existingGenres)
        {
            if(genre == null)
            {
                break;
            }
            cmbGenres.addItem(genre);
        }
        
        
        display.updateUI();
    }//GEN-LAST:event_btnGetLibraryActionPerformed

    private void cmbGenresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenresActionPerformed
        // TODO add your handling code here:
        if(cmbGenres.getSelectedItem() == null){return;}
        JPanel display = jpDisplay;
        display.setBorder(new TitledBorder("Display - " + cmbGenres.getSelectedItem().toString()));
        
        for(Component c : display.getComponents())
        {
            display.remove(c);
        }
        
        JLabel[] labels = new JLabel[100];
        
        int verticalPadding = 20;
        int pos = 0;
        
        try
        {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://Data\\musicLibrary.accdb");
            Statement st = con.createStatement();
            
            ResultSet rs;
            if(cmbGenres.getSelectedItem().toString().equals("All"))
            {
                rs = st.executeQuery("SELECT * FROM library");
                lblGenreImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/genreimages/music-note.jpeg")));
            }else{
                rs = st.executeQuery("SELECT * FROM library WHERE Genre='" + cmbGenres.getSelectedItem().toString() + "'");
                String fileFormat = "/genreimages/";
                fileFormat += cmbGenres.getSelectedItem().toString().toLowerCase().replace(" ", "-");
                fileFormat += ".jpeg";
                //System.out.print(fileFormat);
                lblGenreImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(fileFormat)));
            }
            
            while(rs.next())
            {
                labels[pos] = new JLabel();
                labels[pos].setText(String.format("%s written by %s", rs.getString("Title"), rs.getString("Artist")));
                
                display.add(labels[pos]);
                labels[pos].setBounds(20, verticalPadding, 500, 20);
                
                verticalPadding += 20;
                pos++;
            }
        }
        catch(SQLException e)
        {
            System.exit(102);
        }
        
        display.updateUI();
    }//GEN-LAST:event_cmbGenresActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(musicPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musicPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musicPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musicPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musicPlaylist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetLibrary;
    private javax.swing.JButton btnQuit;
    private javax.swing.JComboBox<String> cmbGenres;
    private javax.swing.JPanel jpDisplay;
    private javax.swing.JLabel lblGenreImage;
    // End of variables declaration//GEN-END:variables
}

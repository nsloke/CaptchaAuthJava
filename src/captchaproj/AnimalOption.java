/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package captchaproj;

import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lokesaheb
 */
public class AnimalOption extends javax.swing.JFrame {
String strpass;
String ltrpass;
    /**
     * Creates new form AnimalOption
     */
    public AnimalOption() {
        strpass="";
        ltrpass="";
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtusrname = new javax.swing.JTextField();
        btnstartpassset = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        bcnv = new java.awt.Canvas();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblnumz = new javax.swing.JTable();
        btnsavepass = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtusrne = new javax.swing.JTextField();
        btndispwig = new javax.swing.JButton();
        btnloginds = new javax.swing.JButton();
        jSplitPane2 = new javax.swing.JSplitPane();
        lcnv = new java.awt.Canvas();
        jScrollPane2 = new javax.swing.JScrollPane();
        ltbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animal Captcha");

        jLabel1.setText("Username");

        btnstartpassset.setText("Display Widgets");
        btnstartpassset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartpasssetActionPerformed(evt);
            }
        });

        jSplitPane1.setDividerLocation(500);

        bcnv.setPreferredSize(new java.awt.Dimension(300, 200));
        bcnv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcnvMouseClicked(evt);
            }
        });
        jSplitPane1.setLeftComponent(bcnv);

        tblnumz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblnumz.setCellSelectionEnabled(true);
        tblnumz.setTableHeader(null);
        tblnumz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnumzMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblnumz);

        jSplitPane1.setRightComponent(jScrollPane1);

        btnsavepass.setText("Register");
        btnsavepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavepassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtusrname, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnstartpassset)
                        .addGap(45, 45, 45)
                        .addComponent(btnsavepass)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusrname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnstartpassset)
                    .addComponent(btnsavepass))
                .addGap(49, 49, 49)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Register", jPanel1);

        jLabel2.setText("Username");

        btndispwig.setText("Display Widgets");
        btndispwig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndispwigActionPerformed(evt);
            }
        });

        btnloginds.setText("Login");
        btnloginds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogindsActionPerformed(evt);
            }
        });

        jSplitPane2.setDividerLocation(300);

        lcnv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lcnvMouseClicked(evt);
            }
        });
        jSplitPane2.setLeftComponent(lcnv);

        ltbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ltbl.setCellSelectionEnabled(true);
        ltbl.setTableHeader(null);
        ltbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ltbl);

        jSplitPane2.setRightComponent(jScrollPane2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(txtusrne, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btndispwig)
                        .addGap(55, 55, 55)
                        .addComponent(btnloginds)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtusrne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndispwig)
                    .addComponent(btnloginds))
                .addGap(63, 63, 63)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
    
    private void btnstartpasssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartpasssetActionPerformed
        try {
            // TODO add your handling code here:
            BufferedImage imga = null;
            BufferedImage imgb = null;
            BufferedImage imgc = null;
            BufferedImage imgd = null;
            BufferedImage imge = null;
            BufferedImage imgf = null;

            imga = ImageIO.read(getClass().getResource("/animals/001.png"));
            imgb = ImageIO.read(getClass().getResource("/animals/002.png"));
            imgc = ImageIO.read(getClass().getResource("/animals/003.png"));
            imgd = ImageIO.read(getClass().getResource("/animals/004.png"));
            imge = ImageIO.read(getClass().getResource("/animals/005.png"));
            imgf = ImageIO.read(getClass().getResource("/animals/006.png"));

            bcnv.getGraphics().drawImage(imga, 10,10, null);
            bcnv.getGraphics().drawImage(imgb, 80,120, null);
            bcnv.getGraphics().drawImage(imgc, 200,30, null);
            bcnv.getGraphics().drawImage(imgd, 20,240, null);
            bcnv.getGraphics().drawImage(imge, 180,120, null);
            bcnv.getGraphics().drawImage(imgf, 300,160, null);

            if(bcnv.getGraphics()!=null){
                System.out.println("context is not null");
            }
            else
            {
                System.out.println("context is null");
            }
            
            
           Object data[][] = { {"91","72","39","95","5","53"},
                               {"18","49","96","18","38","96"},
                               {"94","18","89","59","43","1"},
                               {"82","59","30","61","18","39"},
                               {"53","22","69","73","21","87"},
                               {"1","34","21","1","50","16"},
                        };
           
            String col[] = { "Name", "Capital", "TX", "Name", "Capital", "TX" };
            
            DefaultTableModel model = new DefaultTableModel(data,col);
            
            
            tblnumz.setModel(model);
            
        } catch (IOException ex) {
            Logger.getLogger(AnimalOption.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_btnstartpasssetActionPerformed

    private void tblnumzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnumzMouseClicked
        // TODO add your handling code here:
        int x=tblnumz.rowAtPoint(evt.getPoint());
        int y=tblnumz.columnAtPoint(evt.getPoint());
        strpass=strpass+tblnumz.getValueAt(x,y).toString();
        System.out.println(strpass);
        //JOptionPane.showMessageDialog(null,tblnumz.getValueAt(x,y).toString());
    }//GEN-LAST:event_tblnumzMouseClicked

    private void bcnvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcnvMouseClicked
        // TODO add your handling code here:
        int x=MouseInfo.getPointerInfo().getLocation().x-bcnv.getLocationOnScreen().x;
        int y=MouseInfo.getPointerInfo().getLocation().y-bcnv.getLocationOnScreen().y;
        
         if(x>=10 && x<58 && y>=10 && y<58) {
         strpass=strpass+"Rabbit";
        }
        if(x>=80 && x<128 && y>=120 && y<168) {
         strpass=strpass+"Hippo";
        }
        if(x>=200 && x<248 && y>=30 && y<78) {
         strpass=strpass+"Cheetah";
        }
        if(x>=20 && x<68 && y>=240 && y<288) {
        strpass=strpass+"Zebra";
        }
        
        if(x>=180 && x<228 && y>=120 && y<168) {
        strpass=strpass+"Horse";
        }
        if(x>=300 && x<348 && y>=160 && y<208) {
        strpass=strpass+"Dog";
        }
        
        System.out.println(strpass);
        
    }//GEN-LAST:event_bcnvMouseClicked

    private void btnsavepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavepassActionPerformed
        // TODO add your handling code here:
        String usr=txtusrname.getText();
        try {
            // TODO add your handling code here:
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost:3306/captchdb";
            
            //  Database credentials
            String USER = "root";
            String PASS = "";
            
            Connection conn = null;
            PreparedStatement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.prepareStatement("INSERT INTO animaltbl(userid,passwd) VALUES(?,?)");
            stmt.setString(1,usr);
            stmt.setString(2,strpass);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "New User Added");
            txtusrname.setText("");
           strpass="";
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClickTextOptionForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClickTextOptionForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsavepassActionPerformed

    private void btndispwigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndispwigActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            BufferedImage imga = null;
            BufferedImage imgb = null;
            BufferedImage imgc = null;
            BufferedImage imgd = null;
            BufferedImage imge = null;
            BufferedImage imgf = null;

            imga = ImageIO.read(getClass().getResource("/animals/001.png"));
            imgb = ImageIO.read(getClass().getResource("/animals/002.png"));
            imgc = ImageIO.read(getClass().getResource("/animals/003.png"));
            imgd = ImageIO.read(getClass().getResource("/animals/004.png"));
            imge = ImageIO.read(getClass().getResource("/animals/005.png"));
            imgf = ImageIO.read(getClass().getResource("/animals/006.png"));

            lcnv.getGraphics().drawImage(imga, 10,10, null);
            lcnv.getGraphics().drawImage(imgb, 80,120, null);
            lcnv.getGraphics().drawImage(imgc, 200,30, null);
            lcnv.getGraphics().drawImage(imgd, 20,240, null);
            lcnv.getGraphics().drawImage(imge, 180,120, null);
            lcnv.getGraphics().drawImage(imgf, 300,160, null);

            if(lcnv.getGraphics()!=null){
                System.out.println("context is not null");
            }
            else
            {
                System.out.println("context is null");
            }
            
            
           Object data[][] = { {"91","72","39","95","5","53"},
                               {"18","49","96","18","38","96"},
                               {"94","18","89","59","43","1"},
                               {"82","59","30","61","18","39"},
                               {"53","22","69","73","21","87"},
                               {"1","34","21","1","50","16"},
                        };
           
            String col[] = { "Name", "Capital", "TX", "Name", "Capital", "TX" };
            
            DefaultTableModel model = new DefaultTableModel(data,col);
            
            
            ltbl.setModel(model);
            
        } catch (IOException ex) {
            Logger.getLogger(AnimalOption.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_btndispwigActionPerformed

    private void lcnvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lcnvMouseClicked
        // TODO add your handling code here:
         int x=MouseInfo.getPointerInfo().getLocation().x-lcnv.getLocationOnScreen().x;
        int y=MouseInfo.getPointerInfo().getLocation().y-lcnv.getLocationOnScreen().y;
        
         if(x>=10 && x<58 && y>=10 && y<58) {
         ltrpass=ltrpass+"Rabbit";
        }
        if(x>=80 && x<128 && y>=120 && y<168) {
         ltrpass=ltrpass+"Hippo";
        }
        if(x>=200 && x<248 && y>=30 && y<78) {
         ltrpass=ltrpass+"Cheetah";
        }
        if(x>=20 && x<68 && y>=240 && y<288) {
        ltrpass=ltrpass+"Zebra";
        }
        
        if(x>=180 && x<228 && y>=120 && y<168) {
        ltrpass=ltrpass+"Horse";
        }
        if(x>=300 && x<348 && y>=160 && y<208) {
        ltrpass=ltrpass+"Dog";
        }
        
        System.out.println(ltrpass);
        
    }//GEN-LAST:event_lcnvMouseClicked

    private void btnlogindsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogindsActionPerformed
        // TODO add your handling code here:
         String usr=txtusrne.getText();
        try {
            // TODO add your handling code here:
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost:3306/captchdb";
            
            //  Database credentials
            String USER = "root";
            String PASS = "";
            
            Connection conn = null;
            PreparedStatement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.prepareStatement("SELECT * FROM animaltbl WHERE userid=? AND passwd=?");
            stmt.setString(1,usr);
            stmt.setString(2,ltrpass);
            ResultSet rs=stmt.executeQuery();
            int ix=0;
            while(rs.next()){
             ix=ix+1;
            }
            if(ix>0) {
            JOptionPane.showMessageDialog(null, "Login Successful");
            txtusrne.setText("");
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Login Failed");
            }
           ltrpass="";
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClickTextOptionForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClickTextOptionForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnlogindsActionPerformed

    private void ltblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltblMouseClicked
        // TODO add your handling code here:
         int x=ltbl.rowAtPoint(evt.getPoint());
        int y=ltbl.columnAtPoint(evt.getPoint());
        ltrpass=ltrpass+ltbl.getValueAt(x,y).toString();
        System.out.println(ltrpass);
    }//GEN-LAST:event_ltblMouseClicked

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
            java.util.logging.Logger.getLogger(AnimalOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimalOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimalOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimalOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimalOption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas bcnv;
    private javax.swing.JButton btndispwig;
    private javax.swing.JButton btnloginds;
    private javax.swing.JButton btnsavepass;
    private javax.swing.JButton btnstartpassset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Canvas lcnv;
    private javax.swing.JTable ltbl;
    private javax.swing.JTable tblnumz;
    private javax.swing.JTextField txtusrname;
    private javax.swing.JTextField txtusrne;
    // End of variables declaration//GEN-END:variables
}

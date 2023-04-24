/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.SettingController;
import Model.Person.Staff;

import javax.swing.*;
import java.io.IOException;

/**
 *
 * @author quang
 */
public class MenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    SettingController settingController;
    public MenuFrame() {
        initComponents();
        settingController = new SettingController();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        customerButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        productButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        orderButton = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        staffButton = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        settingButton = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 153, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(900, 200));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\quang\\OneDrive\\Documents\\NetBeansProjects\\test\\src\\main\\java\\images\\icons8_close_30px_3.png")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\quang\\OneDrive\\Documents\\NetBeansProjects\\test\\src\\main\\java\\images\\logo_big.png")); // NOI18N

        jLabel14.setBackground(new java.awt.Color(51, 54, 82));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 54, 82));
        jLabel14.setText("Welcome,...");

        kButton1.setText("Logout");
        kButton1.setkBackGroundColor(new java.awt.Color(255, 0, 0));
        kButton1.setkEndColor(new java.awt.Color(153, 255, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 51, 0));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 51, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
                kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                                .addGap(388, 388, 388)
                                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
                kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(jLabel2))
                                                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel8)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        customerButton.setMaximumSize(new java.awt.Dimension(100, 100));
        customerButton.setPreferredSize(new java.awt.Dimension(100, 100));
        customerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerButtonMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\quang\\OneDrive\\Documents\\NetBeansProjects\\test\\src\\main\\java\\images\\icons8_user_male_60px.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 149, 237));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER");

        javax.swing.GroupLayout customerButtonLayout = new javax.swing.GroupLayout(customerButton);
        customerButton.setLayout(customerButtonLayout);
        customerButtonLayout.setHorizontalGroup(
                customerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerButtonLayout.createSequentialGroup()
                                .addContainerGap(21, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(19, 19, 19))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        customerButtonLayout.setVerticalGroup(
                customerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(customerButtonLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productButton.setPreferredSize(new java.awt.Dimension(100, 105));
        productButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productButtonMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\quang\\OneDrive\\Documents\\NetBeansProjects\\test\\src\\main\\java\\images\\icons8_product_64px.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(23, 149, 237));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PRODUCT");

        javax.swing.GroupLayout productButtonLayout = new javax.swing.GroupLayout(productButton);
        productButton.setLayout(productButtonLayout);
        productButtonLayout.setHorizontalGroup(
                productButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(productButtonLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        productButtonLayout.setVerticalGroup(
                productButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(productButtonLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        orderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orderButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                orderButtonMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(23, 149, 237));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ORDER");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\quang\\OneDrive\\Documents\\NetBeansProjects\\test\\src\\main\\java\\images\\icons8_order_history_50px_1.png")); // NOI18N
        jLabel9.setToolTipText("");

        javax.swing.GroupLayout orderButtonLayout = new javax.swing.GroupLayout(orderButton);
        orderButton.setLayout(orderButtonLayout);
        orderButtonLayout.setHorizontalGroup(
                orderButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(orderButtonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(orderButtonLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel9)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        orderButtonLayout.setVerticalGroup(
                orderButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderButtonLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        staffButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                staffButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                staffButtonMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(23, 149, 237));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("STAFF");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\quang\\OneDrive\\Documents\\NetBeansProjects\\test\\src\\main\\java\\images\\icons8_submit_resume_64px.png")); // NOI18N

        javax.swing.GroupLayout staffButtonLayout = new javax.swing.GroupLayout(staffButton);
        staffButton.setLayout(staffButtonLayout);
        staffButtonLayout.setHorizontalGroup(
                staffButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(staffButtonLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel6)
                                .addContainerGap(19, Short.MAX_VALUE))
        );
        staffButtonLayout.setVerticalGroup(
                staffButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffButtonLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        settingButton.setPreferredSize(new java.awt.Dimension(100, 105));
        settingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingButtonMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(23, 149, 237));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SETTING");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\quang\\OneDrive\\Documents\\NetBeansProjects\\test\\src\\main\\java\\images\\icons8_Settings_64px.png")); // NOI18N

        javax.swing.GroupLayout settingButtonLayout = new javax.swing.GroupLayout(settingButton);
        settingButton.setLayout(settingButtonLayout);
        settingButtonLayout.setHorizontalGroup(
                settingButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(settingButtonLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel12)
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        settingButtonLayout.setVerticalGroup(
                settingButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingButtonLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(productButton, 98, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(staffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(settingButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(productButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(customerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(staffButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(settingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(orderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        System.exit(0);
    }

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        System.exit(0);
    }

    private void customerButtonMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        setColor(customerButton);
    }

    private void customerButtonMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        resetColor(customerButton);
    }

    private void productButtonMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        setColor(productButton);
    }

    private void productButtonMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        resetColor(productButton);
    }

    private void orderButtonMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        setColor(orderButton);
    }

    private void orderButtonMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        resetColor(orderButton);
    }

    private void staffButtonMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        setColor(staffButton);
    }

    private void staffButtonMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        resetColor(staffButton);
    }

    private void settingButtonMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        setColor(settingButton);
    }

    private void settingButtonMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        resetColor(settingButton);
    }

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }

    private void customerButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            if (settingController.checkVerifyProfile())
            {
                new StaffFrame(1).setVisible(true);
                this.dispose();
            } else {
                showMessage("You must setting your profile first!");

            }
        } catch (IOException e) {
            showMessage(e.getMessage());
        } catch (ClassNotFoundException e) {
            showMessage(e.getMessage());
        }

    }

    private void productButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            if (settingController.checkVerifyProfile())
            {
                new StaffFrame(2).setVisible(true);
                this.dispose();
            } else {
                showMessage("You must setting your profile first!");

            }
        } catch (IOException e) {
            showMessage(e.getMessage());
        } catch (ClassNotFoundException e) {
            showMessage(e.getMessage());
        }
    }

    private void orderButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            if (settingController.checkVerifyProfile())
            {
                new StaffFrame(3).setVisible(true);
                this.dispose();
            } else {
                showMessage("You must setting your profile first!");

            }
        } catch (IOException e) {
            showMessage(e.getMessage());
        } catch (ClassNotFoundException e) {
            showMessage(e.getMessage());
        }
    }

    private void staffButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            if (settingController.checkVerifyProfile())
            {
                Staff staff = (Staff) settingController.readProfile();
                if (staff.getRole().equals("ADMIN")) {
                    new StaffFrame(4).setVisible(true);
                    this.dispose();
                } else showMessage("This Panel for Admin Only!");
            } else {
                showMessage("You must setting your profile first!");

            }
        } catch (IOException e) {
            showMessage(e.getMessage());
        } catch (ClassNotFoundException e) {
            showMessage(e.getMessage());
        }
    }

    private void settingButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        new StaffFrame(5).setVisible(true);
        this.dispose();
    }

    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(102, 255, 255));
    }

    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(240,240,240));
    }

    void showMessage(String msg){
        JOptionPane.showMessageDialog(rootPane, msg);
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
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify
    private javax.swing.JPanel customerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel orderButton;
    private javax.swing.JPanel productButton;
    private javax.swing.JPanel settingButton;
    private javax.swing.JPanel staffButton;
    // End of variables declaration
}

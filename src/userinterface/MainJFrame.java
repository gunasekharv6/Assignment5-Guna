/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Area.AreaNetwork;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.JpanelNavigator;


import Business.Restaurant.Restaurant;
import Business.SysAdmin.SysAdmin;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userNameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(logoutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addGap(26, 26, 26)
                            .addComponent(loginJLabel)))
                    .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginJButton)
                .addGap(34, 34, 34)
                .addComponent(logoutJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginJLabel)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        String userName = userNameJTextField.getText();
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        UserAccount loggedInUser = null;
        
        // System Admin Login flow
        
        if(!system.getSysAdminDirectory().getSysAdmins().isEmpty()){
            
            SysAdmin sysadmin = system.getSysAdminDirectory().isUserSysAdmin(userName, password);
//            System.out.println("Inside loginbutton "+sysadmin);
            if(sysadmin!=null){
                loggedInUser = sysadmin.getUserAccount();
                CardLayout layout=(CardLayout)container.getLayout();
                container.add("adminMainPanel", JpanelNavigator.getMasterPanel(container,system,loggedInUser));
                layout.next(container);
                resetFields();
                return ;
            }
        }
        
        // Restaurant Manager flow 
        
        if(loggedInUser==null) {
            
            if(!system.getAreaNetworks().isEmpty()){
                for(AreaNetwork areaNetwork:system.getAreaNetworks()){
                    
                    if(!areaNetwork.getRestaurantDirectory().getRestaurants().isEmpty()){
                        
                        for(Restaurant restaurant:areaNetwork.getRestaurantDirectory().getRestaurants()){
                            
                            for(Employee restaurantEmployee:restaurant.getEmployeeDirectory().getEmployeeList()){
                                
//                                System.out.println("Inside MainJFrame - Employee restaurantEmployee "+restaurant.getEmployeeDirectory().getEmployeeList().get(0).getUseraccount().getUserName());
                                
                                if(restaurantEmployee.getUseraccount().getUserName().equals(userName) && restaurantEmployee.getUseraccount().getPassword().equals(password)){
                                    loggedInUser = restaurantEmployee.getUseraccount();
                                    CardLayout layout=(CardLayout)container.getLayout();
                                    container.add("restaurantMainPanel", JpanelNavigator.getRestaurantManagerPanel(container,system,loggedInUser,restaurant,areaNetwork));
                                    layout.next(container);
                                    resetFields();
                                    return ;
                                }
                                
                            }
                            
                        }
                    }
                    
                }
            }
            
        }
        
        // Customer login Flow
        if(loggedInUser==null){
            
            if(!system.getCustomerDirectory().getCustomers().isEmpty()){
                
                for(Customer customer:system.getCustomerDirectory().getCustomers()){
                    if(customer.getUseraccount().getUserName().equals(userName) && customer.getUseraccount().getPassword().equals(password)){
                        loggedInUser = customer.getUseraccount();
                        CardLayout layout = (CardLayout) container.getLayout();
                        container.add("CustomerMainPanel",JpanelNavigator.getCustomerAreaPanel(container, system, loggedInUser));
                        layout.next(container);
                        resetFields();
                        return;
                    }
                }
            }
        }
        
        // Delivery Person flow
        if(loggedInUser == null) {           
            if(!system.getAreaNetworks().isEmpty()){
                for(AreaNetwork areaNetwork:system.getAreaNetworks()){
                    for(DeliveryMan deliveryMan : areaNetwork.getDeliveryManDirectory().getDeliveryMan()) {
                        if(deliveryMan.getUseraccount().getUserName().equalsIgnoreCase(userName) && deliveryMan.getUseraccount().getPassword().equalsIgnoreCase(password)){
                            loggedInUser = deliveryMan.getUseraccount();
                            CardLayout layout = (CardLayout) container.getLayout();
                            container.add("DeliveryMainPanel", JpanelNavigator.getDeliveryManMainPanel(container, system, areaNetwork, loggedInUser));
                            layout.next(container);
                            resetFields();
                            return;
                            
                        }
                    }
                }
            }           
        }
        
        if(loggedInUser == null){
            JOptionPane.showMessageDialog(this, "!Error!\nPlease verify the Credentials");
            return;
        }
       
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void resetFields() {
        
        userNameJTextField.setText("");
        userNameJTextField.setEnabled(false);
        passwordField.setText("");
        passwordField.setEnabled(false);
        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        
    }
    
    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}

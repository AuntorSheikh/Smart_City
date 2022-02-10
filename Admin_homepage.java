package admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Admin_homepage extends javax.swing.JFrame {

    /**
     * Creates new form Admin_homepage
     */
    public Admin_homepage() {
       initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn01 = new java.awt.Button();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel5 = new java.awt.Panel();
        label5 = new java.awt.Label();
        sname = new java.awt.TextField();
        label6 = new java.awt.Label();
        sphoneno = new java.awt.TextField();
        label9 = new java.awt.Label();
        suaid = new java.awt.TextField();
        label11 = new java.awt.Label();
        superbtn = new javax.swing.JButton();
        label20 = new java.awt.Label();
        sexperience = new javax.swing.JComboBox<>();
        sgender = new javax.swing.JComboBox<>();
        panel6 = new java.awt.Panel();
        label12 = new java.awt.Label();
        name = new java.awt.TextField();
        label13 = new java.awt.Label();
        phoneno = new java.awt.TextField();
        label16 = new java.awt.Label();
        label17 = new java.awt.Label();
        said = new java.awt.TextField();
        subbtn = new javax.swing.JButton();
        gender = new javax.swing.JComboBox<>();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(153, 153, 255));

        panel2.setBackground(new java.awt.Color(0, 204, 204));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label1.setText("SmartCity");

        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setText("Bangladesh");

       

        btn01.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn01.setLabel("Back");
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(369, 369, 369)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(526, 526, 526))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        panel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        label5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label5.setText("Name");

        sname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label6.setText("Phone No.");

        sphoneno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        label9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label9.setText("Super admin ID");

        suaid.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        suaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaidActionPerformed(evt);
            }
        });

        label11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label11.setText("Gender");

        superbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        superbtn.setText("Save");
        superbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superbtnActionPerformed(evt);
            }
        });

        label20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label20.setText("Experience");

        sexperience.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sexperience.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        sgender.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        sgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "male", "female" }));

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(superbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 177, Short.MAX_VALUE))
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(label20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sexperience, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaid, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sphoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sgender, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(suaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(sphoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(sexperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132)
                .addComponent(superbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Super Admin", panel5);

        label12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label12.setText("Name");

        name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        label13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label13.setText("Phone No.");

        phoneno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        label16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label16.setText("Gender");

        label17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label17.setText("Sub Admin ID");

        said.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        subbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subbtn.setText("Save");
        subbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subbtnActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "male", "female" }));

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(subbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(said, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(said, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(subbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );

        label17.getAccessibleContext().setAccessibleName("sub admin ID");

        jTabbedPane1.addTab("Sub Admin", panel6);

        button2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button2.setLabel("Sub Admin");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button3.setLabel("Super Admin");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        // TODO add your handling code here:
        HomePage ob=new HomePage();
        ob.setVisible(true);
        ob.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn01ActionPerformed

    private Connection superbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superbtnActionPerformed
        // TODO add your handling code here:
        String g=(String)sgender.getSelectedItem();
        String exp=(String)sexperience.getSelectedItem();
        int e=Integer.parseInt(exp);
       super_admin sa= new super_admin(sname.getText(),sphoneno.getText(),g,suaid.getText(),e);
       Connection conn = null;
        Statement stmt = null; 
        try {
            
             conn = DriverManager.getConnection("jdbc:mysql://localhost/smartcity","root","");
             conn.setAutoCommit(false); 
             System.out.println("Connection to SQLite has been established.");
             stmt = conn.createStatement();
             String sql = "INSERT INTO superadmin values('"+sa.getid()+"','"+sa.getname()+"','"+sa.getphoneNo()+"',"+sa.getexperience()+",'"+sa.getgender()+"')";         
             int rs=stmt.executeUpdate(sql); 
             if(rs==1){
                     JOptionPane.showMessageDialog(null,"Successfully input Profile Data");
                     suaid.setText("");
                     sname.setText("");
                     sphoneno.setText("");
                     sexperience.setSelectedItem("Select Year");
                     sgender.setSelectedItem("Select Gender");
                     
             }
             else{
               JOptionPane.showMessageDialog(null,"Could not input profile Data");
             }
            stmt.close();          
            conn.commit();          
            conn.close(); 
            return conn;
        } catch (SQLException ex) {
            //Logger.getLogger(super_admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Fillup The Form");
        }
        return null;
          
    }//GEN-LAST:event_superbtnActionPerformed

    private Connection subbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subbtnActionPerformed
        // TODO add your handling code here:
        
        String g=(String)gender.getSelectedItem();
       sub_admin sa= new sub_admin(name.getText(),phoneno.getText(),g,said.getText());
       Connection conn = null;
        Statement stmt = null; 
        try {
           
             conn = DriverManager.getConnection("jdbc:mysql://localhost/smartcity","root","");
             conn.setAutoCommit(false); 
             System.out.println("Connection to SQLite has been established.");
             stmt = conn.createStatement();
             String sql = "INSERT INTO subadmin values('"+sa.getid()+"','"+sa.getname()+"','"+sa.getphoneNo()+"','"+sa.getgender()+"')";         
             int rs=stmt.executeUpdate(sql); 
             if(rs==1){
                     JOptionPane.showMessageDialog(null,"Successfully input Profile Data");
                     said.setText(" 123");
                     name.setText("Auntor");
                     phoneno.setText("");
                     gender.setSelectedItem("Select Gender");
                     
             }
             else{
               JOptionPane.showMessageDialog(null,"Could not input profile Data");
             }
            stmt.close();          
            conn.commit();          
            conn.close(); 
            return conn;
        } catch (SQLException ex) {
           // Logger.getLogger(super_admin.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Fillup The Form");
        }
        return null;
       
       
    }//GEN-LAST:event_subbtnActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        super_admin_page sap = new super_admin_page();
        sap.setVisible(true);
        sap.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        sub_admin_page sp = new sub_admin_page();
        sp.setVisible(true);
        sp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void suaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suaidActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn01;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label2;
    private java.awt.Label label20;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label9;
    private java.awt.TextField name;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private java.awt.TextField phoneno;
    private java.awt.TextField said;
    private javax.swing.JComboBox<String> sexperience;
    private javax.swing.JComboBox<String> sgender;
    private java.awt.TextField sname;
    private java.awt.TextField sphoneno;
    private java.awt.TextField suaid;
    private javax.swing.JButton subbtn;
    private javax.swing.JButton superbtn;
    // End of variables declaration//GEN-END:variables
}

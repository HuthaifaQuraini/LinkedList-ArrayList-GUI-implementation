/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Code_97.ArrayList;
import Code_97.LinkedList;

/**
 *
 * @author Huthaifa Quraini
 */
public class List extends javax.swing.JFrame {

    
    ArrayList list = new ArrayList();
    LinkedList linkedList = new LinkedList();

    public List() {
        initComponents();
        this.setSize(700,640);
        this.setLocationRelativeTo(null);
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lbl_head = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_value = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_addFirst = new javax.swing.JButton();
        btn_addLast = new javax.swing.JButton();
        btn_removeFirst = new javax.swing.JButton();
        btn_GetValue = new javax.swing.JButton();
        btn_GetIndex = new javax.swing.JButton();
        btn_RemoveByIndex = new javax.swing.JButton();
        btn_addByIndex = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_Index = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_result = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Rbtn_ArrayList = new javax.swing.JRadioButton();
        Rbtn_LinkedList = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArrayList-LinkedList");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        lbl_head.setBackground(new java.awt.Color(253, 138, 2));
        lbl_head.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lbl_head.setForeground(new java.awt.Color(242, 238, 238));
        lbl_head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_head.setText("ArrayList-LinkedList");
        lbl_head.setOpaque(true);
        jPanel2.add(lbl_head);
        lbl_head.setBounds(0, 0, 700, 125);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Value :");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 230, 62, 24);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Index : ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(330, 230, 66, 24);

        txt_value.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jPanel2.add(txt_value);
        txt_value.setBounds(130, 220, 190, 40);

        jButton1.setBackground(new java.awt.Color(242, 241, 240));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("Remove Last");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(510, 300, 150, 60);

        btn_addFirst.setBackground(new java.awt.Color(242, 241, 240));
        btn_addFirst.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_addFirst.setText("Add First");
        btn_addFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addFirstActionPerformed(evt);
            }
        });
        jPanel2.add(btn_addFirst);
        btn_addFirst.setBounds(30, 300, 150, 60);

        btn_addLast.setBackground(new java.awt.Color(242, 241, 240));
        btn_addLast.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_addLast.setText("Add Last");
        btn_addLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addLastActionPerformed(evt);
            }
        });
        jPanel2.add(btn_addLast);
        btn_addLast.setBounds(180, 300, 180, 60);

        btn_removeFirst.setBackground(new java.awt.Color(242, 241, 240));
        btn_removeFirst.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_removeFirst.setText("Remove First");
        btn_removeFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeFirstActionPerformed(evt);
            }
        });
        jPanel2.add(btn_removeFirst);
        btn_removeFirst.setBounds(360, 300, 150, 60);

        btn_GetValue.setBackground(new java.awt.Color(242, 241, 240));
        btn_GetValue.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_GetValue.setText("Get Value");
        btn_GetValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GetValueActionPerformed(evt);
            }
        });
        jPanel2.add(btn_GetValue);
        btn_GetValue.setBounds(510, 360, 150, 60);

        btn_GetIndex.setBackground(new java.awt.Color(242, 241, 240));
        btn_GetIndex.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_GetIndex.setText(" Get Index");
        btn_GetIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GetIndexActionPerformed(evt);
            }
        });
        jPanel2.add(btn_GetIndex);
        btn_GetIndex.setBounds(360, 360, 150, 60);

        btn_RemoveByIndex.setBackground(new java.awt.Color(242, 241, 240));
        btn_RemoveByIndex.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_RemoveByIndex.setText("Remove ByIndex");
        btn_RemoveByIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoveByIndexActionPerformed(evt);
            }
        });
        jPanel2.add(btn_RemoveByIndex);
        btn_RemoveByIndex.setBounds(180, 360, 180, 60);

        btn_addByIndex.setBackground(new java.awt.Color(242, 241, 240));
        btn_addByIndex.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_addByIndex.setText("Add By Index");
        btn_addByIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addByIndexActionPerformed(evt);
            }
        });
        jPanel2.add(btn_addByIndex);
        btn_addByIndex.setBounds(30, 360, 150, 60);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setText("List is :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(80, 440, 84, 32);

        txt_Index.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jPanel2.add(txt_Index);
        txt_Index.setBounds(420, 220, 190, 40);

        txt_result.setColumns(20);
        txt_result.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txt_result.setRows(5);
        jScrollPane1.setViewportView(txt_result);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(80, 480, 560, 107);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "List type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel1.setLayout(null);

        buttonGroup1.add(Rbtn_ArrayList);
        Rbtn_ArrayList.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        Rbtn_ArrayList.setSelected(true);
        Rbtn_ArrayList.setText("ArrayList");
        jPanel1.add(Rbtn_ArrayList);
        Rbtn_ArrayList.setBounds(40, 20, 130, 40);

        buttonGroup1.add(Rbtn_LinkedList);
        Rbtn_LinkedList.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        Rbtn_LinkedList.setText("LinkedList");
        jPanel1.add(Rbtn_LinkedList);
        Rbtn_LinkedList.setBounds(440, 20, 130, 40);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(40, 130, 620, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 700, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addFirstActionPerformed
        if(txt_value.getText().trim().equals(""))
            txt_result.append("Please enter valid value\n");
        else{
            if(Rbtn_ArrayList.isSelected()){
                list.addFirst(Integer.parseInt(txt_value.getText().trim()));
                txt_result.append("ArrayList : "+list.toString()+"\n");
                txt_value.setText("");
                
            }
            else{
                linkedList.addFirst(Integer.parseInt(txt_value.getText().trim()));
                txt_result.append("LinkedList : "+linkedList.toString()+"\n");
                txt_value.setText("");
            
            }
        }
    }//GEN-LAST:event_btn_addFirstActionPerformed

    private void btn_addLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addLastActionPerformed
        if(txt_value.getText().trim().equals(""))
            txt_result.append("Please enter valid value\n");
        else{
            if(Rbtn_ArrayList.isSelected()){
                list.add(Integer.parseInt(txt_value.getText().trim()));
                txt_result.append("ArrayList : "+list.toString()+"\n");
                txt_value.setText("");
                
            }
            else{
                linkedList.addLast(Integer.parseInt(txt_value.getText().trim()));
                txt_result.append("LinkedList : "+linkedList.toString()+"\n");
                txt_value.setText("");
            
            }
        }
    }//GEN-LAST:event_btn_addLastActionPerformed

    private void btn_removeFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeFirstActionPerformed
        
            if(Rbtn_ArrayList.isSelected()){
                list.removeFirst();
                txt_result.append("ArrayList : "+list.toString()+"\n");
                txt_value.setText("");
                
            }
            else{
                linkedList.removefirst();
                txt_result.append("LinkedList : "+linkedList.toString()+"\n");
                txt_value.setText("");
            
            }
        
    }//GEN-LAST:event_btn_removeFirstActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if(Rbtn_ArrayList.isSelected()){
                list.removeLast();
                txt_result.append("ArrayList : "+list.toString()+"\n");
                txt_value.setText("");
                txt_Index.setText("");
                
                
            }
            else{
                linkedList.removeLast();
                txt_result.append("LinkedList : "+linkedList.toString()+"\n");
                txt_value.setText("");
                txt_Index.setText("");
                
            
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_addByIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addByIndexActionPerformed
        if(txt_value.getText().trim().equals("")||txt_Index.getText().trim().equals(""))
            txt_result.append("Please enter valid value and index\n");
        else{
            if(Rbtn_ArrayList.isSelected()){
                list.addByIndex(Integer.parseInt(txt_value.getText().trim()),Integer.parseInt(txt_Index.getText().trim()));
                txt_result.append("ArrayList : "+list.toString()+"\n");
                txt_value.setText("");
                txt_Index.setText("");
                
            }
            else{
                linkedList.addByIndex(Integer.parseInt(txt_value.getText().trim()),Integer.parseInt(txt_Index.getText().trim()));
                txt_result.append("LinkedList : "+linkedList.toString()+"\n");
                txt_value.setText("");
                txt_Index.setText("");
            
            }
        }
    }//GEN-LAST:event_btn_addByIndexActionPerformed

    private void btn_RemoveByIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoveByIndexActionPerformed
        if(txt_Index.getText().trim().equals(""))
            txt_result.append("Please enter valid index\n");
        else{
        if(Rbtn_ArrayList.isSelected()){
                list.removeByIndex(Integer.parseInt(txt_Index.getText().trim()));
                txt_result.append("ArrayList : "+list.toString()+"\n");
                txt_value.setText("");
                
            }
            else{
                linkedList.removeByIndex(Integer.parseInt(txt_Index.getText().trim()));
                txt_result.append("LinkedList : "+linkedList.toString()+"\n");
                txt_value.setText("");
            
            }}
        
    }//GEN-LAST:event_btn_RemoveByIndexActionPerformed

    private void btn_GetIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GetIndexActionPerformed
       if(txt_value.getText().trim().equals(""))
            txt_result.append("Please enter valid value\n");
        else{
            if(Rbtn_ArrayList.isSelected()){
                int index=list.getIndex(Integer.parseInt(txt_value.getText().trim()));
                txt_result.append("ArrayList : "+index+"\n");
                txt_value.setText("");
                txt_Index.setText("");
                
            }
            else{
                int index=linkedList.getIndex(Integer.parseInt(txt_value.getText().trim()));
                txt_result.append("LinkedList : "+index+"\n");
                txt_value.setText("");
                txt_Index.setText("");
            
            }
        }
    }//GEN-LAST:event_btn_GetIndexActionPerformed

    private void btn_GetValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GetValueActionPerformed
      if(txt_Index.getText().trim().equals(""))
            txt_result.append("Please enter valid value\n");
        else{
            if(Rbtn_ArrayList.isSelected()){
                int val=list.get(Integer.parseInt(txt_Index.getText().trim()));
                txt_result.append("ArrayList : "+val+"\n");
                txt_value.setText("");
                
            }
            else{
                int val=linkedList.get(Integer.parseInt(txt_Index.getText().trim()));
                txt_result.append("LinkedList : "+val+"\n");
                txt_value.setText("");
            
            }
        }
    }//GEN-LAST:event_btn_GetValueActionPerformed

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
            java.util.logging.Logger.getLogger(List.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rbtn_ArrayList;
    private javax.swing.JRadioButton Rbtn_LinkedList;
    private javax.swing.JButton btn_GetIndex;
    private javax.swing.JButton btn_GetValue;
    private javax.swing.JButton btn_RemoveByIndex;
    private javax.swing.JButton btn_addByIndex;
    private javax.swing.JButton btn_addFirst;
    private javax.swing.JButton btn_addLast;
    private javax.swing.JButton btn_removeFirst;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_head;
    private javax.swing.JTextField txt_Index;
    private javax.swing.JTextArea txt_result;
    private javax.swing.JTextField txt_value;
    // End of variables declaration//GEN-END:variables
}

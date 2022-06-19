/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.MonHocController;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author YenLinh
 */
public class XoaMonHocJPanel extends javax.swing.JPanel {

    /**
     * Creates new form XoaMonHocJPanel
     */
    public XoaMonHocJPanel() {
        initComponents();
        setSize(622, 478);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_xoaMonHoc = new javax.swing.JButton();
        edt_tenMonHoc = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Mã môn học:");

        btn_xoaMonHoc.setText("Xóa môn học");
        btn_xoaMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaMonHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_xoaMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_tenMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edt_tenMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(btn_xoaMonHoc)
                .addContainerGap(231, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaMonHocActionPerformed
        if(edt_tenMonHoc.getText() != "") {
            boolean check = MonHocController.getInstance().xoaMonHoc(edt_tenMonHoc.getText());
            if(check) JOptionPane.showMessageDialog(this, "Xóa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src//images//icon_complete.png"));
            else JOptionPane.showMessageDialog(this, "Môn học không tồn tại hoặc Đã có sinh viên đăng kí!","Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else
            JOptionPane.showMessageDialog(this, "Chưa điền mã môn học!","Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btn_xoaMonHocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_xoaMonHoc;
    private javax.swing.JTextField edt_tenMonHoc;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
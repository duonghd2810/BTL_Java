/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.GiaoVienController;
import controllers.SinhVienController;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.GiaoVien;
import models.NewException;
import models.SinhVien;

/**
 *
 * @author VanTuan
 */
public class ThemTaiKhoanJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ThemTaiKhoanLayout
     */
    public ThemTaiKhoanJPanel() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioGiaoVien = new javax.swing.JRadioButton();
        jRadioSinhVien = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButtonNam = new javax.swing.JRadioButton();
        jRadioButtonNu = new javax.swing.JRadioButton();
        btn_them = new javax.swing.JButton();
        edt_taiKhoan = new javax.swing.JTextField();
        edt_matKhau = new javax.swing.JTextField();
        edt_xacNhanMatKhau = new javax.swing.JTextField();
        edt_hoTen = new javax.swing.JTextField();
        edt_soDT = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Loại tài khoản:");

        jRadioGiaoVien.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioGiaoVien);
        jRadioGiaoVien.setSelected(true);
        jRadioGiaoVien.setText("Giáo viên");
        jRadioGiaoVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGiaoVienActionPerformed(evt);
            }
        });

        jRadioSinhVien.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioSinhVien);
        jRadioSinhVien.setText("Sinh viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên tài khoản:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mật khẩu:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Xác nhận mật khẩu:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Họ tên:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Giới tính:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Số điện thoại:");

        jRadioButtonNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButtonNam);
        jRadioButtonNam.setSelected(true);
        jRadioButtonNam.setText("Nam");
        jRadioButtonNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNamActionPerformed(evt);
            }
        });

        jRadioButtonNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButtonNu);
        jRadioButtonNu.setText("Nữ");

        btn_them.setText("Thêm mới");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioGiaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jRadioSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonNam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonNu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edt_taiKhoan)
                    .addComponent(edt_matKhau)
                    .addComponent(edt_xacNhanMatKhau)
                    .addComponent(edt_hoTen)
                    .addComponent(edt_soDT, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioGiaoVien)
                    .addComponent(jRadioSinhVien))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edt_taiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edt_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edt_xacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(edt_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButtonNam)
                    .addComponent(jRadioButtonNu))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(edt_soDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btn_them)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        try {
            String tenTK = edt_taiKhoan.getText().trim();
            String matKhau = edt_matKhau.getText().trim();
            String xacNhanMatKhau = edt_xacNhanMatKhau.getText().trim();
            String hoTen = edt_hoTen.getText().trim();
            String gioiTinh = "Nam";
            if(jRadioButtonNu.isSelected())
            gioiTinh = "Nữ";
            String soDT = edt_soDT.getText();
            NewException.getInstance().checkThemTK(tenTK, matKhau, xacNhanMatKhau, hoTen, soDT);
            if(jRadioGiaoVien.isSelected()) {
                if(GiaoVienController.getInstance().kiemTraTenDangNhap(tenTK)) {
                    JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại!","Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    GiaoVien giaoVien = new GiaoVien(tenTK, hoTen, soDT, "Chưa cập nhật", gioiTinh, matKhau);
                    if(GiaoVienController.getInstance().themGiaoVien(giaoVien)) {
                        JOptionPane.showMessageDialog(this, "Tạo mới giáo viên thành công!","Thông báo", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src//images//icon_complete.png"));
                        clearData();
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Tao mới giáo viên không thành công!","Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            else {
                if(SinhVienController.getInstance().kiemTraTenDangNhap(tenTK)) {
                    JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại!","Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    SinhVien sinhVien = new SinhVien(tenTK, hoTen, "Chưa cập nhật", "Chưa cập nhật", gioiTinh, matKhau, soDT, "Chưa cập nhật");
                    if(SinhVienController.getInstance().themSinhVien(sinhVien)) {
                        JOptionPane.showMessageDialog(this, "Tạo mới sinh viên thành công!","Thông báo", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src//images//icon_complete.png"));
                        clearData();
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Tạo mới sinh viên không thành công!","Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void jRadioButtonNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonNamActionPerformed

    private void jRadioGiaoVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGiaoVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioGiaoVienActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_them;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField edt_hoTen;
    private javax.swing.JTextField edt_matKhau;
    private javax.swing.JTextField edt_soDT;
    private javax.swing.JTextField edt_taiKhoan;
    private javax.swing.JTextField edt_xacNhanMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonNam;
    private javax.swing.JRadioButton jRadioButtonNu;
    private javax.swing.JRadioButton jRadioGiaoVien;
    private javax.swing.JRadioButton jRadioSinhVien;
    // End of variables declaration//GEN-END:variables

    private void clearData() {
        edt_hoTen.setText("");
        edt_matKhau.setText("");
        edt_soDT.setText("");
        edt_taiKhoan.setText("");
        edt_xacNhanMatKhau.setText("");
        jRadioButtonNam.setSelected(true);
    }
}

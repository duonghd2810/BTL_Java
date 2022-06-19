/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.DanhSachMonHoc;
import models.Diem;
import models.SinhVien;

/**
 *
 * @author Administrator
 */
public class quan_ly_lop_hoc_phan extends javax.swing.JPanel {

    ArrayList<Diem> Diemlist=new ArrayList<>();
    ArrayList<DanhSachMonHoc> dsmh=new ArrayList<>();
    DefaultTableModel tbnModel= new DefaultTableModel();
    int selectedRow = -1;
    public quan_ly_lop_hoc_phan() {
        DangNhap dangNhap = new DangNhap();
        dangNhap.setVisible(true);
        this.setVisible(false);
    }
    
    public quan_ly_lop_hoc_phan(boolean dangNhap) {
        initComponents();
        setSize(544, 372);
        txtmamonhoc.setEditable(false);
        txtmasinhvien.setEditable(false);
        initTable();
        fillTable();
        getData();
    }
    
    //them
    public void getData() {
         FileInputStream fis=null;
        InputStreamReader reader=null;
        BufferedReader bufferedreader= null;
        try {
            fis=new FileInputStream("file//diem.txt");
            reader=new InputStreamReader(fis, StandardCharsets.UTF_8);
            bufferedreader=new BufferedReader(reader);
            String line=null;
            while(null!=(line=bufferedreader.readLine())){
                if(line.isEmpty()){
                    continue;

                }
                Diem diem=new Diem();
                diem.parse(line);
                Diemlist.add(diem);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(quan_ly_lop_hoc_phan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(quan_ly_lop_hoc_phan.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(quan_ly_lop_hoc_phan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(quan_ly_lop_hoc_phan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(bufferedreader!=null){
                try {
                    bufferedreader.close();
                } catch (IOException ex) {
                    Logger.getLogger(quan_ly_lop_hoc_phan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        fillTable();
    }
    
    public void fillTable(){
        tbnModel.setRowCount(0);
        for (Diem diem : Diemlist) {
            String tx1=null,tx2=null,tx3=null,gk=null,ck=null;
            if(diem.getDiemTX1() == 99){
                tx1 = "";
            }else {
                tx1 = String.valueOf(diem.getDiemTX1());
            }
            if(diem.getDiemTX2() == 99){
                tx2 = "";
            }else {
                tx2 = String.valueOf(diem.getDiemTX2());
            }
            if(diem.getDiemTX3() == 99){
                tx3= "";
            }else{
                tx3 = String.valueOf(diem.getDiemTX3());
            }
            if(diem.getDiemGK() == 99){
                gk= "";
            }else{
                gk = String.valueOf(diem.getDiemGK());
            }
            if(diem.getDiemCuoiKy() == 99){
                ck = "";
            }else {
                ck = String.valueOf(diem.getDiemCuoiKy());
            }
            diem.setdiem10();
            tbnModel.addRow(new String[]{diem.getMaMonHoc(),diem.getMaSinhVien(),""+tx1,""+tx2,""+tx3,""+gk,""+ck});
        }
        tbnModel.fireTableDataChanged();
    }
    
    public void initTable(){
        String[] columns= new String[]{"Mã môn học","Mã sinh viên","TX1","TX2","TX3","Giữa kỳ","Điểm thi"};
        tbnModel.setColumnIdentifiers(columns);
        tbnDiem.setModel(tbnModel);
    }
    public void clean(){
        txtDT.setText("");
        txtGK.setText("");
        txtTX1.setText("");
        txtTX2.setText("");
        txtTX3.setText("");
        txtmamonhoc.setText("");
        txtmasinhvien.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTX3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDT = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbnDiem = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtGK = new javax.swing.JTextField();
        btnxuatfile = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTX1 = new javax.swing.JTextField();
        txtmamonhoc = new javax.swing.JTextField();
        txtmasinhvien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTX2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnsua = new javax.swing.JButton();
        btnnhapmoi = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Quản lý lớp học phần"));

        jLabel1.setText("Quản lý điểm");

        jLabel7.setText("Thường xuyên 3");

        txtTX3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTX3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Điểm thi");

        txtDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDTActionPerformed(evt);
            }
        });

        tbnDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã môn học", "Mã sinh viên", "TX 1", "TX 2", "TX 3", "Giữa kỳ", "Điểm thi"
            }
        ));
        tbnDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbnDiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbnDiem);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel9.setText("Giữa kỳ");

        txtGK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGKActionPerformed(evt);
            }
        });

        btnxuatfile.setText("Xuất file");
        btnxuatfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxuatfileActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã sinh viên");

        txtTX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTX1ActionPerformed(evt);
            }
        });

        txtmamonhoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmamonhocActionPerformed(evt);
            }
        });

        txtmasinhvien.setName(""); // NOI18N
        txtmasinhvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmasinhvienActionPerformed(evt);
            }
        });

        jLabel2.setText("Thường xuyên 1");

        jLabel6.setText("Mã môn học");

        txtTX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTX2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Thường xuyên 2");

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnnhapmoi.setText("Nhập mới");
        btnnhapmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhapmoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmasinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTX1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtmamonhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTX2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(76, 76, 76)
                                .addComponent(txtGK, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30)
                                .addComponent(txtTX3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnsua)
                        .addGap(31, 31, 31)
                        .addComponent(btnnhapmoi)
                        .addGap(33, 33, 33)
                        .addComponent(btnxuatfile)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtmamonhoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtTX3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtmasinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtGK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsua)
                    .addComponent(btnnhapmoi)
                    .addComponent(btnxuatfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtmasinhvien.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTX2ActionPerformed

    }//GEN-LAST:event_txtTX2ActionPerformed

    private void txtmamonhocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmamonhocActionPerformed
        txtmamonhoc.setSize(40, 10);
    }//GEN-LAST:event_txtmamonhocActionPerformed

    private void txtTX3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTX3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTX3ActionPerformed

    private void txtDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDTActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        StringBuilder sb =new StringBuilder();
        int error=0;
        int error2=0;
        FileInputStream fis=null;
        InputStreamReader reader=null;
        BufferedReader bufferedreader= null;
        try {
            fis=new FileInputStream("file//danhSachMonHoc.txt");
            reader=new InputStreamReader(fis, StandardCharsets.UTF_8);
            bufferedreader=new BufferedReader(reader);
            String line=null;
            while(null!=(line=bufferedreader.readLine())){
                if(line.isEmpty()){
                    continue;

                }
                DanhSachMonHoc dsmha=new DanhSachMonHoc();
                dsmha.parse(line);
                dsmh.add(dsmha);
            }
                System.out.println(dsmh.size());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(quan_ly_lop_hoc_phan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(quan_ly_lop_hoc_phan.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(quan_ly_lop_hoc_phan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(quan_ly_lop_hoc_phan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(bufferedreader!=null){
                try {
                    bufferedreader.close();
                } catch (IOException ex) {
                    Logger.getLogger(quan_ly_lop_hoc_phan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        for (DanhSachMonHoc a : dsmh) {
            if(a.getMaMon().equals(txtmamonhoc.getText())&&a.getMaSV().equals(txtmasinhvien.getText())){
                error2=1;
            }
        }
        for (Diem diem : Diemlist) {
            if(diem.getMaMonHoc().equals(txtmamonhoc.getText())&&diem.getMaSinhVien().equals(txtmasinhvien.getText())){
                error=1;
            }
        }
        if(txtmamonhoc.getText().equals("")){
            sb.append("Mã môn học không được để trống\n");
        }
        if(txtmasinhvien.getText().equals("")){
            sb.append("Mã sinh viên không được để trống\n");
        }
        if(txtTX1.getText().equals("")){
            sb.append("Điểm TX 1 không được để trống\n");
        }
        if(txtTX2.getText().equals("")){
            sb.append("TX 2 không được để trống\n");
        }
        if(txtGK.getText().equals("")){
            sb.append("Giữa kỳ không được để trống\n");
        }
        if(txtDT.getText().equals("")){
            sb.append("Điểm thi không được để trống\n");
        }

        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "ERROT", JOptionPane.ERROR_MESSAGE);
            return ;
        }else if(txtTX3.getText().equals("")==false){
            int tx1;
                int tx2;
                int tx3;
                int gk;
                int dt;
            try {
                tx1=(int)Float.parseFloat(txtTX1.getText());
                tx2=(int)Float.parseFloat(txtTX2.getText());
                tx3=(int)Float.parseFloat(txtTX3.getText());
                gk=(int)Float.parseFloat(txtGK.getText());
                dt=(int)Float.parseFloat(txtDT.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Nhập đúng định dạng số", "ERROT", JOptionPane.ERROR_MESSAGE);
                return ;
            }
            if(tx1<0){
                sb.append("Yêu cầu nhập điểm tx1 lớn hơn 0");
            }
            if(tx2<0){
                sb.append("Yêu cầu nhập điểm tx2 lớn hơn 0");
            }
            if(tx3<0){
                sb.append("Yêu cầu nhập điểm tx3 lớn hơn 0");
            }
            if(gk<0){
                sb.append("Yêu cầu nhập điểm giữa kỳ lớn hơn 0");
            }
            if(dt<0){
                sb.append("Yêu cầu nhập điểm thi lớn hơn 0");
            }
            if(error2==0){
            sb.append("Sinh viên không học môn này");
            }
            if(sb.length()>0){
                JOptionPane.showMessageDialog(this, sb.toString(), "ERROT", JOptionPane.ERROR_MESSAGE);
                return ;
            }else{
                int choice=JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa điểm không", "Hỏi",JOptionPane.YES_NO_OPTION);
                if(choice==JOptionPane.NO_OPTION){
                    return;
                }
                for (Diem diem : Diemlist) {
                    if(diem.getMaMonHoc().equals(txtmamonhoc.getText())&&diem.getMaSinhVien().equals(txtmasinhvien.getText())){
                        diem.setMaMonHoc(txtmamonhoc.getText());
                        diem.setMaSinhVien(txtmasinhvien.getText());
                        diem.setDiemTX1(Float.parseFloat(txtTX1.getText()));
                        diem.setDiemTX2(Float.parseFloat(txtTX2.getText()));
                        diem.setDiemTX3(Float.parseFloat(txtTX3.getText()));
                        diem.setDiemGK(Float.parseFloat(txtGK.getText()));
                        diem.setDiemCuoiKy(Float.parseFloat(txtDT.getText()));
                        diem.setdiem10();
                        fillTable();
                        clean();
                    }
                }

            }
        }else{
            int tx1;
                int tx2;
                int tx3;
                int gk;
                int dt;
            try {
                tx1=(int)Float.parseFloat(txtTX1.getText());
                tx2=(int)Float.parseFloat(txtTX2.getText());
                tx3=(int)Float.parseFloat(txtTX3.getText());
                gk=(int)Float.parseFloat(txtGK.getText());
                dt=(int)Float.parseFloat(txtDT.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Nhập đúng định dạng số", "ERROT", JOptionPane.ERROR_MESSAGE);
                return ;
            }
            if(tx1<0){
                sb.append("Yêu cầu nhập điểm tx1 lớn hơn 0");
            }
            if(tx2<0){
                sb.append("Yêu cầu nhập điểm tx2 lớn hơn 0");
            }

            if(dt<0){
                sb.append("Yêu cầu nhập điểm thi lớn hơn 0");
            }
            if(sb.length()>0){
                JOptionPane.showMessageDialog(this, sb.toString(), "ERROT", JOptionPane.ERROR_MESSAGE);
                return ;
            }else{
                int choice=JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa điểm không", "Hỏi",JOptionPane.YES_NO_OPTION);
                if(choice==JOptionPane.NO_OPTION){
                    return;
                }
                for (Diem diem : Diemlist) {
                    if(diem.getMaMonHoc().equals(txtmamonhoc.getText())&&diem.getMaSinhVien().equals(txtmasinhvien.getText())){
                        diem.setMaMonHoc(txtmamonhoc.getText());
                        diem.setMaSinhVien(txtmasinhvien.getText());
                        diem.setDiemTX1(Float.parseFloat(txtTX1.getText()));
                        diem.setDiemTX2(Float.parseFloat(txtTX2.getText()));
                        diem.setDiemGK(Float.parseFloat(txtGK.getText()));
                        diem.setDiemCuoiKy(Float.parseFloat(txtDT.getText()));
                        diem.setdiem10();
                        fillTable();
                        clean();
                    }
                }

            }
        }

    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnnhapmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhapmoiActionPerformed
        clean();
    }//GEN-LAST:event_btnnhapmoiActionPerformed

    private void txtTX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTX1ActionPerformed

    }//GEN-LAST:event_txtTX1ActionPerformed

    private void txtGKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGKActionPerformed
        txtTX2.setSize(40,10);// TODO add your handling code here:
    }//GEN-LAST:event_txtGKActionPerformed

    private void txtmasinhvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmasinhvienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmasinhvienActionPerformed

    private void btnxuatfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxuatfileActionPerformed
        try(PrintWriter pw =new PrintWriter(new File("file//diem.txt"))) {
            int x=0;
            for(Diem s: Diemlist){
                if(x==0){
                    pw.print(s.toString());
                    x=1;
                }else{
                    pw.print(s.toString2());
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi ghi file");
        }
//        try {
//            File file = new File("file//diem.txt");
//            FileWriter fw = new FileWriter(file);
//            for (int i = 0 ; i < Diemlist.size() ; i++) {
//                if(i == Diemlist.size() - 1)
//                    fw.write(Diemlist.get(i).toString());
//                else    fw.write(Diemlist.get(i).toString2());
//            }
//            fw.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(quan_ly_lop_hoc_phan.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(quan_ly_lop_hoc_phan.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnxuatfileActionPerformed

    private void tbnDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnDiemMouseClicked
        selectedRow=tbnDiem.getSelectedRow();
        if(selectedRow>=0){
            String mamh=(String) tbnDiem.getValueAt(selectedRow, 0);
            String masv=(String) tbnDiem.getValueAt(selectedRow, 1);

            for (Diem diem : Diemlist) {
                if(mamh.equals(diem.getMaMonHoc())&&masv.equals(diem.getMaSinhVien())){
                    txtmamonhoc.setText(diem.getMaMonHoc());
                    txtmasinhvien.setText(diem.getMaSinhVien());
                    txtTX1.setText(""+diem.getDiemTX1());
                    txtTX2.setText(""+diem.getDiemTX2());
                    txtTX3.setText(""+diem.getDiemTX3());
                    txtGK.setText(""+diem.getDiemGK());
                    txtDT.setText(""+diem.getDiemCuoiKy());
                    break;
                }

            }
        }
    }//GEN-LAST:event_tbnDiemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnhapmoi;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnxuatfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbnDiem;
    private javax.swing.JTextField txtDT;
    private javax.swing.JTextField txtGK;
    private javax.swing.JTextField txtTX1;
    private javax.swing.JTextField txtTX2;
    private javax.swing.JTextField txtTX3;
    private javax.swing.JTextField txtmamonhoc;
    private javax.swing.JTextField txtmasinhvien;
    // End of variables declaration//GEN-END:variables
}

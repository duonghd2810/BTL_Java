/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.DiemController;
import controllers.MonHocController;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import models.Diem;
import models.MonHoc;
import models.SinhVien;

/**
 *
 * @author DELL
 */
public class DanhSachDiemSinhVienJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DanhSachDiem
     */
    ArrayList<Diem> ds = new ArrayList<>();
    public DefaultTableModel model = new DefaultTableModel();
    MonHoc mh = new MonHoc();
    public DanhSachDiemSinhVienJPanel() {
        initComponents();
        setSize(650,440);
    }
    public DanhSachDiemSinhVienJPanel(SinhVien sv){
        initComponents();
        setSize(650,440);
        String[] columns= new String[]{"Mã môn","Tên môn", "TX1", "TX2", "TX3", "Điểm GK","Điểm CK","Điểm hệ 10"};
        model.setColumnIdentifiers(columns);
        danhsachdiemsinhvien.setModel(model);
        danhsachdiemsinhvien.setEnabled(false);
        danhsachdiemsinhvien.setAutoCreateRowSorter(true);
        Diem diem = new Diem();
        ds = DiemController.getInstance().getData(sv);
        themData();
    }
    public void themData() {
        model.setRowCount(0);
        for (Diem diem : ds) {
            String tx1=null,tx2=null,tx3=null,gk=null,ck=null, diem10=null;
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
            if(diem.getdiem10() == 99)
                diem10="";
            else
                diem10 = String.valueOf(diem.getdiem10());
            mh = MonHocController.getInstance().getData(diem.getMaMonHoc());
            model.addRow(new String[] { diem.getMaMonHoc(),mh.getTenMonHoc(), tx1, tx2,tx3, gk, ck, diem10});
        }
        model.fireTableDataChanged();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        danhsachdiemsinhvien = new javax.swing.JTable();

        danhsachdiemsinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã môn", "Tên môn", "TX1", "TX2", "TX3", "Điểm GK", "Điểm CK", "Điểm CK(hệ 10)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(danhsachdiemsinhvien);
        if (danhsachdiemsinhvien.getColumnModel().getColumnCount() > 0) {
            danhsachdiemsinhvien.getColumnModel().getColumn(0).setResizable(false);
            danhsachdiemsinhvien.getColumnModel().getColumn(0).setPreferredWidth(50);
            danhsachdiemsinhvien.getColumnModel().getColumn(1).setResizable(false);
            danhsachdiemsinhvien.getColumnModel().getColumn(1).setPreferredWidth(200);
            danhsachdiemsinhvien.getColumnModel().getColumn(2).setResizable(false);
            danhsachdiemsinhvien.getColumnModel().getColumn(2).setPreferredWidth(50);
            danhsachdiemsinhvien.getColumnModel().getColumn(3).setResizable(false);
            danhsachdiemsinhvien.getColumnModel().getColumn(3).setPreferredWidth(50);
            danhsachdiemsinhvien.getColumnModel().getColumn(4).setResizable(false);
            danhsachdiemsinhvien.getColumnModel().getColumn(4).setPreferredWidth(50);
            danhsachdiemsinhvien.getColumnModel().getColumn(5).setResizable(false);
            danhsachdiemsinhvien.getColumnModel().getColumn(5).setPreferredWidth(70);
            danhsachdiemsinhvien.getColumnModel().getColumn(6).setResizable(false);
            danhsachdiemsinhvien.getColumnModel().getColumn(6).setPreferredWidth(70);
            danhsachdiemsinhvien.getColumnModel().getColumn(7).setResizable(false);
            danhsachdiemsinhvien.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable danhsachdiemsinhvien;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

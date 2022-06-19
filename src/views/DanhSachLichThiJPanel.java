/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.LichThiController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import models.LichThi;

/**
 *
 * @author VanTuan
 */
public class DanhSachLichThiJPanel extends javax.swing.JPanel {

    ArrayList<LichThi> dsLichThis = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    
    /**
     * Creates new form DanhSachLichThiJPanel
     */
    public DanhSachLichThiJPanel() {
        initComponents();
        setSize(600, 440);
        String[] columns= new String[]{"Mã lịch thi", "Thời gian thi", "Ca thi", "Địa điểm thi", "Mã môn học", "Số lượng thí sinh"};
        model.setColumnIdentifiers(columns);
        jTableDSLT.setModel(model);
        jTableDSLT.setEnabled(false);
        jTableDSLT.setAutoCreateRowSorter(true);
        dsLichThis = LichThiController.getInstance().getDanhSachLichThi();
        themData();
    }

    public void themData() {
        model.setRowCount(0);
        for (LichThi lichThi : dsLichThis) {
            model.addRow(new String[] { lichThi.getMaLichThi(), lichThi.getThoiGianThi(), lichThi.getCaThi(), lichThi.getDiaDiemThi(), lichThi.getMaMon(), lichThi.getSoLuongThiSinh() + "" });
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDSLT = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jTableDSLT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lịch thi", "Thời gian thi", "Ca thi", "Địa điểm thi", "Mã môn thi", "Số lượng thí sinh"
            }
        ));
        jScrollPane2.setViewportView(jTableDSLT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDSLT;
    // End of variables declaration//GEN-END:variables
}
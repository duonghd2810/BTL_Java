/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author VanTuan
 */
public class TrangChuAdmin extends javax.swing.JFrame {
    
    boolean dangNhap = false;
    
    //QLTK
    TrangChuiJPanel trangChuiJPanel1;
    ThemTaiKhoanJPanel themTaiKhoanJPanel;
    XoaTaiKhoanJPanel xoaTaiKhoanJPanel;
    
    //QLMH
    TrangChuiJPanel trangChuiJPanel2;
    ThemMonHocJPanel themMonHocJPanel;
    XoaMonHocJPanel xoaMonHocJPanel;
    DanhSachMonHocJPanel danhSachMonHocJPanel;
    
    //QLLT
    TrangChuiJPanel trangChuiJPanel3;
    TaoLichThiJPanel taoLichThiJPanel;
    DanhSachLichThiJPanel danhSachLichThiJPanel;
    
    //QLCN
    TrangChuiJPanel trangChuiJPanel4;
    CapNhatHocPhiJPanel capNhatHocPhiJPanel;
    DanhSachCongNoJPanel danhSachCongNoJPanel;
    
    //QLGV
    TrangChuiJPanel trangChuiJPanel5;
    ThemTaiKhoanJPanel themTaiKhoanGVJPanel;
    DanhSachGiaoVienJPanel danhSachGiaoVienJPanel;
    
    public TrangChuAdmin() {
        if(!this.dangNhap) {
            DangNhap dangNhap = new DangNhap();
            dangNhap.setVisible(true);
            this.setVisible(false);
        }
    }
    /**
     * Creates new form TrangChuAdmin
     */
    public TrangChuAdmin(boolean dangNhap) {
        this.dangNhap = dangNhap;
        initComponents();
        setResizable(false);
        setSize(780, 550);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        this.setLocation((screenWidth - this.getSize().width)/2, (screenHeight - this.getSize().height)/2);
        
        khoiTao();
    }
    
    private void khoiTao() {
        //QLTK
        trangChuiJPanel1 = new TrangChuiJPanel();
        jPanelQLTK.add(trangChuiJPanel1);
        
        //QLMH
        trangChuiJPanel2 = new TrangChuiJPanel();
        jPanelQLMH.add(trangChuiJPanel2);
        
        //QLLT
        trangChuiJPanel3 = new TrangChuiJPanel();
        jPanelQLLT.add(trangChuiJPanel3);
        
        //QLCN
        trangChuiJPanel4 = new TrangChuiJPanel();
        jPanelQLCN.add(trangChuiJPanel4);
        
        //QLGV
        trangChuiJPanel5 = new TrangChuiJPanel();
        jPanelQLGV.add(trangChuiJPanel5);
    } 
    
    public void hienThiQLTK(JPanel jPanel) {
        trangChuiJPanel1.setVisible(false);
        if(themTaiKhoanJPanel != null)
            themTaiKhoanJPanel.setVisible(false);
        if(xoaTaiKhoanJPanel != null)
            xoaTaiKhoanJPanel.setVisible(false);
        jPanel.setVisible(true);
    }
    
    public void hienThiQLMH(JPanel jPanel) {
        trangChuiJPanel2.setVisible(false);
        if(themMonHocJPanel != null)
            themMonHocJPanel.setVisible(false);
        if(xoaMonHocJPanel != null)
            xoaMonHocJPanel.setVisible(false);
        if(danhSachMonHocJPanel != null)
            danhSachMonHocJPanel.setVisible(false);
        jPanel.setVisible(true);
    }
    
    public void hienThiQLLT(JPanel jPanel) {
        trangChuiJPanel3.setVisible(false);
        if(taoLichThiJPanel != null)
            taoLichThiJPanel.setVisible(false);
        if(danhSachLichThiJPanel != null)
            danhSachLichThiJPanel.setVisible(false);
        jPanel.setVisible(true);
    }
    
    public void hienThiQLCN(JPanel jPanel) {
        trangChuiJPanel4.setVisible(false);
        if(capNhatHocPhiJPanel != null)
            capNhatHocPhiJPanel.setVisible(false);
        if(danhSachCongNoJPanel != null)
            danhSachCongNoJPanel.setVisible(false);
        jPanel.setVisible(true);
    }
    
    public void hienThiQLGV(JPanel jPanel) {
        trangChuiJPanel5.setVisible(false);
        if(danhSachGiaoVienJPanel != null)
            danhSachGiaoVienJPanel.setVisible(false);
        jPanel.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btn_themTaiKhoan = new javax.swing.JButton();
        btn_xoaTaiKhoan = new javax.swing.JButton();
        jPanelQLTK = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btn_taoLichThi = new javax.swing.JButton();
        btn_danhSachLichThi = new javax.swing.JButton();
        jPanelQLLT = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btn_danhSachGiaoVien = new javax.swing.JButton();
        jPanelQLGV = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanelQLMH = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btn_themMonHoc = new javax.swing.JButton();
        btn_xoaMonHoc = new javax.swing.JButton();
        btn_danhSachMonHoc = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btn_capNhatGiaTinChi = new javax.swing.JButton();
        btn_danhSachCongNo = new javax.swing.JButton();
        jPanelQLCN = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_dangXuat = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenu1.setText("jMenu1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setName(""); // NOI18N

        btn_themTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        btn_themTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_account_demo.png"))); // NOI18N
        btn_themTaiKhoan.setText("Thêm tài khoản");
        btn_themTaiKhoan.setAlignmentX(0.5F);
        btn_themTaiKhoan.setBorder(null);
        btn_themTaiKhoan.setBorderPainted(false);
        btn_themTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_themTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themTaiKhoanActionPerformed(evt);
            }
        });

        btn_xoaTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        btn_xoaTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del_account.png"))); // NOI18N
        btn_xoaTaiKhoan.setText("Xóa tài khoản");
        btn_xoaTaiKhoan.setAlignmentX(0.5F);
        btn_xoaTaiKhoan.setBorder(null);
        btn_xoaTaiKhoan.setBorderPainted(false);
        btn_xoaTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_xoaTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaTaiKhoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_themTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
            .addComponent(btn_xoaTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btn_themTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_xoaTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 396, Short.MAX_VALUE))
        );

        jPanelQLTK.setBackground(new java.awt.Color(255, 255, 255));
        jPanelQLTK.setPreferredSize(new java.awt.Dimension(622, 478));

        javax.swing.GroupLayout jPanelQLTKLayout = new javax.swing.GroupLayout(jPanelQLTK);
        jPanelQLTK.setLayout(jPanelQLTKLayout);
        jPanelQLTKLayout.setHorizontalGroup(
            jPanelQLTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        jPanelQLTKLayout.setVerticalGroup(
            jPanelQLTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelQLTK, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelQLTK, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý tài khoản", jPanel1);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_taoLichThi.setBackground(new java.awt.Color(255, 255, 255));
        btn_taoLichThi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sort.png"))); // NOI18N
        btn_taoLichThi.setText("Tạo lịch thi");
        btn_taoLichThi.setBorder(null);
        btn_taoLichThi.setBorderPainted(false);
        btn_taoLichThi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_taoLichThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taoLichThiActionPerformed(evt);
            }
        });

        btn_danhSachLichThi.setBackground(new java.awt.Color(255, 255, 255));
        btn_danhSachLichThi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list_subject.png"))); // NOI18N
        btn_danhSachLichThi.setText("Danh sách lịch thi");
        btn_danhSachLichThi.setBorder(null);
        btn_danhSachLichThi.setBorderPainted(false);
        btn_danhSachLichThi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_danhSachLichThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_danhSachLichThiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_taoLichThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_danhSachLichThi, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(btn_taoLichThi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_danhSachLichThi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 396, Short.MAX_VALUE))
        );

        jPanelQLLT.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelQLLTLayout = new javax.swing.GroupLayout(jPanelQLLT);
        jPanelQLLT.setLayout(jPanelQLLTLayout);
        jPanelQLLTLayout.setHorizontalGroup(
            jPanelQLLTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        jPanelQLLTLayout.setVerticalGroup(
            jPanelQLLTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelQLLT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelQLLT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý lịch thi", jPanel3);

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_danhSachGiaoVien.setBackground(new java.awt.Color(255, 255, 255));
        btn_danhSachGiaoVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list_subject.png"))); // NOI18N
        btn_danhSachGiaoVien.setText("Danh sách giáo viên");
        btn_danhSachGiaoVien.setBorder(null);
        btn_danhSachGiaoVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_danhSachGiaoVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_danhSachGiaoVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_danhSachGiaoVien, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(btn_danhSachGiaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 437, Short.MAX_VALUE))
        );

        jPanelQLGV.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelQLGVLayout = new javax.swing.GroupLayout(jPanelQLGV);
        jPanelQLGV.setLayout(jPanelQLGVLayout);
        jPanelQLGVLayout.setHorizontalGroup(
            jPanelQLGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        jPanelQLGVLayout.setVerticalGroup(
            jPanelQLGVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelQLGV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelQLGV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý giáo viên", jPanel5);

        jPanelQLMH.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelQLMHLayout = new javax.swing.GroupLayout(jPanelQLMH);
        jPanelQLMH.setLayout(jPanelQLMHLayout);
        jPanelQLMHLayout.setHorizontalGroup(
            jPanelQLMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        jPanelQLMHLayout.setVerticalGroup(
            jPanelQLMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_themMonHoc.setBackground(new java.awt.Color(255, 255, 255));
        btn_themMonHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_subject.png"))); // NOI18N
        btn_themMonHoc.setText("Thêm môn học");
        btn_themMonHoc.setBorder(null);
        btn_themMonHoc.setBorderPainted(false);
        btn_themMonHoc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_themMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themMonHocActionPerformed(evt);
            }
        });

        btn_xoaMonHoc.setBackground(new java.awt.Color(255, 255, 255));
        btn_xoaMonHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del_subject.png"))); // NOI18N
        btn_xoaMonHoc.setText("Xóa môn học");
        btn_xoaMonHoc.setBorder(null);
        btn_xoaMonHoc.setBorderPainted(false);
        btn_xoaMonHoc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_xoaMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaMonHocActionPerformed(evt);
            }
        });

        btn_danhSachMonHoc.setBackground(new java.awt.Color(255, 255, 255));
        btn_danhSachMonHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list_subject.png"))); // NOI18N
        btn_danhSachMonHoc.setText("Danh sách môn học");
        btn_danhSachMonHoc.setBorder(null);
        btn_danhSachMonHoc.setBorderPainted(false);
        btn_danhSachMonHoc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_danhSachMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_danhSachMonHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_themMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_xoaMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_danhSachMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btn_themMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_xoaMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_danhSachMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 355, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelQLMH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelQLMH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý môn học", jPanel2);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_capNhatGiaTinChi.setBackground(new java.awt.Color(255, 255, 255));
        btn_capNhatGiaTinChi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up_money.png"))); // NOI18N
        btn_capNhatGiaTinChi.setText("Cập nhật giá tiền");
        btn_capNhatGiaTinChi.setBorder(null);
        btn_capNhatGiaTinChi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_capNhatGiaTinChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capNhatGiaTinChiActionPerformed(evt);
            }
        });

        btn_danhSachCongNo.setBackground(new java.awt.Color(255, 255, 255));
        btn_danhSachCongNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list_subject.png"))); // NOI18N
        btn_danhSachCongNo.setText("Danh sách công nợ");
        btn_danhSachCongNo.setBorder(null);
        btn_danhSachCongNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_danhSachCongNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_danhSachCongNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_capNhatGiaTinChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_danhSachCongNo, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(btn_capNhatGiaTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_danhSachCongNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 396, Short.MAX_VALUE))
        );

        jPanelQLCN.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelQLCNLayout = new javax.swing.GroupLayout(jPanelQLCN);
        jPanelQLCN.setLayout(jPanelQLCNLayout);
        jPanelQLCNLayout.setHorizontalGroup(
            jPanelQLCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        jPanelQLCNLayout.setVerticalGroup(
            jPanelQLCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelQLCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelQLCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý công nợ", jPanel4);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Chào mừng bạn đến với trang chủ admin");

        btn_dangXuat.setText("Đăng xuất");
        btn_dangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_dangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_dangXuat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themTaiKhoanActionPerformed
        if(themTaiKhoanJPanel == null) {
            themTaiKhoanJPanel = new ThemTaiKhoanJPanel();
            jPanelQLTK.add(themTaiKhoanJPanel);
            themTaiKhoanJPanel.setVisible(false);
        }
        hienThiQLTK(themTaiKhoanJPanel);
    }//GEN-LAST:event_btn_themTaiKhoanActionPerformed

    private void btn_xoaTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaTaiKhoanActionPerformed
        if(xoaTaiKhoanJPanel != null)
            jPanelQLTK.remove(xoaTaiKhoanJPanel);
        xoaTaiKhoanJPanel = new XoaTaiKhoanJPanel();
        jPanelQLTK.add(xoaTaiKhoanJPanel);
        xoaTaiKhoanJPanel.setVisible(false);
        hienThiQLTK(xoaTaiKhoanJPanel);
    }//GEN-LAST:event_btn_xoaTaiKhoanActionPerformed

    private void btn_themMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themMonHocActionPerformed
        if(themMonHocJPanel == null) {
            themMonHocJPanel = new ThemMonHocJPanel();
            jPanelQLMH.add(themMonHocJPanel);
            themMonHocJPanel.setVisible(false);
        }
        hienThiQLMH(themMonHocJPanel);
    }//GEN-LAST:event_btn_themMonHocActionPerformed

    private void btn_xoaMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaMonHocActionPerformed
        if(xoaMonHocJPanel == null) {
            xoaMonHocJPanel = new XoaMonHocJPanel();
            jPanelQLMH.add(xoaMonHocJPanel);
            xoaMonHocJPanel.setVisible(false);
        }
        hienThiQLMH(xoaMonHocJPanel);
    }//GEN-LAST:event_btn_xoaMonHocActionPerformed

    private void btn_danhSachMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_danhSachMonHocActionPerformed
        if(danhSachMonHocJPanel != null)
            jPanelQLMH.remove(danhSachMonHocJPanel);
        danhSachMonHocJPanel = new DanhSachMonHocJPanel();
        jPanelQLMH.add(danhSachMonHocJPanel);
        danhSachMonHocJPanel.setVisible(false);
        hienThiQLMH(danhSachMonHocJPanel);
    }//GEN-LAST:event_btn_danhSachMonHocActionPerformed

    private void btn_danhSachLichThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_danhSachLichThiActionPerformed
        if(danhSachLichThiJPanel != null) 
            jPanelQLLT.remove(danhSachLichThiJPanel);
        danhSachLichThiJPanel = new DanhSachLichThiJPanel();
        jPanelQLLT.add(danhSachLichThiJPanel);
        danhSachLichThiJPanel.setVisible(false);
        hienThiQLLT(danhSachLichThiJPanel);
    }//GEN-LAST:event_btn_danhSachLichThiActionPerformed

    private void btn_taoLichThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taoLichThiActionPerformed
        if(taoLichThiJPanel == null) {
            taoLichThiJPanel = new TaoLichThiJPanel();
            jPanelQLLT.add(taoLichThiJPanel);
            taoLichThiJPanel.setVisible(false);
        }
        hienThiQLLT(taoLichThiJPanel);
    }//GEN-LAST:event_btn_taoLichThiActionPerformed

    private void btn_capNhatGiaTinChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capNhatGiaTinChiActionPerformed
        if(capNhatHocPhiJPanel == null) {
            capNhatHocPhiJPanel = new CapNhatHocPhiJPanel();
            jPanelQLCN.add(capNhatHocPhiJPanel);
            capNhatHocPhiJPanel.setVisible(false);
        }
        hienThiQLCN(capNhatHocPhiJPanel);
    }//GEN-LAST:event_btn_capNhatGiaTinChiActionPerformed

    private void btn_danhSachCongNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_danhSachCongNoActionPerformed
        if(danhSachCongNoJPanel != null)
            jPanelQLCN.remove(danhSachCongNoJPanel);
        danhSachCongNoJPanel = new DanhSachCongNoJPanel();
        jPanelQLCN.add(danhSachCongNoJPanel);
        danhSachCongNoJPanel.setVisible(false);
        hienThiQLCN(danhSachCongNoJPanel);
    }//GEN-LAST:event_btn_danhSachCongNoActionPerformed

    private void btn_danhSachGiaoVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_danhSachGiaoVienActionPerformed
        if(danhSachGiaoVienJPanel != null)
            jPanelQLGV.remove(danhSachGiaoVienJPanel);
        danhSachGiaoVienJPanel = new DanhSachGiaoVienJPanel();
        jPanelQLGV.add(danhSachGiaoVienJPanel);
        danhSachGiaoVienJPanel.setVisible(false);
        hienThiQLGV(danhSachGiaoVienJPanel);
    }//GEN-LAST:event_btn_danhSachGiaoVienActionPerformed

    private void btn_dangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangXuatActionPerformed
        this.setVisible(false);
        DangNhap dangNhap = new DangNhap();
        dangNhap.setVisible(true);
    }//GEN-LAST:event_btn_dangXuatActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_capNhatGiaTinChi;
    private javax.swing.JButton btn_dangXuat;
    private javax.swing.JButton btn_danhSachCongNo;
    private javax.swing.JButton btn_danhSachGiaoVien;
    private javax.swing.JButton btn_danhSachLichThi;
    private javax.swing.JButton btn_danhSachMonHoc;
    private javax.swing.JButton btn_taoLichThi;
    private javax.swing.JButton btn_themMonHoc;
    private javax.swing.JButton btn_themTaiKhoan;
    private javax.swing.JButton btn_xoaMonHoc;
    private javax.swing.JButton btn_xoaTaiKhoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelQLCN;
    private javax.swing.JPanel jPanelQLGV;
    private javax.swing.JPanel jPanelQLLT;
    private javax.swing.JPanel jPanelQLMH;
    private javax.swing.JPanel jPanelQLTK;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}

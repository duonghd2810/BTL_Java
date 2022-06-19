
package models;

import java.util.ArrayList;

public class SinhVien {
    private String maSV;
    private String tenSV;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private String matKhau;
    private String SDT;
    private String soThich;

    public SinhVien() {
    }

    public SinhVien(String SDT, String soThich) {
        this.SDT = SDT;
        this.soThich = soThich;
    }
    
    public void parse(String line){
        String[] param= line.split("-");
        maSV=param[0];
        tenSV=param[1];
        SDT=param[6];
        gioiTinh=param[3];
    }
    
    public SinhVien(String maSV, String tenSV, String ngaySinh, String gioiTinh, String diaChi, String matKhau, String SDT, String soThich) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.matKhau = matKhau;
        this.SDT = SDT;
        this.soThich = soThich;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    @Override
    public String toString() {
        return maSV + "-" + tenSV + "-" + ngaySinh + "-" + gioiTinh + "-" + diaChi + "-" + matKhau + "-" + SDT + "-" + soThich;
    }
    
    
}

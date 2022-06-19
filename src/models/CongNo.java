
package models;

import java.util.ArrayList;

public class CongNo {
    private String maCongNo;
    private float soDuTaiKhoan;
    private float soTienConNo;
    private String maSV;
    ArrayList<HocPhi> dsHocPhiMonHoc = new ArrayList<>();

    public CongNo() {
    }

    public CongNo(String maCongNo, float soDuTaiKhoan, float soTienConNo, String maSV) {
        this.maCongNo = maCongNo;
        this.soDuTaiKhoan = soDuTaiKhoan;
        this.soTienConNo = soTienConNo;
        this.maSV = maSV;
    }

    public float getSoDuTaiKhoan() {
        return soDuTaiKhoan;
    }

    public void setSoDuTaiKhoan(float soDuTaiKhoan) {
        this.soDuTaiKhoan = soDuTaiKhoan;
    }

    public float getSoTienConNo() {
        return soTienConNo;
    }

    public void setSoTienConNo(float soTienConNo) {
        this.soTienConNo = soTienConNo;
    }

    public ArrayList<HocPhi> getDsHocPhiMonHoc() {
        return dsHocPhiMonHoc;
    }

    public void setDsHocPhiMonHoc(ArrayList<HocPhi> dsHocPhiMonHoc) {
        this.dsHocPhiMonHoc = dsHocPhiMonHoc;
    }

    public String getMaCongNo() {
        return maCongNo;
    }

    public void setMaCongNo(String maCongNo) {
        this.maCongNo = maCongNo;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    @Override
    public String toString() {
        return maCongNo + "-" + soDuTaiKhoan + "-" + soTienConNo + "-" + maSV;
    }
}

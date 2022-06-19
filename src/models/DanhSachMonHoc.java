/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author VanTuan
 */
public class DanhSachMonHoc {
    private String maSV;
    private String maMon;
    private String maLichThi;

    public DanhSachMonHoc() {
    }

    public DanhSachMonHoc(String maSV, String maMon, String maLichThi) {
        this.maSV = maSV;
        this.maMon = maMon;
        this.maLichThi = maLichThi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getMaLichThi() {
        return maLichThi;
    }

    public void setMaLichThi(String maLichThi) {
        this.maLichThi = maLichThi;
    }

    @Override
    public String toString() {
        return maSV + "-" + maMon + "-" + maLichThi;
    }

    public void parse(String line){
        String[] param= line.split("-");
        maMon=param[1];
        maSV=param[0];
        maLichThi=param[2];
    }
    
}

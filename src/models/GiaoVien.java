
package models;

import controllers.RegexController;

public class GiaoVien {
    private String maGV;
    private String tenGV;
    private String SDT;
    private String bangCap;
    private String gioiTinh;
    private String matKhau;

    public GiaoVien() {
    }

    public GiaoVien(String maGV, String tenGV, String SDT, String bangCap, String gioiTinh, String matKhau) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.SDT = SDT;
        this.bangCap = bangCap;
        this.gioiTinh = gioiTinh;
        this.matKhau = matKhau;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT() {
        this.SDT = SDT;
    }

    public String getBangCap() {
        return bangCap;
    }

    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void parse(String line){
        String[] param= line.split("-");
        maGV=param[0];
        tenGV=param[1];
        SDT=param[2];
        bangCap=param[3];
        gioiTinh=param[4];
        matKhau=param[5];
        
    }
    
    @Override
    public String toString() {
        return maGV + "-" + tenGV + "-" + SDT + "-" + bangCap + "-" + gioiTinh + "-" + matKhau;
    }
    public String toString2() {
        return "\n" + maGV + "-" + tenGV + "-" + SDT + "-" + bangCap + "-" + gioiTinh + "-" + matKhau;
    }
}

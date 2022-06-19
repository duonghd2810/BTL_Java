
package models;
public class MonHoc {
    private String maMon;
    private String tenMonHoc;
    private int soTinChi;
    private String maGV;

    public MonHoc() {
    }

    public MonHoc(String maMon, String tenMonHoc, int soTinChi, String maGV) {
        this.maMon = maMon;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
        this.maGV = maGV;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }
    
    @Override
    public String toString() {
        return maMon + "-" + tenMonHoc + "-" + soTinChi + "-" + maGV;
    }
}

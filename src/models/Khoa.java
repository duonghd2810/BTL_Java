
package models;
public class Khoa {
    private String maMon;
    private String thoiGianHoc;
    private String tenGV;
    private String diaDiemHoc;

    public Khoa() {
    }

    public Khoa(String maMon, String thoiGianHoc, String tenGV, String diaDiemHoc) {
        this.maMon = maMon;
        this.thoiGianHoc = thoiGianHoc;
        this.tenGV = tenGV;
        this.diaDiemHoc = diaDiemHoc;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getThoiGianHoc() {
        return thoiGianHoc;
    }

    public void setThoiGianHoc(String thoiGianHoc) {
        this.thoiGianHoc = thoiGianHoc;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getDiaDiemHoc() {
        return diaDiemHoc;
    }

    public void setDiaDiemHoc(String diaDiemHoc) {
        this.diaDiemHoc = diaDiemHoc;
    }
    
    
}


package models;
public class LichThi {
    private String maLichThi;
    private String thoiGianThi;
    private String caThi;
    private String diaDiemThi;
    private String maMon;
    private int soLuongThiSinh;

    public LichThi() {
    }

    public LichThi(String maLichThi, String thoiGianThi, String caThi, String diaDiemThi, String maMon, int soLuongThiSinh) {
        this.maLichThi = maLichThi;
        this.thoiGianThi = thoiGianThi;
        this.caThi = caThi;
        this.diaDiemThi = diaDiemThi;
        this.maMon = maMon;
        this.soLuongThiSinh = soLuongThiSinh;
    }
    
    public String getMaLichThi() {
        return maLichThi;
    }

    public void setMaLichThi(String maLichThi) {
        this.maLichThi = maLichThi;
    }
    
    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getThoiGianThi() {
        return thoiGianThi;
    }

    public void setThoiGianThi(String thoiGianThi) {
        this.thoiGianThi = thoiGianThi;
    }

    public String getDiaDiemThi() {
        return diaDiemThi;
    }

    public void setDiaDiemThi(String diaDiemThi) {
        this.diaDiemThi = diaDiemThi;
    }

    public String getCaThi() {
        return caThi;
    }

    public void setCaThi(String caThi) {
        this.caThi = caThi;
    }

    public int getSoLuongThiSinh() {
        return soLuongThiSinh;
    }

    public void setSoLuongThiSinh(int soLuongThiSinh) {
        this.soLuongThiSinh = soLuongThiSinh;
    }

    @Override
    public String toString() {
        return maLichThi + "-" + thoiGianThi + "-" + caThi + "-" + diaDiemThi + "-" + maMon + "-" + soLuongThiSinh;
    }
    
}

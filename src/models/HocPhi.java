
package models;
public class HocPhi {
    private String maMon;
    private float hocPhi;
    
    public HocPhi() {
    }

    public HocPhi(String maMon, float hocPhi) {
        this.maMon = maMon;
        this.hocPhi = hocPhi;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return maMon + "-" + hocPhi;
    }
}

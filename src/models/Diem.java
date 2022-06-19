
package models;

import java.util.Scanner;

public class Diem {
    protected String maMonHoc;
    protected String maSinhVien;
    protected float diemTX1;
    protected float diemTX2;
    protected float diemTX3=99.0f;
    protected float diemGK;
    protected float diemCuoiKy;
    protected float diem10;
    

    public Diem() {
        
    }

    public Diem(String maMonHoc, String maSinhVien) {
        this.maMonHoc = maMonHoc;
        this.maSinhVien = maSinhVien;
        diemTX1 = 99.0f;
        diemTX2 = 99.0f;
        diemTX3 = 99.0f;
        diemGK = 99.0f;
        diemCuoiKy = 99.0f;
        diem10 = 99.0f;
    }
    
    public Diem(String maMonHoc,String maSinhVien, float diemTX1, float diemTX2, float diemTX3, float diemGK, float diemCuoiKy) {
        this.maMonHoc = maMonHoc;
        this.maSinhVien=maSinhVien;
        this.diemTX1 = diemTX1;
        this.diemTX2 = diemTX2;
        this.diemTX3 = diemTX3;
        this.diemGK = diemGK;
        this.diemCuoiKy = diemCuoiKy;
       
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    
    public float getDiemTX1() {
        return diemTX1;
    }

    public void setDiemTX1(float diemTX1) {
        this.diemTX1 = diemTX1;
    }

    public float getDiemTX2() {
        return diemTX2;
    }

    public void setDiemTX2(float diemTX2) {
        this.diemTX2 = diemTX2;
    }

    public float getDiemTX3() {
        return diemTX3;
    }

    public void setDiemTX3(float diemTX3) {
        this.diemTX3 = diemTX3;
    }

    public float getDiemGK() {
        return diemGK;
    }

    public void setDiemGK(float diemGK) {
        this.diemGK = diemGK;
    }

    public float getDiemCuoiKy() {
        return diemCuoiKy;
    }

    public void setDiemCuoiKy(float diemCuoiKy) {
        this.diemCuoiKy = diemCuoiKy;
    }
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ma mon hoc: ");
        maMonHoc=sc.nextLine();
        System.out.println("Nhap ma sinh vien: ");
        maSinhVien=sc.nextLine();
        System.out.println("Nhap diem TX 1");
        diemTX1=sc.nextFloat();
        System.out.println("Nhap diem TX 2");
        diemTX2=sc.nextFloat();
        System.out.println("Nhap diem TX 3");
        diemTX3=sc.nextFloat();
        System.out.println("Nhap diem giua ky");
        diemGK=sc.nextFloat();
        System.out.println("Nhap diem cuoi ky");
        diemCuoiKy=sc.nextFloat();
        
    }
    public void display(){
        System.out.println(this);
    }
    public float tinhdiem(){
        int x=(int)diemTX3;
        if(diemTX1 == 99.0f || diemTX2 == 99.0f || diemGK == 99.0f || diemCuoiKy == 99.0f)
            return 99.0f;
        if(x!=99){
            return ((((diemTX1+diemTX2+diemTX3)/3.0f)+diemGK*2.0f)/3.0f)*0.4f+diemCuoiKy*0.6f;
        }
        else{
            return  ((diemTX1+diemTX2+diemGK*2)/4.0f)*0.4f+diemCuoiKy*0.6F;

        }
    }

    public void setdiem10(){
        this.diem10=tinhdiem();
    }
    public float getdiem10(){
        return diem10;
    }
    
    public void parse(String line){
        String[] param= line.split("-");
        maMonHoc=param[0];
        maSinhVien=param[1];
        diemTX1=Float.parseFloat(param[2]);
        diemTX2=Float.parseFloat(param[3]);
        diemTX3=Float.parseFloat(param[4]);
        diemGK=Float.parseFloat(param[5]);
        diemCuoiKy=Float.parseFloat(param[6]);
        diem10=Float.parseFloat(param[7]);
        
    }
    @Override
    public String toString() {
        return maMonHoc + "-" + maSinhVien + "-" + diemTX1 + "-" + diemTX2 + "-" + diemTX3 + "-" + diemGK + "-" + diemCuoiKy+"-"+getdiem10();
    }
    
    public String toString2() {
        return "\n" + maMonHoc + "-" + maSinhVien + "-" + diemTX1 + "-" + diemTX2 + "-" + diemTX3 + "-" + diemGK + "-" + diemCuoiKy+"-"+getdiem10();
    }
}

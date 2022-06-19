/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.DanhSachMonHoc;
import models.Diem;
import models.MonHoc;
import models.SinhVien;

/**
 *
 * @author DELL
 */
public class MonHocSinhVienController {
    public static MonHocSinhVienController monHocSinhVienController;
    DanhSachMonHoc danhSachMonHoc;
    public static MonHocSinhVienController getInstance(){
        if(monHocSinhVienController == null)
            monHocSinhVienController = new MonHocSinhVienController();
        return monHocSinhVienController;
    }
    public ArrayList<DanhSachMonHoc> getData(SinhVien sv){
        ArrayList<DanhSachMonHoc> ds = new ArrayList<>();
        FileReader fr = null;
        try {
            File fl = new File("file//danhSachMonHoc.txt");
            fr = new FileReader(fl);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!=null){
                String arr[] = line.trim().split("-");
                if(sv.getMaSV().equals(arr[0].trim())){
                    ds.add(new DanhSachMonHoc(arr[0].trim(),arr[1].trim(),arr[2].trim()));
                }
            }
            br.close();
            fr.close();
            return ds;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MonHocSinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MonHocSinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean checkHocPhan(String maSV, String maMon) {
        try {
            File file = new File("file//danhSachMonHoc.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                if(maSV.compareTo(line.trim().split("-")[0].trim()) == 0 && maMon.compareTo(line.trim().split("-")[1].trim()) == 0){
                    br.close();
                    fr.close();
                    return true;
                }
            }
            br.close();
            fr.close();
            return false;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MonHocSinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MonHocSinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean dangKyHocPhan(MonHoc monHoc, String maSV) {
        if(checkHocPhan(maSV, monHoc.getMaMon()))
            return false;
        try {
            File file = new File("file//danhSachMonHoc.txt");
            FileWriter fw = new FileWriter(file, true);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            if(br.readLine() == null)
                fw.write(maSV + "-" + monHoc.getMaMon() + "-Chưa cập nhật");
            else
                fw.write("\n" + maSV + "-" + monHoc.getMaMon() + "-Chưa cập nhật");
            br.close();
            fr.close();
            fw.close();
            
            File fileD = new File("file//diem.txt");
            FileWriter fwD = new FileWriter(fileD, true);
            FileReader frD = new FileReader(fileD);
            BufferedReader brD = new BufferedReader(frD);
            Diem diem = new Diem(monHoc.getMaMon(), maSV);
            if(brD.readLine() == null)
                fwD.write(diem.toString());
            else
                fwD.write("\n" + diem.toString());
            brD.close();
            frD.close();
            fwD.close();
            
            File fileHocPhi = new File("file//hocPhi.txt");
            FileReader frHP = new FileReader(fileHocPhi);
            BufferedReader brHP = new BufferedReader(frHP);
            String s;
            int tien = 0;
            while((s = brHP.readLine()) != null) {
                if(monHoc.getMaMon().compareTo(s.split("-")[0].trim()) == 0) {
                    tien = Integer.parseInt(s.split("-")[1].trim());
                    break;
                }
            }
            brHP.close();
            fr.close();
            
            File fileCN = new File("file//congNo.txt");
            ArrayList<String> trungGians = new ArrayList<>();
            FileReader frCN = new FileReader(fileCN);
            BufferedReader brCN = new BufferedReader(frCN);
            String line;
            while((line = brCN.readLine()) != null) 
                trungGians.add(line);
            brCN.close();
            frCN.close();
            FileWriter fwCN = new FileWriter(fileCN);
            for (int i = 0; i < trungGians.size(); i++) {
                line = trungGians.get(i);
                String arr[] = trungGians.get(i).trim().split("-");
                if(maSV.compareTo(arr[3].trim()) == 0)
                    line = arr[0].trim() + "-" + arr[1].trim() + "-" + (Float.parseFloat(arr[2].trim()) + tien) + "-" + arr[3].trim(); 
                if(i == trungGians.size() - 1)    fwCN.write(line);
                else            fwCN.write(line + "\n");
            }
            fwCN.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(MonHocSinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

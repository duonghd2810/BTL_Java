/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import java.util.regex.Pattern;
import models.CongNo;
import models.SinhVien;

/**
 *
 * @author VanTuan
 */
public class SinhVienController {
    public static SinhVienController sinhVienController;
    private SinhVien sv; 
    
    public static SinhVienController getInstance() {
        if(sinhVienController == null)
            sinhVienController = new SinhVienController();
        return sinhVienController;
    }
    
    public SinhVien sinhVienDangNhap(String tenDangNhap, String matKhau) {
        try {
            File file = new File("file//sinhVien.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                String arr[] = line.trim().split("-");
                System.out.println(arr[0].trim() + arr[5].trim());
                if(tenDangNhap.compareTo(arr[0].trim()) == 0) {
                    br.close();
                    fr.close();
                    if(matKhau.compareTo(arr[5].trim()) == 0) {
                        sv = new SinhVien(arr[0].trim()
                                , arr[1].trim()
                                , arr[2].trim()
                                , arr[3].trim()
                                , arr[4].trim()
                                , arr[5].trim()
                                , arr[6].trim()
                                , arr[7].trim());
                        return sv;
                    }
                    else return null;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean kiemTraTenDangNhap(String tenDangNhap) {
        try {
            File file = new File("file//sinhVien.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                String arr[] = line.trim().split("-");
                if(tenDangNhap.compareTo(arr[0].trim()) == 0) {
                    br.close();
                    fr.close();
                    return true;
                }
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) { 
            Logger.getLogger(GiaoVienController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GiaoVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean themSinhVien(SinhVien sinhVien) {
        try {
            File file = new File("file//sinhVien.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(file, true);
            String sv = "\n" + sinhVien.toString();
            if(br.readLine() == null) sv = sinhVien.toString();
            fw.write(sv);
            br.close();
            fr.close();
            fw.close();
            File fileCN = new File("file/congNo.txt");
            FileReader frCN = new FileReader(fileCN);
            BufferedReader brCN = new BufferedReader(frCN);
            String line;
            String checkMa = "";
            while((line = brCN.readLine()) != null) {
                checkMa = line;
            }
            brCN.close();
            frCN.close();
            CongNo congNo;
            int kt = 0;
            if(checkMa == "") {
                congNo = new CongNo("CN1", 0, 0, sinhVien.getMaSV());
                kt = 1;
            }
            else {
                checkMa = checkMa.split("-")[0].trim();
                int STT = Integer.parseInt(checkMa.substring(2, checkMa.length()));
                checkMa = checkMa.substring(0, 2);
                checkMa += ++STT;
                congNo = new CongNo(checkMa, 0, 0, sinhVien.getMaSV());
            }
            FileWriter fwCN = new FileWriter(fileCN, true);
            String CN;
            if(kt == 0) CN = "\n" + congNo.toString();
            else CN = congNo.toString();
            fwCN.write(CN);
            fwCN.close();
            return true;
        } catch (IOException ex) {  
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean xoaSinhVien(String maSV) {
        if(!kiemTraTenDangNhap(maSV))
            return false;
        try {
            File file_sinhVien = new File("file//sinhVien.txt");
            ArrayList<String> trungGians = new ArrayList<>();
            FileReader fr_sinhVien = new FileReader(file_sinhVien);
            BufferedReader br_sinhVien = new BufferedReader(fr_sinhVien);
            String line;
            while((line = br_sinhVien.readLine()) != null) 
                trungGians.add(line);
            br_sinhVien.close();
            fr_sinhVien.close();
            FileWriter fw_sinhVien = new FileWriter(file_sinhVien);
            boolean checkN = false;
            for (int i = 0; i < trungGians.size(); i++) {
                line = trungGians.get(i);
                String ma = line.split("-")[0].trim();
                System.out.println(ma);
                if(ma.compareTo(maSV) == 0) {
                    checkN = true;
                    continue;
                }
                if(i == trungGians.size() - 1 || (i == trungGians.size() - 2 && checkN == false))    
                    fw_sinhVien.write(line);
                else    fw_sinhVien.write(line + "\n");
            }
            fw_sinhVien.close();
            File file_congNo = new File("file//congNo.txt");
            trungGians = new ArrayList<>();
            FileReader fr_congNo = new FileReader(file_congNo);
            BufferedReader br_congNo = new BufferedReader(fr_congNo);
            while((line = br_congNo.readLine()) != null) 
                trungGians.add(line);
            br_congNo.close();
            fr_congNo.close();
            FileWriter fw_congNo = new FileWriter(file_congNo);
            checkN = false;
            for (int i = 0; i < trungGians.size(); i++) {
                line = trungGians.get(i);
                if(line.split("-")[3].trim().compareTo(maSV) == 0) {
                    checkN = true;
                    continue;
                }
                if(i == trungGians.size() - 1 || (i == trungGians.size() - 2 && checkN == false))    
                    fw_congNo.write(line);
                else fw_congNo.write(line + "\n");
            }
            fw_congNo.close();
            File file_DSMH = new File("file//danhSachMonHoc.txt");
            trungGians = new ArrayList<>();
            FileReader fr_DSMH = new FileReader(file_DSMH);
            BufferedReader br_DSMH = new BufferedReader(fr_DSMH);
            while((line = br_DSMH.readLine()) != null) 
                trungGians.add(line);
            br_DSMH.close();
            fr_DSMH.close();
            FileWriter fw_DSMH = new FileWriter(file_DSMH);
            for (int i = 0; i < trungGians.size(); i++) {
                line = trungGians.get(i);
                if(line.split("-")[0].trim().compareTo(maSV) == 0) 
                    continue;
                if(i == trungGians.size() - 1 || (trungGians.get(trungGians.size() - 1).split("-")[0].trim().compareTo(maSV) == 0 && i == trungGians.size() - 2))    
                    fw_DSMH.write(line);
                else fw_DSMH.write(line + "\n");
            }
            fw_DSMH.close();
            
            File file_D = new File("file//diem.txt");
            trungGians = new ArrayList<>();
            FileReader fr_D = new FileReader(file_D);
            BufferedReader br_D = new BufferedReader(fr_D);
            while((line = br_D.readLine()) != null) 
                trungGians.add(line);
            br_D.close();
            fr_D.close();
            FileWriter fw_D = new FileWriter(file_D);
            for (int i = 0; i < trungGians.size(); i++) {
                line = trungGians.get(i);
                if(line.split("-")[1].trim().compareTo(maSV) == 0) 
                    continue;
                if(i == trungGians.size() - 1 || (trungGians.get(trungGians.size() - 1).split("-")[1].trim().compareTo(maSV) == 0 && i == trungGians.size() - 2))    
                    fw_D.write(line);
                else fw_D.write(line + "\n");
            }
            fw_D.close();
            
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<SinhVien> danhSachSinhVien() {
        ArrayList<SinhVien> ds = new ArrayList<>();
        try {
            File fileLT = new File("file//sinhVien.txt");
            FileReader fr = new FileReader(fileLT);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                String arr[] = line.trim().split("-");
                ds.add(new SinhVien(
                        arr[0].trim(), 
                        arr[1].trim(), 
                        arr[2].trim(), 
                        arr[3].trim(), 
                        arr[4].trim(),
                        arr[5].trim(),
                        arr[6].trim(),
                        arr[7].trim()));
                //System.out.println("a");
            }
            br.close();
            fr.close();
            return ds;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LichThiController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LichThiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ds;
    }
    
    public static boolean checkSDT(String sdt){
        final Pattern SDT_REGEX =Pattern.compile("^(0)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$");
        return SDT_REGEX.matcher(sdt).matches();
    }
    
}

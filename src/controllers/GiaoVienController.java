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
import models.GiaoVien;

/**
 *
 * @author VanTuan
 */
public class GiaoVienController {
    public static GiaoVienController giaoVienController;
    
    public static GiaoVienController getInstance() {
        if(giaoVienController == null)
            giaoVienController = new GiaoVienController();
        return giaoVienController;
    }
    
    public GiaoVien giaoVienDangNhap(String tenDangNhap, String matKhau) {
        try {
            File file = new File("file//giaoVien.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                String arr[] = line.trim().split("-");
                if(tenDangNhap.compareTo(arr[0].trim()) == 0) {
                    br.close();
                    fr.close();
                    if(matKhau.compareTo(arr[5].trim()) == 0) {
                        GiaoVien giaoVien = new GiaoVien(arr[0].trim()
                                , arr[1].trim()
                                , arr[2].trim()
                                , arr[3].trim()
                                , arr[4].trim()
                                , arr[5].trim());
                        return giaoVien;
                    }
                    else return null;
                }
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) { 
            Logger.getLogger(GiaoVienController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GiaoVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean kiemTraTenDangNhap(String tenDangNhap) {
        try {
            File file = new File("file//giaoVien.txt");
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
    
    public boolean themGiaoVien(GiaoVien giaoVien) {
        try {
            File file = new File("file//giaoVien.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(file, true);
            String gv ="\n" + giaoVien.toString();
            if(br.readLine() == null) gv = giaoVien.toString();
            fw.write(gv);
            fw.close();
            br.close();
            fr.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(GiaoVienController.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return false;
    }
    
    public boolean xoaGiaoVien(String maGV) {
        if(!kiemTraTenDangNhap(maGV))
            return false;
        try {
            File file = new File("file//giaoVien.txt");
            ArrayList<String> trungGians = new ArrayList<>();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                trungGians.add(line);
            }
            br.close();
            fr.close();
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < trungGians.size(); i++)
                if(maGV.compareTo(trungGians.get(i).split("-")[0].trim()) == 0) {
                    trungGians.remove(i);
                    break;
                }
            for (int i = 0; i < trungGians.size(); i++) {
                if(i == trungGians.size() - 1)
                    fw.write(trungGians.get(i));
                else    fw.write(trungGians.get(i) + "\n");
            }
            fw.close();
            
            File fileMH = new File("file//monHoc.txt");
            trungGians = new ArrayList<>();
            FileReader frMH = new FileReader(fileMH);
            BufferedReader brMH = new BufferedReader(frMH);
            boolean check = false;
            while((line = brMH.readLine()) != null) {
                trungGians.add(line);
                check = true;
            }
            brMH.close();
            frMH.close();
            if(check == false)
                return true;
            FileWriter fwMH = new FileWriter(fileMH);
            for (int i = 0; i < trungGians.size(); i++) {
                String arr[] = trungGians.get(i).trim().split("-");
                String ma = arr[3].trim();
                if(ma.compareTo(maGV) == 0) {
                    line = arr[0].trim() + "-" + arr[1].trim() + "-" + arr[2].trim() + "-Chưa cập nhật";
                    if(i == trungGians.size() - 1)    fwMH.write(line);
                    else    fwMH.write(line + "\n");
                    continue;
                }
                if(i == trungGians.size() - 1)    fwMH.write(trungGians.get(i));
                else    fwMH.write(trungGians.get(i) + "\n");    
            }
            fwMH.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GiaoVienController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GiaoVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<GiaoVien> danhSachGiaoVien() {
        ArrayList<GiaoVien> ds = new ArrayList<>();
        try {
            File fileLT = new File("file//giaoVien.txt");
            FileReader fr = new FileReader(fileLT);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                String arr[] = line.split("-");
                ds.add(new GiaoVien(arr[0].trim(), arr[1].trim(), arr[2].trim(), arr[3].trim(), arr[4].trim(), arr[5].trim()));
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
}

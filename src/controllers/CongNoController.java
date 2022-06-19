package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.CongNo;
import models.HocPhi;
import models.SinhVien;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class CongNoController {
    public static CongNoController congNoController;
    CongNo cn;
    public static CongNoController getInstance(){
        if(congNoController == null)
            congNoController = new CongNoController();
        return congNoController;
    }
    
    public CongNo getData(SinhVien sv) throws IOException{
        FileReader fr = null;
        try {
            File file = new File("file//congNo.txt");
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                String arr[] = line.trim().split("-");
                if(sv.getMaSV().equals(arr[3].trim())){
                    cn = new CongNo(arr[0].trim()
                                , Float.parseFloat(arr[1].trim())
                                , Float.parseFloat(arr[2].trim())
                                , arr[3].trim());
                    //System.out.println("TAG:" + arr[1].trim() + arr[2].trim() + "-" + arr[3] + sv.getMaSV());
                    return cn;
                }
            }
            return null;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CongNoController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(CongNoController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    public boolean capNhatGiaTinChi(String gia) {
        int giaTC = Integer.parseInt(gia) * 1;
        try {
            File file = new File("file//giaTinChi.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(gia);
            fw.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(CongNoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<CongNo> danhSachCongNo() {
        ArrayList<CongNo> ds = new ArrayList<>();
        try {
            File file = new File("file//congNo.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                String arr[] = line.trim().split("-");
                CongNo congNo = new CongNo(arr[0].trim(), Float.parseFloat(arr[1].trim()), Float.parseFloat(arr[2].trim()), arr[3].trim());
                ds.add(congNo);
            }
            return ds;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CongNoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CongNoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

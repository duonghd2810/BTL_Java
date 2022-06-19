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
import models.MonHoc;

/**
 *
 * @author YenLinh
 */
public class MonHocController {
    public static MonHocController monHocController;
    public MonHoc mh;
    
    public static MonHocController getInstance() {
        if(monHocController == null)
            monHocController = new MonHocController();
        return monHocController;
    }
    
    public MonHoc getData(String maMH){
        File fl = null;
        try {
            fl = new File("file/monHoc.txt");
            FileReader fr = new FileReader(fl);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                String arr[] = line.trim().split("-");
                if(maMH.equals(arr[0].trim())){
                    mh = new MonHoc(arr[0].trim(),arr[1].trim(),Integer.parseInt(arr[2].trim()), arr[3].trim());
                    return mh;
                }
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MonHocController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MonHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean checkMaMon(String maMon){
        try{
            File file = new File("file//monHoc.txt");
            FileReader fR = new FileReader(file);
            BufferedReader bR = new BufferedReader(fR);
            String line ;
            while((line = bR.readLine()) != null){
                String maMH = line.split("-")[0].trim();
                if(maMon.compareTo(maMH) == 0) return true;
            }
            return false;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MonHocController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MonHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean checkMonKSV(String maMon){
        try{
            File file = new File("file//danhSachMonHoc.txt");
            FileReader fR = new FileReader(file);
            BufferedReader bR = new BufferedReader(fR);
            String line ;
            while((line = bR.readLine()) != null){
                String maMH = line.split("-")[1].trim();
                if(maMon.compareTo(maMH) == 0) return true;
            }
            return false;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MonHocController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MonHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean themMonHoc(MonHoc monHoc){
        if(checkMaMon(monHoc.getMaMon())) return false;
        try{
            File file = new File("file//monHoc.txt");
            FileWriter fW = new FileWriter(file, true);
            FileReader fR = new FileReader(file);
            BufferedReader bR = new BufferedReader(fR);
            if(bR.readLine() != null)
                fW.write("\n" + monHoc.toString());
            else fW.write(monHoc.toString());
            bR.close();
            fW.close();
            fR.close();
            
            File fileGTC = new File("file//giaTinChi.txt");
            FileReader frTGTC = new FileReader(fileGTC);
            BufferedReader brGTC = new BufferedReader(frTGTC);
            int gia = Integer.parseInt(brGTC.readLine());
            brGTC.close();
            frTGTC.close();
            
            File fileHP = new File("file//hocPhi.txt");
            FileWriter fWHP = new FileWriter(fileHP, true);
            FileReader fRHP = new FileReader(fileHP);
            BufferedReader bRHP = new BufferedReader(fRHP);
            if(bRHP.readLine() != null)
                fWHP.write("\n" + monHoc.getMaMon() + "-" + (monHoc.getSoTinChi() * gia));
            else fWHP.write(monHoc.getMaMon() + "-" + (monHoc.getSoTinChi() * gia));
            bRHP.close();
            fWHP.close();
            fRHP.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(MonHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean xoaMonHoc(String maMonHoc){
        if(!checkMaMon(maMonHoc)) return false;
        if(checkMonKSV(maMonHoc)) return false;
        try{
            File file = new File("file//monHoc.txt");
            ArrayList<String> trungGians = new ArrayList<>();
            FileReader fR = new FileReader(file);
            BufferedReader bR = new BufferedReader(fR);
            String line;
            while((line = bR.readLine()) != null){
                trungGians.add(line);
            }
            bR.close();
            fR.close();
            FileWriter fWMH = new FileWriter(file);
            boolean check_n = false;
            for (int i = 0; i < trungGians.size(); i++) {
                line = trungGians.get(i);
                String ma = line.split("-")[0].trim();
                if(maMonHoc.compareTo(ma) == 0){
                    check_n = true;
                    continue;
                }
                if(trungGians.size() - 1 == i || (trungGians.size() - 2 == i && check_n == false)) fWMH.write(line);
                else  fWMH.write(line + "\n");
            }
            fWMH.close();
            
            File fileHP = new File("file//hocPhi.txt");
            trungGians = new ArrayList<>();
            FileReader fRHP = new FileReader(fileHP);
            BufferedReader bRHP = new BufferedReader(fRHP);
            while((line = bRHP.readLine()) != null){
                trungGians.add(line);
            }
            bRHP.close();
            fRHP.close();
            FileWriter fWHP = new FileWriter(fileHP);
            check_n = false;
            for (int i = 0; i < trungGians.size(); i++) {
                line = trungGians.get(i);
                String Ma = line.split("-")[0].trim();
                if(maMonHoc.compareTo(Ma) == 0){
                    check_n = true;
                    continue;
                }
                if(i == trungGians.size() - 1 || (i == trungGians.size() - 2 && check_n == false))  fWHP.write(line);
                else fWHP.write(line + "\n");
            }
            fWHP.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(MonHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ArrayList<MonHoc> danhSachMH(){
        ArrayList<MonHoc> dsMH = new ArrayList<>();
        try{
            File fileMH = new File("file//monHoc.txt");
            FileReader fRMH = new FileReader(fileMH);
            BufferedReader fBMH = new BufferedReader(fRMH);
            String line;
            while((line = fBMH.readLine()) != null){
                String arr[] = line.trim().split("-");
                dsMH.add(new MonHoc(arr[0].trim(), arr[1].trim(), Integer.parseInt(arr[2].trim()), arr[3].trim()));
            }
            fRMH.close();
            fBMH.close();
            return dsMH;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MonHocController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MonHocController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

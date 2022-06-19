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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.LichThi;

/**
 *
 * @author VanTuan
 */
public class LichThiController {
    public static LichThiController lichThiController;
    
    public static LichThiController getInstance() {
        if(lichThiController == null)
            lichThiController = new LichThiController();
        return lichThiController;
    }
    
    public LichThi getData(String maLT){
        try {
            File fl = new File("file//lichthi.txt");
            FileReader fr = new FileReader(fl);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                String arr[] = line.trim().split("-");
                if(maLT.equals(arr[0].trim())){
                    LichThi lichThi = new LichThi(arr[0].trim(), arr[1].trim(), arr[2].trim(), arr[3].trim(), arr[4].trim(), Integer.parseInt(arr[5].trim()));
                    
                    return lichThi;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LichThiController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LichThiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<LichThi> taoLichThi(String ngayBD, String ngayKT, String soLuong) {
        try {
            Date batDau = new SimpleDateFormat("dd/MM/yyyy").parse(ngayBD);
            Date ketThuc = new SimpleDateFormat("dd/MM/yyyy").parse(ngayKT);
            int day = (int) TimeUnit.MILLISECONDS.toDays(ketThuc.getTime() - batDau.getTime());
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
            int sl = Integer.parseInt(soLuong);
            LinkedHashMap<String, Integer> listMH = new LinkedHashMap<>();
            
            File fileMH = new File("file//monHoc.txt");
            FileReader frMH = new FileReader(fileMH);
            BufferedReader brMH = new BufferedReader(frMH);
            String line;
            while((line = brMH.readLine()) != null) {
                listMH.put(line.split("-")[0].trim(), 0);
            }
            brMH.close();
            frMH.close();
            
            File file = new File("file//danhSachMonHoc.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int tong = 0;
            int kt = 0;
            while((line = br.readLine()) != null) {
                kt = 1;
                listMH.replace(line.split("-")[1].trim(), listMH.get(line.split("-")[1].trim()) + 1);
            }
            if(kt == 0)
                return new ArrayList<>();
            
            for (Entry<String, Integer> entry : listMH.entrySet()) {
                int val = entry.getValue();
                int tg = val/sl;
                int du = val%sl;
                if(du != 0)
                    tong += tg + 1;
                else    tong += tg;
            }
            if(tong > day*2 + 2)
                return null;
            
            ArrayList<LichThi> dsLichThis = new ArrayList<>();
            Set<Entry<String, Integer>> ds = listMH.entrySet();
            int ca = 2;
            int dem = 1;
            for (Entry<String, Integer> entry : listMH.entrySet()) {
                String key = entry.getKey();
                int val = entry.getValue();
                if(val == 0) continue;
                if(val < sl) {
                    ca = (ca == 1 ? 2 : 1);
                    dsLichThis.add(new LichThi("L"+ (dem++), dateFormat.format(batDau), ca + "", "Tòa A9", key, val));
                    if(ca == 2) batDau = DateUtil.addDays(batDau, 1);
                }
                else {
                    while(val > 0) {
                        val -= sl;
                        ca = (ca == 1 ? 2 : 1);
                        if(val > 0) 
                            dsLichThis.add(new LichThi("L"+ (dem++), dateFormat.format(batDau), ca + "", "Tòa A9", key, sl));
                        else
                            dsLichThis.add(new LichThi("L"+ (dem++), dateFormat.format(batDau), ca + "", "Tòa A9", key, val + sl));
                        if(ca == 2) batDau = DateUtil.addDays(batDau, 1);
                    }
                }
            }
            return dsLichThis;
        } catch (Exception ex) {
            Logger.getLogger(LichThiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean luuLichThi(ArrayList<LichThi> lichThis, String soLuong) {
        int sl = Integer.parseInt(soLuong);
        //System.out.println(sl + "");
        try {
            File file = new File("file//lichThi.txt");
            FileWriter fw = new FileWriter(file);
            for (int i = 0 ; i < lichThis.size() ; i++) {
                String line = lichThis.get(i).toString();
                if(i == lichThis.size() - 1)    fw.write(line);
                else                        fw.write(line + "\n");
            }
            fw.close();
            
            File fileMH = new File("file//danhSachMonHoc.txt");
            File fileTG = new File("file//trungGian.txt");
            FileReader fr = new FileReader(fileMH);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fwTG = new FileWriter(fileTG);
            String line;
            int count = 0;
            while((line = br.readLine()) != null) {
                fwTG.write("\n" + line);
                count++;
            }
            fwTG.close();
            br.close();
            fr.close();
            
            File fileMHNew = new File("file//danhSachMonHoc.txt");
            File fileLT = new File("file//lichThi.txt");
            FileReader frLT = new FileReader(fileLT);
            BufferedReader brLT = new BufferedReader(frLT);
            int check = 1;
            FileReader frTG = new FileReader(fileTG);
            BufferedReader brTG = new BufferedReader(frTG);
            brTG.mark(8192);
            String maOld = "";
            while((line = brLT.readLine()) != null) {
                String line_mini = brTG.readLine();
                int slThiSinh = Integer.parseInt(line.split("-")[5].trim());
                int dem = 0;
                String maMon = line.split("-")[4].trim();
                
                if(maOld.length() <= 0 || maOld.compareTo(maMon) != 0) {
                    brTG.reset();
                }
                maOld = maMon;
                
                FileWriter fwMH;
                if(check++ == 1) 
                    fwMH = new FileWriter(fileMHNew);
                else
                    fwMH = new FileWriter(fileMHNew, true);
                while(line_mini != null & dem < sl) {
                    if(line_mini.length() < 2) {
                        line_mini = brTG.readLine();
                        continue;
                    }
                    String maMonDS = line_mini.split("-")[1].trim();
                    if(maMonDS.compareTo(maMon) == 0 && dem < sl && dem < slThiSinh) {
                        line_mini = line_mini.split("-")[0].trim() + "-" + line_mini.split("-")[1].trim() + "-" + line.split("-")[0].trim();
                        count--;
                        if(count == 0)  fwMH.write(line_mini);
                        else            fwMH.write(line_mini + "\n");
                        dem++;
                        if(dem == sl)   break;
                    }
                    line_mini = brTG.readLine();
                }
                if(line_mini == null) {
                    brTG.reset();
                }
                fwMH.close();
            }
            brLT.close();
            frLT.close();
            brTG.close();
            frTG.close();
            fileTG.delete();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(LichThiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<LichThi> getDanhSachLichThi() {
        ArrayList<LichThi> ds = new ArrayList<>();
        try {
            File fileLT = new File("file//lichThi.txt");
            FileReader fr = new FileReader(fileLT);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                ds.add(new LichThi(line.split("-")[0].trim(), line.split("-")[1].trim(), line.split("-")[2].trim(), line.split("-")[3].trim(), line.split("-")[4].trim(), Integer.parseInt(line.split("-")[5].trim())));
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

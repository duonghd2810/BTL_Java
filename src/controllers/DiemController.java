/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Diem;
import models.SinhVien;

/**
 *
 * @author DELL
 */
public class DiemController {
    public static DiemController diemController;
    Diem diem;
    
    public static DiemController getInstance(){
        if(diemController == null)
            diemController = new DiemController();
        return diemController;
    }
    public ArrayList<Diem> getData(SinhVien sv){
        ArrayList<Diem> dsDiem = new ArrayList<>();
        File fl = null;
        try {
            fl = new File("file//diem.txt");
            FileReader fr = new FileReader(fl);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!= null){
                String arr[] = line.trim().split("-");
                if(sv.getMaSV().equals(arr[1].trim())){
                    dsDiem.add(new Diem(arr[0].trim(), arr[1].trim(), Float.parseFloat(arr[2].trim()), Float.parseFloat(arr[3].trim()),
                            Float.parseFloat(arr[4].trim()), Float.parseFloat(arr[5].trim()), Float.parseFloat(arr[6].trim())));
                }
            }
            br.close();
            fr.close();
            return dsDiem;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DiemController.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(DiemController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

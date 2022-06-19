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
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Admin;
import views.DangNhap;
import views.TrangChuAdmin;

/**
 *
 * @author VanTuan
 */
public class AdminController {
    public static AdminController adminController;

    public static AdminController getInstance() {
        if(adminController == null)
            adminController = new AdminController();
        return adminController;
    }
    
    public int adminDangNhap(String tenDangNhap, String matKhau) {
        try{
            File file = new File("file//admin.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) { 
                String arr[] = line.trim().split("-");
                if(tenDangNhap.compareTo(arr[0].trim()) == 0) {
                    br.close();
                    fr.close();
                    if(matKhau.compareTo(arr[1].trim()) == 0) 
                        return 1;
                    else return 0;
                }
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0; 
    }
}

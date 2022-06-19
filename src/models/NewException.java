/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.RegexController;

/**
 *
 * @author VanTuan
 */
public class NewException {
    public static NewException newException;
    
    public static NewException getInstance() {
        if(newException == null)
            newException = new NewException();
        return newException;
    }
    
    public void checkSDT(String sdt) throws Exception {
        if(!RegexController.getInstance("^(0)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$").checkRegex(sdt))
            throw new Exception("Số điện thoại phải bắt đầu là số 0 và có 10 số.!");
    } 
    
    public void checkMK(String pass) throws Exception {
        if(!RegexController.getInstance("^(?=.*?[a-zA-Z])(?=.*?[0-9]).{8,30}$").checkRegex(pass))
            throw new Exception("Mật khẩu phải từ 8 - 30 ký tự, gồm chữ và số");
    }
    
    public void checkXNMK(String mk, String cMK) throws Exception {
        if(mk.compareTo(cMK) != 0)
            throw new Exception("Mật khẩu chưa trùng nhau!");
    }
    
    public void checkThemTK(String tenTK, String mk, String cMK, String hoTen, String sdt) throws Exception {
        if(tenTK.length() == 0 || mk.length() == 0 || cMK.length() == 0 || hoTen.length() == 0 || sdt.length() == 0)
            throw new Exception("Chưa điền đầy đủ thông tin");
        else {
            checkMK(mk);
            checkXNMK(mk, cMK);
            checkSDT(sdt);
        }
    }
    
    public void checkSo(String so, String mess) throws Exception {
        if(!RegexController.getInstance("^[0-9]*[1-9][0-9]*$").checkRegex(so))
            throw new Exception(mess);
    }
    
    public void checkThemMH(String maMH, String tenMH, String soTC) throws Exception {
        if(maMH.length() == 0 || tenMH.length() == 0 || soTC.length() == 0)
            throw new Exception("Bạn chưa điền đầy đủ thông tin !");
        else 
            checkSo(soTC, "Số tín chỉ phải là số nguyên dương!");
    }
    
    public void checkNgay(String ngay, String thongBao) throws Exception {
        if(!RegexController.getInstance("(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])/(0[1-9]|1[0-2]|[1-9])/([0-9]{4})").checkRegex(ngay))
            throw new Exception(thongBao);
    }
    
    public void checkTaoLichThi(String ngayBD, String ngayKT, String so) throws Exception {
        if(ngayBD.length() == 0 || ngayKT.length() == 0 || so.length() == 0)
            throw new Exception("Chưa điền đầy đủ thông tin!");
        else {
            checkNgay(ngayBD, "Ngày bắt đầu chưa đúng định dạng!");
            checkNgay(ngayKT, "Ngày kết thúc chưa đúng định dạng!");
            checkSo(so, "Số sinh viên phải là số nguyên dương!");
        }
    }
    
    public void checkCapNhatGia(String gia) throws Exception {
        if(gia.length() == 0)
            throw new Exception("Chưa điền đầy đủ thông tin!");
        else
            checkSo(gia, "Giá tín chỉ phải là số nguyên dương!");
    }
}

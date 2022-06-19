/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author VanTuan
 */
public class FileController {
    public static FileController fileController;
    
    public static FileController getInstance() {
        if(fileController == null)
            fileController = new FileController();
        return fileController;
    }
    
}

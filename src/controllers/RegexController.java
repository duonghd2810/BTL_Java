/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.regex.Pattern;

/**
 *
 * @author VanTuan
 */
public class RegexController {
    private String regex;
    
    public static RegexController regexController;

    public RegexController() {
    }

    public RegexController(String regex) {
        this.regex = regex;
    }
    
    public static RegexController getInstance(String regex) {
        regexController = new RegexController(regex);
        return regexController;
    }
    
    public boolean checkRegex(String str) {
        return Pattern.matches(regex, str);
    }
}

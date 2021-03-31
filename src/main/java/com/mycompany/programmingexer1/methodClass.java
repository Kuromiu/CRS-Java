/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programmingexer1;

/**
 *
 * @author Admin
 */

public class methodClass {
    public String[][] Lists2d(String[] info) { //For creating 2d array
        String[][] products2d = new String[10][5];
        for (int x = 0; x < 7; x++) { 
            products2d[Integer.valueOf(info[0])][x] = info[x];
        }
        return products2d;
    }
    
    public void showlist() { //void does not record anything
        
    }
}

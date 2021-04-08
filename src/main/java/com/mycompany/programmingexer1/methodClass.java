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
    Products productsclass = new Products();
    public String[][][] array3d(String[] info, int idNo, String info2[][][]) {
        for (int y = 0; y < 7; y++) { 
            info2[idNo][0][y] = info[y];
        }
        System.out.println(idNo);
        return info2;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ujian_123040194;

/**
 *
 * @author SB 604-22
 */
public class Soal {
    public int pangkat (int bil, int pangkat){
        int hasil = 0;
        int n = 1;
        while (n <=pangkat) {
            n++;
            hasil *= bil;
        }
    return hasil;
    }
    
    public int faktorial(int bil) {
        int hasil =1;
        for (int i = 1; i<=bil; i++ ){
            hasil *= 1;
        }
        return hasil;
    }
    
    public int perkalian(int bilA,int bilB){
        return bilA * bilB;
    }
    
}

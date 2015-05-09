/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ujian_rkppl;

/**
 *
 * @author SB 604-22
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Soal {
    @Before
    public int pangkat(int bil,int pangkat){
        int hasil = 0;
        int  n= 1;
        while (n <= pangkat){
        n++;
        hasil *= bil;
    }
    return hasil;
    }
    
    @Test
    public void Testpangkat1(){
        Soal s = new Soal();
        s.pangkat(1, 2);
        assertNotNull("seharusnya tidak eror", s);
    }
    
    @Test
    public void Testpangkat2(){
        Soal s = new Soal();
        s.pangkat(-1, 0);
        assertNotNull("ini eror",s);
    }
    
    @After
    public void AhirPangkat(){
        System.out.println("test pangkat usai");
    }    
    
    
    public int faktorial (int bil){
        int hasil = 1;
        for(int i=1;i<= bil;i++ ){
            hasil *= i;
        }
        return hasil;
    }
    
    public int perkalian(int bilA,int bilB){
        return bilA * bilB;
    }
    
}

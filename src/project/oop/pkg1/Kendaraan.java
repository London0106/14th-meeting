/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.oop.pkg1;

/**
 *
 * @author London
 */
public class Kendaraan {
    
   
    private String nama, jenis;
    
    public Kendaraan (){
        
    }
    
    public Kendaraan (String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public String getJenis(){
        return jenis;
    }
    }
    

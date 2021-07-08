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
public class Pengendaraan {
    
    
    private String name, genre;
    public Kendaraan r = new Kendaraan();
    
    public Pengendaraan(){
    } 
    public Pengendaraan (String name,String genre){
        this.name = name;
        this.genre = genre;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGenre (String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    public void setKendaraan(Kendaraan p){
        
        r = p;
    }
    public Kendaraan getKendaraan(){
        return r;
    }
}

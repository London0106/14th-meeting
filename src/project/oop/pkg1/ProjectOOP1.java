/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.oop.pkg1;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class ProjectOOP1 {
 
 static Pengendaraan p = new Pengendaraan();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        int i = 0;
        int j = 0;
        int temp = 0;
        
        String insertMobil;
        //1. kendaraan mobil
        //2. menampilkan mobil
        
       
        do{
        System.out.println("1.Kendaraan");
        
        System.out.println("2.Menampilkan Mobil");
        
        System.out.println("3.Pengendaraan");
        i = scan.nextInt();
            switch(i){
            case 1 :
                if (p.getName()==null && null == p.getGenre()){
                    System.out.println("You do not have the access to case 1.");
                }
                else{
                      System.out.println("===Kendaraan===");
                      System.out.println("Insert Kendaraan =");
                      p.r.setNama(scan.next());
                      System.out.println("Insert Jenis =");
                      p.r.setJenis(scan.next());
                
                      System.out.println("Succesfully updated.");
                }
                break;
            case 2 :
                if (p.getName()==null && null == p.getGenre()){
                    System.out.println("You do not have the acess to case 2.");
                }
                else{
                    System.out.println("===Menampilkan Mobil===");
                    System.out.println("Jenis Kendaraan = "+p.r.getJenis());
                
                    System.out.println("Kendaraan = "+p.r.getNama());
                }

                
                break;
            case 3 :
                System.out.println("===Pengendaraan===");
                System.out.println("Insert Pengendaraan =");
                p.setName(scan.next());
                System.out.println("Insert Genre =");
                p.setGenre(scan.next());
                break;
        }
          
        }while(i!=0);
        
        
        
            
    }
    
}

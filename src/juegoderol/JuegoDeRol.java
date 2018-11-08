/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoderol;

import java.util.Random;

import javax.swing.JOptionPane;

public class JuegoDeRol {
    
   public int golpebasico;
   public int critico;
   public int habilidadespecial;
   public String clase;
   public int hp;
   
   
   public JuegoDeRol (int gopebasico, int critico, int habilidadespecial, String clase, int hp){
   
   this.golpebasico = golpebasico;
   this.critico = critico;
   this.habilidadespecial = habilidadespecial;
   this.clase = clase;
   this.hp = hp;
   
   }

    
    public static void main(String[] args) {
        
        
        JuegoDeRol pj = new JuegoDeRol (10,15,17,"Barbaro",100);
       
       pj.golpebasico = 10;
       pj.critico = 15;
       pj.hp = 100;
       pj.clase = "Barbaro";
       pj.habilidadespecial = 17;
        
        
       
       JuegoDeRol pj2 = new JuegoDeRol (10,15,17,"Caballero",100);
       
       pj2.golpebasico = 10;
       pj2.critico = 14;
       pj2.hp = 100;
       pj2.clase = "Caballero";
       pj2.habilidadespecial = 15;
       
        
        Random golpebasico = new Random ();
        
        int gcaba = golpebasico.nextInt(10);
        int gbb = golpebasico.nextInt(10);
        
        int hp = 100-gcaba;
        int hp2 = 100-gbb;
        
        while (hp<10){    
            
            hp--;
        }
        JOptionPane.showMessageDialog(null, "ROUND 1");
                              
            JOptionPane.showMessageDialog(null, "primer golpe del Caballero = " + gcaba + " | Vida restante BB "+ hp2);
        
            JOptionPane.showMessageDialog(null, "primer golpe del Barbaro = " + gbb + " | Vida restante Caba "+ hp);
            
        JOptionPane.showMessageDialog(null, "ROUND 2");
                              
            JOptionPane.showMessageDialog(null, "primer golpe del Caballero = " + gcaba + " | Vida restante BB "+ hp2);
        
            JOptionPane.showMessageDialog(null, "primer golpe del Barbaro = " + gbb + " | Vida restante Caba "+ hp);
            
       JOptionPane.showMessageDialog(null, "ROUND 3");
                              
            JOptionPane.showMessageDialog(null, "primer golpe del Caballero = " + gcaba + " | Vida restante BB "+ hp2);
        
            JOptionPane.showMessageDialog(null, "primer golpe del Barbaro = " + gbb + " | Vida restante Caba "+ hp);
        }
    }
        
         
        
        
                
   


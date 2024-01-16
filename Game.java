/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompan.game;

public class Game {

    public static void main(String[] args) {
        //buatobjek
        
        Player hero= new Player ();
        Player enemy = new Player();
        
        hero.name = "dreamy";
        hero.speed =30;
        hero.healthpoin = 1000; 
       
        
        hero.attack=100;
        hero.demage= 100;
        hero.defend=100;
        hero.armor=100;
        
       
        
        enemy.name="Pandu";
         enemy.speed =30;
        enemy.healthpoin = 1000; 
        enemy.run();
        
        enemy.demage= 100;
        enemy.defend=100;
        enemy .armor=100;
        
        
        
         hero.run();
        hero.attack(enemy.name); 
       
        
        if(hero.isDead()){
            System.out.println(" game over :(");
        }
                
    }
}

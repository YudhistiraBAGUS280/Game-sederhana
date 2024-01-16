/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompan.game;

public class Player {
    String name;
    int speed;
    int healthpoin;//variable global
    int attack;
    int demage;
    int armor;
    int defend;
    void run(){
        System.out.println(name+"is running");
        System.out.println("speed"+speed);
    }
    
    void attack (String a ){
        System.out.println(name+" is attacking " + a);
        System.out.println("attack:"+ demage);
    }
    void defend (){
        System.out.println(name+"is  defend");
        System.out.println("defend:"+armor);
        
    } 
    
   
    boolean isDead (){
        if (healthpoin<=0)return true;
        return false;

}
    }


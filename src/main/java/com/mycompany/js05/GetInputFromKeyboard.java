/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Created by 21343032_Muhammad Rizky Sandyra

public class GetInputFromKeyboard {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in)); 
        
        String name = "", hoby="";
        
        try {
            System.out.print("Nama Anda: ");
            name = dataIn.readLine();
            System.out.print("Hobi Anda: ");
            hoby = dataIn.readLine();
        }
        
        catch (IOException e) {
            System.out.println("Gagal membaca keyboard");
        }
        
        System.out.println("Jadi hobi anda"+hoby+". Hobi yang bagus" + name);
    }
}

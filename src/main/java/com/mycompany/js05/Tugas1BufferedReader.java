/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Created by 21343032_Muhammad Rizky Sandyra

public class Tugas1BufferedReader {
    public static void main (String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String word1="", word2="", word3="";
        
        try{
            System.out.print("Enter word 1 : ");
            word1 = dataIn.readLine();
       
            System.out.print("Enter word 2 : ");
            word2 = dataIn.readLine();
            
            System.out.print("Enter word 3 : ");
            word3 = dataIn.readLine();
        }
        catch (IOException e) {
            System.out.println("Gagal membaca keyboard");
        }
        
        System.out.println(""+word1+" "+word2+" "+word3);
    }
}

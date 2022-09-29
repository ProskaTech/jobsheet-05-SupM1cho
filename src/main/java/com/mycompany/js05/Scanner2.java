/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js05;

import java.util.Scanner;

//Created by 21343032_Muhammad Rizky Sandyra

public class Scanner2 {
    public static void main(String[] args) {
        float angka1, angka2, jumlah;
        Scanner datamasuk =  new Scanner (System.in);
        
        System.out.print("Masukkan angka ke-1: ");
        angka1 = datamasuk.nextFloat();
        
        System.out.print("Masukkan angka ke-2: ");
        angka2 = datamasuk.nextFloat();
        
        jumlah = angka1 + angka2;
        
        System.out.println("Angka ke-1: " + angka1);
        System.out.println("Angka ke-2: " + angka2);
        System.out.println("Jumlah: " + jumlah);
    }
}

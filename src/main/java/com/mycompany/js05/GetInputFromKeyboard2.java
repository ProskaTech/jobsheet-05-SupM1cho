/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js05;

import javax.swing.JOptionPane;

//Created by 21343032_Muhammad Rizky Sandyra

public class GetInputFromKeyboard2 {
    public static void main(String[] args) {
        String name = "", hoby= "";
        
        name = JOptionPane.showInputDialog("Nama Anda: ");
        hoby = JOptionPane.showInputDialog("Hobi Anda: ");
        
        String msg = "Jadi hobi Anda "+hoby+"." + "Hobi yang bagus"+name;
        
        JOptionPane.showMessageDialog(null,msg);
        
        System.out.println("Jadi hobi " +hoby+ ". Hobi yang bagus" + name);
    }
}

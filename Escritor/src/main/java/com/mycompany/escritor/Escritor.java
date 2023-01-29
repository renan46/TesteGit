/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escritor;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Renan
 */
public class Escritor {
    public static void main (String [] args){
       escritor(); 
        
        
        
    }
    public static void escritor(){
            try{
           FileOutputStream arquivo =  new FileOutputStream("arquivo.txt");
           PrintWriter pr = new PrintWriter(arquivo);
           pr.println("arquivo 1 coluna 1; arquivo 2 coluna 2");
           
           
           
           pr.close();
           arquivo.close();
            
            
        }catch(Exception e){
            System.out.println("Erro ao escrever o arquivo");
        }
            
            
        
        
            
            
            
        }
    
    
}

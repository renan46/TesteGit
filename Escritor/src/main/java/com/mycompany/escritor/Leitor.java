/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escritor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;

/**
 *
 * @author Renan
 */
public class Leitor {
    
    
    
    public static void main(String[] args){
        
        String a = "arquivo.txt";
        
        lerarquivo(a);
        String b = "arquivo1.txt";
        lerarquivo(b);
        
   
    }   
    public static void lerarquivo(String a){
        
        String arq = a;
        try{
            
            FileInputStream arquivo = new FileInputStream(arq);
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br       = new BufferedReader(input);
            //String dados = new String(Files.readAllBytes(file.toPath()));
            String linha;
            
            do{
                linha = br.readLine();
                if(linha != null){
                    System.out.println("Lido " + linha);
                }
            }while(linha != null);                    
        }catch(Exception e){
            System.out.println("Erro ao ler o arquivo");
        }
                
    }
    
   
    
}

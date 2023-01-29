/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojainformatica;

/**
 *
 * @author Renan
 */
class LojaInformatica {
    
    private int id;
    private String marca;
    private String HD;
    private String processador;
    //Object getProcessador;
    
    public LojaInformatica(){ // contrutor vazio
        
    }
    
    public LojaInformatica(String marca, String HD, String processador) {
        this.marca = marca;
        this.HD = HD;
        this.processador = processador;
    }
    public LojaInformatica(int id,String marca, String HD, String processador) {
        
        this.id = id;
        this.marca = marca;
        this.HD = HD;
        this.processador = processador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getHD() {
        return HD;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    
    
    
    
}

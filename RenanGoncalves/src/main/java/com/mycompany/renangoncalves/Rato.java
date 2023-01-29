
package com.mycompany.renangoncalves;


public class Rato {
public static String origem = "America do sul";    
public Rato(){   
}
public Rato(String origem) {
this.origem = origem;
}
private String nome;
private double peso;
private String cor;
private int velocidade;

public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public double getPeso() {
return peso;
}
public void setPeso(double peso) {
this.peso = peso;
}

public String getCor() {
return cor;
}
public void setCor(String cor) {
this.cor = cor;
}

public void andar(){
    this.velocidade ++;
}
public void comer(){
    peso++;
}
    
}

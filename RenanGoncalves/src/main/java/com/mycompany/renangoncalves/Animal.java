
package com.mycompany.renangoncalves;

/**
 *
 * @author Renan do Nascimento Gonçalves - Noturno Turma C - 2º Semestre/2022 - ADO1
 */
public class Animal {
    
    
    public static void main(String[] args){
        Rato ratta = new Rato();
        ratta.setNome("Rattata");
        ratta.setCor("Cinza");
        ratta.setPeso(2);
        
        System.out.println(ratta.getNome());
        System.out.println(ratta.getCor());
        System.out.println(ratta.getPeso()+ " kg");
        
        System.out.println("---------------------------------");
        
        Rato raticate = new Rato();
        raticate.setNome("Raticate");
        raticate.setCor("Marrom");
        raticate.setPeso(4);
        
        System.out.println(raticate.getNome());
        System.out.println(raticate.getCor());
        System.out.println(raticate.getPeso()+ " kg");
        
    }
    
}

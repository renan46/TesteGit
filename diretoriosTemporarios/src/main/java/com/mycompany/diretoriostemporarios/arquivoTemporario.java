
package com.mycompany.diretoriostemporarios;

//import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class arquivoTemporario {
    
    public static void main(String [] args) throws Exception { // o que é throws exception ? 
        Path arquivoTemp1 = Files.createTempFile("prefixo - ", "txt");
        System.out.println("Arquivo temporario: " + arquivoTemp1);
        
        Path diretorioTemp = Files.createTempDirectory("dir-prefix-");
		System.out.println("Diretório temporário:" + diretorioTemp);
		
	Path arquivoTemp2 = Files.createTempFile(diretorioTemp, "prefixo-", ".txt");
        System.out.println("Arquivo temporário:" + arquivoTemp2); 
             
        Path arquivoMove = Files.move(arquivoTemp1, Path.of("./" + arquivoTemp1.getFileName()));
        System.out.println("Arquivo final" + arquivoMove);
                
    }
    
}

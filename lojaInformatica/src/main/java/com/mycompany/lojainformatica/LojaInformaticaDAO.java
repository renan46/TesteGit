
package com.mycompany.lojainformatica;

//import br.sp.senac.exemplojdbc.model.NotaFiscal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LojaInformaticaDAO {
    
    public static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    public static String login = "root";
    public static String senha = "";
    
    public static boolean salvar(LojaInformatica obj){
        
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            
            //TODO: Implementar insert na tabela NotaFiscal
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Abrir a conexão
            conexao = DriverManager.getConnection(url,login,senha);
            
            //Criar o comando sql                                               //mudar para loja
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO loja (marca,HD,processador) VALUES(?,?,?)");
            comandoSQL.setString(1,obj.getMarca());
            comandoSQL.setString(2,obj.getHD());
            comandoSQL.setString(3,obj.getProcessador());
            
            //Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
               retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }
    
    // constou um erro nessa public, se futuramente não sair, começar daqui
    public static ArrayList<LojaInformatica> listar(){
        
        Connection conexao = null;
        ArrayList<LojaInformatica> lista = new ArrayList<LojaInformatica>();
        
        try {
            //Implementar consulta à tabela NotaFiscal
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Abrir a conexão
            conexao = DriverManager.getConnection(url,login,senha);
            
            //Criar o comando SQL
            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT * FROM loja");
            
            //Executar o comando
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    LojaInformatica novoObjeto = new LojaInformatica();
                    novoObjeto.setId(rs.getInt("id"));
                    novoObjeto.setMarca(rs.getString("marca"));
                    novoObjeto.setHD(rs.getString("HD"));
                    novoObjeto.setProcessador(rs.getString("processador"));
                    
                    lista.add(novoObjeto);
                    
                }
            }
            
                    
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
    }
    
    public static LojaInformatica consultarPorID(int id){
        LojaInformatica lista = new LojaInformatica();

        //TODO: Implementar consulta à tabela NotaFiscal pelo id

        return lista;
    }
    
    public static boolean atualizar(LojaInformatica obj){
        
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            
            //TODO: Implementar insert na tabela NotaFiscal
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Abrir a conexão
            conexao = DriverManager.getConnection(url,login,senha);
            
            //Criar o comando sql
          //PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE NotaFiscal SET numeroNota=?, valorNota=? WHERE idNota = ?");                                                              
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE loja       SET marca=?,      HD=?, processador =? WHERE id = ?");
            comandoSQL.setString(1,obj.getMarca());
            comandoSQL.setString(2,obj.getHD());
            comandoSQL.setString(3,obj.getProcessador());
            comandoSQL.setInt(4,obj.getId());
            
            
            //Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
               retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return retorno;
    }
    
    public static boolean excluir(int id){
    
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            
            //TODO: Implementar insert na tabela NotaFiscal
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Abrir a conexão
            conexao = DriverManager.getConnection(url,login,senha);
            
            //Criar o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM loja WHERE id=?");
            comandoSQL.setInt(1,id);            
            
            //Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
               retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    
    }
    
    
}

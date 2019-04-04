/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fernando Callata
 */
public class Conexao {
    //JDBC driver name
    public static final String JDBC_DRIVER = "org.h2.Driver";

    //Database file URL
    public static final String DB_FILE_URL = "jdbc:h2:~/aluno";

    //Database memory URL
    public static final String DB_MEMORY_URL = "jdbc:h2:mem:testdb";

    //Database Credentials
    public static final String USER = "sa";
    public static final String PASS = "";

    private Connection conn = null;

    public Connection obtenhaConexao(String conexaoTipo)  {
        try {
            //STEP 1: Register JDBC Driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            if (!conexaoTipo.equalsIgnoreCase("file") 
                && !conexaoTipo.equalsIgnoreCase("memory")){
                throw new Exception("O tipo do banco de dados deve ser [file] ou [memory].");
            }else if (conexaoTipo.equalsIgnoreCase("file")) {
                conn = DriverManager.getConnection(DB_FILE_URL, USER, PASS);
            }else{
                conn = DriverManager.getConnection(DB_MEMORY_URL, USER, PASS);
            }
        }catch (SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch (Exception e){
            //Handle errors for Class.forName.
            e.printStackTrace();
        } //end try
        return conn;
    }
}

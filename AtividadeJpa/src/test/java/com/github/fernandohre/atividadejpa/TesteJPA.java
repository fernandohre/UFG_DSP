/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.fernandohre.atividadejpa;

import java.sql.SQLException;
import org.h2.tools.Server;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 *
 * @author aluno
 */
public class TesteJPA {
    protected static Server server = null;

    @BeforeSuite
    public void setup() throws SQLException{
        System.out.println("-----Iniciando o Server-----");
        server = Server.createTcpServer().start();
    }

    @AfterSuite
    public void after(){
        System.out.println("-----Encerrando o Server-----");
        if(server != null){
            server.stop();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fernando Callata
 */
public class Mapeador extends PersistenciaJdbc{

    public void prepareComando() throws Exception {
        preparePersistencia();
    }
    
    public void executeSql(String sql) throws SQLException {
        comando.executeUpdate(sql);
        System.out.println("Registro persistido com Sucesso!");
        comando.close();
        conexao.close();
    }
    
    public ResultSet obtenhaResultset(String sql) throws SQLException, Exception {
        this.prepareComando();
        return obtenhaComandoPreparado(sql).executeQuery();
    }
    
    public PreparedStatement obtenhaComandoPreparado(String sql) throws SQLException {
        return conexao.prepareStatement(sql);
    }
    
    public void fecharConexao() throws SQLException {
        conexao.close();
    }
    
    
}

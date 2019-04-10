/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia;

import br.com.fernandohre.dsp2019.aulas1316.ap.Modelo.Funcionario;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando Callata
 */
public class ServicoDeFuncionario implements IServico<Funcionario>{

    private Mapeador mapeador;
    
    public ServicoDeFuncionario() {
        mapeador = new Mapeador();
    }
    @Override
    public void insira(Funcionario dado) {
        try {
            mapeador.prepareComando();
            
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO FUNCIONARIO VALUES (");
            sql.append(dado.obtenhaId() + ", ");
            sql.append(dado.obtenhaMatricula() + ", ");
            sql.append(dado.obtenhaNome() + ");");
            
            mapeador.executeSql(sql.toString() );
            
        } catch (Exception ex) {
            
            Logger.getLogger(ServicoDeFuncionario.class.getName())
                  .log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void atualize(Funcionario dado) {
        try {
            mapeador.prepareComando();
            
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE FUNCIONARIO SET ");
            sql.append("ID = " + dado.obtenhaId() + ", ");
            sql.append("MATRICULA = " + dado.obtenhaMatricula() + ", ");
            sql.append("NOME = " + dado.obtenhaNome() + ";");
            
            mapeador.executeSql(sql.toString() );
            
        } catch (Exception ex) {
            
            Logger.getLogger(ServicoDeFuncionario.class.getName())
                  .log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Funcionario obenha(long id) {
        String sql = "SELECT ID, MATRICULA, NOME FROM FUNCIONARIO WHERE ID = " + id;
        try {
            ResultSet retorno = mapeador.obtenhaResultset(sql);
            while(retorno.next()) {
                Funcionario funcionario = new Funcionario(retorno.getLong("ID"),
                                                retorno.getString("NOME"),
                                                retorno.getLong("MATRICULA"));
                
                retorno.close();
                mapeador.fecharConexao();
                
                return funcionario;
            }
        } catch (Exception ex) {
            Logger.getLogger(ServicoDeFuncionario.class.getName())
                  .log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia.Instalacao;

import br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia.PersistenciaJdbc;

/**
 *
 * @author Fernando Callata
 */
public class FuncionarioCreate extends PersistenciaJdbc {
    @Override
    public boolean crieTabela() throws Exception{

        preparePersistencia();

        System.out.println("Criando a tabela FUNCIONARIO");

        String sql = "CREATE TABLE IF NOT EXISTS FUNCIONARIO(\n" +
                "ID LONG NOT NULL PRIMARY KEY,\n" +
                "MATRICULA VARCHAR(15) NOT NULL," +
                "NOME VARCHAR(100) NOT NULL\n" +
                ")";

        comando.executeUpdate(sql);

        System.out.println("Tabela FUNCIONARIO criada com sucesso!");

        //STEP 4: Clean-up environment
        comando.close();
        conexao.close();
        return true;
    }
}

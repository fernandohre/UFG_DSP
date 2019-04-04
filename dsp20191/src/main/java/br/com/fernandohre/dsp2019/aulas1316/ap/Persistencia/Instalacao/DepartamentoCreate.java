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
public class DepartamentoCreate extends PersistenciaJdbc {
    public boolean crieTabela() throws Exception{

        preparePersistencia();

        System.out.println("Criando a tabela DEPARTAMENTO");

        String sql = "CREATE TABLE IF NOT EXISTS DEPARTAMENTO(\n" +
                "ID LONG NOT NULL PRIMARY KEY,\n" +
                "DESCRICAO VARCHAR(15) NOT NULL," + ")";

        comando.executeUpdate(sql);

        System.out.println("Tabela DEPARTAMENTO criada com sucesso!");

        //STEP 4: Clean-up environment
        comando.close();
        conexao.close();
        return true;
    }
}

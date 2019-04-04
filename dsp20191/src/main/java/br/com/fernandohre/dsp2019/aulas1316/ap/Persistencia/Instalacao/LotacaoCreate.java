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
public class LotacaoCreate extends PersistenciaJdbc {
    public boolean crieTabela() throws Exception{

        preparePersistencia();

        System.out.println("Criando a tabela LOTACAO");

        String sql = "CREATE TABLE IF NOT EXISTS CARGO(\n" +
                "ID LONG NOT NULL PRIMARY KEY,\n" +
                "CARGO LONG NOT NULL, " +
                "DEPARTAMENTO LONG NOT NULL, " +
                "DATAINICIAL LONG NOT NULL, " +
                "DATA FINAL LONG NOT NULL, " +
                "FOREIGN KEY (CARGO) REFERENCES CARGO(ID), " +
                "FOREIGN KEY (DEPARTAMENTO) REFERENCES DEPARTAMENTO(ID)" +
                ")";

        comando.executeUpdate(sql);

        System.out.println("Tabela LOTACAO criada com sucesso!");

        comando.close();
        conexao.close();
        return true;
    }
}

package br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia;

import java.sql.Connection;
import java.sql.Statement;

public class PersistenciaJdbc {
    protected Connection conexao = null;
    protected Statement comando = null;
    protected Conexao criaConexao = new Conexao();
    protected String conexaoTipo = "file";

    protected void preparePersistencia() throws Exception{

        //STEP 3: Open a connection
        conexao = criaConexao.obtenhaConexao(conexaoTipo);


        //STEP 4: Execute a SQL statement
        comando = conexao.createStatement();

    }
    
    public boolean crieTabela() throws Exception { return false;}
}

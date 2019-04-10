/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas1316.ap.Cliente;

import br.com.fernandohre.dsp2019.aulas1316.ap.Modelo.Lotacao;
import br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia.Instalacao.CargoCreate;
import br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia.Instalacao.DepartamentoCreate;
import br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia.Instalacao.FuncionarioCreate;
import br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia.Instalacao.LotacaoCreate;
import br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia.PersistenciaJdbc;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando Callata
 */
public class Principal {
    public static void main(String args[]) throws Exception {
        System.out.println("Criando tabelas...");
        List<PersistenciaJdbc> tabelas = new ArrayList<PersistenciaJdbc>();
        tabelas.add(new CargoCreate());
        tabelas.add(new FuncionarioCreate());
        tabelas.add(new DepartamentoCreate());
        tabelas.add(new LotacaoCreate());
        
        for(PersistenciaJdbc item : tabelas) {
            item.crieTabela();
        }
    }
    
    public static void menu() {
        System.out.println("");
    }
}

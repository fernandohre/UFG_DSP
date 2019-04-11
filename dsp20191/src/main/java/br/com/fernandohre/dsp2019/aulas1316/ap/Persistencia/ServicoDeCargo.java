/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia;

import br.com.fernandohre.dsp2019.aulas1316.ap.Modelo.Cargo;

/**
 *
 * @author Alunoinf_2
 */
public class ServicoDeCargo implements IServico<Cargo>{

    private Mapeador mapeador;
    
    public ServicoDeCargo() {
        mapeador = new Mapeador();
    }
    
    @Override
    public void insira(Cargo dado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualize(Cargo dado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cargo obenha(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

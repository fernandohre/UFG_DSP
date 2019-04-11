/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia;

import br.com.fernandohre.dsp2019.aulas1316.ap.Modelo.Lotacao;

/**
 *
 * @author Fernando Callata
 */
public class ServicoDeLotacao implements IServico<Lotacao>{

    private Mapeador mapeador;
    
    public ServicoDeLotacao() {
        mapeador = new Mapeador();
    }
    
    @Override
    public void insira(Lotacao dado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualize(Lotacao dado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lotacao obenha(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

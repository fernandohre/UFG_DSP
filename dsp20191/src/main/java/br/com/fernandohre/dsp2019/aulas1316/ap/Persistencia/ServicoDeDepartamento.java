/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia;

import br.com.fernandohre.dsp2019.aulas1316.ap.Modelo.Departamento;

/**
 *
 * @author Fernando Callata
 */
public class ServicoDeDepartamento implements IServico<Departamento> {

    private Mapeador mapeador;
    
    public ServicoDeDepartamento() {
        mapeador = new Mapeador();
    }
    
    @Override
    public void insira(Departamento dado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualize(Departamento dado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Departamento obenha(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas1316.ap;

import java.util.Date;

/**
 *
 * @author Fernando Callata
 */
public class Lotacao {
    private long id;
    private Date dataInicial;
    private Date dataFinal;
    private Cargo cargo;
    private Departamento departamento;
    
    public Lotacao(long id, Date dataInicial, Date dataFinal, 
                   Cargo cargo, Departamento departamento) {
        this.id = id;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cargo = cargo;
        this.departamento = departamento;
    }
    
    public Date obtenhaDataInicial() {
        return this.dataInicial;
    }
    
    public Date obtenhaDataFinal() {
        return this.dataFinal;
    }
    
    public Cargo obtenhaCargo() {
        return this.cargo;
    }
    
    public Departamento obtenhaDepartamento() {
        return this.departamento;
    }
}

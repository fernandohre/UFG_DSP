/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas1316.ap;

/**
 *
 * @author Alunoinf_2
 */
public abstract class ObjetoIdentificador {
    private long id;
    private String nome;
    
    public ObjetoIdentificador(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public long obtenhaId() {
        return id;
    }
    
    public String obtenhaNome() {
        return nome;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas1316.ap.Modelo;

/**
 *
 * @author Fernando Callata
 */
public class Funcionario extends ObjetoIdentificador{
    
    private long matricula;
    
    public Funcionario(long id, String nome, long matricula) {
        super(id, nome);
        this.matricula = matricula;
    }
    
    public long obtenhaMatricula() {
        return matricula;
    }
}

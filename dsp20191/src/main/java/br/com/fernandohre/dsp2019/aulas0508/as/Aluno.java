/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas0508.as;

/**
 * Classe de negócio que representa a entidade aluno.
 * 
 * @author Fernando Callata
 */
public class Aluno {
    private String nome;
    private long matricula;
    private double nota1;
    private double nota2;
    
    public Aluno(String nome, long matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public String obtenhaNome() {
        return this.nome;
    }
    
    public long obtenhaMatricula() {
        return this.matricula;
    }
    
    public double obtenhaPrimeiraNota() {
        return this.nota1;
    }
    
    public double obtanhaSegundaNota() {
        return this.nota2;
    }
}

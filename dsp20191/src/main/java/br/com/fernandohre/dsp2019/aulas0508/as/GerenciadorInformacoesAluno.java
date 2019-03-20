/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas0508.as;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Fernando Callata
 */
public class GerenciadorInformacoesAluno {
    private static GerenciadorInformacoesAluno instancia;
    private static DataOutputStream escritorArquivo;
    
    private FileOutputStream obtenhaArquivo() throws FileNotFoundException {
        return new FileOutputStream("src/main/resources/avaliacao.dat");
    }
    private GerenciadorInformacoesAluno() {}
    
    public static GerenciadorInformacoesAluno contexto() {
        if (instancia == null) {
            instancia = new GerenciadorInformacoesAluno();
            return instancia;
        }
        return instancia;
    }
    
    public Aluno instancieAluno(String nome, 
                                long matricula, 
                                double nota1, 
                                double nota2) 
    {
        return new Aluno(nome, matricula, nota1, nota2);
    }
    
    public void persistaAluno(Aluno aluno) throws FileNotFoundException, IOException {
        if (escritorArquivo == null) {
            escritorArquivo = new DataOutputStream(obtenhaArquivo());
        }
        escritorArquivo.writeChars(aluno.obtenhaNome());
        escritorArquivo.writeLong(aluno.obtenhaMatricula());
        escritorArquivo.writeDouble(aluno.obtenhaPrimeiraNota());
        escritorArquivo.writeDouble(aluno.obtanhaSegundaNota());
        
        escritorArquivo.flush();  
        escritorArquivo.close(); 
        System.out.println("Arquivo gravado com sucesso!");
    }
}

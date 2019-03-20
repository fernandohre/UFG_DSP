/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas0508.as;

import br.com.fernandohre.dsp2019.aulas0104.ap.LeitorDeArquivo;
import java.io.IOException;

/**
 * Programa principal que faz a chamada de outras classes, montando o objeto 
 * aluno, persiste o arquivo e lê o mesmo.
 * 
 * @author Fernando Callata
 */
public class ProgramaAluno {
    public static void main(String args[])  {
        
        try {
            GerenciadorInformacoesAluno
                    .contexto()
                    .persistaAluno(GerenciadorInformacoesAluno
                                   .contexto()
                                   .instancieAluno("Fernando Callata", 
                                                   201609821, 
                                                   10, 
                                                   10));
            
            LeitorDeArquivo
            .Instancia()
            .leia("src/main/resources/avaliacao.dat");
        } catch(IOException excecao) {
            System.out.println("Erro na leitura do arquivo");
            excecao.printStackTrace();
        }
        
        
        
    }
}

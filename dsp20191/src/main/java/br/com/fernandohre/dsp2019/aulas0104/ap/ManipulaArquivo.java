
package br.com.fernandohre.dsp2019.aulas0104.ap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Fernando Callata
 */
public class ManipulaArquivo {
    public static void main(String[] args) {
        
        String nomeArquivo = new File("src/main/resources/arquivo.txt")
                                 .getAbsolutePath();
        escrevaArquivo("Disciplina para software persistente", nomeArquivo);
        
        escrevaArquivo("arquivo csv será lido....", nomeArquivo);
        
        LeitorDeArquivo
        .Instancia()
        .obtenhaUnidadesFederativas(
                new File("src/main/resources/UF.csv").getAbsolutePath(),
                ",")
        .forEach((item) -> {
            System.out.println("---------------------------");
            System.out.println("Identificador: " + item.obtenhaIdentificador());
            System.out.println("Sigla: " + item.obtenhaSigla());
            System.out.println("Descrição: " + item.obtenhaDescricao());
            System.out.println("Código Região: " + item.obtenhaCodigoRegiao());
        });
    }
    
    private static void escrevaArquivo(String mensagem, 
                                       String caminhoNomeArquivo) {
        File arquivo = new File(caminhoNomeArquivo);
        FileWriter fr = null;
        try {
            fr = new FileWriter(arquivo);
            fr.write(mensagem);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

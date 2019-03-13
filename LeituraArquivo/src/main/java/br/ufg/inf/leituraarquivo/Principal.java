
package br.ufg.inf.leituraarquivo;

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
public class Principal {
    public static void main(String[] args) {
        
        String nomeArquivo = new File("src/main/resources/arquivo.txt")
                                 .getAbsolutePath();
        escrevaArquivo("Disciplina para software persistente", nomeArquivo);
        
        exibaConteudoArquivo(nomeArquivo);
    }
    
    private static void exibaConteudoArquivo(String nomeArquivoCaminho) {
        String linha = null;

        try {
            FileReader leitorDeArquivo = new FileReader(nomeArquivoCaminho);

            BufferedReader leitorDeBuffer = new BufferedReader(leitorDeArquivo);

            while((linha = leitorDeBuffer.readLine()) != null) {
                System.out.println(linha);
            }
            
            leitorDeBuffer.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Não foi possível abrir o arquivo '" + 
                nomeArquivoCaminho + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Erro na leitura do arquivo '" 
                + nomeArquivoCaminho + "'");
        }
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


package br.ufg.inf.leituraarquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Fernando Callata
 */
public class Principal {
    public static void main(String[] args) {
        
        String nomeArquivo = new File("src/main/resources/arquivo.txt")
                                 .getAbsolutePath();
        String linha = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(nomeArquivo);

            // Always wrap FileReader in BufferedReader.
            BufferedReader leitorDeBuffer = new BufferedReader(fileReader);

            while((linha = leitorDeBuffer.readLine()) != null) {
                System.out.println(linha);
            }   

            // Always close files.
            leitorDeBuffer.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Não foi possível abrir o arquivo '" + 
                nomeArquivo + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Erro na leitura do arquivo '" 
                + nomeArquivo + "'");
        }
    }
}

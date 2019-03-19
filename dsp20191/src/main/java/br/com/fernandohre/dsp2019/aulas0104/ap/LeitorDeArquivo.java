/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas0104.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando Callata
 */
public class LeitorDeArquivo {
    
    private static LeitorDeArquivo instancia;
    
    private LeitorDeArquivo() {
    }
    
    public static LeitorDeArquivo Instancia() {
        if (instancia == null) {
            instancia = new LeitorDeArquivo();
            return instancia;
        }
        return instancia;
    }
    public void leia(String arquivoCaminho) {
        String linha = null;

        try {
            FileReader leitorDeArquivo = new FileReader(arquivoCaminho);

            BufferedReader leitorDeBuffer = new BufferedReader(leitorDeArquivo);

            while((linha = leitorDeBuffer.readLine()) != null) {
                System.out.println(linha);
            }
            
            leitorDeBuffer.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Não foi possível abrir o arquivo '" + 
                arquivoCaminho + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Erro na leitura do arquivo '" 
                + arquivoCaminho + "'");
        }
    }
    
    public List<UnidadeFederativa> obtenhaUnidadesFederativas(
            String arquivoCaminho, 
            String codigoSeparador) {
        
        String linha = null;
        List<UnidadeFederativa> lista = new ArrayList<UnidadeFederativa>();
        try {
            FileReader leitorDeArquivo = new FileReader(arquivoCaminho);

            BufferedReader leitorDeBuffer = new BufferedReader(leitorDeArquivo);

            while((linha = leitorDeBuffer.readLine()) != null) {
                String[] dados = linha.split(codigoSeparador);
                //Para desprezar a primeira linha do arquivo
                if (dados.length < 4) {
                    continue;
                }
                UnidadeFederativa item = new UnidadeFederativa(
                        dados[0],
                        dados[1],
                        dados[2],
                        dados[3]);
                lista.add(item);
            }
            
            leitorDeBuffer.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Não foi possível abrir o arquivo '" + 
                arquivoCaminho + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Erro na leitura do arquivo '" 
                + arquivoCaminho + "'");
        }
        return lista;
    }
}

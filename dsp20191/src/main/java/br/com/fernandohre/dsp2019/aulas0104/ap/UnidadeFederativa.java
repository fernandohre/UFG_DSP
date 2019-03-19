/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas0104.ap;

/**
 *
 * @author Fernando Callata
 */
public class UnidadeFederativa {
    private String identificador;
    private String sigla;
    private String descricao;
    private String codigoRegiao;
    
    public UnidadeFederativa(String iden, 
                             String sigla, 
                             String desc, 
                             String codRegiao) {
        this.identificador = iden;
        this.sigla = sigla;
        this.descricao = desc;
        this.codigoRegiao = codRegiao;
    }
    
    public String obtenhaIdentificador() {
        return this.identificador;
    }
    
    public String obtenhaSigla() {
        return this.sigla;
    }
    
    public String obtenhaDescricao() {
        return this.descricao;
    }
    
    public String obtenhaCodigoRegiao() {
        return this.codigoRegiao;
    }
}

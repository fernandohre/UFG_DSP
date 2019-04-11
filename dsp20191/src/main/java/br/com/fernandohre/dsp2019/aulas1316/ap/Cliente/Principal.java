/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernandohre.dsp2019.aulas1316.ap.Cliente;

import br.com.fernandohre.dsp2019.aulas1316.ap.Modelo.Lotacao;
import br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia.Instalacao.CargoCreate;
import br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia.Instalacao.DepartamentoCreate;
import br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia.Instalacao.FuncionarioCreate;
import br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia.Instalacao.LotacaoCreate;
import br.com.fernandohre.dsp2019.aulas1316.ap.Persistencia.PersistenciaJdbc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando Callata
 */
public class Principal {
    private static Scanner leitor = new Scanner(System.in);
    
    public static void main(String args[]) throws Exception {
        System.out.println("Criando tabelas...");
        List<PersistenciaJdbc> tabelas = new ArrayList<PersistenciaJdbc>();
        tabelas.add(new CargoCreate());
        tabelas.add(new FuncionarioCreate());
        tabelas.add(new DepartamentoCreate());
        tabelas.add(new LotacaoCreate());
        
        tabelas.forEach(conceito -> {
            try {
                conceito.crieTabela();
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }
    
    public static void menu() {
        System.out.println(" OPERAÇÕES ");
        System.out.println(" 1 - Cadastrar");
        System.out.println(" 2 - Atualizar");
        System.out.println(" 3 - Consultar");
    }
    
    public static void conceitos() {
        System.out.println("Selecione o conceito : ");
        System.out.println("1 - Funcionario");
        System.out.println("2 - Departamento");
        System.out.println("3 - Cargo");
        System.out.println("4 - Lotacao");
        System.out.println("5 - Voltar Tela de Operações");
    }
}

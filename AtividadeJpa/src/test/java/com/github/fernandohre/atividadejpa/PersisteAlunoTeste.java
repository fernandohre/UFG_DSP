/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.fernandohre.atividadejpa;

import com.gihub.fernandohre.atividadejpa.persistencia.Servico;
import com.github.fernandohre.atividadejpa.model.Aluno;
import static java.lang.Math.log;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author aluno
 */
public class PersisteAlunoTeste extends TesteJPA{
    
    private Servico<Aluno> servico = new Servico<Aluno>();
    @Test
    public void TestaPersistenciaPessoa(){
        System.out.println("Persiste Aluno Teste");
        Aluno aluno = new Aluno();
        Aluno novo = servico.saveOrUpdate(aluno);
        if(novo != null){
            Assert.assertTrue(novo.getId() == 1L);
        }else{
            System.out.println("Erro ao persistir a Pessoa");
            Assert.assertTrue(false);
        }
    }
}

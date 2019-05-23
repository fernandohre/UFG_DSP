/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.fernandohre.atividadejpa.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author aluno
 */
@Data
@NoArgsConstructor
@Entity
public class Aluno implements Entidade{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aluno_id")
    private Long id;
    private long matricula;
    private String nome;
    
    @ManyToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Turma> turmas;
    
    public Long getId() {
        return id;
    }

    
}

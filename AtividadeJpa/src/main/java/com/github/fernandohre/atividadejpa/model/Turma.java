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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

@Data
@NoArgsConstructor
@Entity
public class Turma implements Entidade{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "turma_id")
    private Long id;
    private String descricao;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "turma",
            joinColumns = {@JoinColumn(name = "turma_id")},
            inverseJoinColumns = {@JoinColumn(name = "aluno_id")})
    private List<Aluno> alunos;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "turma",
            joinColumns = {@JoinColumn(name = "turma_id")},
            inverseJoinColumns = {@JoinColumn(name = "professor_id")})
    private List<Professor> professores;
    
    public Turma(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
}

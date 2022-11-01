package com.projetounidade2.projetorestapisecurity.model;

import java.util.List;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "ListaDeEstudos")
public class ListaDeEstudos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Questao> questoes;

    @ManyToOne()
    private Usuario usuario;
}

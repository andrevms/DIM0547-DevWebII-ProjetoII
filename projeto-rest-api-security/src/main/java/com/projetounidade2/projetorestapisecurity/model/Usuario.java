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
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String email;

    private String senha;

    @OneToMany(fetch = FetchType.LAZY)
    private List<ListaDeEstudos> listaDeEstudos;

}

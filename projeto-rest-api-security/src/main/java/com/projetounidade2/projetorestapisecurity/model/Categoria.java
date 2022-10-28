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
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String categoria;

    @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY)
    private List<Questao> questoes;

}

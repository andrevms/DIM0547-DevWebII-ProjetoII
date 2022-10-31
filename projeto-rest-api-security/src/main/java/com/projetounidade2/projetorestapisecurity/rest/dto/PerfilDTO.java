package com.projetounidade2.projetorestapisecurity.rest.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.boot.context.properties.ConstructorBinding;

import com.projetounidade2.projetorestapisecurity.model.Perfil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PerfilDTO {

    private Long id;
    private String nome;

    public PerfilDTO(Perfil perfil) {
        this.id = perfil.getId();
        this.nome = perfil.getNome();
    }

    public static List<PerfilDTO> converter(List<Perfil> perfis) {
        return perfis.stream().map(PerfilDTO::new).collect(Collectors.toList());
    }
}

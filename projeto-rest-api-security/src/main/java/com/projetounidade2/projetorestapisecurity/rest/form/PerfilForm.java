package com.projetounidade2.projetorestapisecurity.rest.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.projetounidade2.projetorestapisecurity.model.Perfil;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PerfilForm {

    @NotBlank @NotNull
    private String nome;

    public Perfil converter() {
        Perfil perfil = new Perfil();
        perfil.setNome(this.nome);
        return perfil;
    }

}

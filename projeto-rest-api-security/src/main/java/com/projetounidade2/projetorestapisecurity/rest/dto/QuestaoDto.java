package com.projetounidade2.projetorestapisecurity.rest.dto;

import com.projetounidade2.projetorestapisecurity.model.Questao;

import lombok.Data;

@Data
public class QuestaoDto {
    private Integer id;
    private String enunciado;

    public static QuestaoDto from(Questao questao) {
        var dto = new QuestaoDto();
        dto.setEnunciado(questao.getEnunciado());
        dto.setId(questao.getId());
        return dto;
    }
}

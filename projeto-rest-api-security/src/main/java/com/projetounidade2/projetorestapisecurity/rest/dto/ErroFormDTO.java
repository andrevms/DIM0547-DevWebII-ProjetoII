package com.projetounidade2.projetorestapisecurity.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErroFormDTO {

    private String campo;
    private String erro;
}

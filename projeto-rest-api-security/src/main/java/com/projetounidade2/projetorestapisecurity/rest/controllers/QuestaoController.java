package com.projetounidade2.projetorestapisecurity.rest.controllers;

import java.util.List;
import java.net.URI;

import javax.validation.Valid;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;

import com.projetounidade2.projetorestapisecurity.model.Questao;
import com.projetounidade2.projetorestapisecurity.rest.dto.QuestaoDto;
import com.projetounidade2.projetorestapisecurity.rest.form.QuestaoForm;
import com.projetounidade2.projetorestapisecurity.service.QuestaoService;
import lombok.*;

@RestController
@RequestMapping("api/questoes")
@RequiredArgsConstructor
public class QuestaoController {
    private final QuestaoService questaoService;

    @GetMapping
    public ResponseEntity<List<QuestaoDto>> listarQuestoes() {
        List<Questao> res = questaoService.getListQuestao();
        var list = res.stream().map(a -> QuestaoDto.from(a)).toList();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<QuestaoDto> save(@RequestBody @Valid QuestaoForm form, UriComponentsBuilder uriBuilder) {
        Questao questao = form.converter();
        questaoService.saveQuestao(questao);

        URI uri = uriBuilder.path("/questoes/{id}").buildAndExpand(questao.getId()).toUri();
        return ResponseEntity.created(uri).body(new QuestaoDto(questao));
    }
    
}

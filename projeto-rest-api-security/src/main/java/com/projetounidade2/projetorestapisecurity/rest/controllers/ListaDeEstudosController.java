package com.projetounidade2.projetorestapisecurity.rest.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetounidade2.projetorestapisecurity.model.ListaDeEstudos;
import com.projetounidade2.projetorestapisecurity.rest.dto.lista_de_estudos.CriarListaDeEstudosDto;
import com.projetounidade2.projetorestapisecurity.service.ListaDeEstudosService;

@RestController
@RequestMapping("api/lista-de-estudos")
public class ListaDeEstudosController {

    @Autowired
    ListaDeEstudosService service;

    @PostMapping
    public ResponseEntity<ListaDeEstudos> criar(@RequestBody @Valid CriarListaDeEstudosDto params) {
        return ResponseEntity.ok(service.criar(params));
    }
    
}

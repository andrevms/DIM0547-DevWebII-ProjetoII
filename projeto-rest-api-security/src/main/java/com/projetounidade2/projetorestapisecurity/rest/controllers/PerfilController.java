package com.projetounidade2.projetorestapisecurity.rest.controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

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

import com.projetounidade2.projetorestapisecurity.model.Perfil;
import com.projetounidade2.projetorestapisecurity.rest.dto.PerfilDTO;
import com.projetounidade2.projetorestapisecurity.rest.form.PerfilForm;
import com.projetounidade2.projetorestapisecurity.service.PerfilService;

@RestController
@RequestMapping("api/perfis")
public class PerfilController {

    @Autowired
    PerfilService perfilService;

    @GetMapping
    public List<PerfilDTO> find() {
        List<Perfil> perfis = perfilService.getListPerfil();
        return PerfilDTO.converter(perfis);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PerfilDTO> save(@RequestBody @Valid PerfilForm form, UriComponentsBuilder uriBuilder) {
        Perfil perfil = form.converter();
        perfilService.savePerfil(perfil);

        URI uri = uriBuilder.path("/perfis/{id}").buildAndExpand(perfil.getId()).toUri();
        return ResponseEntity.created(uri).body(new PerfilDTO(perfil));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody PerfilForm perfil) {
        try {
            perfilService.atualizarPerfil(id, perfil.getNome());
        } catch (Exception e) {
           throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Perfil não encontrado");
        }
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id) {
        try {
            perfilService.removePerfil(id);
        } catch (Exception e) {
           throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Perfil não encontrado");
        }
    }

}

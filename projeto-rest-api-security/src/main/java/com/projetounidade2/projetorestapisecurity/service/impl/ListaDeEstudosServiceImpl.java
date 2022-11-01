package com.projetounidade2.projetorestapisecurity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import com.projetounidade2.projetorestapisecurity.model.ListaDeEstudos;
import com.projetounidade2.projetorestapisecurity.repository.ListaDeEstudosRepository;
import com.projetounidade2.projetorestapisecurity.service.ListaDeEstudosService;

@Component
public class ListaDeEstudosServiceImpl implements ListaDeEstudosService {

    @Autowired
    ListaDeEstudosRepository listaDeEstudosRepository;

    @Override
    public void remover(int id) {
        // TODO: simulando recuperação de usuário da sessão
        var usuarioId = 1;

        var listaDeEstudos = listaDeEstudosRepository.findById(id);

        if (!listaDeEstudos.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Lista de Estudos não existe");
        }

        var listaDeEstudosFinal = listaDeEstudos.get();

        if (listaDeEstudosFinal.getUsuario().getId() != usuarioId) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuário não pode remover esta lista");
        }

        listaDeEstudosRepository.delete(listaDeEstudosFinal);
    }

    @Override
    public List<ListaDeEstudos> listar() {
        // TODO: simulando recuperação de usuário da sessão
        var usuarioId = 1;
        return listaDeEstudosRepository.listar(usuarioId);
    }

    @Override
    public void adicionarQuestao(int listaId, int questaoId) {
        // TODO Auto-generated method stub
        // adicionar questão à lista de questões        
    }
}

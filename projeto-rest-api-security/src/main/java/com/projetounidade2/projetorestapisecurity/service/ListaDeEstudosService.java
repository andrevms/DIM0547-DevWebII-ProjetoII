package com.projetounidade2.projetorestapisecurity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projetounidade2.projetorestapisecurity.model.ListaDeEstudos;

@Service
public interface ListaDeEstudosService {

    public ListaDeEstudos saveListaDeEstudos(ListaDeEstudos listaDeEstudos);

    public void removeListaDeEstudos(ListaDeEstudos listaDeEstudos);

    public ListaDeEstudos getListaDeEstudosById(Integer id);

    public List<ListaDeEstudos> getListListaDeEstudos();
}

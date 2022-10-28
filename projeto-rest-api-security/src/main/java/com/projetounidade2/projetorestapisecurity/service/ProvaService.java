package com.projetounidade2.projetorestapisecurity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projetounidade2.projetorestapisecurity.model.Prova;


@Service
public interface ProvaService {

    public Prova saveProva(Prova prova);

    public void atualizarProva(int id, String prova);

    public void removeProvaById(int id);

    public Prova getProvaById(Integer id);

    public List<Prova> getListProva();
}

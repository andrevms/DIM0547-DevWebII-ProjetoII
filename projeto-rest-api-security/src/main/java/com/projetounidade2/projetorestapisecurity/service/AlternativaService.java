package com.projetounidade2.projetorestapisecurity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projetounidade2.projetorestapisecurity.model.Alternativa;

@Service
public interface AlternativaService {
    public Alternativa saveAlternativa(Alternativa alternativa);

    public void removeAlternativa(String id);

    public Alternativa getAlternativaById(Integer id);

    public List<Alternativa> getListAlternativa();

    public void atualizarAlternativa(int id, String alt);
}

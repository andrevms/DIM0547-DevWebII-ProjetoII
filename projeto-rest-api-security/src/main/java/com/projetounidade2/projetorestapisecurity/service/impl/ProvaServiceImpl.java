package com.projetounidade2.projetorestapisecurity.service.impl;
/*
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.imd.projeto.web.estudaconcursos.model.Prova;
import br.com.imd.projeto.web.estudaconcursos.repository.ProvaRepository;
import org.springframework.data.domain.Sort;

@Component
public class ProvaServiceImpl implements ProvaService {
    @Autowired
    ProvaRepository provaRepository;

    @Override
    public Prova saveProva(Prova prova) {
        return provaRepository.save(prova);
    }

    @Override
    public void removeProvaById(int id) {
        provaRepository.deleteById(id);
    }

    @Override
    public Prova getProvaById(Integer id) {
        return provaRepository.findById(id).map(prova -> {
            return prova;
        }).orElseThrow(() -> null);
    }

    @Override
    public List<Prova> getListProva() {
        return provaRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @Override
    public void atualizarProva(int id, String prova) {
        Prova p = provaRepository.getReferenceById(id);
        p.setProvaNome(prova);
        provaRepository.save(p);
    }
}
 */
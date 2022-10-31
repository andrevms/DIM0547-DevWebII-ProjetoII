package com.projetounidade2.projetorestapisecurity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projetounidade2.projetorestapisecurity.model.Perfil;
import com.projetounidade2.projetorestapisecurity.repository.PerfilRepository;
import com.projetounidade2.projetorestapisecurity.service.PerfilService;


@Component
public class PerfilServiceImpl implements PerfilService {

    @Autowired
    PerfilRepository perfilRepository;

    @Override
    public Perfil savePerfil(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    @Override
    public void removePerfil(Long id) {
       perfilRepository.deleteById(id);
    }

    @Override
    public Perfil getPerfilById(Long id) {
        return perfilRepository
                        .findById(id)
                        .map(
                            perfil -> {
                                return perfil;
                            }
                        ).orElseThrow(
                            () -> null
                        );
    }

    @Override
    public List<Perfil> getListPerfil() {
        return perfilRepository.findAll();
    }

    @Override
    public void atualizarPerfil(Long id, String nome) {
      var p = perfilRepository.getReferenceById(id);
      p.setNome(nome);
      perfilRepository.save(p);
    }
   
}
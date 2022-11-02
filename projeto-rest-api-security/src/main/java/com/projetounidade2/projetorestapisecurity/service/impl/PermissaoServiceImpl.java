package com.projetounidade2.projetorestapisecurity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projetounidade2.projetorestapisecurity.model.Permissao;
import com.projetounidade2.projetorestapisecurity.repository.PermissaoRepository;
import com.projetounidade2.projetorestapisecurity.service.PermissaoService;


@Component
public class PermissaoServiceImpl implements PermissaoService {

    @Autowired
    PermissaoRepository permissaoRepository;

    @Override
    public Permissao savePermissao(Permissao permissao) {
        return permissaoRepository.save(permissao);
    }

    @Override
    public void removePermissao(Long id) {
       permissaoRepository.deleteById(id);
    }

    @Override
    public Permissao getPermissaoById(Long id) {
        return permissaoRepository
                        .findById(id)
                        .map(
                            permissao -> {
                                return permissao;
                            }
                        ).orElseThrow(
                            () -> null
                        );
    }

    @Override
    public List<Permissao> getListPermissao() {
        return permissaoRepository.findAll();
    }

    @Override
    public void atualizarPermissao(Long id, String nome) {
      var p = permissaoRepository.getReferenceById(id);
      p.setNome(nome);
      permissaoRepository.save(p);
    }
   
}
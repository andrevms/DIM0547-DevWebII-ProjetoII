package com.projetounidade2.projetorestapisecurity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projetounidade2.projetorestapisecurity.model.Perfil;

@Service
public interface PerfilService {
    public Perfil savePerfil(Perfil perfil);

    public void removePerfil(Long id);

    public Perfil getPerfilById(Long id);

    public List<Perfil> getListPerfil();

    public void atualizarPerfil(Long id, String nome);
}

package com.projetounidade2.projetorestapisecurity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projetounidade2.projetorestapisecurity.model.Usuario;


@Service
public interface UsuarioService {
    
    public Usuario saveUsuario(Usuario usuario);

    public void removeUsuario(Usuario usuario);

    public Usuario getUsuarioById(Integer id);

    public List<Usuario> getListUsuario();

    public boolean login(String email, String senha);
    
}

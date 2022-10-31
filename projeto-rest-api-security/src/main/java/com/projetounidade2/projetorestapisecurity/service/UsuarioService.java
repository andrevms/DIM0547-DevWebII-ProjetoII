package com.projetounidade2.projetorestapisecurity.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.projetounidade2.projetorestapisecurity.model.Usuario;


@Service
public interface UsuarioService extends UserDetailsService {
    
    public Usuario salvar(Usuario usuario);

    public void removeUsuario(Usuario usuario);

    public Usuario getUsuarioById(Integer id);

    public List<Usuario> getListUsuario();
    
}

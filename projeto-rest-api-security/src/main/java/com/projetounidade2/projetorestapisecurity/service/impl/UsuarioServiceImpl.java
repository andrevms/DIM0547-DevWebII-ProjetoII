package com.projetounidade2.projetorestapisecurity.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.projetounidade2.projetorestapisecurity.exception.SenhaInvalidaException;
import com.projetounidade2.projetorestapisecurity.model.Usuario;
import com.projetounidade2.projetorestapisecurity.repository.UsuarioRepository;

@Component
public class UsuarioServiceImpl implements UserDetailsService {

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioRepository repository;

    @Transactional
    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public UserDetails autenticar( Usuario usuario ){
        UserDetails user = loadUserByUsername(usuario.getEmail());
        boolean senhasBatem = passwordEncoder.matches( usuario.getSenha(), user.getPassword() );

        if(senhasBatem){
            return user;
        }

        throw new SenhaInvalidaException();
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Usuario usuario = repository.findByEmail(email);

        String[] roles = usuario.isAdmin() ? new String[] { "ADMIN", "USER" } : new String[] { "USER" };

        return User
                .builder()
                .username(usuario.getEmail())
                .password(usuario.getSenha())
                .roles(roles)
                .build();

        /*
         * Usuário em memória
         * if(!username.equals("cicrano")){
         * throw new UsernameNotFoundException("Usuário não encontrado na base.");
         * }
         * 
         * return User
         * .builder()
         * .username("cicrano")
         * .password(passwordEncoder.encode("123"))
         * .roles("USER")
         * .build();
         */
    }

}

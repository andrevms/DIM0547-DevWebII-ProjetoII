package com.projetounidade2.projetorestapisecurity.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "usuario")
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @NotEmpty
    private String nome;

    @Column
    @NotEmpty
    private String email;

    @Column
    @NotEmpty
    private String senha;

    @Column
    private boolean admin;

    @OneToMany(fetch = FetchType.LAZY)
    private List<ListaDeEstudos> listaDeEstudos;

    @ManyToMany()
    private List<Perfil> perfis;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        System.out.println(this.perfis);
        return this.perfis;
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}

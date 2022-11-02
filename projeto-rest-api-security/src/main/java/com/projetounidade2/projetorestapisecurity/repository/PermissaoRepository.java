package com.projetounidade2.projetorestapisecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetounidade2.projetorestapisecurity.model.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
}

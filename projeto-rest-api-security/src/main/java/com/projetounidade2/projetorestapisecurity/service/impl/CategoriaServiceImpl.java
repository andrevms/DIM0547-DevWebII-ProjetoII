package com.projetounidade2.projetorestapisecurity.service.impl;
/* 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.imd.projeto.web.estudaconcursos.model.Categoria;
import br.com.imd.projeto.web.estudaconcursos.repository.CategoriaRepository;

@Component
public class CategoriaServiceImpl  implements CategoriaService{
    
    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public Categoria saveCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void removeCategoria(String id) {
        categoriaRepository.deleteById(Integer.parseInt(id));
    }

    @Override
    public Categoria getCategoriaByNome(String nome) {
        return categoriaRepository.findByCategoria(nome);
    }

    @Override
    public List<Categoria> getListCategoria() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria recuperarPorId(int id) {
        return categoriaRepository.getReferenceById(id);
    }

    @Override
    public void atualizarCategoria(int id, String categoria) {
        var cat = categoriaRepository.getReferenceById(id);
        cat.setCategoria(categoria);
        categoriaRepository.save(cat);
    }
}
*/
package com.example.teste.services;

import java.util.List;
import java.util.Optional;

import com.example.teste.model.Disciplina;
import com.example.teste.repository.DisciplinaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public List<Disciplina> obterTodos(){
        return disciplinaRepository.ObterTodos();
    }

    public Optional<Disciplina> obterPorId(Integer id){
        return disciplinaRepository.ObterPorId(id);
    }

    public Disciplina adicionar(Disciplina disciplina){
        return disciplinaRepository.adicionar(disciplina);
    
    }

    public void deletar(Integer id){
        disciplinaRepository.deletar(id);
    }

    public Disciplina atualizar(Integer id, Disciplina disciplina){
        disciplina.setId(id);
        return disciplinaRepository.atualizar(disciplina);
    }

    
}

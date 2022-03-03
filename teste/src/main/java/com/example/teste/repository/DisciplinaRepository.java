package com.example.teste.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.teste.model.Disciplina;
import com.example.teste.model.exception.ResourceNotFoundException;

import org.springframework.stereotype.Repository;

@Repository
public class DisciplinaRepository {

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private Integer ultimoId = 0;

    public List<Disciplina> ObterTodos(){
        return disciplinas;
    }

    public Optional<Disciplina> ObterPorId(Integer id){
        return disciplinas
        .stream()
        .filter(disciplina -> disciplina.getId() == id)
        .findFirst();
    }

    public Disciplina adicionar(Disciplina disciplina){
        ultimoId++;
        disciplina.setId(ultimoId);
        disciplinas.add(disciplina);

        return disciplina;
    }

    public void deletar(Integer id){
        disciplinas.removeIf(disciplina -> disciplina.getId() == id);
    }
    
    public Disciplina atualizar(Disciplina disciplina){
        Optional<Disciplina> disciplinaEncontrada = ObterPorId(disciplina.getId());

        if(disciplinaEncontrada.isEmpty()){
            throw new ResourceNotFoundException("Disciplina nao encontrada");
        }
        
        deletar(disciplina.getId());

        adicionar(disciplina);

        return disciplina;
}
}
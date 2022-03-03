package com.example.teste.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.teste.model.Aluno;
import com.example.teste.model.exception.ResourceNotFoundException;

import org.springframework.stereotype.Repository;


@Repository
public class AlunoRepository {
    
    private List<Aluno> alunos = new ArrayList<Aluno>();
    private Integer ultimoId = 0;

    public List<Aluno> obterTodos(){
    return alunos;
    }

    public Optional<Aluno> obterPorId(Integer id){
        return alunos
        .stream()
        .filter(aluno -> aluno.getId() == id)
        .findFirst();
    }

    public Aluno adicionar(Aluno aluno){
        ultimoId++;
        aluno.setId(ultimoId);
        alunos.add(aluno);

        return aluno;
    }

    public void deletar(Integer id){
        alunos.removeIf(aluno -> aluno.getId() == id);
    }


    public Aluno atualizar(Aluno aluno){
        Optional <Aluno> alunoEncontrado = obterPorId(aluno.getId());

        if(alunoEncontrado.isEmpty()){
            throw new ResourceNotFoundException("aluno nao encontrado");
        }

        deletar(aluno.getId());

        adicionar(aluno);

        return aluno;
}
}

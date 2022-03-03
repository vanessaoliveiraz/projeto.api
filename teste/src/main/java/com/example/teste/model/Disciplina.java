package com.example.teste.model;


public class Disciplina {
////#region atributos
    private Integer id;
    private String Nomedisciplina;
    private String Nomeprofessor;
    private Integer duracaoMinutos;
    private String observacao;
////#endregion

////#region Getters e Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNomedisciplina() {
        return Nomedisciplina;
    }
    public void setNomedisciplina(String nomedisciplina) {
        Nomedisciplina = nomedisciplina;
    }
    public String getNomeprofessor() {
        return Nomeprofessor;
    }
    public void setNomeprofessor(String nomeprofessor) {
        Nomeprofessor = nomeprofessor;
    }
    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }
    public void setDuracaoMinutos(Integer duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
////#endregion
}

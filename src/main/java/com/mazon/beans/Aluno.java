package com.mazon.beans;

import java.util.Objects;

public class Aluno {
    String nome;
    String numeroMatricula;
    int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String email) {
        this.numeroMatricula = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade &&
                numeroMatricula.equals(aluno.numeroMatricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroMatricula, idade);
    }
}

package com.mazon.beans;

import java.util.ArrayList;
import java.util.List;

public class MatriculaAluno {
    private List<Aluno> listaAluno;

    private static MatriculaAluno stdregd = null;

    private MatriculaAluno(){
        this.listaAluno = new ArrayList<Aluno>();
    }

    public static MatriculaAluno getInstance(){
        if (stdregd == null){
            stdregd = new MatriculaAluno();
            return stdregd;
        }
        else {
            return stdregd;
        }
    }

    public void add(Aluno std){
        this.listaAluno.add(std);
    }

    public String updateAluno(Aluno std){
        for (int i=0; i<listaAluno.size(); i++){
            Aluno stdn = listaAluno.get(i);
            if (stdn.getNumeroMatricula().equals(std.getNumeroMatricula())){
                listaAluno.set(i,std);
                return "atualizado matricula: "+std.getNumeroMatricula();
            }
        }
        return "Falha na atualização";
    }

    public String deleteAluno(String matricula){
        for (int i=0; i<listaAluno.size(); i++){
            Aluno stdn = listaAluno.get(i);
            if (stdn.getNumeroMatricula().equals(matricula)){
                listaAluno.remove(i);
                return "deletado matricula: "+matricula;
            }
        }
        return "Falha na exclusão";
    }

    public List<Aluno> getListaAluno(){
        return listaAluno;
    }

}

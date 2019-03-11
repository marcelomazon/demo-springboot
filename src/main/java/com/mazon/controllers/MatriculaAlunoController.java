package com.mazon.controllers;

import com.mazon.beans.Aluno;
import com.mazon.beans.MatriculaAluno;
import com.mazon.beans.MatriculaAlunoReply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MatriculaAlunoController {

    private Aluno student;

    @RequestMapping(value = "/aluno/matricula", method = RequestMethod.POST)
    @ResponseBody
    public MatriculaAlunoReply registerStudent(@RequestBody Aluno student) {
        this.student = student;
        System.out.println("Matricula aluno");
        MatriculaAlunoReply stdregreply = new MatriculaAlunoReply();
        MatriculaAluno.getInstance().add(student);
        //We are setting the below value just to reply a message back to the caller
        stdregreply.setNome(student.getNome());
        stdregreply.setIdade(student.getIdade());
        stdregreply.setNumeroMatricula(student.getNumeroMatricula());
        stdregreply.setStatusMatricula("Sucesso");
        return stdregreply;
    }

}

package com.mazon.controllers;

import com.mazon.beans.Aluno;
import com.mazon.beans.MatriculaAluno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AlunoListaController {

    @RequestMapping(value = "/aluno/lista", method = RequestMethod.GET)
    @ResponseBody
    public List<Aluno> getAllAlunos(){
        return MatriculaAluno.getInstance().getListaAluno();
    }

}

package com.mazon.controllers;

import com.mazon.beans.Aluno;
import com.mazon.beans.MatriculaAluno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlunoUpdateController {

    @RequestMapping(value="/aluno/update", method = RequestMethod.PUT)
    @ResponseBody

    public String updateAluno(@RequestBody Aluno aluno){
        System.out.print("aluno atualizado: "+aluno.getNumeroMatricula());
        return MatriculaAluno.getInstance().updateAluno(aluno);
    }

}

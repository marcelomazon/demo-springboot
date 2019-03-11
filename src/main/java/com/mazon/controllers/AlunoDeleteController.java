package com.mazon.controllers;

import com.mazon.beans.MatriculaAluno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlunoDeleteController {
    @RequestMapping(method = RequestMethod.DELETE, value="/aluno/delete/{idAluno}")

    @ResponseBody
    public String deleteAluno(@PathVariable("idAluno") String numeroMatricula){
        System.out.println("aluno deletado: "+numeroMatricula);
        return MatriculaAluno.getInstance().deleteAluno(numeroMatricula);
    }
}

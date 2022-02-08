package br.com.grx.alexandre.testegrx1.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.grx.alexandre.testegrx1.models.Pessoa;

@Controller
public class NamesController {
    Integer _id = 0;
    List<Pessoa> pessoas = new ArrayList<>();

    @GetMapping("/inicio")
    public ModelAndView inicio(){
        ModelAndView mv = new ModelAndView("inicio");
        mv.addObject("pessoas", pessoas);

        return mv;
    }

    @PostMapping("/inicio")
    public String criar(Pessoa pessoa, RedirectAttributes redirect){
        pessoa.setId(++_id);
        pessoas.add(pessoa);

        return "redirect:/inicio";
    }

}

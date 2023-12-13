package uenp.SistemaEspecialista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uenp.SistemaEspecialista.DTO.CaseRequestDTO;
import uenp.SistemaEspecialista.model.Case;
import uenp.SistemaEspecialista.service.CaseService;

@RestController
@RequestMapping(value = "/api/cases")
public class CaseController {
    @Autowired
    private CaseService caseService;
    
    @GetMapping
    public List<Case> getCases(CaseRequestDTO caseRequest, Float similaridade) {
        // calcular a similiraide local de cada campo
        // adicionar a similaridade local de cada campo na similaridade global
        // adicionar o caso em um vetor se a similaridade global seja maior que a similaridade passada
        // retornar o vetor após calcular a similaridade global de todos os casos

        List<Case> cases = caseService.findAll();
        for (Case c : cases) {
            // c.calcSimilaridadeLocal();
            // c.calcSimilaridadeGlobal();
        }



        return caseService.findAll();
    }

    @PostMapping
    public Case saveCase(Case c) {
        return caseService.save(c);
    }

    public Float calcSimilaridadeLocal() {
        return 0.0f;
    }

    public Float calcSimilaridadeGlobal() {
        return 0.0f;
    }
}


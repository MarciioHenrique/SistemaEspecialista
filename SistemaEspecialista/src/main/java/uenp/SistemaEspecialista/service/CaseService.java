package uenp.SistemaEspecialista.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uenp.SistemaEspecialista.repository.CaseRepository;
import uenp.SistemaEspecialista.model.Case;

@Service
public class CaseService {
    @Autowired
    private CaseRepository caseRepository;

    public List<Case> findAll() {
        return caseRepository.findAll();
    }

    public Case findById(Long id) {
        return caseRepository.findById(id).get();
    }

    public Case save(Case c) {
        return caseRepository.save(c);
    }
}

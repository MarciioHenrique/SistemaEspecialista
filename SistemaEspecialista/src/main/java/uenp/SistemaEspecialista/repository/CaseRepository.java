package uenp.SistemaEspecialista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uenp.SistemaEspecialista.model.Case;

public interface CaseRepository extends JpaRepository<Case, Long> {
    
}

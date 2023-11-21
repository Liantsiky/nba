package org.nba.repository;

import org.nba.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe, Integer> {

}

package org.nba.repository;

import org.nba.model.Saison;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaisonRepository extends JpaRepository<Saison, Integer> {

}

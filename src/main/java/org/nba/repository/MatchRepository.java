package org.nba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.nba.model.Match;

public interface MatchRepository extends JpaRepository<Match, Integer> {

}

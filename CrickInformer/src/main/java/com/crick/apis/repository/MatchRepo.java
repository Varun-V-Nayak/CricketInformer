package com.crick.apis.repository;

import com.crick.apis.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    // get match by team name
    Optional<Match> findByTeamHeading(String teamHeading);
}

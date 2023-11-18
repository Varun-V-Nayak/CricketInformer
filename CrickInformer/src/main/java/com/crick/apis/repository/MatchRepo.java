package com.crick.apis.repository;

import com.crick.apis.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepo extends JpaRepository<Match,Integer> {
}

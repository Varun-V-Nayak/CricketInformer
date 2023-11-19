package com.crick.apis.service;

import com.crick.apis.entity.Match;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface MatchService {

    List<Match> getAllMatches();

    List<Match> getLiveMatches();

    List<List<String>> getCWC2023PointTable();

}

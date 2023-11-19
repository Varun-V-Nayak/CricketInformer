package com.crick.apis.controller;

import com.crick.apis.entity.Match;
import com.crick.apis.service.Impl.MatchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {
    @Autowired
    private MatchServiceImpl matchService;

 @GetMapping("/live")
    ResponseEntity<?> getLiveMatches(){
        return new ResponseEntity<>(matchService.getLiveMatches(), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    ResponseEntity<?> getAllMatches(){
        return new ResponseEntity<>(matchService.getAllMatches(), HttpStatus.OK);
    }

    @GetMapping("/getPointsTable")
    ResponseEntity<?> getPointsTable(){
        return new ResponseEntity<>(matchService.getCWC2023PointTable(), HttpStatus.OK);
    }
}

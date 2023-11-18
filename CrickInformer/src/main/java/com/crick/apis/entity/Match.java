package com.crick.apis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cricket_match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matchId;

    private String teamHeading;
    private String matchNumberVenue;
    private String battingTeam;
    private String battingTeamScore;
    private String bowlTeam;
    private String bowlTeamScore;
    private String liveText;
    private String matchLink;
    private String textComplete;

    @Enumerated
    private MatchStatus matchStatus;

    private Date date = new Date();

    // set match status according to completed or not

    public void setMatchStatus(MatchStatus matchStatus) {
        if(textComplete.isBlank()){
            this.matchStatus = MatchStatus.LIVE;
        }else{
            this.matchStatus = MatchStatus.COMPLETED;
        }
    }
}

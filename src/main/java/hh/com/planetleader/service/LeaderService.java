package hh.com.planetleader.service;

import hh.com.planetleader.entity.Leader;
import hh.com.planetleader.entity.LeaderAgeComparator;
import hh.com.planetleader.repository.LeaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 */
@Service
@RequiredArgsConstructor
public class LeaderService {

    private final LeaderRepository leaderRepository;

    public void addLeader(Leader leader) {
        this.leaderRepository.save(leader);
    }

    public void deleteLeader(Leader leader) {
        this.leaderRepository.delete(leader);
    }

    public void editLeader(Leader leader) {
        this.leaderRepository.save(leader);
    }


    public Optional<Leader> findLeaderByName(Leader leader) {
        Optional<Leader> leader1 = this.leaderRepository.findByName(leader.getName());
        if (leader1.isEmpty()) {
            leader1 = this.leaderRepository.findById(leader.getId());

        }
        return leader1;
    }

    public List<Leader> getFirstTenYoungerLeader(Leader leader) {
        List<Leader> leaders = leaderRepository.findAll();

        return leaders.stream().limit(10).sorted(new LeaderAgeComparator()).collect(Collectors.toList());
    }

    public List<Leader> getAllLeaderThatNonCommandPlanet(Leader leader) {
        List<Leader> leaders = leaderRepository.findAll();


        return null;
    }
}

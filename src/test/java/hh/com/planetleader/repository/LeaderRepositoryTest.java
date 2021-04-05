package hh.com.planetleader.repository;

import hh.com.planetleader.entity.Leader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 */
@DataJpaTest
class LeaderRepositoryTest {

    @Autowired
    private LeaderRepository leaderRepository;

    @Test
    public void testLeaderReposFound() {
        final Leader leader = new Leader();
        leader.setName("vasya");
        leader.setLeaderAge(10);
        leaderRepository.save(leader);
        Optional<Leader> leaderByName =leaderRepository.findByName("vasya");
        assertTrue(leaderByName.isPresent());
        assertEquals("vasya", leaderByName.get().getName());
    }

    @Test
    public void testLeaderReposNOTFound() {
        final Leader leader = new Leader();
        leader.setName("vasya");
        leader.setLeaderAge(10);
        leaderRepository.save(leader);
        Optional<Leader> leaderByName =leaderRepository.findByName("nevasya");
        assertFalse(leaderByName.isPresent());
    }
}
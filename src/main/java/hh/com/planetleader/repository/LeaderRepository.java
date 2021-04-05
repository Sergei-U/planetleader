package hh.com.planetleader.repository;

import hh.com.planetleader.entity.Leader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 */
@Repository
public interface LeaderRepository extends JpaRepository<Leader, Long> {

    Optional<Leader> findByName(String name);


    @Query("select first 10 * from Leader order by leaderAge desc ")
    List<Leader> findByLeaderAge();
}

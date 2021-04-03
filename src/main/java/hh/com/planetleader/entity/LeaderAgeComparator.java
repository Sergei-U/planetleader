package hh.com.planetleader.entity;

import java.util.Comparator;

/**
 *
 */
public class LeaderAgeComparator implements Comparator<Leader> {
    @Override
    public int compare(Leader o1, Leader o2) {
        return Long.compare(o1.getLeaderAge(), o2.getLeaderAge());
    }
}
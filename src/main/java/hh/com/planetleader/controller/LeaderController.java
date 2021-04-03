package hh.com.planetleader.controller;

import hh.com.planetleader.entity.Leader;
import hh.com.planetleader.service.LeaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping(value = "/leader")
@RequiredArgsConstructor
public class LeaderController {

    private final LeaderService leaderService;
    @RequestMapping(value = "/addleader", method = RequestMethod.POST)
    public void addLeader(@RequestBody Leader leader) {this.leaderService.addLeader(leader);}
    @RequestMapping(value = "/deleteleader", method = RequestMethod.POST)
    public void deleteLeader(@RequestBody Leader leader) {this.leaderService.deleteLeader(leader);}
    @RequestMapping(value = "/editleader", method = RequestMethod.POST)
    public void editLeader(@RequestBody Leader leader) {this.leaderService.editLeader(leader);}
    @RequestMapping(value = "/findleader", method = RequestMethod.POST)
    public void findLeader(@RequestBody Leader leader) {this.leaderService.findLeaderByName(leader);}
}

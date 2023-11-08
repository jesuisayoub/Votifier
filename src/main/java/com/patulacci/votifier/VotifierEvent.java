package com.patulacci.votifier;

import com.vexsoftware.votifier.model.Vote;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class VotifierEvent implements Listener  {
    @EventHandler(priority= EventPriority.NORMAL, ignoreCancelled = true)
    public void onVotifierEvent(com.vexsoftware.votifier.model.VotifierEvent event) {
        Vote vote = event.getVote();
        System.out.println(vote.getUsername() + ": test");
    }
}

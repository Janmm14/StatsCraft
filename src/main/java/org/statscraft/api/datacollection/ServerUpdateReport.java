package org.statscraft.api.datacollection;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServerUpdateReport {

    @JsonProperty
    private UUID uuid;
    @JsonProperty
    private int playerCount;

    public UUID getUuid() {
        return uuid;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    @Override
    public String toString() {
        return "ServerUpdateReport{" +
            "uuid=" + uuid +
            ", playerCount=" + playerCount +
            '}';
    }
}

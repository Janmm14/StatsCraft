package org.statscraft.api.datacollection;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServerReport {
    @JsonProperty
    private UUID uuid;
    @JsonProperty
    private String osName;
    @JsonProperty
    private String osArch;
    @JsonProperty
    private String osVersion;
    @JsonProperty
    private String javaVmName;
    @JsonProperty
    private String javaVendor;
    @JsonProperty
    private String javaVersion;
    @JsonProperty
    private int coreCount;
    @JsonProperty
    private long maxJvmRam;
    @JsonProperty
    private String serverVersion;
    @JsonProperty
    private String minecraftVersion;
    @JsonProperty
    private boolean onlineMode;
    @JsonProperty
    private int worldsCount;
    @JsonProperty
    private int pluginsCount;
    @JsonProperty
    private String defaultGamemode;

    public UUID getUuid() {
        return uuid;
    }

    public String getOsName() {
        return osName;
    }

    public String getOsArch() {
        return osArch;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getJavaVmName() {
        return javaVmName;
    }

    public String getJavaVendor() {
        return javaVendor;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public long getMaxJvmRam() {
        return maxJvmRam;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public String getMinecraftVersion() {
        return minecraftVersion;
    }

    public boolean isOnlineMode() {
        return onlineMode;
    }

    public int getWorldsCount() {
        return worldsCount;
    }

    public int getPluginsCount() {
        return pluginsCount;
    }

    public String getDefaultGamemode() {
        return defaultGamemode;
    }

    @Override
    public String toString() {
        return "ServerReport{" +
            "uuid=" + uuid +
            ", osName='" + osName + '\'' +
            ", osArch='" + osArch + '\'' +
            ", osVersion='" + osVersion + '\'' +
            ", javaVmName='" + javaVmName + '\'' +
            ", javaVendor='" + javaVendor + '\'' +
            ", javaVersion='" + javaVersion + '\'' +
            ", coreCount=" + coreCount +
            ", maxJvmRam=" + maxJvmRam +
            ", serverVersion='" + serverVersion + '\'' +
            ", minecraftVersion='" + minecraftVersion + '\'' +
            ", onlineMode=" + onlineMode +
            ", worldsCount=" + worldsCount +
            ", pluginsCount=" + pluginsCount +
            ", defaultGamemode='" + defaultGamemode + '\'' +
            '}';
    }
}

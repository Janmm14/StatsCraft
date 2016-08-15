package org.statscraft.api.datacollection;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PluginReport {
    @JsonProperty
    private String authKey;
    @JsonProperty
    private UUID serverUuid;
    @JsonProperty
    private String name;
    @JsonProperty
    private String version;
    @JsonProperty
    private String description;
    @JsonProperty
    private String website;
    @JsonProperty
    private List<String> authors;
    @JsonProperty
    private List<String> depend;
    @JsonProperty
    private List<String> softDepend;
    @JsonProperty
    private Map<String, String> customData;

    public String getAuthKey() {
        return authKey;
    }

    public UUID getServerUuid() {
        return serverUuid;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getDescription() {
        return description;
    }

    public String getWebsite() {
        return website;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public List<String> getDepend() {
        return depend;
    }

    public List<String> getSoftDepend() {
        return softDepend;
    }

    public Map<String, String> getCustomData() {
        return customData;
    }

    @Override
    public String toString() {
        return "PluginReport{" +
            "authKey='" + authKey + '\'' +
            ", serverUuid=" + serverUuid +
            ", name='" + name + '\'' +
            ", version='" + version + '\'' +
            ", description='" + description + '\'' +
            ", website='" + website + '\'' +
            ", authors=" + authors +
            ", depend=" + depend +
            ", softDepend=" + softDepend +
            ", customData=" + customData +
            '}';
    }
}

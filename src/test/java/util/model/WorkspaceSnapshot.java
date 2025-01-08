
package util.model;


import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class WorkspaceSnapshot {

    @Expose
    private Boolean enableSubsetting;
    @Expose
    private Boolean enableUpsert;
    @Expose
    private PostJobScripts postJobScripts;
    @Expose
    private SubsetTargets subsetTargets;
    @Expose
    private Tags tags;
    @Expose
    private UpsertConfiguration upsertConfiguration;

    public Boolean getEnableSubsetting() {
        return enableSubsetting;
    }

    public void setEnableSubsetting(Boolean enableSubsetting) {
        this.enableSubsetting = enableSubsetting;
    }

    public Boolean getEnableUpsert() {
        return enableUpsert;
    }

    public void setEnableUpsert(Boolean enableUpsert) {
        this.enableUpsert = enableUpsert;
    }

    public PostJobScripts getPostJobScripts() {
        return postJobScripts;
    }

    public void setPostJobScripts(PostJobScripts postJobScripts) {
        this.postJobScripts = postJobScripts;
    }

    public SubsetTargets getSubsetTargets() {
        return subsetTargets;
    }

    public void setSubsetTargets(SubsetTargets subsetTargets) {
        this.subsetTargets = subsetTargets;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public UpsertConfiguration getUpsertConfiguration() {
        return upsertConfiguration;
    }

    public void setUpsertConfiguration(UpsertConfiguration upsertConfiguration) {
        this.upsertConfiguration = upsertConfiguration;
    }

}

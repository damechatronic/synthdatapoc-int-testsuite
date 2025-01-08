
package util.model;

import java.util.List;

import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class JobStatus {

    @Expose
    private String destinationDatabaseId;
    @Expose
    private Double destinationDatabaseSizeMb;
    @Expose
    private String endTime;
    @Expose
    private Boolean hasGanModelAssets;
    @Expose
    private Boolean hasTrace;
    @Expose
    private String id;
    @Expose
    private Boolean isContainerizedGeneration;
    @Expose
    private Boolean isEphemeralGeneration;
    @Expose
    private Boolean isUpsertGeneration;
    @Expose
    private PrivacyAnalysis privacyAnalysis;
    @Expose
    private Boolean processAllTablesWhenSubsettingScan;
    @Expose
    private String progressCheckTimestamp;
    @Expose
    private String publishedTime;
    @Expose
    private String sourceDatabaseId;
    @Expose
    private Double sourceDatabaseSizeMb;
    @Expose
    private String startTime;
    @Expose
    private String status;
    @Expose
    private Long subsetTargetHash;
    @Expose
    private Boolean subsettingEnabledScan;
    @Expose
    private List<Task> tasks;
    @Expose
    private String type;
    @Expose
    private Boolean unsafeLogging;
    @Expose
    private List<Object> warnings;
    @Expose
    private Boolean webhooksAreEnabled;
    @Expose
    private String workerVersion;
    @Expose
    private String workspaceId;
    @Expose
    private WorkspaceSnapshot workspaceSnapshot;

    public String getDestinationDatabaseId() {
        return destinationDatabaseId;
    }

    public void setDestinationDatabaseId(String destinationDatabaseId) {
        this.destinationDatabaseId = destinationDatabaseId;
    }

    public Double getDestinationDatabaseSizeMb() {
        return destinationDatabaseSizeMb;
    }

    public void setDestinationDatabaseSizeMb(Double destinationDatabaseSizeMb) {
        this.destinationDatabaseSizeMb = destinationDatabaseSizeMb;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Boolean getHasGanModelAssets() {
        return hasGanModelAssets;
    }

    public void setHasGanModelAssets(Boolean hasGanModelAssets) {
        this.hasGanModelAssets = hasGanModelAssets;
    }

    public Boolean getHasTrace() {
        return hasTrace;
    }

    public void setHasTrace(Boolean hasTrace) {
        this.hasTrace = hasTrace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsContainerizedGeneration() {
        return isContainerizedGeneration;
    }

    public void setIsContainerizedGeneration(Boolean isContainerizedGeneration) {
        this.isContainerizedGeneration = isContainerizedGeneration;
    }

    public Boolean getIsEphemeralGeneration() {
        return isEphemeralGeneration;
    }

    public void setIsEphemeralGeneration(Boolean isEphemeralGeneration) {
        this.isEphemeralGeneration = isEphemeralGeneration;
    }

    public Boolean getIsUpsertGeneration() {
        return isUpsertGeneration;
    }

    public void setIsUpsertGeneration(Boolean isUpsertGeneration) {
        this.isUpsertGeneration = isUpsertGeneration;
    }

    public PrivacyAnalysis getPrivacyAnalysis() {
        return privacyAnalysis;
    }

    public void setPrivacyAnalysis(PrivacyAnalysis privacyAnalysis) {
        this.privacyAnalysis = privacyAnalysis;
    }

    public Boolean getProcessAllTablesWhenSubsettingScan() {
        return processAllTablesWhenSubsettingScan;
    }

    public void setProcessAllTablesWhenSubsettingScan(Boolean processAllTablesWhenSubsettingScan) {
        this.processAllTablesWhenSubsettingScan = processAllTablesWhenSubsettingScan;
    }

    public String getProgressCheckTimestamp() {
        return progressCheckTimestamp;
    }

    public void setProgressCheckTimestamp(String progressCheckTimestamp) {
        this.progressCheckTimestamp = progressCheckTimestamp;
    }

    public String getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
    }

    public String getSourceDatabaseId() {
        return sourceDatabaseId;
    }

    public void setSourceDatabaseId(String sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
    }

    public Double getSourceDatabaseSizeMb() {
        return sourceDatabaseSizeMb;
    }

    public void setSourceDatabaseSizeMb(Double sourceDatabaseSizeMb) {
        this.sourceDatabaseSizeMb = sourceDatabaseSizeMb;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getSubsetTargetHash() {
        return subsetTargetHash;
    }

    public void setSubsetTargetHash(Long subsetTargetHash) {
        this.subsetTargetHash = subsetTargetHash;
    }

    public Boolean getSubsettingEnabledScan() {
        return subsettingEnabledScan;
    }

    public void setSubsettingEnabledScan(Boolean subsettingEnabledScan) {
        this.subsettingEnabledScan = subsettingEnabledScan;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getUnsafeLogging() {
        return unsafeLogging;
    }

    public void setUnsafeLogging(Boolean unsafeLogging) {
        this.unsafeLogging = unsafeLogging;
    }

    public List<Object> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Object> warnings) {
        this.warnings = warnings;
    }

    public Boolean getWebhooksAreEnabled() {
        return webhooksAreEnabled;
    }

    public void setWebhooksAreEnabled(Boolean webhooksAreEnabled) {
        this.webhooksAreEnabled = webhooksAreEnabled;
    }

    public String getWorkerVersion() {
        return workerVersion;
    }

    public void setWorkerVersion(String workerVersion) {
        this.workerVersion = workerVersion;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public WorkspaceSnapshot getWorkspaceSnapshot() {
        return workspaceSnapshot;
    }

    public void setWorkspaceSnapshot(WorkspaceSnapshot workspaceSnapshot) {
        this.workspaceSnapshot = workspaceSnapshot;
    }

}


package util.model;


import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class Task {

    @Expose
    private String action;
    @Expose
    private String databaseScanId;
    @Expose
    private String endTime;
    @Expose
    private String id;
    @Expose
    private String jobId;
    @Expose
    private Boolean presentOnlyWhenActive;
    @Expose
    private String startTime;
    @Expose
    private Long stepsCompleted;
    @Expose
    private Long totalSteps;
    @Expose
    private String unit;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDatabaseScanId() {
        return databaseScanId;
    }

    public void setDatabaseScanId(String databaseScanId) {
        this.databaseScanId = databaseScanId;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Boolean getPresentOnlyWhenActive() {
        return presentOnlyWhenActive;
    }

    public void setPresentOnlyWhenActive(Boolean presentOnlyWhenActive) {
        this.presentOnlyWhenActive = presentOnlyWhenActive;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Long getStepsCompleted() {
        return stepsCompleted;
    }

    public void setStepsCompleted(Long stepsCompleted) {
        this.stepsCompleted = stepsCompleted;
    }

    public Long getTotalSteps() {
        return totalSteps;
    }

    public void setTotalSteps(Long totalSteps) {
        this.totalSteps = totalSteps;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}

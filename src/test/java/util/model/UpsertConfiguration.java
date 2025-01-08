
package util.model;


import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class UpsertConfiguration {

    @Expose
    private Boolean autoStartAfterSuccessfulGeneration;
    @Expose
    private Boolean debugTempTables;
    @Expose
    private Boolean disableTriggers;
    @Expose
    private Boolean treatMissingConstraintsAsWarning;

    public Boolean getAutoStartAfterSuccessfulGeneration() {
        return autoStartAfterSuccessfulGeneration;
    }

    public void setAutoStartAfterSuccessfulGeneration(Boolean autoStartAfterSuccessfulGeneration) {
        this.autoStartAfterSuccessfulGeneration = autoStartAfterSuccessfulGeneration;
    }

    public Boolean getDebugTempTables() {
        return debugTempTables;
    }

    public void setDebugTempTables(Boolean debugTempTables) {
        this.debugTempTables = debugTempTables;
    }

    public Boolean getDisableTriggers() {
        return disableTriggers;
    }

    public void setDisableTriggers(Boolean disableTriggers) {
        this.disableTriggers = disableTriggers;
    }

    public Boolean getTreatMissingConstraintsAsWarning() {
        return treatMissingConstraintsAsWarning;
    }

    public void setTreatMissingConstraintsAsWarning(Boolean treatMissingConstraintsAsWarning) {
        this.treatMissingConstraintsAsWarning = treatMissingConstraintsAsWarning;
    }

}


package util.model;


import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class PrivacyAnalysis {

    @Expose
    private Long anonymizedTableCount;
    @Expose
    private Long atRiskColumnCount;
    @Expose
    private Long atRiskTableCount;
    @Expose
    private ColumnCountByPrivacyRank columnCountByPrivacyRank;
    @Expose
    private Long fullyMaskedTableCount;
    @Expose
    private Long notIncludedColumnCount;
    @Expose
    private Long notIncludedTableCount;
    @Expose
    private Long notSensitiveColumnCount;
    @Expose
    private Long notSensitiveTableCount;
    @Expose
    private Long partiallyMaskedTableCount;
    @Expose
    private Long protectedColumnCount;
    @Expose
    private Long protectedTableCount;
    @Expose
    private Tables tables;

    public Long getAnonymizedTableCount() {
        return anonymizedTableCount;
    }

    public void setAnonymizedTableCount(Long anonymizedTableCount) {
        this.anonymizedTableCount = anonymizedTableCount;
    }

    public Long getAtRiskColumnCount() {
        return atRiskColumnCount;
    }

    public void setAtRiskColumnCount(Long atRiskColumnCount) {
        this.atRiskColumnCount = atRiskColumnCount;
    }

    public Long getAtRiskTableCount() {
        return atRiskTableCount;
    }

    public void setAtRiskTableCount(Long atRiskTableCount) {
        this.atRiskTableCount = atRiskTableCount;
    }

    public ColumnCountByPrivacyRank getColumnCountByPrivacyRank() {
        return columnCountByPrivacyRank;
    }

    public void setColumnCountByPrivacyRank(ColumnCountByPrivacyRank columnCountByPrivacyRank) {
        this.columnCountByPrivacyRank = columnCountByPrivacyRank;
    }

    public Long getFullyMaskedTableCount() {
        return fullyMaskedTableCount;
    }

    public void setFullyMaskedTableCount(Long fullyMaskedTableCount) {
        this.fullyMaskedTableCount = fullyMaskedTableCount;
    }

    public Long getNotIncludedColumnCount() {
        return notIncludedColumnCount;
    }

    public void setNotIncludedColumnCount(Long notIncludedColumnCount) {
        this.notIncludedColumnCount = notIncludedColumnCount;
    }

    public Long getNotIncludedTableCount() {
        return notIncludedTableCount;
    }

    public void setNotIncludedTableCount(Long notIncludedTableCount) {
        this.notIncludedTableCount = notIncludedTableCount;
    }

    public Long getNotSensitiveColumnCount() {
        return notSensitiveColumnCount;
    }

    public void setNotSensitiveColumnCount(Long notSensitiveColumnCount) {
        this.notSensitiveColumnCount = notSensitiveColumnCount;
    }

    public Long getNotSensitiveTableCount() {
        return notSensitiveTableCount;
    }

    public void setNotSensitiveTableCount(Long notSensitiveTableCount) {
        this.notSensitiveTableCount = notSensitiveTableCount;
    }

    public Long getPartiallyMaskedTableCount() {
        return partiallyMaskedTableCount;
    }

    public void setPartiallyMaskedTableCount(Long partiallyMaskedTableCount) {
        this.partiallyMaskedTableCount = partiallyMaskedTableCount;
    }

    public Long getProtectedColumnCount() {
        return protectedColumnCount;
    }

    public void setProtectedColumnCount(Long protectedColumnCount) {
        this.protectedColumnCount = protectedColumnCount;
    }

    public Long getProtectedTableCount() {
        return protectedTableCount;
    }

    public void setProtectedTableCount(Long protectedTableCount) {
        this.protectedTableCount = protectedTableCount;
    }

    public Tables getTables() {
        return tables;
    }

    public void setTables(Tables tables) {
        this.tables = tables;
    }

}

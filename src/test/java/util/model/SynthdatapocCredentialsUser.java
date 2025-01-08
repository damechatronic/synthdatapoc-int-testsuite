
package util.model;


import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class SynthdatapocCredentialsUser {

    @Expose
    private String column;
    @Expose
    private String columnProtection;
    @Expose
    private String consistencyColumn;
    @Expose
    private String dataType;
    @Expose
    private String generator;
    @Expose
    private Boolean isConsistent;
    @Expose
    private Boolean isDataFree;
    @Expose
    private Boolean isDifferentiallyPrivate;
    @Expose
    private Boolean isIncluded;
    @Expose
    private Boolean isProtected;
    @Expose
    private Boolean isSensitive;
    @Expose
    private String privacyRank;
    @Expose
    private String privacyStatus;
    @Expose
    private String schema;
    @Expose
    private String table;
    @Expose
    private Boolean tonicStructuralDetectedSensitivity;

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getColumnProtection() {
        return columnProtection;
    }

    public void setColumnProtection(String columnProtection) {
        this.columnProtection = columnProtection;
    }

    public String getConsistencyColumn() {
        return consistencyColumn;
    }

    public void setConsistencyColumn(String consistencyColumn) {
        this.consistencyColumn = consistencyColumn;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getGenerator() {
        return generator;
    }

    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public Boolean getIsConsistent() {
        return isConsistent;
    }

    public void setIsConsistent(Boolean isConsistent) {
        this.isConsistent = isConsistent;
    }

    public Boolean getIsDataFree() {
        return isDataFree;
    }

    public void setIsDataFree(Boolean isDataFree) {
        this.isDataFree = isDataFree;
    }

    public Boolean getIsDifferentiallyPrivate() {
        return isDifferentiallyPrivate;
    }

    public void setIsDifferentiallyPrivate(Boolean isDifferentiallyPrivate) {
        this.isDifferentiallyPrivate = isDifferentiallyPrivate;
    }

    public Boolean getIsIncluded() {
        return isIncluded;
    }

    public void setIsIncluded(Boolean isIncluded) {
        this.isIncluded = isIncluded;
    }

    public Boolean getIsProtected() {
        return isProtected;
    }

    public void setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
    }

    public Boolean getIsSensitive() {
        return isSensitive;
    }

    public void setIsSensitive(Boolean isSensitive) {
        this.isSensitive = isSensitive;
    }

    public String getPrivacyRank() {
        return privacyRank;
    }

    public void setPrivacyRank(String privacyRank) {
        this.privacyRank = privacyRank;
    }

    public String getPrivacyStatus() {
        return privacyStatus;
    }

    public void setPrivacyStatus(String privacyStatus) {
        this.privacyStatus = privacyStatus;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public Boolean getTonicStructuralDetectedSensitivity() {
        return tonicStructuralDetectedSensitivity;
    }

    public void setTonicStructuralDetectedSensitivity(Boolean tonicStructuralDetectedSensitivity) {
        this.tonicStructuralDetectedSensitivity = tonicStructuralDetectedSensitivity;
    }

}

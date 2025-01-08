
package util.model;


import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class SynthdatapocCommissions {

    @Expose
    private Columns columns;
    @Expose
    private String privacyStatus;
    @Expose
    private String schema;
    @Expose
    private String table;
    @Expose
    private String tableMode;
    @Expose
    private String tableProtection;

    public Columns getColumns() {
        return columns;
    }

    public void setColumns(Columns columns) {
        this.columns = columns;
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

    public String getTableMode() {
        return tableMode;
    }

    public void setTableMode(String tableMode) {
        this.tableMode = tableMode;
    }

    public String getTableProtection() {
        return tableProtection;
    }

    public void setTableProtection(String tableProtection) {
        this.tableProtection = tableProtection;
    }

}

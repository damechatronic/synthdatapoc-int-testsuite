
package util.model;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Tables {

    @SerializedName("synthdatapoc.commissions")
    private SynthdatapocCommissions synthdatapocCommissions;
    @SerializedName("synthdatapoc.credentials")
    private SynthdatapocCredentials synthdatapocCredentials;
    @SerializedName("synthdatapoc.departments")
    private SynthdatapocDepartments synthdatapocDepartments;
    @SerializedName("synthdatapoc.employees")
    private SynthdatapocEmployees synthdatapocEmployees;
    @SerializedName("synthdatapoc.titles")
    private SynthdatapocTitles synthdatapocTitles;
    @SerializedName("synthdatapoc.transactional_sales")
    private SynthdatapocTransactionalSales synthdatapocTransactionalSales;

    public SynthdatapocCommissions getSynthdatapocCommissions() {
        return synthdatapocCommissions;
    }

    public void setSynthdatapocCommissions(SynthdatapocCommissions synthdatapocCommissions) {
        this.synthdatapocCommissions = synthdatapocCommissions;
    }

    public SynthdatapocCredentials getSynthdatapocCredentials() {
        return synthdatapocCredentials;
    }

    public void setSynthdatapocCredentials(SynthdatapocCredentials synthdatapocCredentials) {
        this.synthdatapocCredentials = synthdatapocCredentials;
    }

    public SynthdatapocDepartments getSynthdatapocDepartments() {
        return synthdatapocDepartments;
    }

    public void setSynthdatapocDepartments(SynthdatapocDepartments synthdatapocDepartments) {
        this.synthdatapocDepartments = synthdatapocDepartments;
    }

    public SynthdatapocEmployees getSynthdatapocEmployees() {
        return synthdatapocEmployees;
    }

    public void setSynthdatapocEmployees(SynthdatapocEmployees synthdatapocEmployees) {
        this.synthdatapocEmployees = synthdatapocEmployees;
    }

    public SynthdatapocTitles getSynthdatapocTitles() {
        return synthdatapocTitles;
    }

    public void setSynthdatapocTitles(SynthdatapocTitles synthdatapocTitles) {
        this.synthdatapocTitles = synthdatapocTitles;
    }

    public SynthdatapocTransactionalSales getSynthdatapocTransactionalSales() {
        return synthdatapocTransactionalSales;
    }

    public void setSynthdatapocTransactionalSales(SynthdatapocTransactionalSales synthdatapocTransactionalSales) {
        this.synthdatapocTransactionalSales = synthdatapocTransactionalSales;
    }

}

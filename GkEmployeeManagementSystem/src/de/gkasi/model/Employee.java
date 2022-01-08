package de.gkasi.model;
import de.gkasi.settings.AppTexts;

public class Employee {
    //region 1. Declaration and Initialization Attribute
    private String strEmployeeID;
    private String strEmployeeName;
    private String strDesignation;
    /**
     * 1. Constructor
     * Standard constructor
     * assign all Attributes with predefined standard
     * values.
     * {@link Employee#Employee(String, String, String)}
     */
    public Employee() {
        this.strEmployeeID = AppTexts.DFL_EMPLOYEEID;
        this.strEmployeeName = AppTexts.DFL_EMPLOYEENAME;
        this.strDesignation=AppTexts.DFL_DESIGNATION;
    }

    /**
     * 2. Constructor
     * 1. Overloaded Constructor to directly set
     * all the attribute values with given parameter.
     * @param strEmployeeID :{@link String}  : Employee Id
     * @param strEmployeeName   : {@link String} : Employee Name
     * @param strDesignation : {@link String} : Employee Designation
     */

    public Employee(String strEmployeeID, String strEmployeeName,String strDesignation ) {
        this.strEmployeeID = strEmployeeID;
        this.strEmployeeName = strEmployeeName;
        this.strDesignation=strDesignation;
    }


    /**
     * TODO 0 getAllAttributesAsCsvString
     * All attributes as one string with semicolon split character
     * Index          : 0        ;     1       ; 2
     * Attributname   : strEmployeeID ;strEmployeeName; strDesignation <br>
     *
     * @return strAllAttributesAsCsvString : {@link String} : All Attributes with semicolon splitted  and then returned as a String
     */
    public String getAllAttributesAsCsvString() {
        return this.strEmployeeID + AppTexts.SPLIT_CHAR + this.strEmployeeName + AppTexts.SPLIT_CHAR  +this.strDesignation;
    }

    /**
     * TODO 1 setAllAttributesFromCsvString
     * generated from {@link Employee#getAllAttributesAsCsvString()}
     * CSV-String and splits it according to split_char.
     * {@link Employee} extracts the individual attribute values and assigns them
     * <p>
     * Index          : 0        ;     1              ; 2
     * Attributname   : strEmployeeID ;strEmployeeName ; strDesignation <br>
     *
     * @param strReadCsvLine : {@link String} : Read the CSV-String later {@link de.gkasi.logic.CsvFileHandler}
     */
    public void setAllAttributesFromCsvLine(String strReadCsvLine) {
        //All attributes with Semicolon splitted
        String[] strAllAttributes = strReadCsvLine.split(AppTexts.SPLIT_CHAR);

        //set all Attribute values
        this.strEmployeeID   = strAllAttributes[AppTexts.SPLIT_INDEX_TITLE];
        this.strEmployeeName = strAllAttributes[AppTexts.SPLIT_INDEX_CONTENTONE];
        this.strDesignation  = strAllAttributes[AppTexts.SPLIT_INDEX_CONTENTTWO];
    }

    //endregion

    // Getter und Setter
    public String getEmployeeID() {
        return strEmployeeID;
    }

    public void setEmployeeID(String strEmployeeID) {
        this.strEmployeeID = strEmployeeID;
    }

    public String getEmployeeName() {
        return strEmployeeName;
    }

    public void setEmployeeName(String strEmployeeName) {
        this.strEmployeeName = strEmployeeName;
    }
    public String getDesignation() {
        return strDesignation;
    }

    public void setDesignation(String strDesignation) {
        this.strDesignation = strDesignation;
    }
//region 4. Methods and Functions

    public String toString(){

        return "Employee { "+
                "Employee Id='"+ strEmployeeID + '\'' +", EmployeeName= '"+
                strEmployeeName+ '\''+ ", Designation= '"+strDesignation+ '\''+ "}";

    }

}

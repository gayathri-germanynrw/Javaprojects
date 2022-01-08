package de.gkasi.settings;

/**
 * It provides all Program texts
 */

public class AppTexts {

    //region 1
    // Application header
    public static final String APPLICATION_NAME = "\n\n#########################\t"+ "EMPLOYEE MANAGEMENT SYSTEM"+"\t###############################\n\n";
    //end

     //region 2
    // main menu
    public static final String ENCLOSED_NUMBER_PREFIX="[\t";
    public static final String ENCLOSED_NUMBER_SUFFIX="\t]";
    public static final String NO_SUCH_OPTION="There is no such option";
    public static final String EMPLOYEES="Employees";
    public static final String SHOW=ENCLOSED_NUMBER_PREFIX+AppCommands.CMD_VIEW+ENCLOSED_NUMBER_SUFFIX+" "+ "View "+EMPLOYEES ;
    public static final String ADD=ENCLOSED_NUMBER_PREFIX+AppCommands.CMD_ADD+ENCLOSED_NUMBER_SUFFIX+" " + "Add "+EMPLOYEES;
    public static final String DELETE=ENCLOSED_NUMBER_PREFIX+AppCommands.CMD_DELETE+ENCLOSED_NUMBER_SUFFIX+" "+ "Delete "+EMPLOYEES ;
    public static final String UPDATE=ENCLOSED_NUMBER_PREFIX+AppCommands.CMD_UPDATE+ENCLOSED_NUMBER_SUFFIX+" " + "update "+EMPLOYEES;
    public static final String EXIT=ENCLOSED_NUMBER_PREFIX+AppCommands.CMD_EXIT+ENCLOSED_NUMBER_SUFFIX+" "+"Exit ";
    //end region
    //region 3
    // default string
    public static final String EMPLOYEE_ID   = "EmployeeID\t:";
    public static final String EMPLOYEE_NAME = "EmployeeName\t:";
    public static final String EMPLOYEE_DESIGNATION = "EmployeeDesignation\t:";
    public static final String INPUT_NOTE_TITLE   = "\n\n" + EMPLOYEE_ID + "\t";
    public static final String INPUT_NOTE_CONTENTONE = "\n\n" + EMPLOYEE_NAME + "\t";
    public static final String INPUT_NOTE_CONTENTTWO = "\n\n" + EMPLOYEE_DESIGNATION + "\t";
    public static final String SHOW_SINGLE_ENTRY="\n[\t%d\t]\t" + EMPLOYEE_ID + " %s\t" + EMPLOYEE_NAME + " %s\t"+ EMPLOYEE_DESIGNATION + " %s\t\n";

    //region 3
    //User Messages
    public static final String USER_MSG_NO_ENTRIES_YET="No entries available";
    public static final String USER_MSG_INCORRECT_INPUT_DATA=ENCLOSED_NUMBER_PREFIX+"Please enter the correct data"+ENCLOSED_NUMBER_SUFFIX;
    public static final String CHOOSE_A_ENTRY_UPDATE=ENCLOSED_NUMBER_PREFIX+"Please select the valid entry to Update "+ENCLOSED_NUMBER_SUFFIX;
    public static final String CHOOSE_A_ENTRY =ENCLOSED_NUMBER_PREFIX+ "please select one from the above list of employees : "+ENCLOSED_NUMBER_SUFFIX;
    public static final int MIN_CHARS_TO_INPUT=1;
    //end


    //region 4
    // User question
    public static final String USER_QUESTION_DELETE_THIS_ENTRY=ENCLOSED_NUMBER_PREFIX+"Are you sure to delete this entry  "+ENCLOSED_NUMBER_SUFFIX;
     // end

    //region 5
    // Default constructor values
    public static final String DFL_EMPLOYEEID="Emp1234";
    public static final String DFL_EMPLOYEENAME="JOHN";
    public static final String DFL_DESIGNATION="Software Entwickler";
    //end region

    //region 6
    // default values
    public static final String SPLIT_CHAR    = ";";
    public static final int SPLIT_INDEX_TITLE   = 0;
    public static final int SPLIT_INDEX_CONTENTONE = 1;
    public static final int SPLIT_INDEX_CONTENTTWO = 2;
}

package de.gkasi.testdata;

import de.gkasi.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    //region 0. Constants
    private static final int MAX_AMOUNT_OF_TEST_NOTES = 10;
    //endregion

    //region 1. Decl and Init Attribute
    //endregion

    //region 2. constructor

    /**
     * Private Standard constructor
     * so that no object are created from outside of the class .
     */
    private TestData() {
    }

    //endregion

    //region 3. Test

    /**
     * This function delivered threadsafe (synchronized) employees list
     * as list back.
     *
     * @return testNotes : {@link List} - {@link Employee} : TestEmployees
     */
    public static synchronized List<Employee> getTestNotes() {
        //Decl. and Init
        List<Employee> testListe = new ArrayList<>();

        for (int noteCounter = 0; noteCounter < MAX_AMOUNT_OF_TEST_NOTES; noteCounter++) {
//			Employee empData = new Employee();
//
//			empData.getEmployeeID (noteCounter);
//			empData.getEmployeeName (noteCounter);
//
//     		testListe.add(empData);


        }

        return testListe;
    }
    //endregion

}
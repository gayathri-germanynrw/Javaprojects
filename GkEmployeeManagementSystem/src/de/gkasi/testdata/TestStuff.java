package de.gkasi.testdata;
import de.gkasi.logic.CsvFileHandler;
import de.gkasi.model.Employee;
import java.util.List;

/**
 * Used to test things separately
 */
public class TestStuff {
    public static void main(String[] args) {
        List<Employee> employeesFromFile= CsvFileHandler.getOnlyInstanceOfThisClassEver().readFromCsvFile();
        employeesFromFile.add(new Employee(" 123455","Tim","Software Entwickler"));
        //System.out.println("employeesFromFile"+employeesFromFile);
        CsvFileHandler.getOnlyInstanceOfThisClassEver().saveToCsvFile(employeesFromFile);
    }
}

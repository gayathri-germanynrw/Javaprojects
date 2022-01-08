package de.gkasi.ui;

import de.gkasi.logic.CsvFileHandler;
import de.gkasi.model.Employee;
import de.gkasi.settings.AppCommands;
import de.gkasi.settings.AppTexts;
import de.rhistel.logic.ConsoleReader;
import java.util.List;

public class UiController {
     /**
     * Gives the user the menu selection
     *  and triggers through user input
     *  the appropriate Create Read Update Delete operation(CRUD)
     */

    //region 1. Attribute
    private List<Employee> employees;
    // end region

    //region 2. constructor

    /**
     * Standard constructor
     */
    public UiController() {
        this.employees = CsvFileHandler.getOnlyInstanceOfThisClassEver().readFromCsvFile();
        //this.employees = TestData.getTestNotes();
    }
    //end region

    //region 3. Start Ui

     public void startUi() {

        mainMenu();
    }
    //end region


    /**
     * Shows the main menu over and over again
     * the user does not exit the program
     */
    private void mainMenu(){
        //Decl. and Init
        boolean chkApplication=false;

        while(!chkApplication) {
           //Display the main menu on the console
            printMainMenu();
            int iUserchoice = ConsoleReader.in.readPositivInt();
            //Check the user's input and trigger the appropriate CRUD or exit the loop
            switch (iUserchoice) {
                case AppCommands.CMD_VIEW -> viewEmployees();

                case AppCommands.CMD_ADD -> addEmployee();

                case AppCommands.CMD_UPDATE -> updateEmployee();

                case AppCommands.CMD_DELETE -> deleteEmployee();

                case AppCommands.CMD_EXIT -> chkApplication = true;
                default -> System.out.println(AppTexts.NO_SUCH_OPTION);
            }
        }

    }
    /**
     *  prints out the main menu
     */

    private void printMainMenu(){
        System.out.println(AppTexts.APPLICATION_NAME);
        System.out.println(AppTexts.SHOW);
        System.out.println(AppTexts.ADD);
        System.out.println(AppTexts.DELETE);
        System.out.println(AppTexts.UPDATE);
        System.out.println(AppTexts.EXIT);
    }
    //end region

    /**
     * Saves an entry
     */
    private void addEmployee(){
       Employee employeeToSave=getEmployeeFromUi();
       try {
           if (employeeToSave != null) {
               //one entry added
               System.out.println("print the value of the employeeToSave  " + employeeToSave);
               employees.add(employeeToSave);
               CsvFileHandler.getOnlyInstanceOfThisClassEver().saveToCsvFile(employees);

               // View list of all employees

               viewEmployees();

           } else {
               System.out.println(AppTexts.USER_MSG_INCORRECT_INPUT_DATA);
           }

           }catch(Exception e){
               e.printStackTrace();
           System.out.println("print the value of e---"+e);
           }
    }

    //end region

    /**
     * Reads out the input data of the user
     * checks these for their validity. are
     * if the data is correct, a new entry is generated.
     * Filled with the value and delivered back.
     *
     */

    private Employee getEmployeeFromUi() {
        //Decl. and Init
        Employee employeeFromUi = null;

        final int indexTitle   = 0;
        final int indexContentOne = 1;
        final int indexContentTwo = 2;
        boolean isUiDataValid = true;
        //read input data
        String[] strEmployeeData = this.getInputData();
        // traverse through the list
        for (String strCurrentEmployeeInput : strEmployeeData) {

           // the input atleast has minimum lengh 1
            if (!(strCurrentEmployeeInput.length() >=AppTexts.MIN_CHARS_TO_INPUT)) {
                isUiDataValid = false;
            }
        }

        // data is correct
        if (isUiDataValid) {
        // new entry with input data
            employeeFromUi = new Employee(strEmployeeData[indexTitle], strEmployeeData[indexContentOne],strEmployeeData[indexContentTwo]);
        }

        return employeeFromUi;
    }


    /**
     * Outputs the command prompt and reads
     * the input data.
     *
     * @return strInputtedData: {@link String} []: Read input data
     */

    private String[] getInputData() {


        System.out.print(AppTexts.INPUT_NOTE_TITLE);
        String strInputTitle = ConsoleReader.in.readMandatoryString();

        System.out.print(AppTexts.INPUT_NOTE_CONTENTONE);
        String strInputContentOne = ConsoleReader.in.readMandatoryString();

        System.out.print(AppTexts.INPUT_NOTE_CONTENTTWO);
        String strInputContentTwo = ConsoleReader.in.readMandatoryString();


        return new String[]{
                strInputTitle,
                strInputContentOne,
                strInputContentTwo
        };
    }
    // end region


    /**
     * show all entries
     */
    private void viewEmployees(){
        if(!employees.isEmpty()){
            for (int index = 0; index< employees.size(); index++)  {
                Employee currentemployee = employees.get(index);
                System.out.printf(AppTexts.SHOW_SINGLE_ENTRY, index,
                        currentemployee.getEmployeeID(), currentemployee.getEmployeeName(),currentemployee.getDesignation());
            }

        }else
          {
                System.out.println(AppTexts.USER_MSG_NO_ENTRIES_YET);
          }
 }
    // end region


    /**
     * update the Employee details
     */
    private void updateEmployee(){
        if(!employees.isEmpty()){
            viewEmployees();
            int inputIndexToEdit=getValidIndex();
            Employee objEmployeeToEdit=getEmployeeFromUi();
            if(objEmployeeToEdit!=null){
                employees.set(inputIndexToEdit,objEmployeeToEdit);
                //TODO 5 Save changes in the file after changing
                CsvFileHandler.getOnlyInstanceOfThisClassEver().saveToCsvFile(employees);

                viewEmployees();
            }else{
                System.out.println(AppTexts.CHOOSE_A_ENTRY_UPDATE);
            }

        }else{
            System.out.println(AppTexts.USER_MSG_NO_ENTRIES_YET);
        }

    }
    // end region

    /**
     * this method returns an Valid Index
     *
     * @return ValidIndex : int
     */

    private int getValidIndex() {
        int   inputIndex=0;
        final int indexOfLastElement=employees.size()-1;
        boolean isValidIndex=false;
        while(!isValidIndex){
            System.out.println(AppTexts.CHOOSE_A_ENTRY);
            inputIndex = ConsoleReader.in.readPositivInt();
            isValidIndex=((inputIndex>=0) && (inputIndex<=indexOfLastElement));
      }
   return inputIndex;
    }
    // end region

    /**
     * This method used for delete an entry
     *
     */


    private void deleteEmployee(){
         if(!employees.isEmpty()) {
             viewEmployees();
             int indexToDelete = getValidIndex();
             System.out.println(AppTexts.USER_QUESTION_DELETE_THIS_ENTRY);
             boolean answerIsYes = ConsoleReader.in.readMandatoryAnswerToBinaryQuestion();

             //Check die Antwort
             if (answerIsYes) {
                 employees.remove(indexToDelete);
                 CsvFileHandler.getOnlyInstanceOfThisClassEver().saveToCsvFile(employees);
                 viewEmployees();
             }

         }else{
             System.out.println(AppTexts.USER_MSG_NO_ENTRIES_YET);
         }

    }
    // end region

}

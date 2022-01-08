package de.gkasi.testdata;

import de.gkasi.model.Note;
import de.gkasi.logic.CsvFileHandler;

import java.util.List;

/**
 * TODO 2 Klasse implementieren und Notes Testen
 * Wird zum separaten testen von Dingen genutzt
 */
public class TestStuff {

    public static void main(String[] args) {
//        Note noteOne = new Note("Einkaufen", "Tomaten");
//        Note noteTwo = new Note();
//
//        System.out.println(noteOne);
//        System.out.println(noteOne.getAllAttributesAsCsvString());
//
//        String strCsvLine = "Fahren bei ZUG ; Ticket nicht vergessen !!!";
//        noteTwo.setAllAttributesFromCsvLine(strCsvLine);
//
//        System.out.println(noteTwo);
//        System.out.println(noteTwo.getAllAttributesAsCsvString());


        List<Note> notesFromFile = CsvFileHandler.getOnlyInstanceOfThisClassEver().readFromCsvFile();

        //System.out.println(notesFromFile);

        notesFromFile.add(new Note("Einkaufen  ","Obst und Gemüse"));
       // notesFromFile.clear();


        System.out.println(notesFromFile);
        CsvFileHandler.getOnlyInstanceOfThisClassEver().saveToCsvFile(notesFromFile);



    }
}
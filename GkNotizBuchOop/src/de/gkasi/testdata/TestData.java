package de.gkasi.testdata;


import de.gkasi.model.Note;

import java.util.ArrayList;
import java.util.List;

/**
 * Diese Klasse stellt generische
 * Test {@link }
 * und gibt diese als {@link java.util.List} zurueck.
 * Von dieser Klasse muss kein Objekt angelegt werden.
 * Da Sie nur eine einzige Funktion hat. Diese ist statisch und
 * kann ueber den Klassenamen aufgerufen werden.
 * Deswegen ist der Konsturktor aehnlich wie bei
 * Textklassen privat
 */


public class TestData {
    private static final int MAX_AMOUNT_OF_TEST_NOTES = 10;

    private TestData(){

    }

    /**
     * Diese Funktion liefert threadsicher(synchronized) Testnotizen
     * als Liste zurueck.
     *
     * @return testNotes : {@link List} - {@link Note} : Testnotizen
     */


    public static synchronized List<Note> getTestNotes(){
        List<Note> testNoteList=new ArrayList<>();
        for(int noteCounter=0;noteCounter<MAX_AMOUNT_OF_TEST_NOTES;noteCounter++){
            //      Note testNote = new Note();

//			testNote.setTitle("Titel " + noteCounter);
//			testNote.setContent("Inhalt " + noteCounter);

//			testNoteListe.add(testNote);

//			Note testNote = new Note("Titel " + noteCounter, "Inhalt " + noteCounter);
//			testNoteListe.add(testNote);

            testNoteList.add(new Note("Titel " + noteCounter,"Inhalt " + noteCounter));

        }


        return testNoteList;
    }

}

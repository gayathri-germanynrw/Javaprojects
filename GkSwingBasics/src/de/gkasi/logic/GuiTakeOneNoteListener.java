package gkasi.logic;



import gkasi.model.SimpleNote;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Nimmt die Klicks der Klasse {@link de.rhistel.gui.GuiTakeOneNote} entegegen
 * und leitet die weitere Logik in actionPerformed ein.
 * TODO 3.0 Listener selber schreiben
 */
public class GuiTakeOneNoteListener implements ActionListener {
	
	//region 0. Konstanten
	//endregion
	
	//region 1. Decl and Init Attribute
	private JTextField txtNoteContent;
	private JLabel     lblOutput;
	//endregion
	
	//region 2. Konstruktoren
	
	/**
	 * Direktes setzen der Attribute zur beschaffung der Daten
	 *
	 * @param txtNoteContent : {@link JTextField} : {@link de.rhistel.logic.GuiTakeOneNoteListener#txtNoteContent}
	 * @param lblOutput      : {@link JTextField} : {@link de.rhistel.logic.GuiTakeOneNoteListener#lblOutput}
	 */
	public GuiTakeOneNoteListener(JTextField txtNoteContent, JLabel lblOutput) {
		this.txtNoteContent = txtNoteContent;
		this.lblOutput      = lblOutput;
	}
	
	//endregion
	
	//region 3. ClickEvent
	
	/**
	 * Invoked when an action occurs.
	 *
	 * @param e the event to be processed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
			
			
			//Auslesen der Eingabedaten
			String strNoteContent = txtNoteContent.getText();
			
			//Checken ob diese Richtig sind
			if (!strNoteContent.isEmpty()) {
				
				//Datumsformat generieren sprich wie soll das Datum angezeigt werden
				DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
				
				//Duch die pure Generierung von Date bekommen wir das aktuelle Datum per format als String
				String strCreationDate = dateFormat.format(new Date());
				
				//Generierung des Models
				SimpleNote simpleNoteFromGui = new SimpleNote(strCreationDate, strNoteContent);
				
				//Weiterverarbeitung
				lblOutput.setText(simpleNoteFromGui.getCreationDate() + " : " + simpleNoteFromGui.getContent());
				
				//Speicher in Datei
				CsvFileHandler.getInstance().saveSimpleNoteToCsvFile(simpleNoteFromGui);
			} else {
				lblOutput.setText("Eingabe darf nicht leer sein");
			}
		
		
	}
	//endregion
	
	//region 4. Methoden und Funktionen
	//endregion
}
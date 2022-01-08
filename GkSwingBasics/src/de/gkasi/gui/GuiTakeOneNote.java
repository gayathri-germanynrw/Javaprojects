package gkasi.gui;

import gkasi.logic.CsvFileHandler;
import gkasi.logic.GuiTakeOneNoteListener;
import gkasi.model.SimpleNote;

import javax.swing.*;

public class GuiTakeOneNote {

    private JFrame mainFrameWindow;
    private JTextField txtNoteContent;
    private JButton btnSubmitNote;
    private JLabel lblOutput;

    public void openGui(){
        this.mainFrameWindow=new JFrame("Nur eine Notiz");
        this.txtNoteContent=new JTextField();
        this.btnSubmitNote=new JButton("Speichern");
        this.lblOutput=new JLabel("Ausgabe der Notiz");

        //3.Konfiguration Hauptfenster
        this.mainFrameWindow.setSize(400, 300);
        this.mainFrameWindow.setLocation(410, 200);
        this.mainFrameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //4. Konfigurieren der Views
        this.txtNoteContent.setSize(290, 25);
        this.txtNoteContent.setLocation(15, 40);

        this.btnSubmitNote.setSize(290, 25);
        this.btnSubmitNote.setLocation(15, 65);

        this.lblOutput.setSize(290, 25);
        this.lblOutput.setLocation(15, 95);


        SimpleNote lastSimpleNote= CsvFileHandler.getInstance().readSimpleNoteFromCsvFile();
        this.lblOutput.setText(lastSimpleNote.getCreationDate()+ " : "+ lastSimpleNote.getContent());

//5. Hinzufuegen der Steuerelemente zum Hauptfenster
        this.mainFrameWindow.add(this.txtNoteContent);
        this.mainFrameWindow.add(this.btnSubmitNote);
        this.mainFrameWindow.add(this.lblOutput);

        this.btnSubmitNote.addActionListener(new GuiTakeOneNoteListener(this.txtNoteContent, this.lblOutput));


        this.mainFrameWindow.setVisible(true);




    }




}

package es.uniovi.eii.ds.main.command;

import es.uniovi.eii.ds.main.FileCommand;
import es.uniovi.eii.ds.main.FileEditor;

public class Delete implements FileCommand {

    @Override
    public void execute(FileEditor editor) {

        if(editor.isRecording()){
            editor.record(this);
            return;
        }

        StringBuilder text = new StringBuilder(editor.getText());

        int indexOfLastWord = text.toString().trim().lastIndexOf(" ");
		if (indexOfLastWord == -1)
            text = new StringBuilder("");
		else
			text.setLength(indexOfLastWord);

        editor.setText(text);
    }


}

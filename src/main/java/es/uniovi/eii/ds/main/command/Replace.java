package es.uniovi.eii.ds.main.command;

import es.uniovi.eii.ds.main.FileCommand;
import es.uniovi.eii.ds.main.FileEditor;

public class Replace implements FileCommand{

    private final String[] args;

    public Replace(String [] args){
        this.args = args;
    }

    @Override
    public void execute(FileEditor editor) {
        if(editor.isRecording()){
            editor.record(this);
            return;
        }
        String find = args[0];
		String replace = args[1];
        editor.setText(new StringBuilder(editor.getText().replace(find, replace)));
    }

}

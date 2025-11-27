package es.uniovi.eii.ds.main.command;

import es.uniovi.eii.ds.main.FileCommand;
import es.uniovi.eii.ds.main.FileEditor;

public class Insert implements FileCommand{

    private final String[] args;

    public Insert(String[] args){
        this.args = args;
    }

    @Override
    public void execute(FileEditor editor) {
        if(editor.isRecording()){
            editor.record(this);
            return;
        }
        StringBuilder text = new StringBuilder(editor.getText());
        for(String word: args){
            text.append(" ").append(word);
        }
        editor.setText(text);
    }

}

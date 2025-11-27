package es.uniovi.eii.ds.main.command;

import java.util.ArrayDeque;
import java.util.Queue;

import es.uniovi.eii.ds.main.FileCommand;
import es.uniovi.eii.ds.main.FileEditor;

public class Macro implements FileCommand {

    private final Queue<FileCommand> commands = new ArrayDeque<>();
    private final String name;

    public Macro(String name){
        this.name = name;
    }

    public void addCommand(FileCommand command) {
        commands.add(command);
    }

    public String name(){
        return name;
    }
    
    @Override
    public void execute(FileEditor editor) {

        if(editor.isRecording()){
            editor.record(this);
            return;
        }
        
        for (FileCommand command : commands) {
            command.execute(editor);
        }
    }

}

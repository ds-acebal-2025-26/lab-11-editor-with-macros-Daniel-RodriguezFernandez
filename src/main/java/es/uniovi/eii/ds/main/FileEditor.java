package es.uniovi.eii.ds.main;

import java.util.HashMap;
import java.util.Map;

import es.uniovi.eii.ds.main.command.Macro;

public class FileEditor {

    private StringBuilder text = new StringBuilder();
    private Map<String, Macro> macros = new HashMap<>();
    private Macro currentMacro = null;

    public String getText() {
        return text.toString();
    }

    public void setText(StringBuilder text) {
        this.text = text;
    }

    public Map<String, Macro> getMacros() {
        return macros;
    }

    public void startRecording(String name){
        this.currentMacro = new Macro(name);
    }

    public Macro getCurrentMacro(){
        return currentMacro;
    }

    public boolean isRecording(){
        return currentMacro != null;
    }

    public void stopRecording(){
        currentMacro = null;
    }

    public void record(FileCommand command){
        if(isRecording()){
            currentMacro.addCommand(command);
        }
    }
}

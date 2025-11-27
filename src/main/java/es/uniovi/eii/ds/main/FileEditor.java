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

<<<<<<< HEAD
    public void startRecording(String name){
        this.currentMacro = new Macro(name);
=======
    public void startRecording(Macro macro){
        this.currentMacro = macro;
>>>>>>> 5c800db85f0b87850a36c87d9b62bc8da52a5ff7
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
<<<<<<< HEAD
=======

    public void startRecording(Macro macro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

>>>>>>> 5c800db85f0b87850a36c87d9b62bc8da52a5ff7
}

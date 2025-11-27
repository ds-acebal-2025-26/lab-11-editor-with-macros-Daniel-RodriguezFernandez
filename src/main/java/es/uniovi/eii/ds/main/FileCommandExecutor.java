package es.uniovi.eii.ds.main;

public class FileCommandExecutor {

    private final FileEditor fileEditor;

    public FileCommandExecutor(FileEditor editor) {
        this.fileEditor = editor;
    }

    public void execute(FileCommand command) {
        command.execute(fileEditor);
    }

    
}

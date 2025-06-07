package programs.patterns.memento;

// Originator class (the text editor)
public class TextEditor {
    private String content = "";

    public void type(String word) {
        content = word;
    }

    public String getContent() {
        return content;
    }

    public TextMemento save() {
        return new TextMemento(content);
    }

    public void restore(TextMemento memento) {
        if (memento != null) {
            content = memento.getState();
        }
    }

}

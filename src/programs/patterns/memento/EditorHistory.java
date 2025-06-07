package programs.patterns.memento;

import java.util.Stack;

public class EditorHistory {

    private final Stack<TextMemento> history = new Stack<>();

    public void save(TextEditor editor) {
        if (editor != null) {
            history.push(editor.save());
        }
    }

    public void undo(TextEditor editor) {
        if (editor != null) {
            if (!history.isEmpty()) {
                editor.restore(history.pop());
            }
        }
    }
}

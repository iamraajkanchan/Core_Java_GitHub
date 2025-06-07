package programs.patterns.memento;

import java.util.Stack;

public class EditorHistoryFromAI {
    private final Stack<TextMemento> history = new Stack<>();

    public EditorHistoryFromAI() {
        history.push(new TextMemento("")); // Ensure empty state is saved at the start
    }

    public void save(TextEditor editor) {
        if (editor != null) {
            history.push(editor.save());
        }
    }

    public void undo(TextEditor editor) {
        if (editor != null && !history.isEmpty()) {
            editor.restore(history.pop());
        }
    }
}
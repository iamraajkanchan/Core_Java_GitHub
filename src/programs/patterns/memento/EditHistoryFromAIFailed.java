package programs.patterns.memento;

import java.util.Stack;

public class EditHistoryFromAIFailed {
    private final Stack<TextMemento> history = new Stack<>();

    public void save(TextEditor editor) {
        if (editor != null) {
            // Ensure the initial state is saved
            if (history.isEmpty()) {
                history.push(new TextMemento("")); // Save empty state first
            }
            history.push(editor.save());
        }
    }

    public void undo(TextEditor editor) {
        if (editor != null) {
            if (!history.isEmpty()) {
                System.out.println("History before undo:");
                for (TextMemento memento : history) {
                    System.out.println("Saved State: " + memento.getState());
                }

                TextMemento lastState = history.pop();
                editor.restore(lastState); // Restore last saved state

                System.out.println("Restored to: " + editor.getContent());

                System.out.println("History after undo:");
                for (TextMemento memento : history) {
                    System.out.println("Saved State: " + memento.getState());
                }
            } else {
                System.out.println("Undo failed: History is empty!");
            }
        }
    }
}

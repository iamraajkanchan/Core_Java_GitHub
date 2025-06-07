package programs.patterns.memento;


/**
 * The memento behavioral design pattern is used to save and restore the state of an object without violating encapsulation.
 * It is especially useful when an object's state can change frequently, and you need a way to revert back to
 * a previous state, like in undo/redo functionality.
 * */


// A memento class stores a state.
public class TextMemento {
    private String state;

    public TextMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

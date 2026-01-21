package linkedlist;

class TextEditor {

    static class State {
        String text;
        State prev, next;

        State(String text) {
            this.text = text;
        }
    }

    State head, current;
    int size = 0, limit = 10;

    void addState(String text) {
        State s = new State(text);

        if (current != null)
            current.next = null;

        if (head == null) {
            head = current = s;
        } else {
            s.prev = current;
            current.next = s;
            current = s;
        }

        size++;
        if (size > limit)
            head = head.next;
    }

    void undo() {
        if (current.prev != null)
            current = current.prev;
    }

    void redo() {
        if (current.next != null)
            current = current.next;
    }

    void display() {
        System.out.println("Current Text: " + current.text);
    }

    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        te.addState("Hello");
        te.addState("Hello World");
        te.addState("Hello World!");

        te.display();
        te.undo();
        te.display();
        te.redo();
        te.display();
    }
}

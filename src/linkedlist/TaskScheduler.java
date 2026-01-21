package linkedlist;

class TaskScheduler {

    static class Task {
        int id;
        String name;
        int priority;
        Task next;

        Task(int id, String name, int p) {
            this.id = id;
            this.name = name;
            priority = p;
        }
    }

    Task head = null, tail = null;

    void addTask(int id, String name, int p) {
        Task t = new Task(id, name, p);
        if (head == null) {
            head = tail = t;
            t.next = head;
        } else {
            tail.next = t;
            tail = t;
            tail.next = head;
        }
    }

    void display() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addTask(1, "Code", 1);
        ts.addTask(2, "Debug", 2);
        ts.display();
    }
}

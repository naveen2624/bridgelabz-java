package linkedlist;

class RoundRobin {

    static class Process {
        int id, burst;
        Process next;

        Process(int id, int b) {
            this.id = id;
            burst = b;
        }
    }

    Process head = null, tail = null;

    void addProcess(int id, int b) {
        Process p = new Process(id, b);
        if (head == null) {
            head = tail = p;
            p.next = head;
        } else {
            tail.next = p;
            tail = p;
            tail.next = head;
        }
    }

    void simulate(int tq) {
        Process curr = head;
        while (head != null) {
            if (curr.burst > tq) {
                curr.burst -= tq;
            } else {
                System.out.println("Process " + curr.id + " completed");
                remove(curr.id);
            }
            curr = curr.next;
        }
    }

    void remove(int id) {
        Process curr = head, prev = tail;
        do {
            if (curr.id == id) {
                if (curr == head) head = head.next;
                prev.next = curr.next;
                if (curr == tail) tail = prev;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public static void main(String[] args) {
        RoundRobin rr = new RoundRobin();
        rr.addProcess(1, 10);
        rr.addProcess(2, 5);
        rr.simulate(3);
    }
}

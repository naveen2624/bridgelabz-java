package linkedlist;

class InventorySystem {

    static class Item {
        int id, qty;
        String name;
        double price;
        Item next;

        Item(int id, String name, int q, double p) {
            this.id = id;
            this.name = name;
            qty = q;
            price = p;
        }
    }

    Item head;

    void addEnd(int id, String name, int q, double p) {
        Item item = new Item(id, name, q, p);
        if (head == null) {
            head = item;
            return;
        }
        Item temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = item;
    }

    double totalValue() {
        double sum = 0;
        Item temp = head;
        while (temp != null) {
            sum += temp.qty * temp.price;
            temp = temp.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        InventorySystem inv = new InventorySystem();
        inv.addEnd(101, "Pen", 10, 5);
        inv.addEnd(102, "Book", 5, 100);
        System.out.println("Total Value: " + inv.totalValue());
    }
}

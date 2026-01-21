package linkedlist;

import java.util.*;

class SocialMedia {

    static class User {
        int id, age;
        String name;
        List<Integer> friends;   // Friend IDs
        User next;

        User(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
            friends = new ArrayList<>();
        }
    }

    User head;

    void addUser(int id, String name, int age) {
        User u = new User(id, name, age);
        u.next = head;
        head = u;
    }

    User findUserById(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriend(int id1, int id2) {
        User u1 = findUserById(id1);
        User u2 = findUserById(id2);
        if (u1 != null && u2 != null) {
            u1.friends.add(id2);
            u2.friends.add(id1);
        }
    }

    void removeFriend(int id1, int id2) {
        User u1 = findUserById(id1);
        User u2 = findUserById(id2);
        if (u1 != null && u2 != null) {
            u1.friends.remove(Integer.valueOf(id2));
            u2.friends.remove(Integer.valueOf(id1));
        }
    }

    void mutualFriends(int id1, int id2) {
        User u1 = findUserById(id1);
        User u2 = findUserById(id2);
        if (u1 == null || u2 == null) return;

        System.out.print("Mutual Friends: ");
        for (int f : u1.friends)
            if (u2.friends.contains(f))
                System.out.print(f + " ");
        System.out.println();
    }

    void displayFriends(int id) {
        User u = findUserById(id);
        if (u != null)
            System.out.println("Friends of " + u.name + ": " + u.friends);
    }

    void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friends");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice", 21);
        sm.addUser(2, "Bob", 22);
        sm.addUser(3, "Charlie", 23);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);

        sm.displayFriends(1);
        sm.mutualFriends(2, 3);
        sm.countFriends();
    }
}

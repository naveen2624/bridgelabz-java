package jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class User {
    public String name;
    public int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class ListToJsonArray {

    public static void main(String[] args) throws Exception {

        List<User> users = new ArrayList<>();
        users.add(new User("John",30));
        users.add(new User("Alice",22));
        users.add(new User("Mike",28));

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(users);

        System.out.println(json);
    }
}
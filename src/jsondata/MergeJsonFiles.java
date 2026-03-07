package jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class MergeJsonFiles {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 = (ObjectNode) mapper.readTree(new File("user1.json"));
        ObjectNode json2 = (ObjectNode) mapper.readTree(new File("user2.json"));

        json1.setAll(json2);

        System.out.println(json1.toPrettyString());
    }
}
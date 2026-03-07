package jsondata;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;

public class PrintJsonKeys {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(new File("user.json"));

        Iterator<String> keys = node.fieldNames();

        while(keys.hasNext()){
            String key = keys.next();
            System.out.println(key + " : " + node.get(key));
        }
    }
}
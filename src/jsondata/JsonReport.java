package jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class JsonReport {

    public static void main(String[] args) throws Exception {

        List<Map<String,Object>> records = new ArrayList<>();

        Map<String,Object> row1 = new HashMap<>();
        row1.put("id",1);
        row1.put("name","John");

        Map<String,Object> row2 = new HashMap<>();
        row2.put("id",2);
        row2.put("name","Alice");

        records.add(row1);
        records.add(row2);

        ObjectMapper mapper = new ObjectMapper();

        String report = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(records);

        System.out.println(report);
    }
}
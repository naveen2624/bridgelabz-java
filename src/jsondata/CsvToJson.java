package jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class CsvToJson {

    public static void main(String[] args) throws Exception {

        String[][] csv = {
                {"name","age"},
                {"John","30"},
                {"Alice","25"}
        };

        List<Map<String,String>> list = new ArrayList<>();

        for(int i=1;i<csv.length;i++){
            Map<String,String> map = new HashMap<>();
            map.put("name",csv[i][0]);
            map.put("age",csv[i][1]);
            list.add(map);
        }

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(list);

        System.out.println(json);
    }
}
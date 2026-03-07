package jsondata;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJsonExample {

    public static void main(String[] args) {

        String json = "{ \"name\":\"John\", \"age\":30 }";

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.readTree(json);
            System.out.println("Valid JSON");
        }
        catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}

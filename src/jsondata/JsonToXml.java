package jsondata;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.util.Map;

public class JsonToXml {

    public static void main(String[] args) throws Exception {

        XmlMapper xmlMapper = new XmlMapper();

        Map<String,Object> data = Map.of(
                "name","John",
                "age",30
        );

        String xml = xmlMapper.writeValueAsString(data);

        System.out.println(xml);
    }
}
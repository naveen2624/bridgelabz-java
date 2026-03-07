package jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    public String brand;
    public String model;
    public int year;
}

public class CarToJsonExample {

    public static void main(String[] args) throws Exception {

        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Camry";
        car.year = 2023;

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(car);

        System.out.println(json);
    }
}
package methods.level3;

import java.util.HashSet;

public class OTPGenerator {

    static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++)
            set.add(generateOTP());

        System.out.println("Unique OTPs Generated: " + set.size());
    }
}

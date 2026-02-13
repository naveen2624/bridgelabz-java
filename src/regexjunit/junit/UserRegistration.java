package regexjunit.junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistration {

    public boolean registerUser(String username, String email, String password) {

        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Invalid username");
        }

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Invalid password");
        }

        // Simulating successful registration
        return true;
    }
}

class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertTrue(registration.registerUser(
                "Naveen",
                "naveen@email.com",
                "Password1"
        ));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                    "",
                    "user@email.com",
                    "Password1"
            );
        });
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                    "User",
                    "invalidemail",
                    "Password1"
            );
        });
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                    "User",
                    "user@email.com",
                    "pass"
            );
        });
    }
}

package regexjunit.junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidator {

    public boolean isValid(String password) {
        if (password.length() < 8) return false;

        boolean hasUpperCase = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*\\d.*");

        return hasUpperCase && hasDigit;
    }
}

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Password1"));
    }

    @Test
    void testTooShortPassword() {
        assertFalse(validator.isValid("Pass1"));
    }

    @Test
    void testNoUpperCase() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("Password"));
    }
}

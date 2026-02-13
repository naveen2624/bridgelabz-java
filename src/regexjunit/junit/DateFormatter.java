package regexjunit.junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    public String formatDate(String inputDate) {
        try {
            LocalDate date = LocalDate.parse(inputDate); // yyyy-MM-dd
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return date.format(formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected yyyy-MM-dd");
        }
    }
}

class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        String result = formatter.formatDate("2026-02-13");
        assertEquals("13-02-2026", result);
    }

    @Test
    void testInvalidFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("13-02-2026");
        });
    }

    @Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2026-02-30"); // Feb 30 doesn't exist
        });
    }
}


package regexjunit.junit;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class DatabaseConnection {

    private boolean connected = false;

    public void connect() {
        connected = true;
        System.out.println("Database connected");
    }

    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected");
    }

    public boolean isConnected() {
        return connected;
    }
}



class DatabaseConnectionTest {

    DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(db.isConnected());
    }

    @Test
    void testConnectionIsClosedAfterTest() {
        db.disconnect();
        assertFalse(db.isConnected());
    }
}

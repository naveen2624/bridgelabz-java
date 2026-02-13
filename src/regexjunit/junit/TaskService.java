package regexjunit.junit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;


public class TaskService {

    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // 3 seconds
        return "Task Completed";
    }
}
class TaskServiceTest {

    TaskService service = new TaskService();

    @Test
    @Timeout(2) // Fails if takes more than 2 seconds
    void testLongRunningTask() throws InterruptedException {
        String result = service.longRunningTask();
        assertEquals("Task Completed", result);
    }
}


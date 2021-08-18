package template.core.entity.common;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Task")
final class TaskTest {

    @Test
    @DisplayName("create a task")
    void createTask() {
        final var typicalTaskTitle = "Implement a feature";
        final var task = new Task(typicalTaskTitle);
        assertEquals(typicalTaskTitle, task.title());
    }

}

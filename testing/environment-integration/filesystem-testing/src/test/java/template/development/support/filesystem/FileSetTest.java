package template.development.support.filesystem;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("File set")
final class FileSetTest {

    private final String DATASET_DIRECTORY = System.getenv("DATASET_DIRECTORY");

    @Test
    @DisplayName("find existing yaml files")
    void findExistingYamlFiles() throws IOException {
        final var root = DATASET_DIRECTORY + "/common";
        final var list = FileSet.findFiles(root, "yaml");
        assertEquals(1, list.size());
        assertEquals(root + "/tasks.yaml", list.get(0).toString());
    }

    @Test
    @DisplayName("find non existing xml files")
    void findNonExistingXmlFiles() throws IOException {
        final var root = DATASET_DIRECTORY + "/common";
        final var list = FileSet.findFiles(root, "xml");
        assertEquals(0, list.size());
    }

    @Test
    @DisplayName("try to find files at missing path")
    void tryToFindFilesMissingPath() {
        final var root = DATASET_DIRECTORY + "/missing";
        final var exception = assertThrows(IOException.class,
                () -> FileSet.findFiles(root, "yaml"));
        assertEquals("File list could not be retrieved for path: " + root, exception.getMessage());
    }

}

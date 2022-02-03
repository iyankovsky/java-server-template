package template.development.support.filesystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * A <b>file set</b> provides access to list of files.
 *
 * @author Igor Yankovsky
 */
public final class FileSet {

    private FileSet() {
    }

    /**
     * Find files within one path.
     * Files are always filtered by extension.
     *
     * @param rootPath  root path to search files
     * @param extension files extension
     * @return list of files
     * @throws IOException if error occurred during search
     */
    public static List<Path> findFiles(String rootPath, String extension) throws IOException {
        try (var stream = Files.walk(Paths.get(rootPath))) {
            final var ending = "." + extension;
            return stream.filter(p -> p.toString().endsWith(ending)).toList();
        } catch (IOException e) {
            throw new IOException("File list could not be retrieved for path: " + rootPath, e);
        }
    }

}

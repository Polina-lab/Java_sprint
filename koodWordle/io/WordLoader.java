package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WordLoader {
    private final String filename;

    public WordLoader(String filename) {
        this.filename = filename;
    }

    public List<String> loadWords() throws IOException {
        return Files.readAllLines(Paths.get(filename));
    }
}

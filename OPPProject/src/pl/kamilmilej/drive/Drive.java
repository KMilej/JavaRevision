package pl.kamilmilej.drive;

import pl.kamilmilej.file.File;

public interface Drive {

    void addFile(File file);
    void listFiles();
    File findFile(String fileName);
}

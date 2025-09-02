package pl.kamilmilej.drive;

import pl.kamilmilej.file.File;

import java.util.ArrayList;
import java.util.List;

public class HDDDrive implements Drive {
    List<File> files = new ArrayList<>();

    @Override
    public void listFiles() {
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public File findFile(String fileName) {

        for (File filesList : files) {
            if (fileName.equals(filesList.getName())) {
                return filesList;
            }
        }
        return null;
    }
}

package pl.kamilmilej.drive;

import pl.kamilmilej.file.File;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SSDDrive implements Drive {
    Map<String, File> files = new HashMap<>();

    @Override
    public void addFile(File file) {
        files.put(file.getName(), file);
    }

    @Override
    public void listFiles() {
        Set<String> strings = files.keySet();

        for (String fileNames : strings) {
            System.out.println(fileNames);
        }

    }

    public File findFile(String fileName) {
      return files.get(fileName);
    }
}

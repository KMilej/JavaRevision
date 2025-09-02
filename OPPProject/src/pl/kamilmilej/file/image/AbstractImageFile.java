package pl.kamilmilej.file.image;

import pl.kamilmilej.file.AbstractFile;
import pl.kamilmilej.file.File;
import pl.kamilmilej.file.FileType;

public class AbstractImageFile extends AbstractFile {

    public AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}

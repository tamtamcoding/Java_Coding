package com.accenture.day7.designpattern.factorydesign.implementation;

import javax.annotation.processing.FilerException;
import java.io.File;

public class ReaderFactory {

    public ReadFile getReader(File file) throws ReadFileException {
        if (file.getName().isEmpty()){
            throw new ReadFileException(ReadFileException.NAME_OF_FILE_IS_EMPTY);
        }
        if (file.getName().endsWith("csv")){
            return new CSVReader();
        } else if (file.getName().endsWith("txt")) {
            return new TextReader();
        } else {
            throw new ReadFileException(ReadFileException.FILE_DOES_NOT_EXIST);
        }
    }
}

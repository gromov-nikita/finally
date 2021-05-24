package helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Parser {
    public static Properties getProperty(String path) throws IOException {
        FileInputStream fileInputStream = null;
        Properties property = new Properties();
        try {
            fileInputStream = new FileInputStream(path);
            property.load(fileInputStream);
        }
        catch (IOException ex) {
            ex.printStackTrace();
            throw new IOException();
        }
        finally {
            if(fileInputStream != null) {
                fileInputStream.close();
            }
        }
        return property;
    }
}
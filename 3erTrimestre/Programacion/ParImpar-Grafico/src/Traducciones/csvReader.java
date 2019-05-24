package Traducciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;


public class csvReader {
    public static final String delimiter = ";";
    public static final String QUOTE = "\"";
    BufferedReader br = null;

    CSVReader reader = null;
      try {
        reader = new CSVReader(new FileReader("./words.xml"),delimiter,QUOTE);
        String[] nextLine=null;

        while ((nextLine = reader.readNext()) != null) {
            System.out.println(Arrays.toString(nextLine));
        }

    } catch (Exception e) {
         ...
    } finally {
        if (null != reader) {
            reader.close();
        }
    }
}
}


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by eivhy on 20.12.2015.
 */
public class readFile {

    public String readFile(String filename) throws IOException {

        String content = null;

        File file = new File(filename);

        FileReader reader = null;

        try {
            reader = new FileReader(file);
            char[] chars = new char[(int)file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader!=null) reader.close();
        }

        return content;

    }

}

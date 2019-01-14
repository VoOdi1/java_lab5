package PackegeLab5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public  class saveFile {

    void write_file(String fileName,String Words  )
    {
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            out.write(Words);
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

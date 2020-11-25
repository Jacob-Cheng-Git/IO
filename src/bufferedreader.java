import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class bufferedreader {

    public void TestBufferedReader(){
        File file = new File("d:/lol.txt");

        try (
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        ){
            while (true){
                String line = bufferedReader.readLine();
                if (null == line)
                    break;
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

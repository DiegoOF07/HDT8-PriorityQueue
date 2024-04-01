import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class Reader {

    private File file;

    /**
     * @description Constructor de la clase
     * @param fileName
     */
    public Reader(String fileName){
        file = new File(fileName);
    }

     /** 
     * @description Método que se encarga de leer el archivo con los pacientes
     * @return ArrayList<String>
     * @throws Exception
     */
    public ArrayList<Patient> read() throws Exception{
        ArrayList<Patient> patients = new ArrayList<>();
        BufferedReader bufer = new BufferedReader(new FileReader(file));
        String line = bufer.readLine();
        while(line != null){
            List<String> items = Stream.of(line.split("\\s*,\\s*")).toList();
            patients.add(new Patient(items.get(0), items.get(1), items.get(2).charAt(0)));
            line = bufer.readLine();
        }
        bufer.close();
        return patients;
    }  
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Patient> myQueue = new PriorityQueue<>();
        ArrayList<Patient> myPatients;
        myQueue.insert(new Patient("Arnulfo", "Gripe", 'E'));
        myQueue.insert(new Patient("Pedro", "Neumonia", 'B'));
        myQueue.insert(new Patient("Rafael", "Cirrosis", 'A'));
        myQueue.insert(new Patient("Miguel", "Fiebre", 'C'));
        myQueue.insert(new Patient("Gabriel", "Paro Cardiaco", 'A'));
        myPatients = myQueue.showQueue();
        for (Patient patient : myPatients) {
            System.out.println(patient);
        }
    }
}

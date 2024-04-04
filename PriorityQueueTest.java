import org.junit.*;
public class PriorityQueueTest {
    
    /**
     * @description Test creado con la finalidad de probar la insersion de los elementos en la cola
     */
    @Test
    public void insertInQueueTest(){
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        queue.insert(new Patient("María", "Dolor de cabeza", 'D'));
        queue.insert(new Patient("Robert", "Neumonia", 'B'));
        queue.insert(new Patient("Ernest", "Tos", 'E'));
        Patient patient = queue.getQueue().remove();
        Assert.assertEquals(new Patient("Robert", "Neumonia", 'B').toString(), patient.toString());
    }

    /**
     * @description Test creado con la finalidad de probar la eliminacion de los elementos de la cola por prioridad
     */
    @Test
    public void removingPatientFromQueue(){
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        queue.insert(new Patient("María", "Dolor de cabeza", 'D'));
        queue.insert(new Patient("Robert", "Paro Cardiaco", 'A'));
        queue.insert(new Patient("Ernest", "Diarrea", 'C'));
        Patient patient = queue.getQueue().remove();
        Assert.assertEquals(new Patient("Robert", "Paro Cardiaco", 'A').toString(), patient.toString());
    }
    
}

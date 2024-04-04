import java.util.LinkedList;
import java.util.Scanner;
/**
 * @author Diego Flores 23714
 * Clase encargada de mostrar los datos al usuario y ejecutar el programa
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repit = true;
        while(repit){
            System.out.println("\nSala de emergencias\n");
            System.out.println("1. PriorityQueue propia");
            System.out.println("2. PriorityQueue Java Collection Framework");
            System.out.println("3. Salir");
            System.out.print("Selecciona la opcion que desees: ");
            String op = sc.nextLine();
            switch (op) {
                case "1":
                    subMenu1();
                    break;
                case "2":
                    subMenu2();
                    break;
                case "3":
                    repit = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }

    /**
     * @description SubMenu para la cola de prioridad propia
     */
    public static void subMenu1(){
        PriorityQueue<Patient> myQueue = new PriorityQueue<>();
        LinkedList<Patient> myPatients = null;
        Reader reader = new Reader("pacientes.txt");
        Scanner sc = new Scanner(System.in);
        boolean repit = true;
        boolean isCharged = false;
        while(repit){
            System.out.println("\nSala de emergencias\n");
            System.out.println("1. Cargar datos del archivo");
            System.out.println("2. Mostrar los pacientes por prioridad");
            System.out.println("3. Atender un paciente");
            System.out.println("4. Regresar");
            System.out.print("Selecciona la opcion que desees: ");
            String op = sc.nextLine();
            switch (op) {
                case "1":
                    if(!isCharged){
                        try {
                            for (Patient patient : reader.read()) {
                                myQueue.insert(patient);
                            }
                        } catch (Exception e) {
                            e.getMessage();
                        }
                        myPatients = myQueue.getQueue();
                        isCharged = true;
                    }else{
                        System.out.println("Ya has cargado los datos del archivo de texto");
                    }
                    break;
                case "2":
                    if(isCharged){
                        for (Patient patient : myPatients) {
                            System.out.println(patient);
                        }
                    }else{
                        System.out.println("Para mostrar los datos primero cargalos en la cola");
                    }
                    break;
                case "3":
                    Patient current = myQueue.remove();
                    if(isCharged){
                        if(current != null){
                            System.out.println("Paciente atendido: "+current);
                        }else{
                            System.out.println("Todos los pacientes se han atendido");
                            isCharged = false;
                        }
                    }else{
                        System.out.println("No se puede atender un paciente si aun no se cargan los datos");
                    }
                    break;
                case "4":
                    repit = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }

    /**
     * @description SubMenu para la cola de prioridad propia de Java Collection Framework
     */
    public static void subMenu2(){
        java.util.PriorityQueue<Patient> myQueue = new java.util.PriorityQueue<>();
        Reader reader = new Reader("pacientes.txt");
        Scanner sc = new Scanner(System.in);
        boolean repit = true;
        boolean isCharged = false;
        while(repit){
            System.out.println("\nSala de emergencias\n");
            System.out.println("1. Cargar datos del archivo");
            System.out.println("2. Mostrar los pacientes por prioridad");
            System.out.println("3. Atender un paciente");
            System.out.println("4. Regresar");
            System.out.print("Selecciona la opcion que desees: ");
            String op = sc.nextLine();
            switch (op) {
                case "1":
                    if(!isCharged){
                        try {
                            for (Patient patient : reader.read()) {
                                myQueue.offer(patient);
                            }
                        } catch (Exception e) {
                            e.getMessage();
                        }
                        isCharged = true;
                    }else{
                        System.out.println("Ya has cargado los datos del archivo de texto");
                    }
                    break;
                case "2":
                    if(isCharged){
                        
                        for (Object patient : myQueue.toArray()) {
                            System.out.println(patient);
                        }
                    }else{
                        System.out.println("Para mostrar los datos primero cargalos en la cola");
                    }
                    break;
                case "3":
                    Patient current = myQueue.poll();
                    if(isCharged){
                        if(current != null){
                            System.out.println("Paciente atendido: "+current);
                        }else{
                            System.out.println("Todos los pacientes se han atendido");
                            isCharged = false;
                        }
                    }else{
                        System.out.println("No se puede atender un paciente si aun no se cargan los datos");
                    }
                    break;
                case "4":
                    repit = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}

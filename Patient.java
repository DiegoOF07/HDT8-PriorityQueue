/**
 * @author Diego Flores 23714
 * Clase encargada de modelar a los pacientes
 */
public class Patient implements Comparable<Patient>{
    
    private String name;
    private String symptom;
    private char emergencyCode;
    
    /**
     * @description Constructor de la clase
     * @param name
     * @param symptom
     * @param emergencyCode
     */
    public Patient(String name, String symptom, char emergencyCode) {
        this.name = name;
        this.symptom = symptom;
        this.emergencyCode = emergencyCode;
    }

    /**
     * @description Obtiene el nombre del paciente
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * @description Asigna el nombre del paciente
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @description Obtiene el sintoma del paciente
     * @return String
     */
    public String getSymptom() {
        return symptom;
    }

    /**
     * @description Asigna el sintoma al paciente
     * @param symptom
     */
    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    /**
     * @description Obtiene el codigo de emergencia del paciente
     * @return char
     */
    public char getEmergencyCode() {
        return emergencyCode;
    }

    /**
     * @description Asigna el codigo de emergencia del paciente
     * @param emergencyCode
     */
    public void setEmergencyCode(char emergencyCode) {
        this.emergencyCode = emergencyCode;
    }

    /**
     * @description Metodo que devuelve todos los atributos del paciente
     * @return String
     */
    @Override
    public String toString() {
        return "Paciente: " + name + " | sintoma: " + symptom + " | codigo: " + emergencyCode;
    }

    /**
     * @description Metodo que compara a los pacientes en funcion del codigo de emergencia
     * @return int
     */
    @Override
    public int compareTo(Patient nextPatient) {
        return Character.compare(this.emergencyCode, nextPatient.getEmergencyCode());
    }

    
}

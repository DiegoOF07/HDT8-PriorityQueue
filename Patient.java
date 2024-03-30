public class Patient implements Comparable<Patient>{
    
    private String name;
    private String symptom;
    private char emergencyCode;
    
    public Patient(String name, String symptom, char emergencyCode) {
        this.name = name;
        this.symptom = symptom;
        this.emergencyCode = emergencyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public char getEmergencyCode() {
        return emergencyCode;
    }

    public void setEmergencyCode(char emergencyCode) {
        this.emergencyCode = emergencyCode;
    }

    @Override
    public String toString() {
        return "Paciente: " + name + " | sintoma: " + symptom + " | codigo: " + emergencyCode;
    }

    @Override
    public int compareTo(Patient nextPatient) {
        return Character.compare(this.emergencyCode, nextPatient.getEmergencyCode());
    }

    
}

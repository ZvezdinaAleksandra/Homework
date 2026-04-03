package homework5;

public class Therapist extends Doctor {


    public void prescribeTreatment(Patient patient) {
        if (patient.planCode == 1) {
            patient.doctor = new Surgeon();
        } else if (patient.planCode == 2) {
            patient.doctor = new Dentist();
        } else {
            patient.doctor = this;
        }

        patient.doctor.treatPatient();
    }
}
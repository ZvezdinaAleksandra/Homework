package homework5;

public class Clinic {
    public static void main(String[] args) {
        Therapist therapist = new Therapist();  // терапевт который будет делать все назначения

        Patient patient = new Patient(1);       // пациент с планом лечения 1
        therapist.prescribeTreatment(patient);  // назначает хирурга

        Patient patient1 = new Patient(2);      // пациент с планом лечения 2
        therapist.prescribeTreatment(patient1); //  назначает дантиста

        Patient patient3 = new Patient(10);      // пациент с планом лечения !=1,2
        therapist.prescribeTreatment(patient3); // терапевт назначает себя и лечит пациента
    }
}
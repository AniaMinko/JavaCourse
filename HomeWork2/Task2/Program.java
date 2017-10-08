public class Program{

public static void main(String[] args){
 Patient patient = new Patient("Ivan", "Ivanov", "Heart Failure", "Heart Ultrasound");
 patient.displayInfo();
 Card card = new Card(1834,"Lenina 48");
 patient.setCard(card);
 System.out.println("Card of patient -  number of card: " + patient.getCard().getNumber() + " adress of patient: "+ patient.getCard().getAdress());
 Doctor doctor = new Doctor("Andrei","Petrov", "Cardiologist");
 patient.setDoctor(doctor);
 System.out.println("Пациента с диагнозом - " + patient.getDiagnosis() + " лечит врач - " + patient.getDoctor().getName() + " "+patient.getDoctor().getSurname()+" "+ " специализация: " + patient.getDoctor().getSpecialization());
 
 }
}
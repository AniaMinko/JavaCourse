public class Patient extends APerson{
private String diagnosis;
private String appointment;
private Card card;
private Doctor doctor;

public void setDiagnosis(String diagnosis){
	this.diagnosis=diagnosis;
}
public String getDiagnosis(){return diagnosis;}
public void setAppointment(String appointment){
	this.appointment=appointment;
}
   public String getAppointment(){return appointment;}
   public void setCard(Card card){
   this.card=card;
}
   public Card getCard(){return card;}
   public void setDoctor(Doctor doctor){
	   this.doctor=doctor;
	   
   }
   public Doctor getDoctor(){return doctor;}
   
   public Patient(String name, String surname, String diagnosis, String appointment){
	   super(name,surname);
	   this.diagnosis=diagnosis;
	   this.appointment=appointment;
   }
   public void displayInfo(){
	   System.out.println("Patient: Name: " + super.getName() + " Surname: " + super.getSurname() + " Diagnosis: " + getDiagnosis() + " Appointment: " + getAppointment() );
}
}

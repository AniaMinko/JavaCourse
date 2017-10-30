public class Doctor extends APerson{
private String specialization;
public void setSpecialization(String specialization){
     
        this.specialization=specialization;
    }
    public String getSpecialization() { return specialization; }
	
	public Doctor(String name, String surname, String specialization)
	{
	super(name,surname);
	this.specialization=specialization;
	
	}
	public void displayInfo(){
		System.out.println("Doctor: Name: " + super.getName() + " Surname: " + super.getSurname() + " Specialization: " + getSpecialization());
	}
}
	
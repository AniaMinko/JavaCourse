public abstract class APerson {
     
    private String name;
    private String surname;
      
	  public void setName(String name){
     
        this.name=name;
    }
    public String getName() { return name; }
	public void setSurname(String surname){
		this.surname=surname;
	}
    public String getSurname() { return surname; }
    
    public APerson(String name, String surname){
     
        this.name=name;
        this.surname=surname;
    }
	public abstract void displayInfo();
		
}
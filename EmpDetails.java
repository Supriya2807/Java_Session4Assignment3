package acadgild.assignments;

public class EmpDetails {

	private String Empname;
	private int EmpId;
	private String EmpPosition;
	
	
	
	
	public void setname(String name){
		
		Empname=name;
	}
	
	public void setid(int id){
		
		EmpId=id;
		
		
	}
	
	public void setposition(String position){
		
		EmpPosition=position;
		
		
	}
	
	
	public String getname(){
		
		return Empname;
		
	}
	
	public int getId(){
		
		return EmpId;
		
	}
	
	public String getposition(){
		
		return EmpPosition;
	}
	
	
}

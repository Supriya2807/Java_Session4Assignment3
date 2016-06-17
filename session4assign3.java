package acadgild.assignments;

public class session4assign3 {
	
	public static void main(String []args){
		
		EmpDetails emp1 = new EmpDetails();
		EmpDetails emp2 = new EmpDetails();
		EmpDetails emp3 = new EmpDetails();
		
		System.out.println("The Employee Details are:");
		
		System.out.println("Emp Id \t"+" Emp Name\t"+ "Emp Position ");

		
		emp1.setname("Bharti");
		emp1.setid(101);
		emp1.setposition("Sr.Engr");
		
		System.out.println(emp1.getId()+" \t"+emp1.getname()+ " \t" + emp1.getposition());

		emp2.setname("Anu");
		emp2.setid(102);
		emp2.setposition("Team Lead");
		
		System.out.println(emp2.getId()+" \t"+emp2.getname()+ " \t" + emp2.getposition());


		emp3.setname("Shweta");
		emp3.setid(102);
		emp3.setposition("Sr. Team Lead");
		
		System.out.println(emp3.getId()+" \t"+emp3.getname()+ " \t" + emp3.getposition());

		
	}

}

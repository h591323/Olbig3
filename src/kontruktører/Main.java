package kontruktører;

import java.time.LocalDate;



public class Main {

	public static void main(String[] args) {
		
		AnsattDAO crud = new AnsattDAO();
		
		LocalDate ost = LocalDate.of(2012, 9, 12);
		
		Ansatt ole = new Ansatt (1004, "ova", "Ole", "Vann", ost, "Potetelsker", 40000);
		
		
		//crud.createAnsatt(ole); problem med id og brukernavn
		System.out.println(crud.retrieveAlleAnsatte());
		System.out.println(crud.finnPersonMedId(1001));
		System.out.println(crud.finnPersonMedBrukernavn("ddu"));
		crud.updateAnsatt(1001, "PotetElsker", 50000);
		System.out.println(crud.retrieveAnsatt(1001)); //updateAnsatt fungerer ikke
	}	
	

	
}



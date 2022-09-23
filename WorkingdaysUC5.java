package com.codebode.project;

public class WorkingdaysUC5 {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NO_OF_WORKING_DAYS = 20;
	

	public static void main(String[] args) {
		
	int	empwage = 0;
	int emphrs = 0;
	int TotalEmpWage = 0;
		for (int r = 0; r < NO_OF_WORKING_DAYS;  r++ ) {
			int empcheck = (int) Math.floor(Math.random() * 50 ) % 3;
		switch (empcheck) {
		case IS_FULL_TIME:
			emphrs = 8;
			break;
		case IS_PART_TIME:
			emphrs = 4;
			break;
			default:
				emphrs = 0;
				
		}
		
		empwage = EMP_RATE_PER_HOUR * emphrs ;
		TotalEmpWage += empwage;
		System.out.println("Employee wage is :" + empwage);
			

	}
     System.out.println("Total wage is : " + TotalEmpWage);
     
}

}

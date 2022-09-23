package com.codebode.project;

public class HoursDaysUC6 {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int MAX_DAYS_OF_WORK = 20;
    public static final int MAX_HOURS_OF_WORK = 100;
    
    

	public static void main(String[] args) {
	
		int empwage = 0;
		int emphours = 0;
		int totalemphours = 0;
		int totalworkingdays = 0;
		
		
		while (totalworkingdays <= MAX_DAYS_OF_WORK && totalemphours < MAX_HOURS_OF_WORK) {
			totalworkingdays++;
			int empcheck = (int) Math.floor(Math.random() *10 ) % 3;
			switch (empcheck ) {
			
			case IS_FULL_TIME:
				emphours = 8;
				break;
			case IS_PART_TIME:
				emphours = 4;
				break;
				default:
				emphours = 0;
					
			}
				
			totalemphours += emphours ;
			System.out.println("DAY#: " + totalworkingdays + "emphours: " +emphours);
		}
		int totalwage = emphours * EMP_RATE_PER_HOUR;
		System.out.println("total employee wage is: " + totalwage);
		
	}

}

package com.codebode.project;

public class Empattendance {

	public static void main(String[] args) {
		int IS_Present=1;
		System.out.println("Welcome EmpWage computation problem");
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if  (empcheck == IS_Present)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");

	}

}

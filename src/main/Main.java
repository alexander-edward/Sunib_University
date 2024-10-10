package main;

import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		String studentID, studentName, studentDOB, studentGender, studentContact, studentEmail, studentHomeAddress, studentCity, studentProvince, studentConfirm;
		int studentAge;
		float studentHeight, studentWeight;
		
		System.out.println("Student Information");
		System.out.println("===================");
		
		while(true) {
			do {
				System.out.print("Input StudentID [ e.g. 2720419523 ] : ");
				studentID = scan.nextLine();
			}while (!studentID.startsWith("27") | !(studentID.length() == 10));
			
			do {
				System.out.print("Input Student Name : ");
				studentName = scan.nextLine();
			}while(studentName.length() < 1);
			
			do {
				System.out.print("Input Date of Birth [ e.g. 9/24/2004 ] : ");
				studentDOB = scan.nextLine();
			}while(studentDOB.isBlank());
			
			do {
				System.out.print("Input Age : ");
				studentAge = scan.nextInt();
				scan.nextLine();
			}while(studentAge < 15);
			
			do {
				System.out.print("Input Height [ e.g. 180, 175.5, etc ] : ");
				studentHeight = scan.nextFloat();
				scan.nextLine();
			}while(studentHeight < 120);
			
			do {
				System.out.print("Input Weight [ e.g. 50, 67.5, etc ] : ");
				studentWeight = scan.nextFloat();
				scan.nextLine();
			}while(studentWeight < 30);
			
			do {
				System.out.print("Input Gender [ e.g. Male, Female ] : ");
				studentGender = scan.nextLine();
			}while(!(studentGender.equals("Male")) && !(studentGender.equals("Female")));
			
			do {
				System.out.print("Input Contact Number [ e.g. +62841230591334 ] : ");
				studentContact = scan.nextLine();
			}while(!(studentContact.startsWith("+62")) | !(studentContact.length() > 13) | !(studentContact.length() < 15) );
			
			do {
				System.out.print("Input Email Address : ");
				studentEmail = scan.nextLine();
			}while(!(studentEmail.endsWith("@gmail.com")));
			
			System.out.println("Address Detail");
			System.out.println("===================");
			
			do {
				System.out.print("Input Home Address : ");
				studentHomeAddress = scan.nextLine();
			}while(!(studentHomeAddress.startsWith("Jl. ")));
			
			do {
				System.out.print("Input City : ");
				studentCity = scan.nextLine();
			}while(studentCity.isBlank());
			
			do {
				System.out.print("Input Province : ");
				studentProvince = scan.nextLine();
			}while(studentProvince.isBlank());
			
			String studentFullAddress = studentHomeAddress + ", " + studentCity + ", " + studentProvince;
			
			System.out.println("=====================================================================");
			System.out.println("|                        Student Information                        |");
			System.out.println("=====================================================================");
			System.out.printf("| %-16s: %-48s|\n", "Student ID", studentID);
			System.out.printf("| %-16s: %-48s|\n", "Student Name", studentName);
			System.out.printf("| %-16s: %-48s|\n", "Date of Birth", studentDOB);
			System.out.printf("| %-16s: %-48s|\n", "Age", studentAge);
			System.out.printf("| %-16s: %-48s|\n", "Height", studentHeight);
			System.out.printf("| %-16s: %-48s|\n", "Weight", studentWeight);
			System.out.printf("| %-16s: %-48s|\n", "Gender", studentGender);
			System.out.printf("| %-16s: %-48s|\n", "Contact Number", studentContact);
			System.out.printf("| %-16s: %-48s|\n", "Email Address", studentEmail);
			System.out.printf("| %-16s: %-48s|\n", "Address Detail", studentFullAddress);
			System.out.println("=====================================================================");
			
			do {
				System.out.println("Is this information correct [ true | false ] : ");
				studentConfirm = scan.nextLine();
				if(studentConfirm.equals("true")) {
					System.out.println("Thank you for using this application :)");
					return;
				}
				else {
					break;
				}
			}while(!(studentConfirm.equals("true")) || !(studentConfirm.equals("false")));
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}

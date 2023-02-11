package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner; 
/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {

		Student std1= new Student("James",(short) 20, 3.5, "Farmingdale" //fixes the error from before by completing the methods requirements 
                        + "");
                Scanner sc = new Scanner(System.in); //takes in the input for the GPA
                System.out.println("Enter GPA: ");
                double GPA = sc.nextDouble();  
                std1.setGPA(GPA);
		System.out.println(std1); //Prints out all of the student's information 
	}

}
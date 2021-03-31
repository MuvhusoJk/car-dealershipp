/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jake
 */ 
import java.util.*;
public class Main {
    
public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		
		String brandName;
		String countryOfOrigin;
		String modelName;
		int yearOfmanufacture;
		String driveType;
		int doors;
		String color;
		String driveTrain;
		
		System.out.print("enter the Brand of car: ");
		brandName = scanner.nextLine();
		
		System.out.print("enter the Country of origin of the car: ");
		countryOfOrigin = scanner.nextLine();
		
		System.out.print("enter the model name of the car: ");
		modelName = scanner.nextLine();
		
		System.out.print("enter the year on which the car was manufactured: ");
		yearOfmanufacture = scanner.nextInt();
		
		System.out.println("enter the drive type(LEFT OR RIGHT SIDED) of the car: ");
		driveType = scanner.nextLine();
		
		
		System.out.print("How many doors does the car have? ");
		doors = scanner.nextInt();
		
		System.out.println("What colour is the car? ");
		color = scanner.nextLine();
		
		System.out.println("What is the drive train of the car (AWD or 2WD)? ");
		driveTrain=scanner.nextLine();
		
		Car myObj = new Car(brandName, countryOfOrigin, modelName, yearOfmanufacture, driveType, doors, color, driveTrain);
		myObj.DisplayInformation();
	}

}

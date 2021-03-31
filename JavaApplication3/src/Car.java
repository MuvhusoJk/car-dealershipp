/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jake
 */
    
public class Car extends modelDetails {
	modelDetails myObj = new modelDetails();
	Make make = new Make();
	public Car(String brandName, String countryOforigin, String modelName, int yearOfmanufacture, String driveType, int doors, 
			String color, String driveTrain) {
		super();
		myObj.setBrandName(brandName);
		myObj.setCountryOfOrigin(countryOforigin);
		myObj.setModelName(modelName);
		myObj.setYearOfmanufacture(yearOfmanufacture);
		myObj.setDriveType(driveType);
		myObj.setDoors(doors);
		myObj.setColor(color);
		myObj.setDriveTrain(driveTrain);
	}
	
	public void DisplayInformation(){
		System.out.println("The information listed below is based on your "+myObj.getBrandName()+" "+myObj.getModelName());
		System.out.println(myObj.getBrandName() +"The car brand: ");
		System.out.println("The country of origin: " +myObj.getCountryOforigin());
		System.out.println("The model name: " +myObj.getModelName());
		System.out.println("The year of which car was manufactured: " +myObj.getYearOfmanufacture());
		System.out.println("The drive type: " +myObj.getDriveType()+"-side drive");
		System.out.println("The number of doors: " +myObj.getDoors());
		System.out.println("The colour of the car: " +myObj.getColor());
		System.out.println("The drive is :" + myObj.getDriveTrain());
	}
	

        
        
}

package cui;

import java.util.InputMismatchException;
import java.util.Scanner;

import domein.Thermometer4;
import exceptions.BuitenBereikException;

public class ThermometerApplicatie4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s = new Scanner(System.in);
	        int tempF, tempC;
	        Thermometer4 t;
	        boolean magStoppen = false;
	        String invoer;
	        
	        do {
	        	try {
	        		System.out.print("Geef een gehele temperatuur in °F"
	                        + " uit het interval [14,104]: ");
	                //tempF = s.nextInt();
	        		invoer = s.nextLine();
	                
	                t = new Thermometer4();
	                t.stelAantalGradenIn(invoer);
	                tempC = t.converteerNaarCelcius();

	                System.out.printf
	                    ("De temperatuur in °C is %d%n", tempC);
	                magStoppen = true;    
	        	}
	        	catch (BuitenBereikException e) {
	        		System.out.println(e.getMessage());
	        	}
	        	catch (InputMismatchException e) {
	        		System.out.println("De invoer moet een geheel getal zijn");
	        		s.nextLine();
	        	}
	        	
	        }while(!magStoppen);
	}

}

package app.vehicle.assign2;

import java.time.LocalDate;

import app.vehicle.assign2.VehicleException;
public class VehicleValidations {

	
	//To validate all necessary conditions
	public static Vehicle validateInputs(int chasisNo, String col, double price, String manufDate, String insuDate,
			double pollutionLvl,Vehicle[] v) throws VehicleException {
		Colour colour = parseAndValidateColour(col);
		LocalDate mfgDate = parseDate(manufDate);
		LocalDate insDate = parseDate(insuDate);
		colourValid(colour);
		pollutionLvl(pollutionLvl);
		// => all i/ps are valid
		return new Vehicle(chasisNo, colour, price, mfgDate, insDate, pollutionLvl);
	}
	
	
	
	//add public static method to validate for colour mismatch
	public static boolean colourValid (Colour colour) throws VehicleException
	{
		for(Colour cvalid :colour.values())
		{
			if(cvalid == colour)
			{
				return true;
			}		
		}
		throw new VehicleException("Invalid colour");
	}
	
	//add public static method to validate pollution level
	public static String pollutionLvl (double pollutionLvl) throws VehicleException
	{
		if(pollutionLvl <= 20.00) {
		
		return "Pollution level is low";
		}
		throw new VehicleException("Pollution level exceeds ");
	}
	

	
	// add a static method for parsing n validating colour type
	public static Colour parseAndValidateColour(String colour) {
		return Colour.valueOf(colour.toUpperCase()); //parse -> String to enum conversion
	}
	
	// add a static method for parsing string --> LocalDate
		public static LocalDate parseDate(String date) {
			return LocalDate.parse(date); // String to LocalDate conversion
		}

	
}

package main;

import java.util.Scanner;

/*  
 *	The main() method in this class is commented out
 *	so that it does not conflict with the main() method
 *	in Converter.java
 *
 *	Both classes work if run independantly
 */
public class Converter_Single_Menu {
	private static String[] MENU = {
			" 1. Inches to Centimeters",
			" 2. Centimeters to Inches",
			" 3. Miles to Kilometers",
			" 4. Kilometers to Miles",
			" 5. Farenheit to Celcius",
			" 6. Celcius to Farenheit",
			" 7. Degrees to Radians",
			" 8. Radians to Degrees",
			" 9. Pascal to Bar",
			"10. Bar to Pascal",
			"11. Pascal to PSI",
			"12. PSI to Pascal",
			"13. Bar to PSI",
			"14. PSI to Bar",
			"15. Pounds to Kilograms",
			"16. Kilograms to Pounds"
	};
	
	private static float from, to;
	
	private static void printMenu() {
		System.out.println("Please select an option, followed by the value to convert:");
		for (String option : MENU) System.out.println(option);
		System.out.println("" + (MENU.length + 1) + ". Quit"); //Sneaky way to add the Quit option, allowing MENU to be added to (in development) without having to change the Quit option's number label 
	}
	
	private static void printResult(String fromUnit, String toUnit) {
		System.out.print("\n\n");
		System.out.println("-------------------- Answer --------------------");
		System.out.println(from + " " + fromUnit + " = " + to + " " + toUnit);
		System.out.println("------------------------------------------------");
		System.out.print("\n\n");
	}
	
/*
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int menuSelection = 0;
		
		while (menuSelection != MENU.length + 1) {
			printMenu();
			
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) menuSelection = scanner.nextInt();
			// Handle Quit option
			if (menuSelection == MENU.length + 1) { //Skips the "scanner.nextFloat()" below so that you only have to enter the "Quit" option once 
				System.out.println("Goodbye.");
				break;
			}
			
			// Begin conversions
			if (scanner.hasNextFloat()) from = scanner.nextFloat();
			switch (menuSelection) {
				case 1: //in -> cm
					to = from * 2.54f;
					printResult("inch(es)", "centimeters(s)");
					break;
				case 2: //cm -> in
					to = from / 2.54f;
					printResult("centimeter(s)", "inch(es)");
					break;
				case 3: //miles -> kilometers
					to = from * 1.609344f;
					printResult("mile(s)", "kilometer(s)");
					break;
				case 4: //kilometers -> miles
					to = from / 1.609344f;
					printResult("kilometer(s)", "mile(s)");
					break;
				case 5: //F -> C
					to = (5.0f / 9.0f) * (from - 32);
					printResult("F", "C");
					break;
				case 6: //C -> F
					to = (1.8f * from) + 32;
					printResult("C", "F");
					break;
				case 7: //D -> R
					to = (float) Math.toRadians(from);
					printResult("degree(s)", "radian(s)");
					break;
				case 8: //R -> D
					to = (float) Math.toDegrees(from);
					printResult("radian(s)", "degree(s)");
					break;
				case 9: //pascal -> bar
					to = from / 100000f;
					printResult("pascal", "bar");
					break;
				case 10: //bar -> pascal
					to = from * 100000f;
					printResult("bar", "pascal");
					break;
				case 11: //pascal -> PSI
					to = from / 6894.757f;
					printResult("pascal", "PSI");
					break;
				case 12: //PSI -> pascal
					to = from * 6894.757f;
					printResult("PSI", "pascal");
					break;
				case 13: //bar -> PSI
					to = from * 14.5038f;
					printResult("bar", "PSI");
					break;
				case 14: //PSI -> bar
					to = from / 14.5038f;
					printResult("PSI", "bar");
					break;
				case 15: //lb -> kg
					to = from / 2.20462f;
					printResult("lb(s)", "kg(s)");
					break;
				case 16: //kg -> lb
					to = from * 2.20462f;
					printResult("kg(s)", "lb(s)");
					break;
				default: break;
			}
			
			scanner.close();
		}
	}
*/
}

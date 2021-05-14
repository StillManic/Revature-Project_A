package main;

import java.util.Scanner;

public class Converter {
	private static String[] MAIN_MENU = {
			"1. Length",
			"2. Temperature",
			"3. Angle",
			"4. Pressure",
			"5. Mass"
	};
	
	private static String[] LENGTH_MENU = {
			"1. Inches to Centimeters",
			"2. Centimeters to Inches",
			"3. Miles to Kilometers",
			"4. Kilometers to Miles"
	};
	
	private static String[] TEMPERATURE_MENU = {
			"1. Farenheit to Celcius",
			"2. Celcius to Farenheit"
	};
	
	private static String[] ANGLE_MENU = {
			"1. Degrees to Radians",
			"2. Radians to Degrees"
	};
	
	private static String[] PRESSURE_MENU = {
			"1. Pascal to Bar",
			"2. Bar to Pascal",
			"3. Pascal to PSI",
			"4. PSI to Pascal",
			"5. Bar to PSI",
			"6. PSI to Bar"
	};
	
	private static String[] MASS_MENU = {
			"1. Pounds to Kilograms",
			"2. Kilograms to Pounds"
	};
	
	private static int menuSelection;
	private static float from, to;
	private static boolean quit = false;
	private static Scanner scanner;
	
	private static void printMenu(String[] menu, boolean printReturnInsteadOfQuit) {
		for (String option : menu) System.out.println(option);	// Print the menu
		
		/* 
		 * This is a sneaky way to add a "Quit" or "Return to Main Menu" 
		 * option to the printed menu, so that they don't have to be 
		 * included in the arrays above
		 */
		System.out.println("" + (menu.length + 1) + ". " + (printReturnInsteadOfQuit ? "Return to Main Menu" : "Quit"));
	}
	
	/*
	 * Main Menu
	 */
	private static void printMainMenu() {
		System.out.println("Please select an option:");
		printMenu(MAIN_MENU, false);
	}
	
	/*
	 * Length
	 */
	private static void printAndHandleLengthMenu() {
		System.out.println("\n\n\nLength Conversions:");
		printMenu(LENGTH_MENU, true);
		
		if (scanner.hasNextInt()) menuSelection = scanner.nextInt();
		
		if (menuSelection > LENGTH_MENU.length) {	// Return to Main Menu
			System.out.print("\n\n\n");
			return;
		}
		
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
			default: break;
		}
	}
	
	/*
	 * Temperature
	 */
	private static void printAndHandleTemperatureMenu() {
		System.out.println("\n\n\nTemperature Conversions:");
		printMenu(TEMPERATURE_MENU, true);
		
		if (scanner.hasNextInt()) menuSelection = scanner.nextInt();
		
		if (menuSelection > TEMPERATURE_MENU.length) {	// Return to Main Menu
			System.out.print("\n\n\n");
			return;
		}
		
		if (scanner.hasNextFloat()) from = scanner.nextFloat();
		switch (menuSelection) {
			case 1: //F -> C
				to = (5.0f / 9.0f) * (from - 32);
				printResult("F", "C");
				break;
			case 2: //C -> F
				to = (1.8f * from) + 32;
				printResult("C", "F");
				break;
			default: break;
		}
	}
	
	/*
	 * Angle
	 */
	private static void printAndHandleAngleMenu() {
		System.out.println("\n\n\nAngle Conversions:");
		printMenu(ANGLE_MENU, true);
		
		if (scanner.hasNextInt()) menuSelection = scanner.nextInt();
		
		if (menuSelection > ANGLE_MENU.length) {	// Return to Main Menu
			System.out.print("\n\n\n");
			return;
		}
		
		if (scanner.hasNextFloat()) from = scanner.nextFloat();
		switch (menuSelection) {
			case 1: //D -> R
				to = (float) Math.toRadians(from);
				printResult("degree(s)", "radian(s)");
				break;
			case 2: //R -> D
				to = (float) Math.toDegrees(from);
				printResult("radian(s)", "degree(s)");
				break;
			default: break;
		}
	}
	
	/*
	 * Pressure
	 */
	private static void printAndHandlePressureMenu() {
		System.out.println("\n\n\nPressure Conversions:");
		printMenu(PRESSURE_MENU, true);
		
		if (scanner.hasNextInt()) menuSelection = scanner.nextInt();
		
		if (menuSelection > PRESSURE_MENU.length) {	// Return to Main Menu
			System.out.print("\n\n\n");
			return;
		}
		
		if (scanner.hasNextFloat()) from = scanner.nextFloat();
		switch (menuSelection) {
			case 1: //pascal -> bar
				to = from / 100000f;
				printResult("pascal", "bar");
				break;
			case 2: //bar -> pascal
				to = from * 100000f;
				printResult("bar", "pascal");
				break;
			case 3: //pascal -> PSI
				to = from / 6894.757f;
				printResult("pascal", "PSI");
				break;
			case 4: //PSI -> pascal
				to = from * 6894.757f;
				printResult("PSI", "pascal");
				break;
			case 5: //bar -> PSI
				to = from * 14.5038f;
				printResult("bar", "PSI");
				break;
			case 6: //PSI -> bar
				to = from / 14.5038f;
				printResult("PSI", "bar");
				break;
			default: break;
		}
	}
	
	/*
	 * Mass
	 */
	private static void printAndHandleMassMenu() {
		System.out.println("\n\n\nMass Conversions:");
		printMenu(MASS_MENU, true);
		
		if (scanner.hasNextInt()) menuSelection = scanner.nextInt();
		
		if (menuSelection > MASS_MENU.length) {	// Return to Main Menu
			System.out.print("\n\n\n");
			return;
		}
		
		if (scanner.hasNextFloat()) from = scanner.nextFloat();
		switch (menuSelection) {
			case 1: //lb -> kg
				to = from / 2.20462f;
				printResult("lb(s)", "kg(s)");
				break;
			case 2: //kg -> lb
				to = from * 2.20462f;
				printResult("kg(s)", "lb(s)");
				break;
			default: break;
		}
	}
	
	/*
	 * Print Result
	 */
	private static void printResult(String fromUnit, String toUnit) {
		System.out.print("\n\n");
		System.out.println("-------------------- Answer --------------------");
		System.out.println(from + " " + fromUnit + " = " + to + " " + toUnit);
		System.out.println("------------------------------------------------");
		System.out.print("\n\n");
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		menuSelection = 0;
		
		while (!quit) {
			printMainMenu();
			
			scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) menuSelection = scanner.nextInt();
			
			if (menuSelection > MAIN_MENU.length) {		// Handle Quit
				scanner.close();
				quit = true;
				System.out.println("\nGoodbye.");
				break;
			}
			
			// Handle Main Menu
			switch (menuSelection) {
				case 1: printAndHandleLengthMenu(); 	 break;	// Length
				case 2: printAndHandleTemperatureMenu(); break;	// Temperature
				case 3: printAndHandleAngleMenu();		 break;	// Angle
				case 4: printAndHandlePressureMenu(); 	 break;	// Pressure
				case 5: printAndHandleMassMenu(); 		 break;	// Mass
				default: break;
			}
		}
	}
}

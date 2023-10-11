package ru.specialist.temperature;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		double c,f;
		Scanner scan = new Scanner(System.in); 
	    
	    System.out.print("Введите температуру в °С: ");
	     
	    c = scan.nextDouble();
	   
	     f = c * 9 / 5 +32;
	    
	     System.out.printf("Температура в °F: %.3f ", f);

	}

}

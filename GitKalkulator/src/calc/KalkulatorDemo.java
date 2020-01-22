package calc;

import java.util.Scanner;

public class KalkulatorDemo {

	public static void main(String[] args) {
		
		System.out.println("KALKULATOR");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesi prvi broj: ");
		int broj1 = in.nextInt();
		
		System.out.print("Unesi drugi broj: ");
		int broj2 = in.nextInt();
		
		int rezultat = broj1 + broj2;
		System.out.println("Rezultat je: " + rezultat);
		
		in.close();
		
		System.out.println("Operacija izvrsena");
		
	}
	
}

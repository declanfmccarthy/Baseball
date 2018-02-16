package baseball_cisc181;

import java.util.Scanner;

public class bb_statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Player name");
	     String name = sc.nextLine();
	     System.out.println("How many at-bats?");
	     int AB = sc.nextInt();
	     System.out.println("How many hits?");
	     int H = sc.nextInt();
	     System.out.println("How many doubles?");
	     int dub = sc.nextInt();
	     System.out.println("How many triples?");
	     int trip = sc.nextInt();
	     System.out.println("How many homeruns?");
	     int HR = sc.nextInt();
	     System.out.println("How many runs?");
	     int R = sc.nextInt();
	     System.out.println("How many walks?");
	     int BB = sc.nextInt();
	     
	     System.out.println("The stats are as follows: ");
	     System.out.println("Batting average: " + ba(H,AB) );
	     System.out.println("On Base Percentage: " + obp(H, BB, AB) );
	     System.out.println("Slugging Percentage: " + slug(H, dub, trip, HR, AB) );
	     System.out.println("On Base Slugging Percentage: " + ops(slug(H, dub, trip, HR, AB), obp(H, BB, AB)) );
	     System.out.println("Total Bases: " + TB(H, dub, trip, HR) );
	     

	}//main
	public static double ba(double hits, double AB) {
		double value = hits/AB;
		return value;
	}
	public static double obp(double hits, double BB, double AB) {
		double value = (hits + BB)/AB;
		return value;
	}
	public static double slug(double hits, double dub, double trip, double HR, double AB) {
		double value = (hits + dub + (2 * trip) + (3 * HR))/AB;
		return value;
	}
	public static int TB(int hits, int dub, int trip, int HR) {
		int value = (hits + dub + (2 * trip) + (3 * HR));
		return value;
	}		
	public static double ops(double slug, double obp) {
		double value = obp + slug;
		return value;
	}
	
	

}//class

package EpamTask4.Epam4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Construction {
	public static void ConstructionCost() {
		PrintStream p = new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner sc = new Scanner(System.in);
		p.println("CALCULATION OF CONSTRUCTION COST");
		p.println("Please select the Material for construction : ");
		p.println("1. Standard Materials");
		p.println("2. Above Standard Materials");
		p.println("3. High Standard Materials");
		p.println("4. High Standard Materials and Fully Automated home");
		try {
			int ch = sc.nextInt();
			double area, cost;
			switch(ch) {
			case 1:
				p.println("Enter the area of the house : ");
				area = sc.nextDouble();
				cost = (1200 * area);
				p.println("Cost to build the house in rupees is : " + cost);
				break;
			case 2:
				p.println("Enter the area of the house : ");
				area = sc.nextDouble();
				cost = (1500 * area);
				p.println("Cost to build the house in rupees is : " + cost);
				break;				
			case 3:
				p.println("Enter the area of the house : ");
				area = sc.nextDouble();
				cost = (1800 * area);
				p.println("Cost to build the house in rupees is : " + cost);
				break;
			case 4:
				p.println("Enter the area of the house : ");
				area = sc.nextDouble();
				cost = (2500 * area);
				p.println("Cost to build the house in rupees is : " + cost);
				break;
			default:
				p.println("Please choose from 1-4");
			}
		} catch (Exception e) {
			p.println("Please enter a valid input");
		}
	}
}

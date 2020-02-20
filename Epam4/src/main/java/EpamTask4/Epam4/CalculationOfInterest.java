package EpamTask4.Epam4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CalculationOfInterest {
	public static void Interest() {
		PrintStream p = new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner sc = new Scanner(System.in);
		p.println("CALCULATION OF INTEREST");
		try {
			p.println("Enter the Principal amount of Interest : ");
			double principal = sc.nextDouble();
			p.println("Enter the Time period of Interest : ");
			double time = sc.nextDouble();
			p.println("Enter the Rate of Interest : ");
			double rate = sc.nextDouble();
			p.println("Simple Interest is : " + ((principal * time * rate) / 100));
			p.println("Compound Interest is : " + ((principal * Math.pow(1 + (rate / 100), time)) - principal));
			p.println("----------------------------------------");
		} catch (Exception e) {
			p.println("Please enter a valid input");
		}
		
	}

}

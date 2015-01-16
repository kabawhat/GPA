import java.util.Scanner;
import java.io.File;

public class GPA
{
	public static void main(String args[])
	{
		System.out.println("Welcome to GPA. Let's calculate your GPA.");
		System.out.println("=========================================\n\n");

		System.out.print("Firstly, we'll build your portfolio of classes.");
		try {
			Thread.sleep(500);
			System.out.print(".");

			Thread.sleep(500);
			System.out.print(".");

			Thread.sleep(200);
			System.out.print("\n-------------------------------------------------\n\n");
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}

		System.out.print("How many high school level classes have you taken so far?");
		Scanner keyboard = new Scanner(System.in);
	}
}

import java.util.Scanner;
import java.io.File;

public class GPA
{
	public static void main(String args[])
	{
		File portfolio = new File("portfolio.dat");

		if (portfolio.length() == 0) { // New "user".
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

			System.out.print("How many high school level classes have you taken so far? ");
			Scanner keyboard = new Scanner(System.in);

			int number_of_classes = keyboard.nextInt();
			for (int i = 1; i <= number_of_classes; i++) {
				System.out.println("What was this class called? ");

			}
		} else { // Existing "user" with a portfolio.

		}
	}
}

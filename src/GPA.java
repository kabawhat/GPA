import java.util.ArrayList;
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

			System.out.print("Firstly, we'll build your portfolio of classes...");
			System.out.print("\n-------------------------------------------------\n\n");

			System.out.print("How many high school level courses have you taken so far? ");
			Scanner keyboard = new Scanner(System.in);

			int courseCount = keyboard.nextInt();
			ArrayList<Course> courses = new ArrayList<Course>();
			ArrayList<Double> sixWeekAverages = new ArrayList<Double>();

			for (int i = 1; i <= courseCount; i++) {
				if (i == 1) {
					System.out.println("\nLet's start with course #" + i + ".");
				} else {
					System.out.println("\nNow onto course #" + i + ".");
				}

				Course course = new Course();

				System.out.print("What was this course called? ");
				if (i == 1) keyboard.nextLine(); // Picks up inevitable newline character (\n). Not really sure why it only affects the first iteration, though...
				String courseName = keyboard.nextLine();
				course.setName(courseName);

				System.out.print("1st 6 weeks average? ");
				if (i == 1) keyboard.nextDouble(); // Picks up inevitable newline character (\n). Not really sure why it only affects the first iteration, though...
				double courseSixWeeksAverage = keyboard.nextDouble();
				sixWeekAverages.add(courseSixWeeksAverage);
			}
		} else { // Existing "user" with a portfolio.

		}
	}
}

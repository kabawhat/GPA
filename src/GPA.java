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
				keyboard.nextLine(); // Picks up inevitable newline character (\n).
				String courseName = keyboard.nextLine();
				course.setName(courseName);

				for (int j = 1; j <= 6; j++) {
					System.out.print(j + Number.getEnding(j) + " 6 weeks average? ");
					double courseSixWeeksAverage = keyboard.nextDouble();
					sixWeekAverages.add(courseSixWeeksAverage);
				}
			}
		} else { // Existing "user" with a portfolio.

		}
	}
}

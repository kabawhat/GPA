import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class GPA
{
	public static double getScaled(String level, int unscaled)
	{
		double scaled;

		if (unscaled >= 97 && unscaled <= 100) {
			scaled = 5.0;
		} else if (unscaled >= 94 && unscaled <= 96) {
			scaled = 4.8;
		} else if (unscaled >= 90 && unscaled <= 93) {
			scaled = 4.6;
		} else if (unscaled >= 87 && unscaled <= 89) {
			scaled = 4.4;
		} else if (unscaled >= 84 && unscaled <= 86) {
			scaled = 4.2;
		} else if (unscaled >= 80 && unscaled <= 83) {
			scaled = 4.0;
		} else if (unscaled >= 77 && unscaled <= 79) {
			scaled = 3.8;
		} else if (unscaled >= 74 && unscaled <= 76) {
			scaled = 3.6;
		} else if (unscaled >= 71 && unscaled <= 73) {
			scaled = 3.4;
		} else if (unscaled == 70) {
			scaled = 3.2;
		} else if (unscaled < 70) {
			scaled = 0.0;
		}

		switch (level) {
			case "AP":
			case "IB":
				scaled += 1;
				break;
			case "GT":
			case "Pre-AP":
				scaled += 0.5;
				break;
		}

		return scaled;
	}

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
			ArrayList<Double> firstSemesterSixWeekAverages = new ArrayList<Double>();
			ArrayList<Double> secondSemesterSixWeekAverages = new ArrayList<Double>();

			for (int i = 1; i <= courseCount; i++) {
				if (i == 1) {
					System.out.println("\nLet's start with course #" + i + ".");
				} else {
					System.out.println("\nNow onto course #" + i + ".");
				}

				Course course = new Course();

				System.out.print("What is this course called? ");
				keyboard.nextLine(); // Picks up inevitable newline character (\n).
				String courseName = keyboard.nextLine();
				course.setName(courseName);

				System.out.print("Course level? (AP, IB, GT, Pre-AP, On Level) ");
				keyboard.nextLine(); // Picks up inevitable newline character (\n).
				String courseLevel = keyboard.nextLine();
				course.setLevel(courseLevel);

				for (int j = 1; j <= 6; j++) {
					if (j == 4) {
						System.out.print("Midterm? ");
						double midterm = keyboard.nextDouble();

						course.setMidterm(midterm);
					}

					System.out.print(j + Number.getEnding(j) + " 6 weeks average? ");
					double courseSixWeeksAverage = keyboard.nextDouble();

					if (j == 1 || j == 2 || j == 3) {
						firstSemesterSixWeekAverages.add(courseSixWeeksAverage);
					}

					if (j == 4 || j == 5 || j == 6) {
						secondSemesterSixWeekAverages.add(courseSixWeeksAverage);
					}
				}

				System.out.print("Final? ");
				double finalExam = keyboard.nextDouble();

				course.setFinal(finalExam);

				course.setFirstSemesterSixWeeksAverages(firstSemesterSixWeekAverages);
				course.setSecondSemesterSixWeekAverages(secondSemesterSixWeekAverages);

				System.out.println("-\n" + course + "\n\n");
			}
		} else { // Existing "user" with a portfolio.

		}
	}
}

import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Course
{
	private String name;
	private ArrayList<Integer> firstSemesterSixWeekAverages;
	private int midterm;
	private ArrayList<Integer> secondSemesterSixWeekAverages;
	private int finalExam;

	public Course()
	{
		this.name                          = "";
		this.firstSemesterSixWeekAverages  = new ArrayList<Integer>();
		this.midterm                       = 0;
		this.secondSemesterSixWeekAverages = new ArrayList<Integer>();
		this.finalExam                     = 0;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setFirstSemesterSixWeeksAverages(ArrayList<Double> firstSemesterSixWeeksAverages)
	{
		for (double sixWeekAverage : firstSemesterSixWeeksAverages) {
			this.firstSemesterSixWeekAverages.add((int) Math.round(sixWeekAverage));
		}
	}

	public void setMidterm(double midterm)
	{
		this.midterm = (int) Math.round(midterm);
	}

	public void setSecondSemesterSixWeekAverages(ArrayList<Double> secondSemesterSixWeekAverages)
	{
		for (double sixWeekAverage : secondSemesterSixWeekAverages) {
			this.secondSemesterSixWeekAverages.add((int) Math.round(sixWeekAverage));
		}
	}

	public void setFinal(double finalExam)
	{
		this.finalExam = (int) Math.round(finalExam);
	}

	public double getFirstSemesterGPA()
	{
		double average = (2 * (firstSemesterSixWeeksAverages.get(0) + firstSemesterSixWeeksAverages.get(1) + firstSemesterSixWeeksAverages(2)) + midterm) / 7;

		return GPA.getScaled((int) Math.round(average));
	}

	public double getSecondSemesterGPA()
	{
		double average = (2 * (secondSemesterSixWeeksAverages.get(0) + secondSemesterSixWeeksAverages.get(1) + secondSemesterSixWeeksAverages(2)) + finalExam) / 7;

		return GPA.getScaled((int) Math.round(average));
	}

	public String toString()
	{
		return "Name: " + name + "\n1st Semester: " + firstSemesterSixWeekAverages.get(0) + ", " + firstSemesterSixWeekAverages.get(1) + ", " + firstSemesterSixWeekAverages.get(2) + "\n2nd Semester: " + secondSemesterSixWeekAverages.get(0) + ", " + secondSemesterSixWeekAverages.get(1) + ", " + secondSemesterSixWeekAverages.get(2);
	}
}

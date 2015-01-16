import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Course
{
	private String name;
	private ArrayList<Integer> firstSemesterSixWeekAverages;
	private ArrayList<Integer> secondSemesterSixWeekAverages;

	public Course()
	{
		this.name                          = "";
		this.firstSemesterSixWeekAverages  = new ArrayList<Integer>();
		this.secondSemesterSixWeekAverages = new ArrayList<Integer>();
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

	public void setSecondSemesterSixWeekAverages(ArrayList<Double> secondSemesterSixWeekAverages)
	{
		for (double sixWeekAverage : secondSemesterSixWeekAverages) {
			this.secondSemesterSixWeekAverages.add((int) Math.round(sixWeekAverage));
		}
	}

	public String toString()
	{
		return "Name: " + name + "\n1st Semester: " + firstSemesterSixWeekAverages.get(0) + "\t" + firstSemesterSixWeekAverages.get(1) + "\t" + firstSemesterSixWeekAverages.get(2) + "\n2nd Semester: " + secondSemesterSixWeekAverages.get(0) + "\t" + secondSemesterSixWeekAverages.get(1) + "\t" + secondSemesterSixWeekAverages.get(2);
	}
}

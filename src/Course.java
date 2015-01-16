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
			this.firstSemesterSixWeekAverages.add((int) Math.round(sixWeekAverage))
		}
	}

	public void setSecondSemesterSixWeekAverages(ArrayList<Double> secondSemesterSixWeekAverages)
	{
		for (double sixWeekAverage : secondSemesterSixWeekAverages) {
			this.secondSemesterSixWeekAverages.add((int) Math.round(sixWeekAverage))
		}
	}
}
